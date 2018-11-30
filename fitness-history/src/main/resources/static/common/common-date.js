/**
 * 将日期格式化为yyyy/MM/dd的格式
 * @returns
 */
function formatYearMonthDay(dateStr){
	
	if(dateStr == null || dateStr== ''){
		return '';
	}
	
	var reg = /(\d+)/g;
	var r = dateStr.match(reg);
	if(r != null){
		// r[0] 表示匹配到的全体
		var y = parseInt(r[0],10);
		var m = parseInt(r[1],10);
		var d = parseInt(r[2],10);
		
		var newStr = '' + y + '/' + (m<10?('0'+m):m) + '/' + (d<10?('0'+d):d);
		return newStr;
	}
}