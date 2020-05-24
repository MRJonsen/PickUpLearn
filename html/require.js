/*
 * 服务器地址
 */
// ajax请求封装
// url:发送请求的地址
// data:发送请求的参数
// successfn:请求成功执行函数
// errorfn:请求失败执行函数
//var baseurl = "http://192.168.10.130:8080/shcb/";
var baseurl = "http://192.168.10.114:8080/shcb/";
//var baseurl = "http://117.149.2.229:1626/shcb/";

var AppFunMenu = 'com.nci.app.biz.base.AppFunMenu';
var DefectManage = 'com.zenith.meter.process.DefectManage';
var ComplaintManage = 'com.zenith.meter.process.ComplaintManage';
var AppCodeData = 'com.nci.app.biz.base.AppCodeData';
var TagManage = 'com.zenith.meter.process.TagManage'
var TagUserManage = 'com.zenith.meter.process.TagUserManage';

// 通用接口请求方法
function ajaxpost(className, methodName, data, successFun, errorFun) {
	ajaxpostWithCallback(className, methodName, data, 'callback', function success(data) {
		successFun(data);
	}, function error(error) {
		errorFun(error);
	});
}

function ajaxpostWithCallback(className, methodName, data, multiCallBack, successFun, errorFun) {
	if(multiCallBack.length = 0) {
		multiCallBack = 'callback';
	}
	var url = baseurl + 'do/app/uiuniteaction';
	var uploadData = {
		"className": className,
		"Data": JSON.stringify(data),
		"methodName": methodName
	}
	$.ajax({
		url: url,
		data: uploadData,
		cache: false,
		type: "POST",
		dataType: "json", //数据类型为jsonp  
//		contentType: 'application/json',
//		dataType: "jsonp", //数据类型为jsonp  
//		jsonp: "callback",
//		jsonpCallback: multiCallBack, //服务端用于接收callback调用的function名的参数    
		success: function(data) {
			if(data.Code == '01') {
				try {
					successFun(JSON.parse(data.Data));
				} catch(e) {
					mui.toast('操作失败')
				}
			} else {
				mui.toast('操作失败')
			}
		},
		error: function(error) {
			errorFun(error);
		},

	});
};

//信息提示
function infoTip(tip, back, url) {
	var html = '<div class="mask_save">' +
		'<div class="confirmbox">' +
		'<p></p>' +
		'</div>' +
		'</div>';
	$('body').append(html);
	$('.mask_save').show();
	$('.confirmbox').addClass('in');
	$('.confirmbox p').text(tip);
	var t = 2;
	var timer = setInterval(function() {
		t--;
		if(t <= 0) {
			if(back == true) {
				location = url
			} else if(back == false) {
				$('.mask_save').hide()
			}
			clearInterval(timer);
			return;
		}
	}, 1000)
}

// 登录
function login(username, password, successFun, errorFun) {
	var url = baseurl + 'do/app/uiunitelogin';
	var uploadData = {
		"USERACCOUNT": username,
		"LOGINPWD": password,
	}
	$.ajax({
		url: url,
		data: uploadData,
		cache: false,
		type: "POST",
		dataType: "json", //数据类型为jsonp  
//		async: false,
//		jsonp: "callback",
//		contentType: 'application/json',
//		jsonpCallback: 'callback', //服务端用于接收callback调用的function名的参数    
		success: function(data) {
			console.log('data  === ' + data);
			successFun(data);
		},
		error: function(error) {
			errorFun(error);
		},
	});
}