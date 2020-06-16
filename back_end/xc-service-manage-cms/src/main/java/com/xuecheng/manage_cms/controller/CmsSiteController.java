package com.xuecheng.manage_cms.controller;

import com.xuecheng.api.cms.CmsSiteControllerApi;
import com.xuecheng.framework.domain.cms.CmsSite;
import com.xuecheng.manage_cms.service.CmsSiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cms/site")
public class CmsSiteController implements CmsSiteControllerApi{
    @Autowired
    private CmsSiteService cmsSiteService;
    @Override
    @GetMapping("list")
    public List<CmsSite> findSiteList() {
        return cmsSiteService.findSiteList();
    }
}
