package com.cmiracle.authresourceservice.mapper;

import com.cmiracle.authresourceservice.model.SysRoleMenuRelation;
import com.cmiracle.authresourceservice.model.SysRoleMenuRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SysRoleMenuRelationMapper extends Mapper<SysRoleMenuRelation> {
    long countByExample(SysRoleMenuRelationExample example);

    int deleteByExample(SysRoleMenuRelationExample example);

    List<SysRoleMenuRelation> selectByExample(SysRoleMenuRelationExample example);

    int updateByExampleSelective(@Param("record") SysRoleMenuRelation record, @Param("example") SysRoleMenuRelationExample example);

    int updateByExample(@Param("record") SysRoleMenuRelation record, @Param("example") SysRoleMenuRelationExample example);
}