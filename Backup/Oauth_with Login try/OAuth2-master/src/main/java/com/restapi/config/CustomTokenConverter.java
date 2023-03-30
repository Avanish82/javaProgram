//package com.restapi.config;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.oauth2.common.OAuth2AccessToken;
//import org.springframework.security.oauth2.provider.OAuth2Authentication;
//import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
//
//import com.restapi.entity.TblUserMaster;
//import com.restapi.entity.User;
////import com.oauth.enitity.TblUserMaster;
//import com.restapi.service.UserDetailsServiceImpl;
//
//public class CustomTokenConverter extends JwtAccessTokenConverter{
//	
//	@Autowired
//	UserDetailsServiceImpl userService;
////	@Autowired
////	UserService userService;
//	
//	@Override
//	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
//		
//		if(authentication.getOAuth2Request().getGrantType().equalsIgnoreCase("password")) {
//			final Map<String, Object> additionalInfo = new HashMap<String, Object>();
//			System.out.println("Authentication |"+authentication.getUserAuthentication().getAuthorities());
//			additionalInfo.put("authorities", authentication.getUserAuthentication().getAuthorities());
//			
////			UserDetails users = userService.loadUserByUsername(authentication.getName());
////			additionalInfo.put("name", users.getUsername());
////			additionalInfo.put("doj", ((User) users).getRoles());
////			additionalInfo.put("empId", ((User) users).getId());
//			
//			TblUserMaster tblUserMaster = userService.findByEmail(authentication.getName());
//			additionalInfo.put("name", tblUserMaster.getFirstName());
//			additionalInfo.put("doj", tblUserMaster.getDoj());
//			additionalInfo.put("empId", tblUserMaster.getEmpId());
//			
//			((DefultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInfo);
//		}
//		accessToken = super.enhance(accessToken, authentication);
//		((DefaultOAuth2AccessToken) accessToken).setAdditiionalInformation(new HashMap<>);
//		return accessToken;
//		
//	}
//
//}
