package com.learning.userservice.userdetails;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class UserDetails {

    public List<String> getUserDetails(Integer id){
        Map<Integer , List<String>> userMap = new HashMap<>();
        userMap.put(1, Arrays.asList("test1" , "test1@gmail.com"));
        userMap.put(2,Arrays.asList("test2" ,"test2@gmail.com"));
        userMap.put(3, Arrays.asList("test3" ,"test3@gmail.com"));
       if(!userMap.containsKey(id)){
           return new ArrayList<>();
       }else{
           return userMap.get(id);
       }

    }

}
