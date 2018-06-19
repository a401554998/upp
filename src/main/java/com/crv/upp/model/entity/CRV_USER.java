package com.crv.upp.model.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author: zph
 * @Date: 2018/6/18 17:56
 */
@Data
@Entity
public class CRV_USER {

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String password;
    private String phone;
    private Date createtime;

}
