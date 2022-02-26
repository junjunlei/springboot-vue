package com.jerry.controller;
import com.jerry.common.base.BaseController;
import com.jerry.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *  管理 API
 *
 * @author jerry
 * @date 2022-02-26 15:36:40
 */
@RestController("roleMenuController.v1")
@RequestMapping("/v1/rolemenus")
public class RoleMenuController extends BaseController {

    @Autowired
    private RoleMenuService roleMenuService;


}
