package com.crv.upp.serice.impl;

import com.crv.upp.dao.jpa.UserDaoRepository;
import com.crv.upp.model.entity.CRV_USER;
import com.crv.upp.serice.UserServiceJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zph
 * @Date: 2018/6/18 18:23
 */
@Service
public class UserServiceJpaImpl implements UserServiceJpa {

    @Autowired
    private UserDaoRepository userDaoRepository;

    @Override
    public Iterable<CRV_USER> findAllUser() {
        Iterable<CRV_USER> users =  userDaoRepository.findAll();
        return users;
    }
}
