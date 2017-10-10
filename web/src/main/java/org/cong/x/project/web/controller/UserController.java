package org.cong.x.project.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
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
@RequestMapping("/userInfo")
public class UserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/getUserInfo")
    public DataRes<PageRes<SysUser>> getUserInfo() {
        return sysUserService.getUserInfo();
    }


    /**
     * 用户查询.
     * @return
     */
    @RequestMapping("/userList")
    @RequiresPermissions("userInfo:view")//权限管理;
    public String userInfo(){
        return "userInfo";
    }

    /**
     * 用户添加;
     * @return
     */
    @RequestMapping("/userAdd")
    @RequiresPermissions("userInfo:add")//权限管理;
    public String userInfoAdd(){
        return "userInfoAdd";
    }

    /**
     * 用户删除;
     * @return
     */
    @RequestMapping("/userDel")
    @RequiresPermissions("userInfo:del")//权限管理;
    public String userDel(){
        return "userInfoDel";
    }

}
