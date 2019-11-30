package com.cmiracle.authresourceservice.mapper;

import com.cmiracle.authresourceservice.model.SysMenu;
import com.cmiracle.authresourceservice.model.SysMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SysMenuMapper extends Mapper<SysMenu> {
    long countByExample(SysMenuExample example);

    int deleteByExample(SysMenuExample example);

    List<SysMenu> selectByExample(SysMenuExample example);

    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);
}