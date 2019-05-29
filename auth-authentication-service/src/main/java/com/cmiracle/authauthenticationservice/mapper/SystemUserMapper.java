package com.cmiracle.authauthenticationservice.mapper;

import com.cmiracle.authauthenticationservice.model.SystemUser;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface SystemUserMapper extends Mapper<SystemUser>, MySqlMapper<SystemUser> {


}
