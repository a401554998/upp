package com.crv.upp.dao.mybatis;

import com.crv.upp.model.CRV_USER;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
 * @author  zph
 *
 * @date 2018/06/17
 */
@Mapper
@ResponseBody
public interface  UserDao {

    @Select("select t.id,t.name,t.password,t.phone,t.createtime from crv_user t")
    List<CRV_USER> findAllUser();
}
