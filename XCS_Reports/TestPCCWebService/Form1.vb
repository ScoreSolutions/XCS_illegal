Public Class Form1

    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        Dim ret As String = ""

        Dim ws As New PCCWebService.rdbserviceEd

        Dim h As New PCCWebService.Header
        h.serviceID = "0000000002"
        h.systemID = "002"

        Dim b As New PCCWebService.BodyGen1
        b.userID = "LAW" '
        b.password = "11111111"

        Dim app(1) As PCCWebService.ParameterAppend
        app(0) = New PCCWebService.ParameterAppend
        app(0).parameterSearch = ""
        app(0).parameterValue = ""
        b.parameterAppend = app

        Dim inHeader As New PCCWebService.InquiryAccMastReqHeader
        inHeader.header = h
        inHeader.body = b



        Dim res As New PCCWebService.InquiryAccMastResHeader
        res = ws.InquiryEdOfficeOperation(inHeader)
        'res.body.
        For Each ed As PCCWebService.EdOfficeInfo In res.body.edOfficeInfo
            ret = ed.offName
        Next

        MessageBox.Show(ret)

    End Sub
End Class
