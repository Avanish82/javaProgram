package com.spring.controller;

import com.spring.model.User;
import com.spring.service.UserService;
import io.swagger.annotations.Api; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController 
@RequestMapping("/rest")
@Api(tags = "UserController", value = "UserController", description = "Controller for UserController Queries")
public class UserController {

    @Autowired
    private UserService userService;

   // @PostMapping("/addUser", produces = "application/json")
    @RequestMapping(value = "/addAllInformation", method= RequestMethod.POST ,produces = "application/json")
    public User userAdd(@RequestBody User user){
        return userService.userAdd(user);
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @PutMapping("/updateUser/{id}")
    public User updateUser(@RequestBody User user, @PathVariable Long id){
        return userService.updateUser(user,id);
    }

    @GetMapping("/getuser/{id}")
    public Optional<User> getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }
    
  //third api call example
  	@GetMapping("/showData")
  	public String viewInfo() {
  		return userService.viewStudent();
	}
 //postmapping use to get all data
  	 @PostMapping("/getAllUserInformation")
     public List<User> getAllUserInformation(){
         return userService.getAllUserInformation();
     }
}
