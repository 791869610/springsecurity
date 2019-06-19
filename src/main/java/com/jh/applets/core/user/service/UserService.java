package com.jh.applets.core.user.service;

import com.jh.applets.core.user.model.User;

public interface UserService {

    /**
     * 添加用户
     * @param user
     */
    void add(User user);

    /**
     * 编辑用户
     * @param user
     */
    void modify(User user);

    /**
     * 删除用户
     * @param id
     */
    void del(Long id);

    /**
     * 根据id获取用户
     * @param id
     */
    User findById(Long id);

    /**
     * 根据account获取用户
     * @param account
     */
    User findByUserName(String account);
}
