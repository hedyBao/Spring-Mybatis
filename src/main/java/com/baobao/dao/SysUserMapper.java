package com.baobao.dao;

import com.baobao.model.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserMapper {
    int insertUser(@Param("sysUser") SysUser sysUser);


}

