package com.cmiracle.authresourceservice.service;

import com.cmiracle.authresourceservice.mapper.SysUserGroupMapper;
import com.cmiracle.authresourceservice.model.SysUser;
import com.cmiracle.authresourceservice.model.SysUserGroup;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: cmiracle
 * @Date: 2019/7/20 15 49
 * @Description:
 */
@Service
public class UserGroupServiceImpl implements UserGroupService {

    @AutoConfigureOrder
    private SysUserGroupMapper sysUserGroupMapper;

    @Override
    public void addUserGroup() {

    }

    @Override
    public void deleteUserGroup(Long id) {

    }

    @Override
    public SysUserGroup getUserGroup(Long id) {
        return null;
    }

    @Override
    public void updateUserGroup(Long id) {

    }

    @Override
    public List<SysUser> getUserGroups() {
        return null;
    }

    @Override
    public void addUser() {

    }

    @Override
    public void removeUser() {

    }
}
