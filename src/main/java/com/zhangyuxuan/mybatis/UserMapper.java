package com.zhangyuxuan.mybatis;

import java.util.List;

/**
 * @description:
 * @author: zhangyuxuan
 * @date: 2022/3/8 下午1:56 周二
 */
public interface UserMapper {
    List<User> queryUserBySchoolName(User user);
}
