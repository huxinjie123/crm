package com.crm.info.controller;

import com.crm.info.entity.Admin;
import com.crm.info.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author huxinjie
 * @date 2020/12/28 16:01
 */
@RestController
@RequestMapping(value = "/admin")
@Api(tags = "admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    @PostMapping(value = "/login")
    @ApiOperation(value = "登录接口")
    public ResponseEntity<List<Admin>> login(String userName, String password){
        List<Admin> admin = adminService.login(userName, password);
        return ResponseEntity.ok(admin);
    }
}
