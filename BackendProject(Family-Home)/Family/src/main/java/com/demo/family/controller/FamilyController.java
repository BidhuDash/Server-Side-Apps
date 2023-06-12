package com.demo.family.controller;

import com.demo.family.dto.FamilyResponse;
import com.demo.family.entity.Family;
import com.demo.family.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/family")
@Configuration
@LoadBalancerClient(name ="family", configuration = Family.class)
public class FamilyController {

    @Autowired
    FamilyService familyService;

    @PostMapping("/")
    public Family saveFamily(@RequestBody Family family){
        return familyService.saveFamily(family);
    }

    @GetMapping("{id}")
    public FamilyResponse findFamilyById(@PathVariable("id") Long id){
        return familyService.findFamilyById(id);
    }

    @GetMapping("/testapp")
    public String test(){
        return "Family App Working";
    }


}

