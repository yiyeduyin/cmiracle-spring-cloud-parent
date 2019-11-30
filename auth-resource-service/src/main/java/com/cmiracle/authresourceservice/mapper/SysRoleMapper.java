package com.cmiracle.authresourceservice.mapper;

import com.cmiracle.authresourceservice.model.SysRole;
import com.cmiracle.authresourceservice.model.SysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SysRoleMapper extends Mapper<SysRole> {
    long countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    List<SysRole> selectByExample(SysRoleExample example);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);
}