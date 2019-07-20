package com.cmiracle.authresourceservice.service;

import com.cmiracle.authresourceservice.model.SysRole;

import java.util.List;

/**
 * @Author: cmiracle
 * @Date: 2019/7/19 00 43
 * @Description:
 */
public interface RoleService {

    void addRole();

    void deleteRole(Long id);

    SysRole getRole(Long id);

    void updateRole(Long id);

    List<SysRole> getRoles();
}
