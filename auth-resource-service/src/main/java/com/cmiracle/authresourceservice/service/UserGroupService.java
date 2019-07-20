package com.cmiracle.authresourceservice.service;

import com.cmiracle.authresourceservice.model.SysUser;
import com.cmiracle.authresourceservice.model.SysUserGroup;

import java.util.List;

/**
 * @Author: cmiracle
 * @Date: 2019/7/19 00 45
 * @Description:
 */
public interface UserGroupService {

    void addUserGroup();

    void deleteUserGroup(Long id);

    SysUserGroup getUserGroup(Long id);

    void updateUserGroup(Long id);

    List<SysUser> getUserGroups();

    void addUser();

    void removeUser();
}
