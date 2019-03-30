package com.controller;

import com.service.AcademyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zeng
 * @date 2019/3/30 - 11:15
 */
@Controller
@RequestMapping("/academy")
public class AcademyController {
    private AcademyService academyService;
    @Autowired
    public AcademyController(AcademyService academyService){
        this.academyService = academyService;
    }


    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll(){

        return "hh";
    }
}
