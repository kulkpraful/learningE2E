package com.learning.userservice.controller;

import com.learning.userservice.entity.User;
import com.learning.userservice.repository.UserRepository;
import com.learning.userservice.userdetails.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{userId}")
    public  String getUserById(@PathVariable Integer userId){
        UserDetails userDetail = new UserDetails();
        List<String> userDetails = userDetail.getUserDetails(userId);
        if(!userDetails.isEmpty()){
            return "User details: "+userDetails.get(0)+ " and "+userDetails.get(1);
        }else{
            return "No record found for userId: "+userId;
        }

    }

}
