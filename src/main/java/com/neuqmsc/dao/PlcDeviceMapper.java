package com.neuqmsc.dao;

import com.neuqmsc.entity.PlcDevice;
import java.util.List;

public interface PlcDeviceMapper {
    int deleteByPrimaryKey(String deviceName);

    int insert(PlcDevice record);

    PlcDevice selectByPrimaryKey(String deviceName);

    List<PlcDevice> selectAll();

    int updateByPrimaryKey(PlcDevice record);
}