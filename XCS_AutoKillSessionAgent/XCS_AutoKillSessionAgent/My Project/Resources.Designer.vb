s=$P{getExhibitstatus}
group by lg.legislation_name,nvl(aae.product_name,dt.duty_name)  ,
nvl(aae.brand_name,nvl(bm.brand_main_thai,nvl(bm.brand_main_eng,'ไม่ระบุ'))),
nvl(aae.netweight_unit_name,u.thname), aa.have_culprit,bi.case_quality,bi.case_last,aae.status
order by product_name,brand_name]]>
	</queryString>
	<field name="OFFNAME" class="java.lang.String"/>
	<field name="HEADERNAME" class="java.lang.String"/>
	<field name="PRODUCT_NAME" class="java.lang.String"/>
	<field name="BRAND_NAME" class="java.lang.String"/>
	<field name="NETWEIGHT" class="java.math.BigDecimal"/>
	<field name="NETWEIGHT_UNIT_NAME" class="java.lang.String"/>
	<field name="CASE_TYPE" class="java.lang.String"/>
	<field name="EXHIBIT_STATUS" class="java.lang.String"/>
	<field name="USER_NAME" class="java.lang.String"/>
	<field name="UNTILDATE" class="java.lang.String"/>
	<field name="SYSTIMEDATE" class="java.lang.String"/>
	<field name="DATE_FROM" class="java.lang.String"/>
	<field name="MONTH_FROM" class="java.lang.String"/>
	<field name="YEAR_FROM" class="java.lang.String"/>
	<field name="DATE_TO" class="java.lang.String"/>
	<field name="MONTH_TO" class="java.lang.String"/>
	<field name="YEAR_TO" class="java.lang.String"/>
	<group name="8306_Group">
		<groupExpression><![CDATA[$F{PRODUCT_NAME}]]></groupExpression>
		<groupHeader>
			<band height="23">
				<rectangle>
					<reportElement x="0" y="0" width="555" height="23" backcolor="#CCCCCC"/>
				</rectangle>
				<textField isBlankWhenNull="true">
					<reportElement x="5" y="0" width="785" height="23"/>
					<textElement verticalAlignment="Middle">
						<font fontName="Angsana New" size="16" pdfFontName="ANGSA.TTF" pdfEncoding="Identity-H" isPdfEmbedded="true"/>
					</textElement>
					<textFieldExpression class="java.lang.String"><![CDATA[$F{PRODUCT_NAME}]]></textFieldExpression>
				</textField>
			</band>
		</groupHeader>
	</group>
	<background>
		<band splitType="Stretch"/>
	</background>
	<title>
		<band height="169" splitType="Stretch">
			<rectangle radius="0">
				<reportElement x="0" y="144" width="555" height="25"/>
			</rectangle>
			<line>
				<reportElement x="84" y="144" width="1" height="25"/>
			</line>
			<line>
				<reportElement x="300" y="144" width="1" height="25"/>
			</line>
			<line>
				<reportElement x="448" y="144" width="1" height="25"/>
			</line>
			<staticText>
				<reportElement x="0" y="144" width="86" height="25"/>
				<textElement textAlignment="Center">
					<font fontName="Angsana New" size="16" pdfFontName="ANGSA.TTF" pdfEncoding="Identity-H" isPdfEmbedded="true"/>
				</textElement>
				<text><![CDATA[รหัส]]></text>
			</staticText>
			<staticText>
				<reportElement x="86" y="144" width="216" height="25"/>
				<textElement textAlignment="Center">
					<font fontName="Ang