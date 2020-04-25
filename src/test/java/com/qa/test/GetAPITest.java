package com.qa.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetAPITest extends TestBase {
	
	TestBase testBase;
	String serviceurl;
	String apiUrl;
	String url;
	RestClient restClient;
	CloseableHttpResponse closeableHttpResponse;
	
	
	@BeforeMethod
	public void setup(){
		testBase=new TestBase();
		serviceurl=prop.getProperty("URL");
		apiUrl=prop.getProperty("serviceURL");
		url=serviceurl+apiUrl;
		
		
		
		
		
	}
	
	@Test
	public void getAPITestWithoutHeaders() throws ClientProtocolException, IOException{
		restClient=new RestClient();
		closeableHttpResponse=restClient.getMethod(url);	
		
		//status code
		int statusCode=	closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("StatusCode:"+statusCode);
		
		
		
	}

}
