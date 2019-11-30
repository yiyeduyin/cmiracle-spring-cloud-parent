package com.cmiracle.authresourceservice.service;

import com.cmiracle.authresourceservice.mapper.*;
import com.cmiracle.authresourceservice.model.*;
import com.cmiracle.springcloud.commonutil.constant.ResultCode;
import com.cmiracle.springcloud.commonutil.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户关联角色
 *
 * @Author: cmiracle
 * @Date: 2019/7/20 15 51
 * @Description:
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Autowired
    private SysRoleMenuRelationMapper sysRoleMenuRelationMapper;

    @Autowired
    private SysUserRoleRelationMapper sysUserRoleRelationMapper;

    @Override
    public void addUser() {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public SysUser getUser(Long id) {
        return null;
    }

    @Override
    public void updateUser(Long id) {

    }

    @Override
    public List<SysUser> getUsers() {
        return null;
    }

    @Override
    public List<SysMenu> getUserMenus(Long id) {
        log.info("into getUserMenus");

        SysUser sysUser = sysUserMapper.selectByPrimaryKey(id);
        if(sysUser == null){
            throw new ServiceException(ResultCode.NOT_FOUND);
        }
        SysUserRoleRelationExample sysUserRoleRelationExample = new SysUserRoleRelationExample();
        sysUserRoleRelationExample.createCriteria().andIdEqualTo(id);
        List<SysUserRoleRelation> sysUserRoleRelations = sysUserRoleRelationMapper.selectByExample(sysUserRoleRelationExample);
        List<Long> roleIds = sysUserRoleRelations.stream().map(s -> s.getRoleId()).collect(Collectors.toList());

        SysRoleMenuRelationExample roleMenuExample = new SysRoleMenuRelationExample();
        roleMenuExample.createCriteria().andRoleIdIn(roleIds);
        List<SysRoleMenuRelation> sysRoleMenuRelations = sysRoleMenuRelationMapper.selectByExample(roleMenuExample);
        List<Long> menuIds = sysRoleMenuRelations.stream().map(s -> s.getMenuId()).collect(Collectors.toList());

        SysMenuExample menuExample = new SysMenuExample();
        menuExample.createCriteria().andIdIn(menuIds);
        List<SysMenu> sysMenus = sysMenuMapper.selectByExample(menuExample);
        return sysMenus;
    }


}
