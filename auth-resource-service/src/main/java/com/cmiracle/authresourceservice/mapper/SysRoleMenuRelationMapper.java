package com.cmiracle.authresourceservice.mapper;

import com.cmiracle.authresourceservice.model.SysRoleMenuRelation;
import com.cmiracle.authresourceservice.model.SysRoleMenuRelationExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface SysRoleMenuRelationMapper extends Mapper<SysRoleMenuRelation> {
    long countByExample(SysRoleMenuRelationExample example);

    int deleteByExample(SysRoleMenuRelationExample example);

    List<SysRoleMenuRelation> selectByExample(SysRoleMenuRelationExample example);

    int updateByExampleSelective(@Param("record") SysRoleMenuRelation record, @Param("example") SysRoleMenuRelationExample example);

    int updateByExample(@Param("record") SysRoleMenuRelation record, @Param("example") SysRoleMenuRelationExample example);
}