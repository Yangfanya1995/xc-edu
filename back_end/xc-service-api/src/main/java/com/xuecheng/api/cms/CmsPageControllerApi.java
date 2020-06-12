package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "cms页面管理接口",description = "提供页面的增删查改")
public interface CmsPageControllerApi {
    @ApiOperation("分页查询页面列表")
    QueryResponseResult findList(int page,int size,QueryPageRequest queryPageRequest);
}
