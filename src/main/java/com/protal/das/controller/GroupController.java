package com.protal.das.controller;

import com.protal.das.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kane on 17-3-2.
 */
@RestController
@RequestMapping("/group")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping
    public List<String> listName(){
        System.out.printf("adfsdf");
        return groupService.listName();
    }

    @GetMapping(path = "/count")
    public int getCount(){
        return groupService.countActiveSite();
    }
}
