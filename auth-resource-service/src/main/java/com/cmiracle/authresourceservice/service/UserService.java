package com.cmiracle.authresourceservice.service;

import com.cmiracle.authresourceservice.model.SysMenu;
import com.cmiracle.authresourceservice.model.SysUser;

import java.util.List;

/**
 * @Author: cmiracle
 * @Date: 2019/7/19 00 45
 * @Description:
 */
public interface UserService {

    void addUser();

    void deleteUser(Long id);

    SysUser getUser(Long id);

    void updateUser(Long id);

    List<SysUser> getUsers();

    List<SysMenu> getUserMenus(Long id);
}
