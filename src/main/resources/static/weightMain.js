

/**
 * 重置表单
 */
function resetForm(){
	var weightForm = document.getElementById("weightForm").reset();
}


function submitForm(){
	var userId = $("#userId_edit").val();
	var weightNum = $("#weight_edit").val();
	var weightDay = $("#weightDay_edit").val();
	
	var weight = new Object();
	weight.userId = userId;
	weight.weight = weightNum;
	weight.weightDay = weightDay;
	
	$.ajax({
        type:"POST", 
        url: "/weight/api/weight",
        dataType:"json", 
        //data类型需要是string
        //data:'{"userId":"' + userId + '", "weight":' + weightNum + ', "weightDay":"' + weightDay + '"}',
        data:JSON.stringify(weight),
        contentType: "application/json", 
        success:function(result){
        	if (result.success){
        		alert('保存成功');
				
        	}else{
        		alert('提示' + result.errorMsg);
        	}
        },
       	failure:function (result) {  
       		//(提示框标题，提示信息)
    		alert('加载失败');
       	}
	});
}
