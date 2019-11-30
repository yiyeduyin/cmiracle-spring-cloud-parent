package com.cmiracle.authresourceservice.model;

import javax.persistence.*;

@Table(name = "sys_user_group_role_relation")
public class SysUserGroupRoleRelation {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "user_group_id")
    private Long userGroupId;

    @Column(name = "role_id")
    private Long roleId;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return user_group_id
     */
    public Long getUserGroupId() {
        return userGroupId;
    }

    /**
     * @param userGroupId
     */
    public void setUserGroupId(Long userGroupId) {
        this.userGroupId = userGroupId;
    }

    /**
     * @return role_id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}