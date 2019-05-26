package com.yjh.test.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroller {

    @RequestMapping("/get")
    public  String GetBoy(){
        return  "boy";
    }


}
