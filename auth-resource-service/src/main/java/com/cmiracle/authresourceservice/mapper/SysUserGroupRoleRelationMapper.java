package com.cmiracle.authresourceservice.mapper;

import com.cmiracle.authresourceservice.model.SysUserGroupRoleRelation;
import com.cmiracle.authresourceservice.model.SysUserGroupRoleRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SysUserGroupRoleRelationMapper extends Mapper<SysUserGroupRoleRelation> {
    long countByExample(SysUserGroupRoleRelationExample example);

    int deleteByExample(SysUserGroupRoleRelationExample example);

    List<SysUserGroupRoleRelation> selectByExample(SysUserGroupRoleRelationExample example);

    int updateByExampleSelective(@Param("record") SysUserGroupRoleRelation record, @Param("example") SysUserGroupRoleRelationExample example);

    int updateByExample(@Param("record") SysUserGroupRoleRelation record, @Param("example") SysUserGroupRoleRelationExample example);
}