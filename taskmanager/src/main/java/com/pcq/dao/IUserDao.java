package com.pcq.dao;

import com.pcq.entity.User;


public interface IUserDao {
    /**
     * 根据用户id获取用户信息
     * @param id 用户id
     * @return 用户对象
     */
    User getUserById(Integer id);

    /**
     * 更新User信息
     * @param user 用户对象
     */
    void updateUser(User user);

    /**
     * 增加用户信息
     * @param user 用户对象
     */
    void addUser(User user);

    /**
     * 根据用户id删除用户信息
     * @param id
     */
    void deleteUserById(Integer id);

    /**
     * 根据用户名和密码寻找用户对象信息
     * @param username 用户名
     * @param password 密码
     * @return
     */
    User findUserByLogin(String username, String password);
}
