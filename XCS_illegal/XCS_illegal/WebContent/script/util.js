
function KO_genParamString(asoArray){
	var result = "";
	for (var i in asoArray) {
		var value = asoArray[i];
		if(value != undefined){
			var token = i + "=" + value + "&";
			result += token;
		}
	}
	return result;
}
