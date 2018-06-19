package com.crv.upp.controller;


import com.crv.upp.model.CRV_USER;
import com.crv.upp.serice.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author  zph
 *
 * @date 20180617
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final  Logger logger = LoggerFactory.getLogger(this.getClass());

   @Autowired
    private UserService userService;


    @RequestMapping(value = "/queryall", method = RequestMethod.GET)
    public List<CRV_USER> queryUserInfo()
    {
        List<CRV_USER> users = userService.findAllUser();
         return   users;

    }

}
