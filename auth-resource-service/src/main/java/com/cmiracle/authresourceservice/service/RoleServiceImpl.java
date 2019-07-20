package com.cmiracle.authresourceservice.service;

import com.cmiracle.authresourceservice.mapper.SysResourceMapper;
import com.cmiracle.authresourceservice.model.SysRole;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 角色
 * 关联菜单和资源
 *
 * @Author: cmiracle
 * @Date: 2019/7/20 16 02
 * @Description:
 */
public class RoleServiceImpl implements RoleService {

    @Autowired
    private SysResourceMapper sysResourceMapper;

    @Override
    public void addRole() {

    }

    @Override
    public void deleteRole(Long id) {

    }

    @Override
    public SysRole getRole(Long id) {
        return null;
    }

    @Override
    public void updateRole(Long id) {

    }

    @Override
    public List<SysRole> getRoles() {
        return null;
    }


}
