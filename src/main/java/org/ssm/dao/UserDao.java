package org.ssm.dao;

import org.apache.ibatis.annotations.Param;
import org.ssm.entity.User;

import java.util.Date;
import java.util.List;

/**
 * Created by xwy_brh on 2017/9/1.
 */
public interface UserDao {

    /**
     * 创建用户
     *
     * @param userName
     * @param userNo
     * @param password
     * @param tel
     * @param createTime
     */
    int insertUser(String userName, String userNo, String password, String tel, Date createTime);


    /**
     * 查询用户的信息
     *
     * @param userNo
     * @return 返回用户对象
     */
    User queryByUserNo(String userNo);

    /**
     * 查询所有用户信息
     *
     * @param offset
     * @param limit
     * @return 用户信息对象列表
     */
    List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);

}
