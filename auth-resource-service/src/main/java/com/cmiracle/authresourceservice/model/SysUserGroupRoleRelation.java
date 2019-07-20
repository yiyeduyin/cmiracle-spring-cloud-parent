package com.cmiracle.authresourceservice.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "sys_user_group_role_relation")
public class SysUserGroupRoleRelation implements Serializable {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "user_group_id")
    private Long userGroupId;

    @Column(name = "role_id")
    private Long roleId;

    private static final long serialVersionUID = 1L;

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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysUserGroupRoleRelation other = (SysUserGroupRoleRelation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserGroupId() == null ? other.getUserGroupId() == null : this.getUserGroupId().equals(other.getUserGroupId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserGroupId() == null) ? 0 : getUserGroupId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        return result;
    }
}