// JScript File

 function OpenDialog(url,btnName,Height,Width)
 {
    var vReturnValue;
    if(Height == null || Height == "")
    Height = "300";
       if(Width == null || Width == "")
    Width = "300";
    if(url != null)
        {
            vReturnValue = window.showModalDialog(url,"#1","dialogHeight: " + Height +"px; dialogWidth: "+ Width +"px; dialogTop: 100px; dialogLeft: 220px;edge: Raised;center: Yes; help: No; resizable: No; status: No;scroll=No;overflow-x: hidden");
    //     vReturnValue = window.open(url, 'CustomPopUp','width=800, height=500,status=no, menubar=no, resizable=yes,modal=yes');
      }
       else
        {
       alert("No URL passed to open");
     }
   if(vReturnValue != null && vReturnValue == true)
     {
         __doPostBack(btnName,'');
       return vReturnValue
     }
     else
     {   //alert(vReturnValue);
       //alert(vReturnValue);
       return false;
      }
}

