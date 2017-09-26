package org.ssm.dao;


import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.ssm.entity.User;
import tool.Tool;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xwy_brh on 2017/9/4.
 */

/**
 * 配置spring和junit整合, junit启动的加载springIOC容器
 * spring-test, junit
 */

@RunWith(SpringJUnit4ClassRunner.class)

// 告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})

public class UserDaoTest {

    //注入Dao实现类依赖
    @Resource
    private UserDao userDao;

    @Test
    public void insertUser() throws Exception {


    }

    @Test
    public void queryByUserNo() throws Exception {
        String userNo = "13253503652";
        User user = userDao.queryByUserNo(userNo);
        System.out.print(user);
    }

    @Test
    public void queryAll() throws Exception {
        List<User> users = userDao.queryAll(2, 10);

        /**
         * Java没有保存形参的记录
         */
        for (User user :
                users) {
            System.out.print(user);
        }

       // Tool.transformObjectsToJson("users", users);
        Tool.transformObjectsToJson(users);
        JSONObject o = Tool.putObjectsIntoJSONObject("users", users);
        System.out.print("\n--Users"+o.toString());
    }

}