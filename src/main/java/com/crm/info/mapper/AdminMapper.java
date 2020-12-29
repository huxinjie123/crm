package com.crm.info.mapper;

import com.crm.info.entity.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author huxinjie
 * @date 2020/12/28 16:02
 */
public interface AdminMapper {
    List<Admin> login(@Param("userName") String userName, @Param("password")String password);
}
