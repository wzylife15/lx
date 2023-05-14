package com.atguigu.scw.component;



import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.atguigu.scw.vo.resp.AppResponse;



@Component
public class SmsTemplate {

	@Value("${sms.host}")
    String host ;
	
	@Value("${sms.path}")
    String path ;
	
	@Value("${sms.method}")
    String method ;
	
	@Value("${sms.appcode}")
    String appcode ;
	
	public AppResponse<String> sendSms(Map<String, String> querys) {

	    Map<String, String> headers = new HashMap<String, String>();
	    headers.put("Authorization", "APPCODE " + appcode);

	    Map<String, String> bodys = new HashMap<String, String>();

	    try {
	    	HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
	    	System.out.println(response.toString());
	    	
	    	return AppResponse.ok(response.toString());
	    } catch (Exception e) {
	    	e.printStackTrace();
	    	return AppResponse.fail(null);
	    }
	}
	
}
