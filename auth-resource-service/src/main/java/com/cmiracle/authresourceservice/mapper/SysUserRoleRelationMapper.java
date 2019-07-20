package com.cmiracle.authresourceservice.mapper;

import com.cmiracle.authresourceservice.model.SysUserRoleRelation;
import com.cmiracle.authresourceservice.model.SysUserRoleRelationExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface SysUserRoleRelationMapper extends Mapper<SysUserRoleRelation> {
    long countByExample(SysUserRoleRelationExample example);

    int deleteByExample(SysUserRoleRelationExample example);

    List<SysUserRoleRelation> selectByExample(SysUserRoleRelationExample example);

    int updateByExampleSelective(@Param("record") SysUserRoleRelation record, @Param("example") SysUserRoleRelationExample example);

    int updateByExample(@Param("record") SysUserRoleRelation record, @Param("example") SysUserRoleRelationExample example);
}