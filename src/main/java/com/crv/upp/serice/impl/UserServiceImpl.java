package com.crv.upp.serice.impl;

import com.crv.upp.model.CRV_USER;
import com.crv.upp.dao.mybatis.UserDao;
import com.crv.upp.serice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author  zph
 *
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<CRV_USER> findAllUser() {
        List<CRV_USER> users = userDao.findAllUser();
        return users;
    }
}
