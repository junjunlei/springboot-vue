package com.jerry.controller;

import com.jerry.common.base.BaseController;
import com.jerry.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *  管理 API
 *
 * @author jerry
 * @date 2022-02-26 15:36:40
 */
@RestController("roleController.v1")
@RequestMapping("/v1/roles")
public class RoleController extends BaseController {

    @Autowired
    private RoleService roleService;


}
