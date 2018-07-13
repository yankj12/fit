
// 页面初始化的时候处理
$(document).ready(function(){
     console.log('page init.');
     // 判断下cookie中是否有userId，如果有的话，将userId写到页面的userId中
     var userId = $.cookie('userId');
     if(userId != null && userId != ''){
    	 $("#userId_edit").val(userId);
     }
     
     // 初始化的时候给称体重日期赋默认值为当天
     var date = new Date();
     var y = date.getFullYear();
     var m = date.getMonth()+1;
     var d = date.getDate();
     var weightDay = ''+y+'/'+m+'/'+d;
     $("#weightDay_edit").val(weightDay);
     
     // 绘制体重图表
     drawWeightChart(userId);
     
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
        	    // 绘制体重图表
        	    drawWeightChart(userId);
        	    // 重新加载datagrid中数据
        	    $('#dg').datagrid('reload');
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


// 绘制echarts
function drawWeightChart(userId){
    // 查询体重数据
    $.ajax({
        type:"GET", 
        url: "/weight/api/weights?userId=" + userId,
        dataType:"json", 
        contentType: "application/json", 
        success:function(result){
        	if (result.success){
        		console.log('查询成功');
        		var weights = result.weights;
        		// 初始化图表
        		initCharts(weights);
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

// 使用echarts展示体重数据
function initCharts(weights){
	// 组装数据
	if(weights != null && weights.length != null && weights.length > 0){
		
	}else{
		return ;
	}
	
	var xdata = [];
	var ydata = [];
	//xdata = ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun'];
	//ydata = [820, 932, 901, 934, 1290, 1330, 1320];
	
	for(var i=0;i<weights.length;i++){
		xdata.push(weights[i].weightDay);
		ydata.push(weights[i].weight);
	}
	
	
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('echartsMain'));

    // 指定图表的配置项和数据
    option = {
		title: {
	        text: '体重变化折线图'
	    },
	    xAxis: {
	        type: 'category',
	        data: xdata
	    },
	    yAxis: {
	        type: 'value'
	    },
	    series: [{
	        data: ydata,
	        type: 'line'
	    }]
	};


    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
}