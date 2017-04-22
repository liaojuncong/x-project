package org.cong.x.project.web.service;


import org.cong.x.project.web.model.SysUser;
import org.cong.x.project.web.util.response.DataRes;
import org.cong.x.project.web.util.response.PageRes;

/**
 * Created by liaojuncong on 04/10/2016.
 */
public interface SysUserService {

    DataRes<PageRes<SysUser>> getUserInfo();
}
