var listPopupObject=new Array();  //เอาไว้เก็บ Array ชนิด Object
var popupObject=new Object();  //เอาไว้เก็บ Object

function INDICTMENT() { 
	   this.INDICTMENT_ID;  
	   this.CREATE_BY;
	   this.CREATE_ON;
	   this.UPDATE_BY;
	   this.UPDATE_ON;
	   this.LAW_ID;
	   this.CASE_LAW_ID;
	   this.GUILT_BASE;
	   this.PENALTY_CASE_LAW_ID;
	   this.PENALTY_DESC;
	   this.ISFINE;
	   this.FINE_RATE;
	   this.ISIMPRISON;
	   this.EXHIBIT_WILD;
	   this.REMARKS;
	   this.GUILT_MST_ID;
	   this.Checked;
}

function V_STAFF_LIST_POPUP()
{	
	this.EMPID;
	this.IDCARD_NO;
	this.TITLE_CODE;
	this.TITLE_NAME;
	this.FIRST_NAME;
	this.LAST_NAME;
	this.POSCODE;
	this.POSNAME;
	this.OFFCODE;
	this.OFFNAME;
	this.TEAM_ID;
	this.TEAM_CODE;
	this.TEAM_NAME;
	this.Checked;
}


function getObjectIsCheck() {
	 var popupCheckObject=new Array();
	 for (var i in listPopupObject) {
	 var object = listPopupObject[i];
	 if(object.Checked){
		 object.Checked = false;
		 popupCheckObject[i] = object;
	   }
	 }
	 if(popupCheckObject.length == 0)popupCheckObject=null;
	 return popupCheckObject;
	}

function getSerializeObject(object,propety) {
	 var str_get="";
	 for (var i in listPopupObject) {
		 var name_propety = listPopupObject[i];
		 str_get=
	 }
	 
	 var popupCheckObject=new Array();
	 for (var i in listPopupObject) {
	 var object = listPopupObject[i];
	 if(object.Checked){
		 object.Checked = false;
		 popupCheckObject[i] = object;
	   }
	 }
	 if(popupCheckObject.length == 0)popupCheckObject=null;
	 return popupCheckObject;
	}

	function testObject() {
     alert(listPopupObject);
     var object = listPopupObject[i];
	  for ( key in object ) {
		  //document.writeln("key = "+key);
		  //document.writeln("<br/>");
		  document.writeln(" "+key+"="+object[key]); 
		  //document.writeln(object.GUILT_BASE);
		  document.writeln("<br/>");
		  }
	}