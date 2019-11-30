package com.cmiracle.authresourceservice.model;

import javax.persistence.*;

@Table(name = "sys_menu")
public class SysMenu {
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 上级菜单
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 层级
     */
    @Column(name = "level")
    private Integer level;

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
     * 获取上级菜单
     *
     * @return parent_id - 上级菜单
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置上级菜单
     *
     * @param parentId 上级菜单
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取层级
     *
     * @return level - 层级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置层级
     *
     * @param level 层级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }
}