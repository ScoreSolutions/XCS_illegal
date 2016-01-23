Namespace Utilities
    Public Class Constant
        Public Const CultureSessionID = "Culture"
        Public Const ApplicationErrorSessionID = "ErrorMessage"
        Public Const IntFormat = "#,##0"
        Public Const DoubleFormat = "#,##0.00"
        Public Const DateFormat = "dd/MM/yyyy"

        Public ReadOnly Property HomeFolder() As String
            Get
                Return System.Web.HttpContext.Current.Request.ApplicationPath & "/"
            End Get
        End Property
        Public ReadOnly Property ImageFolder() As String
            Get
                Return HomeFolder & "Images/"
            End Get
        End Property
        Partial Public Class CultureName
            Public Const Defaults As String = "th-TH"
            Public Const Eng As String = "en-US"
            Public Const Thai As String = "th-TH"
        End Class
        

        Public Shared Function GetFullDate() As String
            Dim month As String = ""
            Select Case DateTime.Now.Month
                Case 1
                    month = "January"
                Case 2
                    month = "Febuary"
                Case 3
                    month = "March"
                Case 4
                    month = "April"
                Case 5
                    month = "May"
                Case 6
                    month = "June"
                Case 7
                    month = "July"
                Case 8
                    month = "August"
                Case 9
                    month = "September"
                Case 10
                    month = "October"
                Case 11
                    month = "November"
                Case 12
                    month = "December"
            End Select
            Return month & ", " & DateTime.Now.Day.ToString() & " " & DateTime.Now.Year.ToString()
        End Function
    End Class

End Namespace

