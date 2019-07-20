package com.cmiracle.authresourceservice.mapper;

import com.cmiracle.authresourceservice.model.SysUserGroup;
import com.cmiracle.authresourceservice.model.SysUserGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SysUserGroupMapper extends Mapper<SysUserGroup> {
    long countByExample(SysUserGroupExample example);

    int deleteByExample(SysUserGroupExample example);

    List<SysUserGroup> selectByExample(SysUserGroupExample example);

    int updateByExampleSelective(@Param("record") SysUserGroup record, @Param("example") SysUserGroupExample example);

    int updateByExample(@Param("record") SysUserGroup record, @Param("example") SysUserGroupExample example);
}