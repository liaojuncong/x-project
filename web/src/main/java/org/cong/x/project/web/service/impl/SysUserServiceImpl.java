package org.cong.x.project.web.service.impl;

import com.github.pagehelper.PageHelper;
import org.cong.x.project.web.dao.SysUserDao;
import org.cong.x.project.web.mapper.SysUserMapper;
import org.cong.x.project.web.model.SysUser;
import org.cong.x.project.web.service.SysUserService;
import org.cong.x.project.web.util.ConverterUtil;
import org.cong.x.project.web.util.ResUtil;
import org.cong.x.project.web.util.response.DataRes;
import org.cong.x.project.web.util.response.PageRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liaojuncong on 04/10/2016.
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public DataRes<PageRes<SysUser>> getUserInfo() {

        SysUser user = sysUserDao.selectById(1);

        List<SysUser> users = sysUserMapper.select();

        PageHelper.startPage(3, 2);
        List<SysUser> list = sysUserMapper.selectAll();

        PageRes page = ConverterUtil.convertToPageInfoRes(list);


        return ResUtil.renderSucc(page);
    }
}
