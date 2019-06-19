package com.jh.applets.core.user.service.impl;

import com.jh.applets.common.enums.IsDeleteEnum;
import com.jh.applets.common.util.id.IdUtil;
import com.jh.applets.core.user.mapper.UserMapper;
import com.jh.applets.core.user.model.User;
import com.jh.applets.core.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * @program: applets
 * @description:
 * @author: jiahao
 * @create: 2019-06-19 15:44
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    /**
     * 添加用户
     *
     * @param user
     */
    @Override
    public void add(User user) {
        user.setId(IdUtil.generateId());
        userMapper.insertSelective(user);
    }

    /**
     * 编辑用户
     *
     * @param user
     */
    @Override
    public void modify(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    /**
     * 删除用户
     *
     * @param id
     */
    @Override
    public void del(Long id) {
        final User build = User.builder().id(id).isDel(IsDeleteEnum.DELETE.getCode()).build();
        userMapper.updateByPrimaryKeySelective(build);
    }

    /**
     * 根据id获取用户
     *
     * @param id
     */
    @Override
    public User findById(Long id) {
        Example example = new Example(User.class);
        example.createCriteria()
                .andEqualTo("id", id)
                .andEqualTo("isDel", IsDeleteEnum.NOT_DELETE.getCode());
        final User user = userMapper.selectOneByExample(example);
        return user;
    }

    /**
     * 根据account获取用户
     *
     * @param account
     */
    @Override
    public User findByUserName(String account) {
        Example example = new Example(User.class);
        example.createCriteria()
                .andEqualTo("account", account)
                .andEqualTo("isDel", IsDeleteEnum.NOT_DELETE.getCode());
        final User user = userMapper.selectOneByExample(example);
        return user;
    }
}
