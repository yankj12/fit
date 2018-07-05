
// 页面初始化的时候处理
$(document).ready(function(){
     console.log('page init.');
     // 判断下cookie中是否有userId，如果有的话，将userId写到页面的userId中
     var userId = $.cookie('userId');
     if(userId != null && userId != ''){
    	 $("#userId_edit").val(userId);
     }
});

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
	
	// 判断下是否存在cookie，将userId写到cookie中
	$.cookie('userId', userId, { expires: 7, path: '/weight' });
	
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
