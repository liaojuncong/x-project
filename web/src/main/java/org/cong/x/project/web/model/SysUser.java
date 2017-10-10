package org.cong.x.project.web.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * Created by liaojuncong on 04/10/2016.
 */
@Data
@ToString
public class SysUser {
    private Integer id;
    private String name;
    private Integer age;
    private String password;
    private String phone;
    private Date createDate;
    private String salt;

    public String getCredentialsSalt() {
        return this.name + this.salt;
    }
}
