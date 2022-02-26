package com.jerry.controller;

import com.jerry.common.base.BaseController;
import com.jerry.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *  管理 API
 *
 * @author jerry
 * @date 2022-02-26 15:36:40
 */
@RestController("menuController.v1")
@RequestMapping("/v1/menus")
public class MenuController extends BaseController {

    @Autowired
    private MenuService menuService;

}
