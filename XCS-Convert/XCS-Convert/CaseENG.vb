Imports XCS_Convert.Utilities
Imports System.Data.OracleClient

Module CaseENG
    Public Function GetOldDatatable(ByVal sql As String) As DataTable
        Dim trans As New Utilities.OracleTransactionDB
        trans.CreateTransaction(OracleDB.GetNewConnection())
        Dim dt As New DataTable
        dt = OracleDB.ExecuteTable(sql, trans.Trans)
        trans.CommitTransaction()

        Return dt
    End Function

    Public Function GetNewDatatable(ByVal sql As String) As DataTable
        Dim trans As New Utilities.OracleTransactionDB
        trans.CreateTransaction(OracleDB.GetNewConnection())
        Dim dt As New DataTable
        dt = OracleDB.ExecuteTable(sql, trans.Trans)
        trans.CommitTransaction()

        Return dt
    End Function

    Public Function GetMappingDBDatatable(ByVal sql As String) As DataTable
        Dim trans As New Utilities.SqlTransactionDB
        trans.CreateTransaction(SqlDB.GetMappingDBConnection())
        Dim dt As New DataTable
        dt = SqlDB.ExecuteTable(sql, trans.Trans)
        trans.CommitTransaction()

        Return dt
    End Function


#Region "Query Data"
    Public Function GetApplicationArrest(ByVal whText As String) As DataTable
        Dim sql As String = "SELECT * FROM (  " & vbNewLine
        sql += " SELECT   " & vbNewLine
        sql += " 'APPLICATION_ARREST_seq.Nextval' As ID,  " & vbNewLine
        sql += " [Input_LAW_CASE].[TRACK_NO] As TRACK_NO,  " & vbNewLine
        sql += " [Input_LAW_CASE].[CASE_DATE] As APPLICATION_DATE,  " & vbNewLine
        sql += " ( " & vbNewLine
        sql += " CASE WHEN [Input_LAW_CASE].[DEPT_ID] = '00900200' OR [Input_LAW_CASE].[DEPT_ID] = '00900400' OR [Input_LAW_CASE].[DEPT_ID]='01000400'  THEN  " & vbNewLine
        sql += "     (SELECT Top 1 [Lib_Mapping_Division].[OFFCODE]   " & vbNewLine
        sql += "     FROM [Lib_Mapping_Division]   " & vbNewLine
        sql += "     WHERE [Lib_Mapping_Division].[AREA_CODE]=[Input_LAW_CASE].[ZONE_ID])  " & vbNewLine
        sql += " ELSE  " & vbNewLine
        sql += "     (SELECT Top 1 [Lib_Mapping_Division].[OFFCODE]   " & vbNewLine
        sql += "     FROM [Lib_Mapping_Division]   " & vbNewLine
        sql += "     INNER JOIN [Lib_Mapping_DivZone] ON [Lib_Mapping_Division].[AREA_CODE]=[Lib_Mapping_DivZone].[AREA_CODE]  " & vbNewLine
        sql += "     WHERE [Lib_Mapping_DivZone].[DEPT_ID]=[Input_LAW_CASE].[DEPT_ID])  " & vbNewLine
        sql += " END  " & vbNewLine
        sql += " )  " & vbNewLine
        sql += "  As DEPARTMENT_ID,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " CASE WHEN [Input_LAW_CASE].[DEPT_ID] = '00900200' OR [Input_LAW_CASE].[DEPT_ID] = '00900400' OR [Input_LAW_CASE].[DEPT_ID]='01000400'  THEN  " & vbNewLine
        sql += "     (SELECT Top 1 [Lib_Mapping_Division].[OFFCODE]   " & vbNewLine
        sql += "     FROM [Lib_Mapping_Division]   " & vbNewLine
        sql += "     WHERE [Lib_Mapping_Division].[AREA_CODE]=[Input_LAW_CASE].[ZONE_ID])  " & vbNewLine
        sql += " ELSE  " & vbNewLine
        sql += "     (SELECT Top 1 [Lib_Mapping_Division].[OFFCODE]   " & vbNewLine
        sql += "     FROM [Lib_Mapping_Division]   " & vbNewLine
        sql += "     INNER JOIN [Lib_Mapping_DivZone] ON [Lib_Mapping_Division].[AREA_CODE]=[Lib_Mapping_DivZone].[AREA_CODE]  " & vbNewLine
        sql += "     WHERE [Lib_Mapping_DivZone].[DEPT_ID]=[Input_LAW_CASE].[ZONE_ID])  " & vbNewLine
        sql += " END  " & vbNewLine
        sql += " )  " & vbNewLine
        sql += "  As OFFCODE,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " SELECT TOP 1 [Lib_Mapping_LEGISLATION].[ID] FROM [Lib_Mapping_LEGISLATION]  " & vbNewLine
        sql += " WHERE [Input_LAW_CASE].[LAW_ID]=[Lib_Mapping_LEGISLATION].[LEGISLATION_CODE]  " & vbNewLine
        sql += " ) As LEGISLATION_ID,  " & vbNewLine
        sql += " CASE [Input_LAW_CASE].[MEE_TOA]   " & vbNewLine
        sql += " WHEN '1' THEN 'Y'   " & vbNewLine
        sql += " ELSE 'N' END  " & vbNewLine
        sql += "  As HAVE_CULPRIT,  " & vbNewLine
        sql += " '' As SCENE_NAME,  " & vbNewLine
        sql += " [Input_LAW_CASE].[PLACE] As SCENE_NO,  " & vbNewLine
        sql += " '' As SCENE_MOO,  " & vbNewLine
        sql += " '' As SCENE_SOI,  " & vbNewLine
        sql += " '' As SCENE_ROAD,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " 	SELECT TOP 1 RDB_SUBDISTRICT_CODE FROM Lib_Mapping_SubDistrict  " & vbNewLine
        sql += " 	WHERE Input_LAW_CASE.TUMBON=Lib_Mapping_SubDistrict.TAMBON_NAME AND RDB_SUBDISTRICT_CODE LIKE   " & vbNewLine
        sql += " 	(  " & vbNewLine
        sql += " 	SELECT TOP 1 LEFT(Lib_Mapping_District.RDB_CODE,4) FROM Lib_Mapping_District  " & vbNewLine
        sql += " 	WHERE Input_LAW_CASE.AUMPUR=Lib_Mapping_District.AMPUR_CODE  " & vbNewLine
        sql += " 	) + '%'  " & vbNewLine
        sql += " ) As SCENE_SUBDISTRICT,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " SELECT TOP 1 LEFT(Lib_Mapping_District.RDB_CODE,4) FROM Lib_Mapping_District  " & vbNewLine
        sql += " WHERE Input_LAW_CASE.AUMPUR=Lib_Mapping_District.AMPUR_CODE  " & vbNewLine
        sql += " ) As SCENE_DISTRICT,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " 	SELECT TOP 1 LEFT([Lib_Mapping_Province].[RDB_CODE],2) FROM [Lib_Mapping_Province]  " & vbNewLine
        sql += " 	WHERE Input_LAW_CASE.PROVINCE_ID=LEFT(Lib_Mapping_Province.PROVINCE_ID,4)  " & vbNewLine
        sql += " ) As SCENE_PROVINCE,  " & vbNewLine
        sql += " [Input_LAW_CASE].[SHARE_CASE] As ALLEGED_CO,  " & vbNewLine
        sql += " CONVERT(DATETIME,  " & vbNewLine
        sql += " CONVERT(varchar(10),[Input_LAW_CASE].[CASE_DATE],120) + ' ' +   " & vbNewLine
        sql += " isnull(CASE when len(ltrim(rtrim([Input_LAW_CASE].[SEARCH_TIME])))<5 then ''   " & vbNewLine
        sql += " else case when SUBSTRING([Input_LAW_CASE].[SEARCH_TIME],1,2)>23  then '' else   " & vbNewLine
        sql += " 	case when reverse(SUBSTRING(REVERSE([Input_LAW_CASE].[SEARCH_TIME]),1,2))>59 then '' else [Input_LAW_CASE].[SEARCH_TIME] end  " & vbNewLine
        sql += "  end  " & vbNewLine
        sql += " end,''),120) As OCCURRENCE_DATE,  " & vbNewLine
        sql += " [Input_LAW_CASE].[GUILTY] As GUILTY,  " & vbNewLine
        sql += "  [Input_LAW_CASE].[PLACE_OWNER]  As OWNER_NAME,  " & vbNewLine
        sql += " [Input_LAW_CASE].[OWNER_NAME] As BUSINESS_NAME,  " & vbNewLine
        sql += " [Input_LAW_CASE].[LAW_ER2_39] As SURETY_NAME,  " & vbNewLine
        sql += " [Input_LAW_CASE].[GET2_39IS] As DUTY,  " & vbNewLine
        sql += " [Input_LAW_CASE].[BY_ORDER2_6] As ORDER_BY,  " & vbNewLine
        sql += " [Input_LAW_CASE].[HEAD_ER2_6_1] As LEADER_POSITION,  " & vbNewLine
        sql += " [Input_LAW_CASE].[DIREC_ER2_6] As DIRECTOR_POSITION,  " & vbNewLine
        sql += " [Input_LAW_CASE].[SOSO_2_29_DETAIL] As BEHAVIOUR,  " & vbNewLine
        sql += " [Input_LAW_CASE].[ARREST_DETAIL] As TESTIMONY,  " & vbNewLine
        sql += " RTRIM(CAST(Search_Date AS VARCHAR(10)) + ' ' + ISNULL(SEARCH_TIME_FINISH,''))  " & vbNewLine
        sql += "  As FINISHED_TIME,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " SELECT Top 1 [Lib_Mapping_Division].[AREA_FULLNAME]   " & vbNewLine
        sql += " FROM [Lib_Mapping_Division]   " & vbNewLine
        sql += " INNER JOIN [Lib_Mapping_DivZone] ON [Lib_Mapping_DivZone].[AREA_CODE]=[Lib_Mapping_Division].[AREA_CODE]  " & vbNewLine
        sql += " WHERE [Lib_Mapping_DivZone].[DEPT_ID]=[Input_LAW_CASE].[DEPT_ID]  " & vbNewLine
        sql += " ) As DEPARTMENT_NAME,  " & vbNewLine
        sql += " [Input_LAW_CASE].[CUST_TYPE] As LAWBREAK_TYPE,  " & vbNewLine
        sql += " [Input_LAW_CASE].[SOSO_2_29_REPLY] As ADMINISTRATION,  " & vbNewLine
        sql += " 'N' As DEL_FLAG,  " & vbNewLine
        sql += " [Input_LAW_CASE].[CASE_SUE_AMT] As ESTIMATE_FINE,  " & vbNewLine
        sql += " [Input_LAW_CASE].[CASE_SUE_DUE_DATE] As ESTIMATE_FINE_DATE,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += "    SELECT TOP 1 [Lib_Mapping_ProductGroup].[GROUP_ID]  " & vbNewLine
        sql += "    FROM [Lib_Mapping_ProductGroup]  " & vbNewLine
        sql += "    WHERE [Lib_Mapping_ProductGroup].[L_ID]=[Input_LAW_CASE].[PROD_TYPE_ID]  " & vbNewLine
        sql += " ) As PRODUCT_GROUP_ID,  " & vbNewLine
        sql += " CASE [Input_LAW_CASE].[LAW_ER_SELECT]   " & vbNewLine
        sql += "    WHEN '1' THEN '1'  " & vbNewLine
        sql += "    WHEN '2' THEN '3'  " & vbNewLine
        sql += "    WHEN '3' THEN '5'  " & vbNewLine
        sql += "    WHEN '4' THEN '2'  " & vbNewLine
        sql += "    WHEN '5' THEN '4'  " & vbNewLine
        sql += " END As ACCUSER_TYPE,  " & vbNewLine
        sql += " [Input_LAW_CASE].[POLICE_STATION] As POLICE_STATION,  " & vbNewLine
        sql += " [Input_LAW_CASE].[LAW_ER1] As ACCUSER_IDCARDNO,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " 	SELECT TOP 1 OFFCODE FROM LIB_Mapping_Staff WHERE   " & vbNewLine
        sql += " 	Input_LAW_CASE.LAW_ER1=LIB_Mapping_Staff.IDCARD_NO  " & vbNewLine
        sql += " ) As ACCUSER_OFFCODE,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " 	SELECT TOP 1 POSCODE FROM LIB_Mapping_Staff WHERE   " & vbNewLine
        sql += " 	Input_LAW_CASE.LAW_ER1=LIB_Mapping_Staff.IDCARD_NO  " & vbNewLine
        sql += " ) As ACCUSER_POSCODE,  " & vbNewLine
        sql += " CASE [Input_LAW_CASE].[CAN_SUE_STEP] WHEN '2' THEN 'Y' ELSE 'N' END As ISSENTCOURT,  " & vbNewLine
        sql += " [Input_LAW_CASE].[CASE_DATE] As ARREST_REPORT_DATE,  " & vbNewLine
        sql += " [Input_LAW_CASE].[F_UPD_DATE] As CREATE_ON,  " & vbNewLine
        sql += " [Input_LAW_CASE].[EDIT_DATE] As UPDATE_ON,  " & vbNewLine
        sql += " [Input_LAW_CASE].[GET2_39] As REPORT_TO_STAFF,  " & vbNewLine
        sql += " [Input_LAW_CASE].[BY_ORDER2_6] As ORDER_BY_STAFF,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " CASE WHEN   " & vbNewLine
        sql += "          (SELECT TOP 1 LTRIM(RTRIM([Lib_IncomeStaff].[POSNAME] + ' ' + ISNULL([Lib_IncomeStaff].[LEVELS],'')))  " & vbNewLine
        sql += "          FROM [Lib_IncomeStaff]  " & vbNewLine
        sql += "          WHERE [Lib_IncomeStaff].[IDCARD_NO]=[Input_LAW_CASE].[LAW_ER1])<>''  " & vbNewLine
        sql += " THEN   " & vbNewLine
        sql += "          (SELECT TOP 1 LTRIM(RTRIM([Lib_IncomeStaff].[POSNAME] + ' ' + ISNULL([Lib_IncomeStaff].[LEVELS],'')))  " & vbNewLine
        sql += "          FROM [Lib_IncomeStaff]  " & vbNewLine
        sql += "          WHERE [Lib_IncomeStaff].[IDCARD_NO]=[Input_LAW_CASE].[LAW_ER1])  " & vbNewLine
        sql += " ELSE [Input_LAW_CASE].[LAW_ER1_POS]  " & vbNewLine
        sql += " END  " & vbNewLine
        sql += " )  " & vbNewLine
        sql += "  As ACCUSER_POSNAME,  " & vbNewLine
        sql += " [Input_LAW_CASE].[LAW_ER1_DEPT] As ACCUSER_OFFNAME,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " CASE WHEN LTRIM(RTRIM(  " & vbNewLine
        sql += "           (SELECT TOP 1 [Lib_IncomeStaff].[TITLE_NAME]+[Lib_IncomeStaff].[FIRST_NAME] + ' ' + [Lib_IncomeStaff].[LAST_NAME]  " & vbNewLine
        sql += "           FROM [Lib_IncomeStaff]  " & vbNewLine
        sql += "           WHERE [Lib_IncomeStaff].[IDCARD_NO]=[Input_LAW_CASE].[LAW_ER1])))<>''  " & vbNewLine
        sql += " THEN  " & vbNewLine
        sql += "          LTRIM(RTRIM(  " & vbNewLine
        sql += "          (SELECT TOP 1 [Lib_IncomeStaff].[TITLE_NAME]+[Lib_IncomeStaff].[FIRST_NAME] + ' ' + [Lib_IncomeStaff].[LAST_NAME]  " & vbNewLine
        sql += "          FROM [Lib_IncomeStaff]  " & vbNewLine
        sql += "          WHERE [Lib_IncomeStaff].[IDCARD_NO]=[Input_LAW_CASE].[LAW_ER1])))  " & vbNewLine
        sql += " ELSE  " & vbNewLine
        sql += "         LTRIM(RTRIM(  " & vbNewLine
        sql += "         (SELECT TOP 1 [Lib_STAFF_2].[PN_NAME]+[Lib_STAFF_2].[PER_NAME] + ' ' + [Lib_STAFF_2].[PER_SURNAME]  " & vbNewLine
        sql += "         FROM [Lib_STAFF_2]  " & vbNewLine
        sql += "         WHERE [Lib_STAFF_2].[IDCARD_NO]=[Input_LAW_CASE].[LAW_ER1])))  " & vbNewLine
        sql += " END  " & vbNewLine
        sql += " )  " & vbNewLine
        sql += "  As ACCUSER_NAME,  " & vbNewLine

        '//########## BOOK_IMPEACHMENT ZONE ########
        sql += " 'BOOK_IMPEACHMENT_SEQ.nextval' As BOOK_IMPEACHMENT_ID,  " & vbNewLine
        sql += " [Input_LAW_CASE].[CASE_NO] As CASE_ID,  " & vbNewLine
        sql += " CONVERT(DATETIME,  " & vbNewLine
        sql += " CONVERT(varchar(10),[Input_LAW_CASE].[CASE_DATE1],120) + ' ' +   " & vbNewLine
        sql += " isnull(CASE when len(ltrim(rtrim([Input_LAW_CASE].[SEND_KADEE_TIME])))<5 then ''   " & vbNewLine
        sql += " else case when SUBSTRING([Input_LAW_CASE].[SEND_KADEE_TIME],1,2)>23  then '' else   " & vbNewLine
        sql += " 	case when reverse(SUBSTRING(REVERSE([Input_LAW_CASE].[SEND_KADEE_TIME]),1,2))>59 then '' else [Input_LAW_CASE].[SEND_KADEE_TIME] end  " & vbNewLine
        sql += "  end  " & vbNewLine
        sql += " end,''),120) As CASE_DATE,  " & vbNewLine
        sql += " [Input_LAW_CASE].[NITIKON_ER] As STAFF_ID_SUE,  " & vbNewLine
        sql += " [Input_LAW_CASE].[USER_ID1] As BOOK_CREATE_BY,  " & vbNewLine
        sql += " [Input_LAW_CASE].[UPD_DATE1] As BOOK_CREATE_ON,  " & vbNewLine
        sql += " '' As BOOK_UPDATE_BY,  " & vbNewLine
        sql += " '' As BOOK_UPDATE_ON,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " CASE [Input_LAW_CASE].[MEE_TOA]   " & vbNewLine
        sql += " WHEN '1' THEN   " & vbNewLine
        sql += "      CASE WHEN [Input_LAW_CASE].[CAN_SUE] <> '0' AND  [Input_LAW_CASE].[CAN_SUE] IS NOT NULL  THEN '1'  " & vbNewLine
        sql += "      ELSE '2'   " & vbNewLine
        sql += "      END  " & vbNewLine
        sql += " ELSE '2' END  " & vbNewLine
        sql += " ) As CASE_QUALITY,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " CASE [Input_LAW_CASE].[MEE_TOA]   " & vbNewLine
        sql += " WHEN '1' THEN   " & vbNewLine
        sql += "      [Input_LAW_CASE].[CAN_SUE_STEP]  " & vbNewLine
        sql += " ELSE '2' END  " & vbNewLine
        sql += " ) As CASE_LAST,  " & vbNewLine
        sql += " [Input_LAW_CASE].[POLICE_STATION] As CASE_RESULT,  " & vbNewLine
        sql += " CASE WHEN [Input_LAW_CASE].[CAN_SUE] <> 'Y'   " & vbNewLine
        sql += " THEN  [Input_LAW_CASE].[COURT_FINE_DATE]  " & vbNewLine
        sql += " ELSE   " & vbNewLine
        sql += "      [Input_LAW_CASE].[CLOSE_DATE]  " & vbNewLine
        sql += " END As CASE_LAST_DATE,  " & vbNewLine
        sql += " CASE WHEN [Input_LAW_CASE].[CAN_SUE] <> 'Y'   " & vbNewLine
        sql += " THEN  [Input_LAW_CASE].[COURT_FINE_AMT]  " & vbNewLine
        sql += " ELSE   " & vbNewLine
        sql += "     ''  " & vbNewLine
        sql += " END As CASE_FINE,  " & vbNewLine

        '//########## COMPARE_CASE ZONE ########
        sql += " 'COMPARE_CASE_SEQ.nextval' As COMPARE_CASE_ID,  " & vbNewLine
        sql += " [Input_LAW_CASE].[SUE_NO] As COMPARE_CASE_NO,  " & vbNewLine
        sql += " [Input_LAW_CASE].[SUE_DATE] As COMPARE_CASE_DATE,  " & vbNewLine
        '//sql += " --[Input_LAW_CASE].[TRACK_NO] As TRACK_NO,  " & vbNewLine
        sql += "       CASE WHEN  " & vbNewLine
        sql += "           LTRIM(RTRIM((SELECT TOP 1 [Lib_CompareSuePlace].[OFFCODE]  " & vbNewLine
        sql += "           FROM [Lib_CompareSuePlace]  " & vbNewLine
        sql += "           WHERE [Lib_CompareSuePlace].[SUE_PLACE]=[Input_LAW_CASE].[SUE_PLACE])))<>'' THEN  " & vbNewLine
        sql += "           (SELECT TOP 1 [Lib_CompareSuePlace].[OFFCODE]  " & vbNewLine
        sql += "           FROM [Lib_CompareSuePlace]  " & vbNewLine
        sql += "           WHERE [Lib_CompareSuePlace].[SUE_PLACE]=[Input_LAW_CASE].[SUE_PLACE])  " & vbNewLine
        sql += "       ELSE   " & vbNewLine
        sql += "           (SELECT Top 1 [Lib_Mapping_Division].[OFFCODE]   " & vbNewLine
        sql += "           FROM [Lib_Mapping_Division]   " & vbNewLine
        sql += "           INNER JOIN [Lib_Mapping_DivZone] ON [Lib_Mapping_Division].[AREA_CODE]=[Lib_Mapping_DivZone].[AREA_CODE]  " & vbNewLine
        sql += "           WHERE [Lib_Mapping_DivZone].[DEPT_ID]=[Input_LAW_CASE].[DEPT_ID])  " & vbNewLine
        sql += "       END  As COMPARE_OFFICE,  " & vbNewLine
        sql += " '' As COMPARE_SUBDISTRICT,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " SELECT TOP 1 LEFT(Lib_Mapping_District.RDB_CODE,4) FROM Lib_Mapping_District  " & vbNewLine
        sql += " WHERE Input_LAW_CASE.SUE_AUMPUR=Lib_Mapping_District.AMPUR_CODE  " & vbNewLine
        sql += " ) As COMPARE_DISTRICT,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " 	SELECT TOP 1 LEFT([Lib_Mapping_Province].[RDB_CODE],2) FROM [Lib_Mapping_Province]  " & vbNewLine
        sql += " 	WHERE Input_LAW_CASE.SUE_PROVINCE_ID=LEFT(Lib_Mapping_Province.PROVINCE_ID,4)  " & vbNewLine
        sql += " ) As COMPARE_PROVINCE,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " 	SELECT TOP 1 RDB_SUBDISTRICT_CODE FROM Lib_Mapping_SubDistrict  " & vbNewLine
        sql += " 	WHERE Input_LAW_CASE.TUMBON2_54=Lib_Mapping_SubDistrict.TAMBON_NAME AND RDB_SUBDISTRICT_CODE LIKE   " & vbNewLine
        sql += " 	(  " & vbNewLine
        sql += " 	SELECT TOP 1 LEFT(Lib_Mapping_District.RDB_CODE,4) FROM Lib_Mapping_District  " & vbNewLine
        sql += " 	WHERE Input_LAW_CASE.AUMPUR2_54=Lib_Mapping_District.AMPUR_CODE  " & vbNewLine
        sql += " 	) + '%'  " & vbNewLine
        sql += " ) As ACCUSER_SUBDISTRICT,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " SELECT TOP 1 LEFT(Lib_Mapping_District.RDB_CODE,4) FROM Lib_Mapping_District  " & vbNewLine
        sql += " WHERE Input_LAW_CASE.AUMPUR2_54=Lib_Mapping_District.AMPUR_CODE  " & vbNewLine
        sql += " ) As ACCUSER_DISTRICT,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " 	SELECT TOP 1 LEFT([Lib_Mapping_Province].[RDB_CODE],2) FROM [Lib_Mapping_Province]  " & vbNewLine
        sql += " 	WHERE Input_LAW_CASE.PROV2_54=LEFT(Lib_Mapping_Province.PROVINCE_ID,4)  " & vbNewLine
        sql += " ) As ACCUSER_PROVINCE,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += "    CASE WHEN (  " & vbNewLine
        sql += "              SELECT TOP 1 [Lib_Indictment].[INDICTMENT_ID]  " & vbNewLine
        sql += "              FROM [Lib_Indictment]  " & vbNewLine
        sql += "              WHERE [Lib_Indictment].[LAW_ID]=[Input_LAW_CASE].[LAW_ID]  " & vbNewLine
        sql += "              AND [Lib_Indictment].[CASE_LAW_ID]= [Input_LAW_CASE].[CASE_SUE_LAW_ID]  " & vbNewLine
        sql += "              AND [Lib_Indictment].[PENALTY_CASE_LAW_ID]=[Input_LAW_CASE].[CASE_SUE_DESC]  " & vbNewLine
        sql += "              AND [Lib_Indictment].GUILT_BASE=[Input_LAW_CASE].[CASE_DETAIL]) is not null  " & vbNewLine
        sql += "    THEN  " & vbNewLine
        sql += "              (SELECT TOP 1 [Lib_Indictment].[INDICTMENT_ID]  " & vbNewLine
        sql += "              FROM [Lib_Indictment]  " & vbNewLine
        sql += "              WHERE [Lib_Indictment].[LAW_ID]=[Input_LAW_CASE].[LAW_ID]  " & vbNewLine
        sql += "              AND [Lib_Indictment].[CASE_LAW_ID]= [Input_LAW_CASE].[CASE_SUE_LAW_ID]  " & vbNewLine
        sql += "              AND [Lib_Indictment].[PENALTY_CASE_LAW_ID]=[Input_LAW_CASE].[CASE_SUE_DESC]  " & vbNewLine
        sql += "              AND [Lib_Indictment].GUILT_BASE=[Input_LAW_CASE].[CASE_DETAIL])  " & vbNewLine
        sql += "     ELSE  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += "     SELECT TOP 1 [Lib_Indictment].[INDICTMENT_ID]  " & vbNewLine
        sql += "     FROM [Lib_Indictment]  " & vbNewLine
        sql += "     INNER JOIN  [Lib_CheckCompareIndictment] ON [Lib_CheckCompareIndictment].[GUILT_MST_ID]=[Lib_Indictment].[GUILT_MST_ID]  " & vbNewLine
        sql += "     WHERE  LTRIM(RTRIM([Lib_CheckCompareIndictment].[case_detail]))=LTRIM(RTRIM([Input_LAW_CASE].[CASE_DETAIL]))  " & vbNewLine
        sql += "     AND LTRIM(RTRIM([Lib_CheckCompareIndictment].[LAW_ID]))=LTRIM(RTRIM([Input_LAW_CASE].[LAW_ID]))  " & vbNewLine
        sql += " )  " & vbNewLine
        sql += "     END  " & vbNewLine
        sql += " ) As INDICTMENT_ID,  " & vbNewLine
        sql += " [Input_LAW_CASE].[BLAME_DESC] As ACCUSER_TESTIMONY,  " & vbNewLine
        sql += " [Input_LAW_CASE].[COURT_FINE_AMT] As COURT_FINE,  " & vbNewLine
        sql += " [Input_LAW_CASE].[COURT_FINE_DATE] As COURT_FINE_DATE,  " & vbNewLine
        sql += " [Input_LAW_CASE].[SUE_PAY_DATE] As PAY_DATE,  " & vbNewLine
        sql += " [Input_LAW_CASE].[TREASURY_PER] As TREASURY_MONEY_P,  " & vbNewLine
        sql += " [Input_LAW_CASE].[SINBON_PER] As BRIBE_MONEY_P,  " & vbNewLine
        sql += " 100-([Input_LAW_CASE].[TREASURY_PER]+[Input_LAW_CASE].[SINBON_PER]) As REWARD_MONEY_P,  " & vbNewLine
        sql += " [Input_LAW_CASE].[TREASURY_AMT] As TREASURY_MONEY,  " & vbNewLine
        sql += " [Input_LAW_CASE].[SINBON_AMT] As BIRBE_MONEY,  " & vbNewLine
        sql += " [Input_LAW_CASE].[REWARD_AMT] As REWARD_MONEY,  " & vbNewLine
        sql += " [Input_LAW_CASE].[USER_ID2] As COMPARE_CASE_CREATE_BY,  " & vbNewLine
        sql += " [Input_LAW_CASE].[UPD_DATE2] As COMPARE_CASE_CREATE_ON,  " & vbNewLine
        sql += " [Input_LAW_CASE].[USER_ID2] As COMPARE_CASE_UPDATE_BY,  " & vbNewLine
        sql += " [Input_LAW_CASE].[UPD_DATE2] As COMPARE_CASE_UPDATE_ON,  " & vbNewLine
        sql += " '1' As COMPARE_AUTHORITY_ID,  " & vbNewLine
        sql += " '2' As MANAGE_TYPE,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " CASE WHEN ISNULL(SUE_DATE,'')<>''  " & vbNewLine
        sql += "         THEN   " & vbNewLine
        sql += " 	CASE when ISNULL(SUE_PAY_DATE,'')  <> '' THEN '2' ELSE '1' END  " & vbNewLine
        sql += "         ELSE ''  " & vbNewLine
        sql += " END  " & vbNewLine
        sql += " ) As CASE_STATUS,  " & vbNewLine
        sql += " [Input_LAW_CASE].[SUE_AMT] As COMPARE_CASE_FINE,  " & vbNewLine
        sql += " [Input_LAW_CASE].[NITIKON_ER] As SUE_STAFF_IDCARDNO,  " & vbNewLine
        sql += " '' As SUE_POSCODE,  " & vbNewLine
        sql += " '' As SUE_OFFCODE,  " & vbNewLine
        sql += " '' As INV_TYPE,  " & vbNewLine
        sql += " [Input_LAW_CASE].[SUE_AMT] As CASE_TOTAL_FINE,  " & vbNewLine

        '//########## APPLICATION_ARREST_PROVE ZONE ########
        sql += " 'APPLICATION_ARREST_PROVE_SEQ.nextval' As APPLICATION_ARREST_PROVE_ID,  " & vbNewLine
        sql += " [Input_LAW_CASE].[THING_LIST_NO] As EXHIBIT_REPORT_NO,  " & vbNewLine
        sql += " [Input_LAW_CASE].[PROVE_ER] As STAFF_IDCARDNO_PROVE,  " & vbNewLine
        sql += " [Input_LAW_CASE].[CASE_DATE2] As TAKEN_DATE,  " & vbNewLine
        sql += " [Input_LAW_CASE].[POS_2_4] As REPLACE_POSITION,  " & vbNewLine
        sql += " [Input_LAW_CASE].[SOSO2_4_ORDER] As ORDER_DESC,  " & vbNewLine
        sql += " [Input_LAW_CASE].[USER_ID2] As APPLICATION_ARREST_PROVE_CREATE_BY,  " & vbNewLine
        sql += " [Input_LAW_CASE].[UPD_DATE2] As APPLICATION_ARREST_PROVE_CREATE_ON,  " & vbNewLine
        sql += " CASE WHEN [Input_LAW_CASE].[THING_LIST_NO] IS NULL THEN '1' ELSE '2' END  As STATUS,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " SELECT TOP 1 [Lib_STAFF_2].[POSCODE]  " & vbNewLine
        sql += " FROM [Lib_STAFF_2]  " & vbNewLine
        sql += " WHERE [Lib_STAFF_2].[IDCARD_NO]=[Input_LAW_CASE].[PROVE_ER]  " & vbNewLine
        sql += " ) As STAFF_PROVE_POSCODE,  " & vbNewLine
        sql += " (  " & vbNewLine
        sql += " SELECT TOP 1 [Lib_Mapping_Staff].[OFFCODE]  " & vbNewLine
        sql += " FROM [Lib_Mapping_Staff]  " & vbNewLine
        sql += " WHERE [Lib_Mapping_Staff].[IDCARD_NO]=[Input_LAW_CASE].[PROVE_ER]  " & vbNewLine
        sql += " ) As STAFF_PROVE_OFFCODE,  " & vbNewLine
        sql += " '' As TAX_VALUE,  " & vbNewLine
        sql += " [Input_LAW_CASE].[SOSO2_4_REPORT] As REPORT_DESC  " & vbNewLine
        sql += " FROM [Input_LAW_CASE]   " & vbNewLine
        sql += " WHERE 1=1 " & vbNewLine
        sql += whText
        sql += " ) Computation "

        'Dim sql As String = "select * "
        'sql += " from law_case_temp "
        'sql += " where 1=1 "
        'sql += whText

        Dim trans As New SqlTransactionDB
        trans.CreateTransaction(SqlDB.GetMappingDBConnection)
        Dim dt As DataTable = SqlDB.ExecuteTable(sql, trans.Trans)
        trans.CommitTransaction()

        Return dt
    End Function

    Public Function GetApplicationArrestLawbreaker(ByVal WhText As String) As DataTable
        Dim sql As String = "SELECT * FROM (" & vbNewLine
        sql += " SELECT  'applicationarrestlawbreakerseq.nextval' As ID,[Input_LAW_BAD].[TRACK_NO] As TRACK_NO," & vbNewLine
        sql += " REPLACE(REPLACE ([Input_LAW_BAD].[LAW_CUST_ID], 'L' , ''),'M','') As LAWBREAKER_NO," & vbNewLine
        sql += "             Case [Input_LAW_BAD].[CUST_TYPE]" & vbNewLine
        sql += "    WHEN '1' THEN " & vbNewLine
        sql += "         CASE  WHEN [Input_LAW_BAD].[PASSPORT] is not null THEN '2'" & vbNewLine
        sql += "         WHEN ASCII(LEFT(RTRIM(LTRIM([Input_LAW_BAD].[ARES_NAME])),1))<161 THEN '2'" & vbNewLine
        sql += "         ELSE '1' END" & vbNewLine
        sql += "    WHEN '2' THEN '3' " & vbNewLine
        sql += " END As CULPRIT_TYPE," & vbNewLine
        sql += " [Input_LAW_BAD].[CARD_ID] As LAWBREAKER_ID_CARD, [Input_LAW_BAD].[PASSPORT] As LAWBREAKER_PASSPORT," & vbNewLine
        sql += " CASE [Input_LAW_BAD].[CUST_TYPE] WHEN '2' THEN '' " & vbNewLine
        sql += " ELSE " & vbNewLine
        sql += "     rtrim(SUBSTRING([Input_LAW_BAD].[ARES_NAME],1,CHARINDEX(' ',[Input_LAW_BAD].[ARES_NAME])))" & vbNewLine
        sql += " END As FIRST_NAME," & vbNewLine
        sql += " CASE [Input_LAW_BAD].[CUST_TYPE] WHEN '2' THEN ''" & vbNewLine
        sql += " ELSE " & vbNewLine
        sql += "    Ltrim(SUBSTRING([Input_LAW_BAD].[ARES_NAME],CHARINDEX(' ',[Input_LAW_BAD].[ARES_NAME]),LEN([Input_LAW_BAD].[ARES_NAME])))" & vbNewLine
        sql += " END As LAST_NAME," & vbNewLine
        sql += " [Input_LAW_BAD].[ADD_CODE] As ADDRESS_NO,[Input_LAW_BAD].[SOI] As SOI,[Input_LAW_BAD].[RD] As ROAD," & vbNewLine
        sql += " REPLACE([Input_LAW_BAD].[MOO],'-','') As MOO," & vbNewLine
        sql += " (" & vbNewLine
        sql += " 	SELECT TOP 1 RDB_SUBDISTRICT_CODE FROM Lib_Mapping_SubDistrict" & vbNewLine
        sql += " 	WHERE [Input_LAW_BAD].[TUMBON]=Lib_Mapping_SubDistrict.TAMBON_NAME AND RDB_SUBDISTRICT_CODE LIKE " & vbNewLine
        sql += " 	(" & vbNewLine
        sql += " 	SELECT TOP 1 LEFT(Lib_Mapping_District.RDB_CODE,4) FROM Lib_Mapping_District" & vbNewLine
        sql += "    WHERE [Input_LAW_BAD].[AUMPUR] = Lib_Mapping_District.AMPUR_CODE " & vbNewLine
        sql += " 	) + '%') As SUBDISTRICT," & vbNewLine
        sql += " (" & vbNewLine
        sql += " SELECT TOP 1 LEFT([Lib_Mapping_District].[RDB_CODE],4)" & vbNewLine
        sql += " FROM [Lib_Mapping_District] " & vbNewLine
        sql += " WHERE [Lib_Mapping_District].[AMPUR_CODE] = [Input_LAW_BAD].[AUMPUR] " & vbNewLine
        sql += " ) As DISTRICT," & vbNewLine
        sql += " (" & vbNewLine
        sql += " SELECT TOP 1 LEFT([Lib_Mapping_Province].[RDB_CODE],2)" & vbNewLine
        sql += " FROM [Lib_Mapping_Province] " & vbNewLine
        sql += " WHERE Left([Lib_Mapping_Province].[PROVINCE_ID], 4) = [Input_LAW_BAD].[PROV] " & vbNewLine
        sql += " ) As PROVINCE," & vbNewLine
        sql += " (" & vbNewLine
        sql += " SELECT TOP 1 [Lib_Nationality].[ID]" & vbNewLine
        sql += " FROM [Lib_Nationality] " & vbNewLine
        sql += " INNER JOIN [Lib_Mapping_Nationality] ON [Lib_Mapping_Nationality].[NATION_CODE]=[Lib_Nationality].[NATION_CODE]" & vbNewLine
        sql += " WHERE [Lib_Mapping_Nationality].[NATION2] = [Input_LAW_BAD].[NATION2] " & vbNewLine
        sql += " ) As NATIONALITY_ID," & vbNewLine
        sql += " (" & vbNewLine
        sql += " SELECT TOP 1 [Lib_Race].[ID]" & vbNewLine
        sql += " FROM [Lib_Race] " & vbNewLine
        sql += " INNER JOIN [Lib_Mapping_Race] ON [Lib_Mapping_Race].[RACE_CODE]=[Lib_Race].[RACE_CODE]" & vbNewLine
        sql += " WHERE [Lib_Mapping_Race].[NATION1] = [Input_LAW_BAD].[NATION1] " & vbNewLine
        sql += " ) As RACE_ID," & vbNewLine
        sql += " [Input_LAW_BAD].[JOB] As CAREER,[Input_LAW_BAD].[AGE] As AGE," & vbNewLine
        sql += " [Input_LAW_BAD].[DAD_NAME] As FATHER_NAME,[Input_LAW_BAD].[MOM_NAME] As MOTHER_NAME," & vbNewLine
        sql += " CASE [Input_LAW_BAD].[CHK_MANUAL] WHEN 'Y' THEN 'Y' ELSE 'N' END As PAID_TIME_OFF," & vbNewLine
        sql += " CASE WHEN [Input_LAW_BAD].[CHK_MANUAL]= 'N' THEN [Input_LAW_BAD].[RECP_NO] ELSE '' END As INVCODE," & vbNewLine
        sql += " [Input_LAW_BAD].[SUE_AMT] As FINE,[Input_LAW_BAD].[BOOK_NO] As BOOK_NO,[Input_LAW_BAD].[RECEIPT_NO] As INV_NO," & vbNewLine
        sql += " CASE WHEN [Input_LAW_BAD].[RECP_LOSE]='N' THEN 'N' ELSE 'Y' END As ISCANCEL," & vbNewLine
        sql += "         '' As CANCEL_DATE,'' As CANCEL_BY,'' As CREATE_ON,'' As UPDATE_ON,'' As TITLE_CODE,'' As SEX," & vbNewLine
        sql += "         '' As BIRTH_DATE,'' As OTHER_NAME,'' As EXCISE_REG_NO,'' As CORPORATION_CODE,'' As COMPANY_TITLE_CODE," & vbNewLine
        sql += "         '' As COMPANY_NAME,'' As PAPER_NO,'N' As ISMISTAKE,'' As ISMISTAKE_DESC " & vbNewLine
        sql += " FROM [Input_LAW_BAD]" & vbNewLine
        sql += " WHERE 1 = 1 " & vbNewLine
        sql += WhText & vbNewLine
        sql += " ) Computation "

        Dim trans As New SqlTransactionDB
        trans.CreateTransaction(SqlDB.GetMappingDBConnection)
        Dim dt As DataTable = SqlDB.ExecuteTable(sql, trans.Trans)
        trans.CommitTransaction()

        Return dt
    End Function

    Public Function GetApplicationArrestExhibit(ByVal WhText As String) As DataTable
        Dim sql As String = "SELECT * FROM (" & vbNewLine
        sql += " SELECT  'APPLICATION_ARREST_EXHIBIT_SEQ.nextval' As ID," & vbNewLine
        sql += " [Input_LAW_KEEP_INV].[TRACK_NO] As TRACK_NO," & vbNewLine
        sql += "         'N' As ISEXHIBITCO," & vbNewLine
        sql += " (" & vbNewLine
        sql += " SELECT TOP 1 [Lib_Mapping_Brand].[rdb_brand_code]" & vbNewLine
        sql += " FROM [Lib_Mapping_Brand] " & vbNewLine
        sql += " WHERE [Lib_Mapping_Brand].[brand_id] = [Input_LAW_KEEP_INV].[BRAND_ID] " & vbNewLine
        sql += " AND [Lib_Mapping_Brand].[product_type_id]=[Input_LAW_KEEP_INV].[PRODUCT_ID]) As BRAND_CODE," & vbNewLine
        sql += " CASE WHEN [Input_LAW_KEEP_INV].[PROD_TYPE_ID]='90301' " & vbNewLine
        sql += "          OR [Input_LAW_KEEP_INV].[PROD_TYPE_ID]='91303' THEN 'O' " & vbNewLine
        sql += "           WHEN [Input_LAW_KEEP_INV].[PROD_TYPE_ID]='91101' THEN 'I'" & vbNewLine
        sql += " ELSE 'Z'" & vbNewLine
        sql += "         End" & vbNewLine
        sql += "           As ISDOMESTIC," & vbNewLine
        sql += " (" & vbNewLine
        sql += " SELECT TOP 1 [Lib_Mapping_Unit].[RDB_CODE]" & vbNewLine
        sql += " FROM [Lib_Mapping_Unit] " & vbNewLine
        sql += " WHERE [Lib_Mapping_Unit].[PACK_ID] = [Input_LAW_KEEP_INV].[PACK_ID] " & vbNewLine
        sql += " ) As SIZE_UNIT_CODE," & vbNewLine
        sql += " [Input_LAW_KEEP_INV].[QTY] As QTY," & vbNewLine
        sql += " (" & vbNewLine
        sql += " SELECT TOP 1 [Lib_Mapping_Unit].[RDB_CODE]" & vbNewLine
        sql += " FROM [Lib_Mapping_Unit]" & vbNewLine
        sql += " WHERE [Lib_Mapping_Unit].[PACK_ID]=[Input_LAW_KEEP_INV].[QTY_ID]" & vbNewLine
        sql += " ) As QTY_UNIT_CODE," & vbNewLine
        sql += " [Input_LAW_KEEP_INV].[WEIGHT] As NETWEIGHT," & vbNewLine
        sql += " (" & vbNewLine
        sql += " SELECT TOP 1 [Lib_Mapping_Unit].[RDB_CODE]" & vbNewLine
        sql += " FROM [Lib_Mapping_Unit]" & vbNewLine
        sql += " WHERE [Lib_Mapping_Unit].[PACK_ID]=[Input_LAW_KEEP_INV].[WEIGHT_ID]) As NETWEIGHT_UNIT_CODE," & vbNewLine
        sql += " CASE [Input_LAW_KEEP_INV].[KEEP_TYPE] WHEN 'ยึด' THEN '1' WHEN 'คืน' THEN '2' END  As STATUS," & vbNewLine
        sql += " [Input_LAW_KEEP_INV].[PROD_DESC] As EXHIBIT_LIST," & vbNewLine
        sql += " [Input_LAW_KEEP_INV].[DETAIL] As EXHIBIT_DESC," & vbNewLine
        sql += " [Input_LAW_KEEP_INV].[CAR_NO] As CAR_NO," & vbNewLine
        sql += " [Input_LAW_KEEP_INV].[PROD_TYPE_ID] As DUTY_CODE," & vbNewLine
        sql += " [Input_LAW_KEEP_INV].[COMMENT_INV] As REMARKS," & vbNewLine
        sql += "         '' As CREATE_ON," & vbNewLine
        sql += "         '' As UPDATE_BY," & vbNewLine
        sql += "         '' As UPDATE_ON," & vbNewLine
        sql += " (" & vbNewLine
        sql += " SELECT TOP 1 [Lib_ProductExhibit].[PRODUCT_EXHIBIT_NAME]" & vbNewLine
        sql += " FROM [Lib_ProductExhibit]" & vbNewLine
        sql += " WHERE [Lib_ProductExhibit].[PRODUCT_EXHIBIT_ID]=[Input_LAW_KEEP_INV].[PROD_TYPE_ID]) As PRODUCT_NAME," & vbNewLine
        sql += " (" & vbNewLine
        sql += " SELECT TOP 1 [Lib_BrandExhibit].[BRAND_NAME]" & vbNewLine
        sql += " FROM [Lib_BrandExhibit]" & vbNewLine
        sql += " WHERE [Lib_BrandExhibit].[BRAND_ID]=[Input_LAW_KEEP_INV].[BRAND_ID]) As BRAND_NAME," & vbNewLine
        sql += " [Input_LAW_KEEP_INV].[PACK_SIZE] As SIZES_DESC," & vbNewLine
        sql += " (" & vbNewLine
        sql += " SELECT TOP 1 [Lib_UnitExhibit].[PACK_NAME]" & vbNewLine
        sql += " FROM [Lib_UnitExhibit]" & vbNewLine
        sql += " WHERE [Lib_UnitExhibit].[PACK_ID]=[Input_LAW_KEEP_INV].[PACK_ID]) As SIZES_UNIT_NAME," & vbNewLine
        sql += " (" & vbNewLine
        sql += " SELECT TOP 1 [Lib_UnitExhibit].[PACK_NAME]" & vbNewLine
        sql += " FROM [Lib_UnitExhibit]" & vbNewLine
        sql += " WHERE [Lib_UnitExhibit].[PACK_ID]=[Input_LAW_KEEP_INV].[QTY_ID]) As QTY_UNIT_NAME," & vbNewLine
        sql += " (" & vbNewLine
        sql += " SELECT TOP 1 [Lib_UnitExhibit].[PACK_NAME]" & vbNewLine
        sql += " FROM [Lib_UnitExhibit]" & vbNewLine
        sql += " WHERE [Lib_UnitExhibit].[PACK_ID]=[Input_LAW_KEEP_INV].[WEIGHT_ID]) As NETWEIGHT_UNIT_NAME," & vbNewLine
        sql += " (" & vbNewLine
        sql += " SELECT TOP 1 [Lib_MapDutyCodeGroupID].[GROUP_ID]" & vbNewLine
        sql += " FROM [Lib_MapDutyCodeGroupID]" & vbNewLine
        sql += " INNER JOIN [Lib_Mapping_ProductExhibit] ON [Lib_Mapping_ProductExhibit].[GROUP_ID]=[Lib_MapDutyCodeGroupID].[GROUP_ID]" & vbNewLine
        sql += " WHERE [Lib_Mapping_ProductExhibit].[PRODUCT_TYPE_ID]=[Input_LAW_KEEP_INV].[PROD_TYPE_ID]) As GROUP_ID," & vbNewLine
        sql += " (" & vbNewLine
        sql += " SELECT TOP 1 [Lib_ProductExhibit].[PRODUCT_EXHIBIT_NAME]" & vbNewLine
        sql += " FROM [Lib_ProductExhibit]" & vbNewLine
        sql += " WHERE [Lib_ProductExhibit].[PRODUCT_EXHIBIT_ID]=[Input_LAW_KEEP_INV].[PROD_TYPE_ID]) As DUTY_NAME," & vbNewLine
        sql += " (" & vbNewLine
        sql += " SELECT TOP 1 [Lib_MapDutyCodeGroupID].[GROUP_NAME]" & vbNewLine
        sql += " FROM [Lib_MapDutyCodeGroupID]" & vbNewLine
        sql += " INNER JOIN [Lib_Mapping_ProductExhibit] ON [Lib_Mapping_ProductExhibit].[GROUP_ID]=[Lib_MapDutyCodeGroupID].[GROUP_ID]" & vbNewLine
        sql += " WHERE [Lib_Mapping_ProductExhibit].[PRODUCT_TYPE_ID]=[Input_LAW_KEEP_INV].[PROD_TYPE_ID]) As GROUP_NAME " & vbNewLine
        sql += " FROM [Input_LAW_KEEP_INV] " & vbNewLine
        sql += " WHERE 1=1 " & vbNewLine
        sql += WhText & vbNewLine
        sql += " ) Computation "

        Dim trans As New SqlTransactionDB
        trans.CreateTransaction(SqlDB.GetMappingDBConnection)
        Dim dt As DataTable = SqlDB.ExecuteTable(sql, trans.Trans)
        trans.CommitTransaction()

        Return dt
    End Function

    Public Function GetApplicationArrestTeam(ByVal WhText As String) As DataTable
        Dim sql As String = ""
        sql += "SELECT * FROM (" & vbNewLine
        sql += " SELECT  'APPLICATION_ARREST_TEAM_SEQ.NEXTVAL' As ID," & vbNewLine
        sql += " GETDATE() As CREATE_ON," & vbNewLine
        sql += " [Input_LAW_TEAM].[TRACK_NO] As TRACK_NO," & vbNewLine
        sql += " (" & vbNewLine
        sql += " SELECT TOP 1 [Lib_STAFF_2].[EMPID]"
        sql += " FROM [Lib_STAFF_2]" & vbNewLine
        sql += " WHERE [Lib_STAFF_2].[IDCARD_NO]=[Input_LAW_TEAM].[EMP_ID]" & vbNewLine
        sql += " ) As STAFF_NO," & vbNewLine
        sql += " [Input_LAW_TEAM].[TEAM_NO] As INSPECTOR_CODE," & vbNewLine
        sql += " (" & vbNewLine
        sql += " CASE WHEN [Input_LAW_TEAM].[EMP_POS] IS NOT NULL THEN" & vbNewLine
        sql += "         [Input_LAW_TEAM].[EMP_POS]" & vbNewLine
        sql += " WHEN ISNULL([Input_LAW_TEAM].[POSITION1],'')<>'' AND ISNULL([Input_LAW_TEAM].[LEVEL1],'') <>'' THEN" & vbNewLine
        sql += " 	[Input_LAW_TEAM].[POSITION1] + ' ' + LTRIM(RTRIM(STR([Input_LAW_TEAM].[LEVEL1])))" & vbNewLine
        sql += " ELSE " & vbNewLine
        sql += " 	(" & vbNewLine
        sql += " 		SELECT TOP 1 [Lib_STAFF_2].[POSNAME] " & vbNewLine
        sql += " 		FROM [Lib_STAFF_2]" & vbNewLine
        sql += " 		WHERE [Lib_STAFF_2].[IDCARD_NO]=[Input_LAW_TEAM].[EMP_ID]" & vbNewLine
        sql += " 	)" & vbNewLine
        sql += "             End) As STAFF_POSITION," & vbNewLine
        sql += " [Input_LAW_TEAM].[EMP_ID] As STAFF_IDCARDNO," & vbNewLine
        sql += " (" & vbNewLine
        sql += " SELECT TOP 1 [Lib_STAFF_2].[POSCODE]" & vbNewLine
        sql += " FROM [Lib_STAFF_2]" & vbNewLine
        sql += " WHERE [Lib_STAFF_2].[IDCARD_NO]=[Input_LAW_TEAM].[EMP_ID]" & vbNewLine
        sql += " ) As STAFF_POSCODE," & vbNewLine
        sql += " (" & vbNewLine
        sql += " select top 1 [Lib_Mapping_Staff].[OFFCODE]" & vbNewLine
        sql += " from [Lib_Mapping_Staff]" & vbNewLine
        sql += " where [Lib_Mapping_Staff].[IDCARD_NO]=[Input_LAW_TEAM].[EMP_ID]" & vbNewLine
        sql += " ) As STAFF_OFFCODE " & vbNewLine
        sql += " FROM [Input_LAW_TEAM] " & vbNewLine
        sql += " WHERE 1=1 " & vbNewLine
        sql += WhText
        sql += " ) Computation "

        Dim trans As New SqlTransactionDB
        trans.CreateTransaction(SqlDB.GetMappingDBConnection)
        Dim dt As DataTable = SqlDB.ExecuteTable(sql, trans.Trans)
        trans.CommitTransaction()

        Return dt
    End Function

    Public Function GetApplicationArrestIndictment(ByVal WhText As String) As DataTable
        Dim sql As String = ""
        sql += " SELECT * FROM ("
        sql += " SELECT  'APPLICATIONARRESTINDICTMENTSEQ.NextVal' As ID,"
        'sql += " 0 As CREATE_BY, GETDATE() As CREATE_ON,"
        sql += " [Input_LAW_CASE_DETAIL].[TRACK_NO] As TRACK_NO,"
        sql += " ("
        sql += " SELECT TOP 1 [Lib_Indictment].[INDICTMENT_ID]"
        sql += " FROM [Lib_Indictment]"
        sql += " WHERE [Lib_Indictment].[GUILT_MST_ID]=[Input_LAW_CASE_DETAIL].[CASE_DETAIL_ID]) As INDICTMENT_ID,"
        sql += " ("
        sql += " SELECT TOP 1 [Lib_Indictment].[EXHIBIT_WILD]"
        sql += " FROM [Lib_Indictment]"
        sql += " WHERE [Lib_Indictment].[GUILT_MST_ID]=[Input_LAW_CASE_DETAIL].[CASE_DETAIL_ID]"
        sql += " ) As EXHIBIT_WILD "
        sql += " FROM [Input_LAW_CASE_DETAIL] "
        sql += " WHERE 1=1 "
        sql += WhText
        sql += " ) Computation "

        Dim trans As New SqlTransactionDB
        trans.CreateTransaction(SqlDB.GetMappingDBConnection)
        Dim dt As DataTable = SqlDB.ExecuteTable(sql, trans.Trans)
        trans.CommitTransaction()

        Return dt
    End Function

#End Region

#Region "Save Data To Oracle Table"
    Public Function SaveApplicationArrest(ByVal dr As DataRow, ByVal trans As OracleTransaction) As Boolean
        Dim ret As Boolean = False
        Dim sql As String = ""
        Try
            sql = " INSERT INTO APPLICATION_ARREST (  " & vbNewLine
            sql += " ID, TRACK_NO, APPLICATION_DATE,   " & vbNewLine
            sql += " DEPARTMENT_ID, OFFCODE, LEGISLATION_ID,   " & vbNewLine
            sql += " HAVE_CULPRIT, SCENE_NO,   " & vbNewLine
            sql += " SCENE_SUBDISTRICT, SCENE_DISTRICT, SCENE_PROVINCE,   " & vbNewLine
            sql += " ALLEGED_CO, OCCURRENCE_DATE, GUILTY,   " & vbNewLine
            sql += " OWNER_NAME, BUSINESS_NAME, SURETY_NAME,   " & vbNewLine
            sql += " DUTY,  ORDER_BY,   " & vbNewLine
            sql += " LEADER_POSITION, DIRECTOR_POSITION, BEHAVIOUR,   " & vbNewLine
            sql += " TESTIMONY, FINISHED_TIME, DEPARTMENT_NAME,   " & vbNewLine
            sql += " LAWBREAK_TYPE, ADMINISTRATION, DEL_FLAG,   " & vbNewLine
            sql += " ESTIMATE_FINE, ESTIMATE_FINE_DATE,    " & vbNewLine
            sql += " PRODUCT_GROUP_ID, ACCUSER_TYPE,   " & vbNewLine
            sql += " POLICE_STATION, ACCUSER_IDCARDNO, ACCUSER_OFFCODE,   " & vbNewLine
            sql += " ACCUSER_POSCODE, ISSENTCOURT, ARREST_REPORT_DATE,   " & vbNewLine
            sql += " CREATE_ON,  UPDATE_ON,  " & vbNewLine
            sql += " REPORT_TO_STAFF, ORDER_BY_STAFF,   " & vbNewLine
            sql += " ACCUSER_POSNAME, ACCUSER_OFFNAME, ACCUSER_NAME)   " & vbNewLine
            sql += "VALUES ("
            sql += "" + dr("ID").ToString().Replace("'", "") + ",'"
            sql += dr("TRACK_NO") + "',"
            sql += OracleDB.SetDateTime(System.Convert.ToDateTime(dr("APPLICATION_DATE"))) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("DEPARTMENT_ID")), "null", OracleDB.SetStr(dr("DEPARTMENT_ID").ToString())) + ","
            sql += "" + OracleDB.SetStr(dr("OFFCODE").ToString()) + ","
            sql += "" + OracleDB.SetStr(dr("LEGISLATION_ID").ToString()) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("HAVE_CULPRIT")), "null", OracleDB.SetStr(dr("HAVE_CULPRIT").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("SCENE_NO")), "null", OracleDB.SetStr(dr("SCENE_NO").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("SCENE_SUBDISTRICT")), "null", OracleDB.SetStr(dr("SCENE_SUBDISTRICT").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("SCENE_DISTRICT")), "null", OracleDB.SetStr(dr("SCENE_DISTRICT").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("SCENE_PROVINCE")), "null", OracleDB.SetStr(dr("SCENE_PROVINCE").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("ALLEGED_CO")), "null", OracleDB.SetStr(dr("ALLEGED_CO").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("OCCURRENCE_DATE")), "null", OracleDB.SetDateTime(System.Convert.ToDateTime(dr("OCCURRENCE_DATE")))) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("GUILTY")), "null", OracleDB.SetStr(dr("GUILTY").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("OWNER_NAME")), "null", OracleDB.SetStr(dr("OWNER_NAME").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("BUSINESS_NAME")), "null", OracleDB.SetStr(dr("BUSINESS_NAME").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("SURETY_NAME")), "null", OracleDB.SetStr(dr("SURETY_NAME").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("DUTY")), "null", OracleDB.SetStr(dr("DUTY").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("ORDER_BY")), "null", OracleDB.SetStr(dr("ORDER_BY").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("LEADER_POSITION")), "null", OracleDB.SetStr(dr("LEADER_POSITION").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("DIRECTOR_POSITION")), "null", OracleDB.SetStr(dr("DIRECTOR_POSITION").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("BEHAVIOUR")), "null", OracleDB.SetStr(dr("BEHAVIOUR").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("TESTIMONY")), "null", OracleDB.SetStr(dr("TESTIMONY").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("FINISHED_TIME")), "null", "to_date(" + OracleDB.SetStr(dr("FINISHED_TIME").ToString().Substring(0, 10)) + ",'yyyy-mm-dd')") + ","
            sql += "" + IIf(Convert.IsDBNull(dr("DEPARTMENT_NAME")), "null", OracleDB.SetStr(dr("DEPARTMENT_NAME").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("LAWBREAK_TYPE")), "null", OracleDB.SetStr(dr("LAWBREAK_TYPE").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("ADMINISTRATION")), "null", OracleDB.SetStr(dr("ADMINISTRATION").ToString())) + ",'N',"
            sql += "" + IIf(Convert.IsDBNull(dr("ESTIMATE_FINE")), "null", OracleDB.SetStr(dr("ESTIMATE_FINE").ToString())) + ","
            If Convert.IsDBNull(dr("ESTIMATE_FINE_DATE")) = False Then
                sql += "" + OracleDB.SetDateTime(System.Convert.ToDateTime(dr("ESTIMATE_FINE_DATE"))) + ","
            Else
                sql += "null,"
            End If
            sql += "" + IIf(Convert.IsDBNull(dr("PRODUCT_GROUP_ID")), "null", OracleDB.SetStr(dr("PRODUCT_GROUP_ID").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("ACCUSER_TYPE")), "null", OracleDB.SetStr(dr("ACCUSER_TYPE").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("POLICE_STATION")), "null", OracleDB.SetStr(dr("POLICE_STATION").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("ACCUSER_IDCARDNO")), "null", OracleDB.SetStr(dr("ACCUSER_IDCARDNO").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("ACCUSER_OFFCODE")), "null", OracleDB.SetStr(dr("ACCUSER_OFFCODE").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("ACCUSER_POSCODE")), "null", OracleDB.SetStr(dr("ACCUSER_POSCODE").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("ISSENTCOURT")), "null", OracleDB.SetStr(dr("ISSENTCOURT").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("ARREST_REPORT_DATE")), "null", OracleDB.SetDateTime(System.Convert.ToDateTime(dr("ARREST_REPORT_DATE")))) + ","
            If Convert.IsDBNull(dr("CREATE_ON")) = False Then sql += "" + OracleDB.SetDateTime(Convert.ToDateTime(dr("CREATE_ON"))) + "," Else sql += "null,"
            If Convert.IsDBNull(dr("UPDATE_ON")) = False Then sql += "" + OracleDB.SetDateTime(Convert.ToDateTime(dr("UPDATE_ON"))) + "," Else sql += "null,"
            sql += "" + IIf(Convert.IsDBNull(dr("REPORT_TO_STAFF")), "null", OracleDB.SetStr(dr("REPORT_TO_STAFF").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("ORDER_BY_STAFF")), "null", OracleDB.SetStr(dr("ORDER_BY_STAFF").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("ACCUSER_POSNAME")), "null", OracleDB.SetStr(dr("ACCUSER_POSNAME").ToString())) + ","
            sql += "" + IIf(Convert.IsDBNull(dr("ACCUSER_OFFNAME")), "null", OracleDB.SetStr(dr("ACCUSER_OFFNAME").ToString())) + "," + IIf(Convert.IsDBNull(dr("ACCUSER_NAME")), "null", OracleDB.SetStr(dr("ACCUSER_NAME").ToString()))
            sql += ")"

            ret = (OracleDB.ExecuteNonQuery(sql, trans) > 0)
            If ret = False Then
                CreateLogFile("Cannot Insert Application Arrest : " & sql)
            End If
        Catch ex As OracleException
            CreateLogFile("OracleException : " & ex.Message & " ### " & ex.StackTrace & "    " & sql)
        Catch ex As Exception
            CreateLogFile("Exception : " & ex.Message & " ### " & ex.StackTrace & "    " & sql)
        End Try

        Return ret
    End Function

    Public Function SaveBookImpeachment(ByVal dr As DataRow, ByVal trans As OracleTransaction) As Long
        Dim vID As Long = 0

        Dim sql As String = ""
        Try
            sql = "INSERT INTO BOOK_IMPEACHMENT (  " & vbNewLine
            sql += " ID, CASE_ID, CASE_DATE,  " & vbNewLine
            sql += " STAFF_ID_SUE, TRACK_NO,  " & vbNewLine
            sql += " CREATE_BY, CREATE_ON,   " & vbNewLine
            sql += " CASE_QUALITY, CASE_LAST, CASE_RESULT,  " & vbNewLine
            sql += " CASE_LAST_DATE, CASE_FINE)  " & vbNewLine

            vID = OracleDB.GetNextSeqID(dr("BOOK_IMPEACHMENT_ID").ToString().Replace("'", ""), trans)
            sql += " VALUES ('" + vID.ToString + "'," + IIf(Convert.IsDBNull(dr("CASE_ID")), "null", OracleDB.SetStr(dr("CASE_ID").ToString())) + ","
            If Convert.IsDBNull(dr("CASE_DATE")) = False Then
                sql += "" + OracleDB.SetDateTime(Convert.ToDateTime(dr("CASE_DATE"))) + ","
            Else
                sql += "null,"
            End If
            sql += "" + IIf(Convert.IsDBNull(dr("STAFF_ID_SUE")), "null", OracleDB.SetStr(dr("STAFF_ID_SUE").ToString())) + "," + IIf(Convert.IsDBNull(dr("TRACK_NO")), "null", OracleDB.SetStr(dr("TRACK_NO").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("BOOK_CREATE_BY")), "null", OracleDB.SetStr(dr("BOOK_CREATE_BY").ToString())) + ","

            If Convert.IsDBNull(dr("BOOK_CREATE_ON")) = False Then
                sql += "" + OracleDB.SetDateTime(Convert.ToDateTime(dr("BOOK_CREATE_ON").ToString())) + ","
            Else
                sql += "null,"
            End If
            sql += "" + IIf(Convert.IsDBNull(dr("CASE_QUALITY")), "null", OracleDB.SetStr(dr("CASE_QUALITY").ToString())) + "," + IIf(Convert.IsDBNull(dr("CASE_LAST")), "null", OracleDB.SetStr(dr("CASE_LAST").ToString())) + "," + IIf(Convert.IsDBNull(dr("CASE_RESULT")), "null", OracleDB.SetStr(dr("CASE_RESULT").ToString())) + ",  " & vbNewLine
            If Convert.IsDBNull(dr("CASE_LAST_DATE")) = False Then
                sql += "" + OracleDB.SetDateTime(Convert.ToDateTime(dr("CASE_LAST_DATE").ToString())) + ","
            Else
                sql += "null,"
            End If
            sql += IIf(Convert.IsDBNull(dr("CASE_FINE")), "null", OracleDB.SetStr(dr("CASE_FINE").ToString()))
            sql += ")"

            Dim ret As Boolean = False
            ret = (OracleDB.ExecuteNonQuery(sql, trans) > 0)
            If ret = False Then
                vID = 0
                CreateLogFile("Cannot Insert Book Impeachment : " & sql)
            End If
        Catch ex As OracleException
            vID = 0
            CreateLogFile("OracleException : " & ex.Message & " ### " & ex.Message & " ### " & ex.StackTrace & "    " & sql)
        Catch ex As Exception
            vID = 0
            CreateLogFile("Exception : " & ex.Message & " ### " & ex.StackTrace & "    " & sql)
        End Try

        Return vID
    End Function

    Public Function SaveCompareCase(ByVal dr As DataRow, ByVal vCaseID As Long, ByVal trans As OracleTransaction) As Boolean
        Dim ret As Boolean = False
        Dim sql As String = ""
        Try
            sql = "INSERT INTO COMPARE_CASE (  " & vbNewLine
            sql += " ID,  " & vbNewLine
            sql += " COMPARE_CASE_NO,  " & vbNewLine
            sql += " COMPARE_CASE_DATE,  " & vbNewLine
            sql += " TRACK_NO,  " & vbNewLine
            sql += " COMPARE_OFFICE,  " & vbNewLine
            sql += " COMPARE_DISTRICT,  " & vbNewLine
            sql += " COMPARE_PROVINCE,  " & vbNewLine
            sql += " ACCUSER_SUBDISTRICT,  " & vbNewLine
            sql += " ACCUSER_DISTRICT,  " & vbNewLine
            sql += " ACCUSER_PROVINCE,  " & vbNewLine
            sql += " INDICTMENT_ID,  " & vbNewLine
            sql += " ACCUSER_TESTIMONY,  " & vbNewLine
            sql += " CASE_ID,  " & vbNewLine
            sql += " COURT_FINE,  " & vbNewLine
            sql += " COURT_FINE_DATE, " & vbNewLine
            sql += " PAY_DATE,  " & vbNewLine
            sql += " TREASURY_MONEY_P,  " & vbNewLine
            sql += " BRIBE_MONEY_P,  " & vbNewLine
            sql += " REWARD_MONEY_P,  " & vbNewLine
            sql += " TREASURY_MONEY,  " & vbNewLine
            sql += " BIRBE_MONEY,  " & vbNewLine
            sql += " REWARD_MONEY,  " & vbNewLine
            sql += " CREATE_BY,  " & vbNewLine
            sql += " CREATE_ON,  " & vbNewLine
            sql += " UPDATE_BY,  " & vbNewLine
            sql += " UPDATE_ON,  " & vbNewLine
            sql += " COMPARE_AUTHORITY_ID,  " & vbNewLine
            sql += " MANAGE_TYPE,  " & vbNewLine
            sql += " CASE_STATUS,  " & vbNewLine
            sql += " CASE_FINE,  " & vbNewLine
            sql += " SUE_STAFF_IDCARDNO,  " & vbNewLine
            sql += " CASE_TOTAL_FINE)  " & vbNewLine
            sql += " VALUES ("
            sql += "" + dr("COMPARE_CASE_ID") + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("COMPARE_CASE_NO")), "null", OracleDB.SetStr(dr("COMPARE_CASE_NO").ToString())) + ",  " & vbNewLine
            If Convert.IsDBNull(dr("COMPARE_CASE_DATE")) = False Then
                sql += "" + OracleDB.SetDateTime(Convert.ToDateTime(dr("COMPARE_CASE_DATE"))) + ","
            Else
                sql += "null,"
            End If
            sql += "" + IIf(Convert.IsDBNull(dr("TRACK_NO")), "null", OracleDB.SetStr(dr("TRACK_NO").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("COMPARE_OFFICE")), "null", OracleDB.SetStr(dr("COMPARE_OFFICE").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("COMPARE_DISTRICT")), "null", OracleDB.SetStr(dr("COMPARE_DISTRICT").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("COMPARE_PROVINCE")), "null", OracleDB.SetStr(dr("COMPARE_PROVINCE").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("ACCUSER_SUBDISTRICT")), "null", OracleDB.SetStr(dr("ACCUSER_SUBDISTRICT").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("ACCUSER_DISTRICT")), "null", OracleDB.SetStr(dr("ACCUSER_DISTRICT").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("ACCUSER_PROVINCE")), "null", OracleDB.SetStr(dr("ACCUSER_PROVINCE").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("INDICTMENT_ID")), "null", OracleDB.SetStr(dr("INDICTMENT_ID").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("ACCUSER_TESTIMONY")), "null", OracleDB.SetStr(dr("ACCUSER_TESTIMONY").ToString())) + ",  " & vbNewLine
            sql += " '" + vCaseID.ToString + "',  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("COURT_FINE")), "null", OracleDB.SetStr(dr("COURT_FINE").ToString())) + ",  " & vbNewLine
            If Convert.IsDBNull(dr("COURT_FINE_DATE")) = False Then
                sql += "" + OracleDB.SetDateTime(Convert.ToDateTime(dr("COURT_FINE_DATE"))) + ","
            Else
                sql += "null,"
            End If
            If Convert.IsDBNull(dr("PAY_DATE")) = False Then
                sql += "" + OracleDB.SetDateTime(Convert.ToDateTime(dr("PAY_DATE"))) + ","
            Else
                sql += "null,"
            End If

            sql += "" + IIf(Convert.IsDBNull(dr("TREASURY_MONEY_P")), "null", OracleDB.SetStr(dr("TREASURY_MONEY_P").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("BRIBE_MONEY_P")), "null", OracleDB.SetStr(dr("BRIBE_MONEY_P").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("REWARD_MONEY_P")), "null", OracleDB.SetStr(dr("REWARD_MONEY_P").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("TREASURY_MONEY")), "null", OracleDB.SetStr(dr("TREASURY_MONEY").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("BIRBE_MONEY")), "null", OracleDB.SetStr(dr("BIRBE_MONEY").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("REWARD_MONEY")), "null", OracleDB.SetStr(dr("REWARD_MONEY").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("COMPARE_CASE_CREATE_BY")), "null", OracleDB.SetStr(dr("COMPARE_CASE_CREATE_BY").ToString())) + ",  " & vbNewLine

            If Convert.IsDBNull(dr("COMPARE_CASE_CREATE_ON")) = False Then
                sql += "" + OracleDB.SetDateTime(Convert.ToDateTime(dr("COMPARE_CASE_CREATE_ON"))) + ","
            Else
                sql += "null,"
            End If

            sql += "" + IIf(Convert.IsDBNull(dr("COMPARE_CASE_UPDATE_BY")), "null", OracleDB.SetStr(dr("COMPARE_CASE_UPDATE_BY").ToString())) + ",  " & vbNewLine

            If Convert.IsDBNull(dr("COMPARE_CASE_UPDATE_ON")) = False Then
                sql += "" + OracleDB.SetDateTime(Convert.ToDateTime(dr("COMPARE_CASE_UPDATE_ON"))) + ","
            Else
                sql += "null,"
            End If
            sql += "'1','2',  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("CASE_STATUS")), "null", OracleDB.SetStr(dr("CASE_STATUS").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("CASE_FINE")), "null", OracleDB.SetStr(dr("CASE_FINE").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("SUE_STAFF_IDCARDNO")), "null", OracleDB.SetStr(dr("SUE_STAFF_IDCARDNO").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("CASE_TOTAL_FINE")), "null", OracleDB.SetStr(dr("CASE_TOTAL_FINE").ToString())) + " " & vbNewLine
            sql += ")"

            ret = (OracleDB.ExecuteNonQuery(sql, trans) > 0)
            If ret = False Then
                CreateLogFile("Cannot Compare Case : " & sql)
            End If
        Catch ex As OracleException
            CreateLogFile("OracleException : " & ex.Message & " ### " & ex.StackTrace & "    " & sql)
        Catch ex As Exception
            CreateLogFile("Exception : " & ex.Message & " ### " & ex.StackTrace & "    " & sql)
        End Try
    End Function

    Public Function SaveApplicationArrestProve(ByVal dr As DataRow, ByVal vCaseID As Long, ByVal trans As OracleTransaction) As Boolean
        Dim ret As Boolean = False
        Dim sql As String = ""
        Try
            sql = "INSERT INTO APPLICATION_ARREST_PROVE (  " & vbNewLine
            sql += " ID,   " & vbNewLine
            sql += " TRACK_NO,   " & vbNewLine
            sql += " EXHIBIT_REPORT_NO,   " & vbNewLine
            sql += " CASE_ID,   " & vbNewLine
            sql += " STAFF_IDCARDNO_PROVE,   " & vbNewLine
            sql += " TAKEN_DATE,   " & vbNewLine
            sql += " REPLACE_POSITION,  " & vbNewLine
            sql += " ORDER_DESC,   " & vbNewLine
            sql += " CREATE_BY,   " & vbNewLine
            sql += " CREATE_ON,   " & vbNewLine
            sql += " STATUS,   " & vbNewLine
            sql += " STAFF_PROVE_POSCODE,   " & vbNewLine
            sql += " STAFF_PROVE_OFFCODE,   " & vbNewLine
            sql += " REPORT_DESC)   " & vbNewLine
            sql += " VALUES (  " & vbNewLine
            sql += "" + dr("APPLICATION_ARREST_PROVE_ID") + ",  " & vbNewLine
            sql += "" + OracleDB.SetStr(dr("TRACK_NO").ToString()) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("EXHIBIT_REPORT_NO")), "null", OracleDB.SetStr(dr("EXHIBIT_REPORT_NO").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(vCaseID.ToString() <> "0", vCaseID.ToString(), "null") + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("STAFF_IDCARDNO_PROVE")), "null", OracleDB.SetStr(dr("STAFF_IDCARDNO_PROVE").ToString())) + ",  " & vbNewLine
            If Convert.IsDBNull(dr("TAKEN_DATE")) = False Then
                sql += "" + OracleDB.SetDateTime(Convert.ToDateTime(dr("TAKEN_DATE"))) + ","
            Else
                sql += "null,"
            End If
            sql += "" + IIf(Convert.IsDBNull(dr("REPLACE_POSITION")), "null", OracleDB.SetStr(dr("REPLACE_POSITION").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("ORDER_DESC")), "null", OracleDB.SetStr(dr("ORDER_DESC").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("APPLICATION_ARREST_PROVE_CREATE_BY")), "null", OracleDB.SetStr(dr("APPLICATION_ARREST_PROVE_CREATE_BY").ToString())) + ",  " & vbNewLine
            If Convert.IsDBNull(dr("APPLICATION_ARREST_PROVE_CREATE_ON")) = False Then
                sql += "" + OracleDB.SetDateTime(Convert.ToDateTime(dr("APPLICATION_ARREST_PROVE_CREATE_ON"))) + ","
            Else
                sql += "null,"
            End If
            sql += "" + IIf(Convert.IsDBNull(dr("STATUS")), "null", OracleDB.SetStr(dr("STATUS").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("STAFF_PROVE_POSCODE")), "null", OracleDB.SetStr(dr("STAFF_PROVE_POSCODE").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("STAFF_PROVE_OFFCODE")), "null", OracleDB.SetStr(dr("STAFF_PROVE_OFFCODE").ToString())) + ",  " & vbNewLine
            sql += "" + IIf(Convert.IsDBNull(dr("REPORT_DESC")), "null", OracleDB.SetStr(dr("REPORT_DESC").ToString())) + "  " & vbNewLine
            sql += ")"
            ret = (OracleDB.ExecuteNonQuery(sql, trans) > 0)
            If ret = False Then
                CreateLogFile("Cannot Insert Application Arrest Prove : " & sql)
            End If
        Catch ex As OracleException
            CreateLogFile("OracleException : " & ex.Message & " ### " & ex.StackTrace & "    " & sql)
        Catch ex As Exception
            CreateLogFile("Exception : " & ex.Message & " ### " & ex.StackTrace & "    " & sql)
        End Try

        Return ret
    End Function

    Public Function SaveApplicationArrestLawbreaker(ByVal vTrackNo As String, ByVal trans As OracleTransaction) As Boolean
        Dim ret As Boolean = False
        Dim dt As DataTable = GetApplicationArrestLawbreaker("and [Input_LAW_BAD].[TRACK_NO]='" & vTrackNo & "'")
        If dt.Rows.Count > 0 Then
            For Each dr As DataRow In dt.Rows
                Dim sql As String = ""
                Try
                    sql = " INSERT INTO APPLICATION_ARREST_LAWBREAKER ("
                    sql += " ID, TRACK_NO, LAWBREAKER_NO, "
                    sql += " CULPRIT_TYPE, LAWBREAKER_ID_CARD, LAWBREAKER_PASSPORT, "
                    sql += " FIRST_NAME, LAST_NAME, "
                    sql += " ADDRESS_NO, SOI, ROAD, "
                    sql += " MOO, SUBDISTRICT, DISTRICT, "
                    sql += " PROVINCE, NATIONALITY_ID, RACE_ID, "
                    sql += " CAREER, AGE, FATHER_NAME, "
                    sql += " MOTHER_NAME, PAID_TIME_OFF, INVCODE, "
                    sql += " FINE, BOOK_NO, INV_NO, "
                    sql += " ISCANCEL, CANCEL_DATE, CANCEL_BY, "
                    sql += " CREATE_BY, CREATE_ON, UPDATE_BY, "
                    sql += " UPDATE_ON, TITLE_CODE, SEX, "
                    sql += " BIRTH_DATE, OTHER_NAME, EXCISE_REG_NO, "
                    sql += " CORPORATION_CODE, COMPANY_TITLE_CODE, COMPANY_NAME, "
                    sql += " PAPER_NO, ISMISTAKE, ISMISTAKE_DESC) "
                    sql += " VALUES("
                    sql += "" & dr("id") & "," & OracleDB.SetStr(dr("TRACK_NO")) & "," & IIf(Convert.IsDBNull(dr("LAWBREAKER_NO")), "null", OracleDB.SetStr(dr("LAWBREAKER_NO"))) & ","
                    sql += "" & IIf(Convert.IsDBNull(dr("CULPRIT_TYPE")), "null", OracleDB.SetStr(dr("CULPRIT_TYPE"))) & ","
                    If Convert.IsDBNull(dr("LAWBREAKER_ID_CARD")) = False Then sql += OracleDB.SetStr(dr("LAWBREAKER_ID_CARD")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("LAWBREAKER_PASSPORT")) = False Then sql += OracleDB.SetStr(dr("LAWBREAKER_PASSPORT")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("FIRST_NAME")) = False Then sql += OracleDB.SetStr(dr("FIRST_NAME")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("LAST_NAME")) = False Then sql += OracleDB.SetStr(dr("LAST_NAME")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("ADDRESS_NO")) = False Then sql += OracleDB.SetStr(dr("ADDRESS_NO")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("SOI")) = False Then sql += OracleDB.SetStr(dr("SOI")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("ROAD")) = False Then sql += OracleDB.SetStr(dr("ROAD")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("MOO")) = False Then sql += OracleDB.SetStr(dr("MOO")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("SUBDISTRICT")) = False Then sql += OracleDB.SetStr(dr("SUBDISTRICT")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("DISTRICT")) = False Then sql += OracleDB.SetStr(dr("DISTRICT")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("PROVINCE")) = False Then sql += OracleDB.SetStr(dr("PROVINCE")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("NATIONALITY_ID")) = False Then sql += OracleDB.SetStr(dr("NATIONALITY_ID")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("RACE_ID")) = False Then sql += OracleDB.SetStr(dr("RACE_ID")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("CAREER")) = False Then sql += OracleDB.SetStr(dr("CAREER")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("AGE")) = False Then sql += OracleDB.SetStr(dr("AGE")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("FATHER_NAME")) = False Then sql += OracleDB.SetStr(dr("FATHER_NAME")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("MOTHER_NAME")) = False Then sql += OracleDB.SetStr(dr("MOTHER_NAME")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("PAID_TIME_OFF")) = False Then sql += OracleDB.SetStr(dr("PAID_TIME_OFF")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("INVCODE")) = False Then sql += OracleDB.SetStr(dr("INVCODE")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("FINE")) = False Then sql += OracleDB.SetStr(dr("FINE")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("BOOK_NO")) = False Then sql += OracleDB.SetStr(dr("BOOK_NO")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("INV_NO")) = False Then sql += OracleDB.SetStr(dr("INV_NO")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("ISCANCEL")) = False Then sql += OracleDB.SetStr(dr("ISCANCEL")) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("CANCEL_BY")) = False Then sql += OracleDB.SetStr(dr("CANCEL_BY")) & "," Else sql += "null,"
                    sql += "null,"
                    sql += "null,"
                    sql += "null,"
                    sql += "null,"
                    sql += "null,"
                    sql += "null,"
                    sql += "null,"
                    sql += "null,"
                    sql += "null,"
                    sql += "null,"
                    sql += "null,"
                    sql += "null,"
                    sql += "null,"
                    sql += "null,"
                    sql += "'N',"
                    sql += "null"
                    sql += ")"

                    ret = (OracleDB.ExecuteNonQuery(sql, trans) > 0)
                    If ret = False Then
                        CreateLogFile("Cannot Insert Application Arrest Lawbreaker : " & sql)
                    End If
                Catch ex As OracleException
                    CreateLogFile("OracleException : " & ex.Message & " ### " & ex.StackTrace & "    " & sql)
                Catch ex As Exception
                    CreateLogFile("Exception : " & ex.Message & " ### " & ex.StackTrace & "    " & sql)
                End Try
            Next
        End If

        Return ret
    End Function

    Public Function SaveApplicationArrestExhibit(ByVal vTrackNO As String, ByVal trans As OracleTransaction) As Boolean
        Dim ret As Boolean = False
        Dim dt As DataTable = GetApplicationArrestExhibit("and [Input_LAW_KEEP_INV].[TRACK_NO]='" & vTrackNO & "'")
        If dt.Rows.Count > 0 Then
            For Each dr As DataRow In dt.Rows
                Dim sql As String = ""
                Try
                    sql = "INSERT INTO APPLICATION_ARREST_EXHIBIT (  " & vbNewLine
                    sql += " ID,   " & vbNewLine
                    sql += " TRACK_NO,  " & vbNewLine
                    sql += " ISEXHIBITCO,   " & vbNewLine
                    sql += " BRAND_CODE,   " & vbNewLine
                    sql += " ISDOMESTIC,   " & vbNewLine
                    sql += " SIZE_UNIT_CODE,   " & vbNewLine
                    sql += " QTY,   " & vbNewLine
                    sql += " QTY_UNIT_CODE,   " & vbNewLine
                    sql += " NETWEIGHT,   " & vbNewLine
                    sql += " NETWEIGHT_UNIT_CODE,   " & vbNewLine
                    sql += " STATUS,   " & vbNewLine
                    sql += " EXHIBIT_LIST,  " & vbNewLine
                    sql += " EXHIBIT_DESC,   " & vbNewLine
                    sql += " CAR_NO,   " & vbNewLine
                    sql += " DUTY_CODE,   " & vbNewLine
                    sql += " REMARKS,   " & vbNewLine
                    sql += " PRODUCT_NAME,   " & vbNewLine
                    sql += " BRAND_NAME,   " & vbNewLine
                    sql += " SIZES_DESC,   " & vbNewLine
                    sql += " SIZES_UNIT_NAME,   " & vbNewLine
                    sql += " QTY_UNIT_NAME,   " & vbNewLine
                    sql += " NETWEIGHT_UNIT_NAME,   " & vbNewLine
                    sql += " GROUP_ID,   " & vbNewLine
                    sql += " DUTY_NAME,   " & vbNewLine
                    sql += " GROUP_NAME)   " & vbNewLine
                    sql += "VALUES ("
                    sql += "APPLICATION_ARREST_EXHIBIT_SEQ.nextval,  " & vbNewLine
                    sql += "'" + vTrackNO + "',  " & vbNewLine
                    sql += "'N',  " & vbNewLine
                    If Convert.IsDBNull(dr("BRAND_CODE")) = False Then sql += OracleDB.SetStr(dr("BRAND_CODE").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("ISDOMESTIC")) = False Then sql += OracleDB.SetStr(dr("ISDOMESTIC").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("SIZE_UNIT_CODE")) = False Then sql += OracleDB.SetStr(dr("SIZE_UNIT_CODE").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("QTY")) = False Then sql += OracleDB.SetStr(dr("QTY").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("QTY_UNIT_CODE")) = False Then sql += OracleDB.SetStr(dr("QTY_UNIT_CODE").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("NETWEIGHT")) = False Then sql += OracleDB.SetStr(dr("NETWEIGHT").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("NETWEIGHT_UNIT_CODE")) = False Then sql += OracleDB.SetStr(dr("NETWEIGHT_UNIT_CODE").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("STATUS")) = False Then sql += OracleDB.SetStr(dr("STATUS").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("EXHIBIT_LIST")) = False Then sql += OracleDB.SetStr(dr("EXHIBIT_LIST").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("EXHIBIT_DESC")) = False Then sql += OracleDB.SetStr(dr("EXHIBIT_DESC").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("CAR_NO")) = False Then sql += OracleDB.SetStr(dr("CAR_NO").ToString()) & "," Else sql += "null,"

                    If Convert.IsDBNull(dr("DUTY_CODE")) = False Then sql += OracleDB.SetStr(dr("DUTY_CODE").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("REMARKS")) = False Then sql += OracleDB.SetStr(dr("REMARKS").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("PRODUCT_NAME")) = False Then sql += OracleDB.SetStr(dr("PRODUCT_NAME").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("BRAND_NAME")) = False Then sql += OracleDB.SetStr(dr("BRAND_NAME").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("SIZES_DESC")) = False Then sql += OracleDB.SetStr(dr("SIZES_DESC").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("SIZES_UNIT_NAME")) = False Then sql += OracleDB.SetStr(dr("SIZES_UNIT_NAME").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("QTY_UNIT_NAME")) = False Then sql += OracleDB.SetStr(dr("QTY_UNIT_NAME").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("NETWEIGHT_UNIT_NAME")) = False Then sql += OracleDB.SetStr(dr("NETWEIGHT_UNIT_NAME").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("GROUP_ID")) = False Then sql += OracleDB.SetStr(dr("GROUP_ID").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("DUTY_NAME")) = False Then sql += OracleDB.SetStr(dr("DUTY_NAME").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("GROUP_NAME")) = False Then sql += OracleDB.SetStr(dr("GROUP_NAME").ToString()) Else sql += "null"
                    sql += ")"

                    ret = (OracleDB.ExecuteNonQuery(sql, trans) > 0)
                    If ret = False Then
                        CreateLogFile("Cannot Insert Application Arrest Indictment : " & sql)
                    End If
                Catch ex As OracleException
                    CreateLogFile("OracleException : " & ex.Message & " ### " & ex.StackTrace & "    " & sql)
                Catch ex As Exception
                    CreateLogFile("Exception : " & ex.Message & " ### " & ex.StackTrace & "    " & sql)
                End Try
            Next
        End If

        Return ret
    End Function

    Public Function SaveApplicationArrestTeam(ByVal vTrackNO As String, ByVal trans As OracleTransaction) As Boolean
        Dim ret As Boolean = False
        Dim dt As DataTable = GetApplicationArrestTeam("and [Input_LAW_TEAM].[TRACK_NO]='" & vTrackNO & "'")
        If dt.Rows.Count > 0 Then
            For Each dr As DataRow In dt.Rows
                Dim sql As String = ""
                Try
                    sql = "INSERT INTO APPLICATION_ARREST_TEAM ("
                    sql += " ID,  CREATE_ON,  TRACK_NO, "
                    sql += " STAFF_NO, INSPECTOR_CODE, STAFF_POSITION, "
                    sql += " STAFF_IDCARDNO, STAFF_POSCODE, "
                    sql += " STAFF_OFFCODE) "
                    sql += "VALUES("
                    sql += "" & dr("id") & ",  " & vbNewLine
                    sql += "" & OracleDB.SetDateTime(DateTime.Now) & ", "
                    If Convert.IsDBNull(dr("TRACK_NO")) = False Then sql += OracleDB.SetStr(dr("TRACK_NO").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("STAFF_NO")) = False Then sql += OracleDB.SetStr(dr("STAFF_NO").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("INSPECTOR_CODE")) = False Then sql += OracleDB.SetStr(dr("INSPECTOR_CODE").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("STAFF_POSITION")) = False Then sql += OracleDB.SetStr(dr("STAFF_POSITION").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("STAFF_IDCARDNO")) = False Then sql += OracleDB.SetStr(dr("STAFF_IDCARDNO").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("STAFF_POSCODE")) = False Then sql += OracleDB.SetStr(dr("STAFF_POSCODE").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("STAFF_OFFCODE")) = False Then sql += OracleDB.SetStr(dr("STAFF_OFFCODE").ToString()) Else sql += "null"
                    sql += ")"

                    ret = (OracleDB.ExecuteNonQuery(sql, trans) > 0)
                    If ret = False Then
                        CreateLogFile("Cannot Insert Application Arrest Team : " & sql)
                    End If
                Catch ex As OracleException
                    CreateLogFile("OracleException : " & ex.Message & " ### " & ex.StackTrace & "    " & sql)
                Catch ex As Exception
                    CreateLogFile("Exception : " & ex.Message & " ### " & ex.StackTrace & "    " & sql)
                End Try
            Next
        End If

        Return ret
    End Function

    Public Function SaveApplicationArrestIndictment(ByVal vTrackNO As String, ByVal trans As OracleTransaction) As Boolean
        Dim ret As Boolean = False
        Dim dt As DataTable = GetApplicationArrestIndictment("and [Input_LAW_CASE_DETAIL].[TRACK_NO]='" & vTrackNO & "'")
        If dt.Rows.Count > 0 Then
            For Each dr As DataRow In dt.Rows
                Dim sql As String = ""
                Try
                    sql = " INSERT INTO APPLICATION_ARREST_INDICTMENT ("
                    sql += " ID, CREATE_BY, CREATE_ON, "
                    sql += "  TRACK_NO,  INDICTMENT_ID, EXHIBIT_WILD) "
                    sql += " VALUES ("
                    sql += "" & dr("id") & ", 0, " & vbNewLine
                    sql += "" & OracleDB.SetDateTime(DateTime.Now) & ", "
                    If Convert.IsDBNull(dr("TRACK_NO")) = False Then sql += OracleDB.SetStr(dr("TRACK_NO").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("INDICTMENT_ID")) = False Then sql += OracleDB.SetStr(dr("INDICTMENT_ID").ToString()) & "," Else sql += "null,"
                    If Convert.IsDBNull(dr("EXHIBIT_WILD")) = False Then sql += OracleDB.SetStr(dr("EXHIBIT_WILD").ToString()) Else sql += "null"
                    sql += ")"

                    ret = (OracleDB.ExecuteNonQuery(sql, trans) > 0)
                    If ret = False Then
                        CreateLogFile("Cannot Insert Application Arrest Indictment : " & sql)
                    End If
                Catch ex As OracleException
                    CreateLogFile("OracleException : " & ex.Message & " ### " & ex.StackTrace & "    " & sql)
                Catch ex As Exception
                    CreateLogFile("Exception : " & ex.Message & " ### " & ex.StackTrace & "    " & sql)
                End Try
            Next
        End If

        Return ret
    End Function

    Public Function SaveAppArrestProveExhibit(ByVal dr As DataRow, ByVal vCaseID As Long, ByVal trans As OracleTransaction) As Boolean
        Dim ret As Boolean = False
        Dim sql As String = ""
        Try
            sql = " INSERT INTO APP_ARREST_PROVE_EXHIBIT ("
            sql += " ID, TRACK_NO, DUTY_CODE, "
            sql += " PRODUCT_CODE, BRAND_CODE, ISDOMESTIC, "
            sql += " SIZES_CODE, SIZE_UNIT_CODE, QTY, "
            sql += " QTY_UNIT_CODE, NETWEIGHT, NETWEIGHT_UNIT_CODE, "
            sql += " STATUS, EXHIBIT_LIST, EXHIBIT_DESC, "
            sql += " CAR_NO, APP_ARREST_PROVE_EXHIBIT_ID, REMARKS, "
            sql += " CREATE_BY, CREATE_ON, UPDATE_BY, "
            sql += " UPDATE_ON, PRODUCT_NAME, BRAND_NAME, "
            sql += " SIZES_DESC, SIZES_UNIT_NAME, QTY_UNIT_NAME, "
            sql += " NETWEIGHT_UNIT_NAME, GROUP_ID, DUTY_NAME, "
            sql += " GROUP_NAME) "

            sql += " VALUES (  " & vbNewLine
            sql += "" + "APP_ARREST_PROVE_EXHIBIT_SEQ.NextVal,  " & vbNewLine
            sql += "" + OracleDB.SetStr(dr("TRACK_NO").ToString()) + ",  " & vbNewLine
            
        Catch ex As Exception

        End Try
    End Function
#End Region

    Public Sub DeleteCaseByTrackNo(ByVal vTrackNo As String)
        Dim trans As New OracleTransactionDB
        Try

            If trans.CreateTransaction(OracleDB.GetNewConnection) = True Then
                OracleDB.ExecuteNonQuery("delete from application_arrest_team where track_no='" & vTrackNo & "'", trans.Trans)
                OracleDB.ExecuteNonQuery("delete from application_arrest_prove where track_no='" & vTrackNo & "'", trans.Trans)
                OracleDB.ExecuteNonQuery("delete from application_arrest_lawbreaker where track_no='" & vTrackNo & "'", trans.Trans)
                OracleDB.ExecuteNonQuery("delete from application_arrest_indictment where track_no='" & vTrackNo & "'", trans.Trans)
                OracleDB.ExecuteNonQuery("delete from application_arrest_exhibit where track_no='" & vTrackNo & "'", trans.Trans)
                OracleDB.ExecuteNonQuery("delete from APP_ARREST_PROVE_EXHIBIT where track_no='" & vTrackNo & "'", trans.Trans)
                DeleteCompareCase(vTrackNo, trans.Trans)
                OracleDB.ExecuteNonQuery("delete from book_impeachment where track_no='" & vTrackNo & "'", trans.Trans)

                'OracleDB.ExecuteNonQuery("delete from compare_case where track_no='" & vTrackNo & "'", trans.Trans)

                OracleDB.ExecuteNonQuery("delete from application_arrest where track_no='" & vTrackNo & "'", trans.Trans)

                trans.CommitTransaction()
            End If
        Catch ex As Exception
            trans.RollbackTransaction()

            MessageBox.Show("Exception : " & ex.Message & ex.StackTrace)
        End Try

    End Sub

    Private Sub DeleteCompareCase(ByVal vTrackNo As String, ByVal trans As OracleTransaction)
        Dim cDt As New DataTable
        cDt = Utilities.OracleDB.ExecuteTable("select id from compare_case where track_no='" & vTrackNo & "'", trans)
        If cDt.Rows.Count > 0 Then
            Dim CompareCaseID As String = cDt.Rows(0)("id")
            Dim reReqDt As New DataTable
            reReqDt = Utilities.OracleDB.ExecuteTable("select id from APPLICATION_REWARD_REQUEST where COMPARE_CASE_ID='" & CompareCaseID & "'", trans)
            If reReqDt.Rows.Count > 0 Then
                Dim ReReqID As String = reReqDt.Rows(0)("id")
                OracleDB.ExecuteNonQuery("delete from application_reqard_req_alcohol where APPLICATION_REWARD_REQUEST_ID = '" & ReReqID & "'")
                OracleDB.ExecuteNonQuery("delete from application_reqard_req_report where APPLICATION_REWARD_REQUEST_ID = '" & ReReqID & "'")
                OracleDB.ExecuteNonQuery("delete from application_reqard_req_tax where APPLICATION_REWARD_REQUEST_ID = '" & ReReqID & "'")
                OracleDB.ExecuteNonQuery("delete from application_reqard_req_team where APPLICATION_REWARD_REQUEST_ID = '" & ReReqID & "'")
                OracleDB.ExecuteNonQuery("delete from application_reqard_req_tobacco where APPLICATION_REWARD_REQUEST_ID = '" & ReReqID & "'")

                Utilities.OracleDB.ExecuteNonQuery("delete from APPLICATION_REWARD_REQUEST where id='" & ReReqID & "' ", trans)
            End If
            reReqDt = Nothing

            Dim AppReqApproveCompareDT As New DataTable
            AppReqApproveCompareDT = Utilities.OracleDB.ExecuteTable("select id from app_req_approve_compare where COMPARE_CASE_ID='" & CompareCaseID & "'", trans)
            If AppReqApproveCompareDT.Rows.Count > 0 Then
                Dim AppReqApproveCompareID As String = AppReqApproveCompareDT.Rows(0)("id")
                OracleDB.ExecuteNonQuery("delete from app_req_approve_compare_form1 where APP_REQ_APPROVE_COMPARE_ID='" & AppReqApproveCompareID & "'", trans)
                OracleDB.ExecuteNonQuery("delete from app_req_approve_compare_form2 where APP_REQ_APPROVE_COMPARE_ID='" & AppReqApproveCompareID & "'", trans)
                OracleDB.ExecuteNonQuery("delete from app_req_approve_compare_form3 where APP_REQ_APPROVE_COMPARE_ID='" & AppReqApproveCompareID & "'", trans)

                Utilities.OracleDB.ExecuteNonQuery("delete from APP_REQ_APPROVE_COMPARE where id='" & AppReqApproveCompareID & "'", trans)
            End If
            AppReqApproveCompareDT = Nothing

            Dim CompareCaseChangeDT As New DataTable
            CompareCaseChangeDT = Utilities.OracleDB.ExecuteTable("select id from compare_case_change where compare_case_id='" & CompareCaseID & "'", trans)
            If CompareCaseChangeDT.Rows.Count > 0 Then
                Dim ComCaseChangeID As String = CompareCaseChangeDT.Rows(0)("id")
                OracleDB.ExecuteNonQuery("delete from compare_case_change_item where COMPARE_CASE_CHANGE_ID='" & ComCaseChangeID & "'", trans)

                OracleDB.ExecuteNonQuery("delete from compare_case_change where id='" & ComCaseChangeID & "'", trans)
            End If
            CompareCaseChangeDT = Nothing

            OracleDB.ExecuteNonQuery("delete from invoice2 where compare_case_id='" & CompareCaseID & "'", trans)

            Dim RewDivDT As New DataTable
            RewDivDT = OracleDB.ExecuteTable("select id from reward_divide where compare_case_id='" & CompareCaseID & "'", trans)
            If RewDivDT.Rows.Count > 0 Then
                Dim RewardDivideID As String = RewDivDT.Rows(0)("id")
                OracleDB.ExecuteNonQuery("delete from reward_divide_alcohol where reward_divide_id='" & RewardDivideID & "'", trans)
                OracleDB.ExecuteNonQuery("delete from reward_divide_tax where reward_divide_id='" & RewardDivideID & "'", trans)

                OracleDB.ExecuteNonQuery("delete from reward_divide where id='" & RewardDivideID & "'", trans)
            End If
            RewDivDT = Nothing

            OracleDB.ExecuteNonQuery("delete from send_income_case where compare_case_id='" & CompareCaseID & "'", trans)

            OracleDB.ExecuteNonQuery("delete from compare_case where id='" & CompareCaseID & "'", trans)
        End If
        cDt = Nothing
    End Sub

    Public Sub CreateLogFile(ByVal TextMsg As String)
        Dim FileName As String = Application.StartupPath + "\\" + DateTime.Now.ToString("yyyyMMddHH") + ".log"
        Dim ojb As New System.IO.StreamWriter(FileName, True)
        ojb.WriteLine(DateTime.Now.ToString("yyyy-MM-dd hh:mm:ss.fff") + " " + TextMsg + vbNewLine & vbNewLine & vbNewLine)
        ojb.Close()
    End Sub
End Module
