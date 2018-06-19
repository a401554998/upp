package com.crv.upp.controller;

import com.crv.upp.model.entity.CRV_USER;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.crv.upp.serice.UserServiceJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zph
 * @Date: 2018/6/18 18:33
 */
@RestController
@RequestMapping("/userjpa")
public class UserControllerJpa {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserServiceJpa userServiceJpa;

    @RequestMapping(value = "/queryall", method = RequestMethod.GET)
    public  Iterable<CRV_USER> queryUserInfo()
    {
        Iterable<CRV_USER> list = userServiceJpa.findAllUser();
        logger.info("---------------"+list);



            return list ;
    }
}
