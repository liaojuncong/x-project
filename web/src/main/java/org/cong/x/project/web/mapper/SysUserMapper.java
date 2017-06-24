package org.cong.x.project.web.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.cong.x.project.web.model.SysUser;

import java.util.List;

/**
 * Created by liaojuncong on 04/10/2016.
 */
@Mapper
public interface SysUserMapper {

    List<SysUser> selectAll();

    @Select("select * from sys_user")
    List<SysUser> select();

    @Select("select * from sys_user where id=#{id}")
    SysUser selectById(@Param("id") long id);
}
