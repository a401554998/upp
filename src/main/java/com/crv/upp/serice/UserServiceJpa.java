package com.crv.upp.serice;

import com.crv.upp.model.entity.CRV_USER;

/**
 * @Author: zph
 * @Date: 2018/6/18 18:19
 */
public interface UserServiceJpa {

    /**
     *   query  all user
     * @return Iterable<User>
     */
    Iterable<CRV_USER> findAllUser();
}
