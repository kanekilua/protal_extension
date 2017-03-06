package com.protal.das.service;

import com.protal.das.dao.GroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kane on 17-3-2.
 */
@Service
public class GroupService {
    @Autowired
    private GroupMapper groupMapper;

    public List<String> listName(){
        return groupMapper.listName();
    }

    public int countActiveSite(){
        return groupMapper.countActiveSite();
    }
}
