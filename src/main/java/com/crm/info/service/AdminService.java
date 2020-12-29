package com.crm.info.service;

import com.crm.info.entity.Admin;

import java.util.List;

/**
 * @author huxinjie
 * @date 2020/12/28 16:02
 */
public interface AdminService {
    List<Admin> login(String userName, String password);
}
