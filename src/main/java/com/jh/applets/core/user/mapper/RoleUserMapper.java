package com.jh.applets.core.user.mapper;

import com.jh.applets.config.mapper.MyBaseMapper;
import com.jh.applets.core.user.model.RoleUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface RoleUserMapper extends MyBaseMapper<RoleUser> {
}