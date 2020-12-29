package com.crm.info.service.impl;

import com.crm.info.entity.Admin;
import com.crm.info.mapper.AdminMapper;
import com.crm.info.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huxinjie
 * @date 2020/12/28 16:03
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public List<Admin> login(String userName, String password) {
        return adminMapper.login(userName, password);
    }
}
