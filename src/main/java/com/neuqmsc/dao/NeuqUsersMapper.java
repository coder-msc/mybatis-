package com.neuqmsc.dao;

import com.neuqmsc.entity.NeuqUsers;
import java.util.List;

public interface NeuqUsersMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(NeuqUsers record);

    NeuqUsers selectByPrimaryKey(Integer userId);

    List<NeuqUsers> selectAll();

    int updateByPrimaryKey(NeuqUsers record);
}