package com.cmiracle.authresourceservice.mapper;

import com.cmiracle.authresourceservice.model.SysRoleResourceRelation;
import com.cmiracle.authresourceservice.model.SysRoleResourceRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SysRoleResourceRelationMapper extends Mapper<SysRoleResourceRelation> {
    long countByExample(SysRoleResourceRelationExample example);

    int deleteByExample(SysRoleResourceRelationExample example);

    List<SysRoleResourceRelation> selectByExample(SysRoleResourceRelationExample example);

    int updateByExampleSelective(@Param("record") SysRoleResourceRelation record, @Param("example") SysRoleResourceRelationExample example);

    int updateByExample(@Param("record") SysRoleResourceRelation record, @Param("example") SysRoleResourceRelationExample example);
}