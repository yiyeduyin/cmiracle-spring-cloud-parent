package com.cmiracle.authresourceservice.model;

import javax.persistence.*;

@Table(name = "sys_user_group_relation")
public class SysUserGroupRelation {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_group_id")
    private Long userGroupId;

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
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
}