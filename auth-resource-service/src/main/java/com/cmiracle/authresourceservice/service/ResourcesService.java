package com.cmiracle.authresourceservice.service;

import com.cmiracle.authresourceservice.model.SysResource;

import java.util.List;

/**
 * @Authoor: cmiracle
 * @Date: 2019/7/7 01 33
 * @Description:
 */
public interface ResourcesService {

    /**
     * 获取资源
     */
    List<SysResource> getResources();
}
