	function openPopupDialog(url,argument,style){
		data = window.showModalDialog(url ,argument, style);
		if(data != null){
		}
		return data;
	}
	
	
   function checkAll()
	{
	var checkBox = jQuery("input[name^='checkbox_']");
	//alert(checkBox);
   // alert(checkBox.length);
	for (i = 0; i < checkBox.length; i++){
		checkBox[i].checked = true ;
		var object = listPopupObject[i];
		object.Checked = true;
	  }
	}
	
   
	function uncheckAll()
	{
	var checkBox = jQuery("input[name^='checkbox_']");
	for (i = 0; i < checkBox.length; i++){
		checkBox[i].checked = false ;
		var object = listPopupObject[i];
		object.Checked = false;
	 }
	}
	
	

	
   function isAllCheckBoxe(objectCheckBox) {
		 if(objectCheckBox.checked == true){
			 checkAll();
		 }else{
			 uncheckAll();
		 }
	 }
	 
   
	 function isCheckBoxe(objectCheckBox) {
		 var index = objectCheckBox.value;
		 var object = listPopupObject[index];
		 
		 if(objectCheckBox.checked == true){
			 object.Checked = objectCheckBox.checked;
		 }else{
			 object.Checked = false;
		 }
	 }
	 
	 
	 function selectCheckBoxe(){
		 var object = getObjectIsCheck();
		 window.returnValue=object;
		 window.close();
		 window.opener.focus();
	 }
	 