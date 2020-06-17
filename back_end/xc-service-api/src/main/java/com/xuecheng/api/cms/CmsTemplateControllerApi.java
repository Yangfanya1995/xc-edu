package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.CmsSite;
import com.xuecheng.framework.domain.cms.CmsTemplate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

@Api(value = "cms模板管理接口",description = "提供模板的增删查改")
public interface CmsTemplateControllerApi {
    @ApiOperation("查询站点列表")
    List<CmsTemplate> findSiteList();
}
