package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.CmsSite;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

@Api(value = "cms站点管理接口",description = "提供站点的增删查改")
public interface CmsSiteControllerApi {
    @ApiOperation("查询站点列表")
    List<CmsSite> findSiteList();
}
