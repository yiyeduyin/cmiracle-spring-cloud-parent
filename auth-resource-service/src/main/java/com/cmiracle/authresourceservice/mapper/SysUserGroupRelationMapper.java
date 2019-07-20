package com.cmiracle.authresourceservice.mapper;

import com.cmiracle.authresourceservice.model.SysUserGroupRelation;
import com.cmiracle.authresourceservice.model.SysUserGroupRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SysUserGroupRelationMapper extends Mapper<SysUserGroupRelation> {
    long countByExample(SysUserGroupRelationExample example);

    int deleteByExample(SysUserGroupRelationExample example);

    List<SysUserGroupRelation> selectByExample(SysUserGroupRelationExample example);

    int updateByExampleSelective(@Param("record") SysUserGroupRelation record, @Param("example") SysUserGroupRelationExample example);

    int updateByExample(@Param("record") SysUserGroupRelation record, @Param("example") SysUserGroupRelationExample example);
}