package org.cong.x.project.web.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by liaojuncong on 04/10/2016.
 */
@Data
public class SysUser {
    private Integer id;
    private String name;
    private Integer age;
    private String password;
    private String phone;
    private Date createDate;
}
