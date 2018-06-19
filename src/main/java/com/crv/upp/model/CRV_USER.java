package com.crv.upp.model;

import java.util.Date;
import lombok.Data;


/**
 *  @author zph
 *  @Date: 2018/6/17 16:45
 */
@Data
public class CRV_USER {

     private Integer id;
     private String name;
     private String password;
     private String phone;
     private Date createTime;

}
