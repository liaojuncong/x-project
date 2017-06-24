package org.cong.x.project.web.dao;

import org.apache.ibatis.session.SqlSession;
import org.cong.x.project.web.model.SysUser;
import org.springframework.stereotype.Component;

/**
 * Created by liaojuncong on 25/06/2017.
 */
@Component
public class SysUserDao {

    private final SqlSession sqlSession;

    public SysUserDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public SysUser selectById(long id) {
        return this.sqlSession.selectOne("selectById", id);
    }
}
