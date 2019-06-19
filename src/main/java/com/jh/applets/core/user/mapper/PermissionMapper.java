package com.jh.applets.core.user.mapper;

import com.jh.applets.config.mapper.MyBaseMapper;
import com.jh.applets.core.user.model.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PermissionMapper extends MyBaseMapper<Permission> {
}