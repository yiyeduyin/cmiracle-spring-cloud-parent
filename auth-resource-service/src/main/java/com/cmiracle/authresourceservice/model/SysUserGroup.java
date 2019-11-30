package com.cmiracle.authresourceservice.model;

import javax.persistence.*;

@Table(name = "sys_user_group")
public class SysUserGroup {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}