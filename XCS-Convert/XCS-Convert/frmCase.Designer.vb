<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmCase
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container
        Me.label2 = New System.Windows.Forms.Label
        Me.txtTrackNo = New System.Windows.Forms.TextBox
        Me.label1 = New System.Windows.Forms.Label
        Me.cbOffcode = New System.Windows.Forms.ComboBox
        Me.progressBar1 = New System.Windows.Forms.ProgressBar
        Me.lblCurrDate = New System.Windows.Forms.Label
        Me.lblTime = New System.Windows.Forms.Label
        Me.btnStart = New System.Windows.Forms.Button
        Me.lblCaseDate = New System.Windows.Forms.Label
        Me.dtCaseDateTo = New System.Windows.Forms.DateTimePicker
        Me.dtCaseDateFrom = New System.Windows.Forms.DateTimePicker
        Me.timer1 = New System.Windows.Forms.Timer(Me.components)
        Me.lblStatus = New System.Windows.Forms.Label
        Me.btnDeleteTemp = New System.Windows.Forms.Button
        Me.btnAddExhibit = New System.Windows.Forms.Button
        Me.SuspendLayout()
        '
        'label2
        '
        Me.label2.AutoSize = True
        Me.label2.Location = New System.Drawing.Point(38, 15)
        Me.label2.Name = "label2"
        Me.label2.Size = New System.Drawing.Size(55, 13)
        Me.label2.TabIndex = 24
        Me.label2.Text = "เลขที่งาน :"
        '
        'txtTrackNo
        '
        Me.txtTrackNo.Location = New System.Drawing.Point(95, 12)
        Me.txtTrackNo.Name = "txtTrackNo"
        Me.txtTrackNo.Size = New System.Drawing.Size(100, 20)
        Me.txtTrackNo.TabIndex = 23
        '
        'label1
        '
        Me.label1.AutoSize = True
        Me.label1.Location = New System.Drawing.Point(50, 67)
        Me.label1.Name = "label1"
        Me.label1.Size = New System.Drawing.Size(36, 13)
        Me.label1.TabIndex = 22
        Me.label1.Text = "พื้นที่ :"
        Me.label1.Visible = False
        '
        'cbOffcode
        '
        Me.cbOffcode.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.cbOffcode.FormattingEnabled = True
        Me.cbOffcode.Location = New System.Drawing.Point(92, 64)
        Me.cbOffcode.Name = "cbOffcode"
        Me.cbOffcode.Size = New System.Drawing.Size(227, 21)
        Me.cbOffcode.TabIndex = 21
        Me.cbOffcode.Visible = False
        '
        'progressBar1
        '
        Me.progressBar1.Location = New System.Drawing.Point(12, 102)
        Me.progressBar1.Name = "progressBar1"
        Me.progressBar1.Size = New System.Drawing.Size(466, 23)
        Me.progressBar1.TabIndex = 20
        '
        'lblCurrDate
        '
        Me.lblCurrDate.Anchor = CType((System.Windows.Forms.AnchorStyles.Bottom Or System.Windows.Forms.AnchorStyles.Left), System.Windows.Forms.AnchorStyles)
        Me.lblCurrDate.AutoSize = True
        Me.lblCurrDate.Location = New System.Drawing.Point(152, -87)
        Me.lblCurrDate.Name = "lblCurrDate"
        Me.lblCurrDate.Size = New System.Drawing.Size(0, 13)
        Me.lblCurrDate.TabIndex = 19
        Me.lblCurrDate.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'lblTime
        '
        Me.lblTime.AutoSize = True
        Me.lblTime.Location = New System.Drawing.Point(412, 9)
        Me.lblTime.Name = "lblTime"
        Me.lblTime.Size = New System.Drawing.Size(35, 13)
        Me.lblTime.TabIndex = 18
        Me.lblTime.Text = "label1"
        Me.lblTime.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'btnStart
        '
        Me.btnStart.Location = New System.Drawing.Point(339, 38)
        Me.btnStart.Name = "btnStart"
        Me.btnStart.Size = New System.Drawing.Size(56, 23)
        Me.btnStart.TabIndex = 16
        Me.btnStart.Text = "เริ่ม"
        Me.btnStart.UseVisualStyleBackColor = True
        Me.btnStart.Visible = False
        '
        'lblCaseDate
        '
        Me.lblCaseDate.AutoSize = True
        Me.lblCaseDate.Location = New System.Drawing.Point(38, 44)
        Me.lblCaseDate.Name = "lblCaseDate"
        Me.lblCaseDate.Size = New System.Drawing.Size(48, 13)
        Me.lblCaseDate.TabIndex = 15
        Me.lblCaseDate.Text = "วันที่คดี :"
        Me.lblCaseDate.Visible = False
        '
        'dtCaseDateTo
        '
        Me.dtCaseDateTo.Format = System.Windows.Forms.DateTimePickerFormat.[Short]
        Me.dtCaseDateTo.Location = New System.Drawing.Point(216, 38)
        Me.dtCaseDateTo.Name = "dtCaseDateTo"
        Me.dtCaseDateTo.Size = New System.Drawing.Size(103, 20)
        Me.dtCaseDateTo.TabIndex = 14
        Me.dtCaseDateTo.Visible = False
        '
        'dtCaseDateFrom
        '
        Me.dtCaseDateFrom.Format = System.Windows.Forms.DateTimePickerFormat.[Short]
        Me.dtCaseDateFrom.Location = New System.Drawing.Point(92, 38)
        Me.dtCaseDateFrom.Name = "dtCaseDateFrom"
        Me.dtCaseDateFrom.Size = New System.Drawing.Size(103, 20)
        Me.dtCaseDateFrom.TabIndex = 13
        Me.dtCaseDateFrom.Visible = False
        '
        'timer1
        '
        Me.timer1.Enabled = True
        Me.timer1.Interval = 1000
        '
        'lblStatus
        '
        Me.lblStatus.AutoSize = True
        Me.lblStatus.Location = New System.Drawing.Point(16, 84)
        Me.lblStatus.Name = "lblStatus"
        Me.lblStatus.Size = New System.Drawing.Size(0, 13)
        Me.lblStatus.TabIndex = 25
        '
        'btnDeleteTemp
        '
        Me.btnDeleteTemp.Location = New System.Drawing.Point(216, 9)
        Me.btnDeleteTemp.Name = "btnDeleteTemp"
        Me.btnDeleteTemp.Size = New System.Drawing.Size(88, 23)
        Me.btnDeleteTemp.TabIndex = 26
        Me.btnDeleteTemp.Text = "Delete Temp"
        Me.btnDeleteTemp.UseVisualStyleBackColor = True
        '
        'btnAddExhibit
        '
        Me.btnAddExhibit.Location = New System.Drawing.Point(403, 39)
        Me.btnAddExhibit.Name = "btnAddExhibit"
        Me.btnAddExhibit.Size = New System.Drawing.Size(75, 23)
        Me.btnAddExhibit.TabIndex = 27
        Me.btnAddExhibit.Text = "Add Exhibit"
        Me.btnAddExhibit.UseVisualStyleBackColor = True
        Me.btnAddExhibit.Visible = False
        '
        'frmCase
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(490, 137)
        Me.Controls.Add(Me.btnAddExhibit)
        Me.Controls.Add(Me.btnDeleteTemp)
        Me.Controls.Add(Me.lblStatus)
        Me.Controls.Add(Me.label2)
        Me.Controls.Add(Me.txtTrackNo)
        Me.Controls.Add(Me.label1)
        Me.Controls.Add(Me.cbOffcode)
        Me.Controls.Add(Me.progressBar1)
        Me.Controls.Add(Me.lblCurrDate)
        Me.Controls.Add(Me.lblTime)
        Me.Controls.Add(Me.btnStart)
        Me.Controls.Add(Me.lblCaseDate)
        Me.Controls.Add(Me.dtCaseDateTo)
        Me.Controls.Add(Me.dtCaseDateFrom)
        Me.Name = "frmCase"
        Me.Text = "Import Case"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Private WithEvents label2 As System.Windows.Forms.Label
    Private WithEvents txtTrackNo As System.Windows.Forms.TextBox
    Private WithEvents label1 As System.Windows.Forms.Label
    Private WithEvents cbOffcode As System.Windows.Forms.ComboBox
    Private WithEvents progressBar1 As System.Windows.Forms.ProgressBar
    Private WithEvents lblCurrDate As System.Windows.Forms.Label
    Private WithEvents lblTime As System.Windows.Forms.Label
    Private WithEvents btnStart As System.Windows.Forms.Button
    Private WithEvents lblCaseDate As System.Windows.Forms.Label
    Private WithEvents dtCaseDateTo As System.Windows.Forms.DateTimePicker
    Private WithEvents dtCaseDateFrom As System.Windows.Forms.DateTimePicker
    Private WithEvents timer1 As System.Windows.Forms.Timer
    Friend WithEvents lblStatus As System.Windows.Forms.Label
    Friend WithEvents btnDeleteTemp As System.Windows.Forms.Button
    Friend WithEvents btnAddExhibit As System.Windows.Forms.Button

End Class
