//package com.spring.service;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.spring.model.RestTemplateDto;
// 
//
//@Service
//public class ThirdPartyApiService {
//
//	private static final String post_find_all_User_URL ="http://localhost:8000/rest/getAllUserInformation";
//	
//	RestTemplate restTemplate=new RestTemplate();
//	
//	public ResponseEntity<String> getAll() {
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		
//		HttpEntity<String> entity =new HttpEntity<String>("parameters", headers);
//		
//		ResponseEntity<RestTemplateDto> response = restTemplate.exchange(post_find_all_User_URL, HttpMethod.POST, entity, RestTemplateDto.class);
//		RestTemplateDto obj=response.getBody();
//		//String obj=response.getBody().toString();
//		ObjectMapper mapper=new ObjectMapper();
//		//RestTemplateDto rest=mapper.readValue(obj, RestTemplateDto.class);
//		String s=obj.getAddress();
//		System.out.println(s);
//		
////		Map<String, String> id=new HashMap<String, String>();
////		String endPoint="http://localhost:8000/rest/getAllUserInformation";
////		
////		ResponseEntity<RestTemplateDto> data= restTemplate1.postForObject(endPoint, RestTemplateDto.class, null, id);
////		 if(data.getStatusCodeValue()==200) {
////			 
////			 RestTemplateDto t1=data.getBody();
////			 String st=t1.getAddress();
////			 String st1=t1.getName();
////			 System.out.println(st);
////			// response.setThirdPartyApiDto(t1);
////	 
////		 }	 
//		return null;
//	}
//}
//
////HttpHeaders headers = new HttpHeaders();
////headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
////
////HttpEntity<String> entity =new HttpEntity<String>("parameters", headers);
////
////ResponseEntity<String> response = restTemplate.exchange(post_find_all_User_URL, HttpMethod.POST, entity, String.class);
////String obj=response.getBody().toString();
////ObjectMapper mapper=new ObjectMapper();
////RestTemplateDto rest=mapper.readValue(obj, RestTemplateDto.class);
////String s=rest.getAddress();
////System.out.println(s);