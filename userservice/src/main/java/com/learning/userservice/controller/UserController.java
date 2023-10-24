package com.learning.userservice.controller;

import com.learning.userservice.userdetails.UserDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{userId}")
    public ResponseEntity<String> getUserById(@PathVariable(name = "userId", required = false) Integer userId){
        UserDetails userDetail = new UserDetails();
        List<String> userDetails = userDetail.getUserDetails(userId);
        String userName  = userDetails.get(0);
        String emailId = userDetails.get(1);
        if(!userDetails.isEmpty()){
            return  ResponseEntity.ok("User details: " + userName + " and " + emailId);
        }else{
            return ResponseEntity.badRequest().body("No record found for userId: " + userId);
        }

    }

}
