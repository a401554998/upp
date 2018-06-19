package com.crv.upp.serice;

import com.crv.upp.model.CRV_USER;
import java.util.List;

/**
 * @author  zph
 *
 * @date 2018/06/17
 */
public interface UserService {

    /**
    *   query  all user
     * @return List<User>
    */
    List<CRV_USER> findAllUser();
}
