package com.cmiracle.authresourceservice.mapper;

import com.cmiracle.authresourceservice.model.SysResource;
import com.cmiracle.authresourceservice.model.SysResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SysResourceMapper extends Mapper<SysResource> {
    long countByExample(SysResourceExample example);

    int deleteByExample(SysResourceExample example);

    List<SysResource> selectByExample(SysResourceExample example);

    int updateByExampleSelective(@Param("record") SysResource record, @Param("example") SysResourceExample example);

    int updateByExample(@Param("record") SysResource record, @Param("example") SysResourceExample example);
}