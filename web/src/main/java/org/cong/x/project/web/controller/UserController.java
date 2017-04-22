package org.cong.x.project.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.cong.x.project.web.model.SysUser;
import org.cong.x.project.web.service.SysUserService;
import org.cong.x.project.web.util.response.DataRes;
import org.cong.x.project.web.util.response.PageRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liaojuncong on 04/10/2016.
 */
@Slf4j
@RestController
public class UserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/getUserInfo")
    public DataRes<PageRes<SysUser>> getUserInfo() {
        return sysUserService.getUserInfo();
    }

}
