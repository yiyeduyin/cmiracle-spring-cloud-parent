package com.cmiracle.authresourceservice.service;

import com.cmiracle.authresourceservice.mapper.*;
import com.cmiracle.authresourceservice.model.SysMenu;
import com.cmiracle.authresourceservice.model.SysRoleMenuRelation;
import com.cmiracle.authresourceservice.model.SysUser;
import com.cmiracle.authresourceservice.model.SysUserRoleRelation;
import com.cmiracle.springcloud.commonutil.constant.ResultCode;
import com.cmiracle.springcloud.commonutil.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户关联角色
 *
 * @Author: cmiracle
 * @Date: 2019/7/20 15 51
 * @Description:
 */
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
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(id);
        if(sysUser == null){
            throw new ServiceException(ResultCode.NOT_FOUND);
        }
        Example example = new Example(SysUserRoleRelation.class);
        example.createCriteria().andEqualTo("userId", id);
        List<SysUserRoleRelation> sysUserRoleRelations = sysUserRoleRelationMapper.selectByExample(example);
        List<Long> roleIds = sysUserRoleRelations.stream().map(s -> s.getRoleId()).collect(Collectors.toList());

        Example roleMenuExample = new Example(SysRoleMenuRelation.class);
        roleMenuExample.createCriteria().andIn("roleId", roleIds);
        List<SysRoleMenuRelation> sysRoleMenuRelations = sysRoleMenuRelationMapper.selectByExample(roleMenuExample);
        List<Long> menuIds = sysRoleMenuRelations.stream().map(s -> s.getMenuId()).collect(Collectors.toList());

        Example menuExample = new Example(SysRoleMenuRelation.class);
        menuExample.createCriteria().andIn("id", menuIds);
        List<SysMenu> sysMenus = sysMenuMapper.selectByExample(menuExample);




        return sysMenus;
    }


}
