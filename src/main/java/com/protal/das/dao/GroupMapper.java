package com.protal.das.dao;

import com.protal.das.beans.entity.Group;

import java.util.List;

public interface GroupMapper {
    int deleteByPrimaryKey(Long groupid);

    int insert(Group record);

    int insertSelective(Group record);

    Group selectByPrimaryKey(Long groupid);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);

    List<String> listName();

    int countActiveSite();
}