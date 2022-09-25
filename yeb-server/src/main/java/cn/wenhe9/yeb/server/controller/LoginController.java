package cn.wenhe9.yeb.server.controller;

import cn.wenhe9.yeb.server.domain.AdminLoginParam;
import cn.wenhe9.yeb.server.result.ResultResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 登录
 * @author: DuJinliang
 * @create: 2022/9/24
 */
@RestController
@Api(tags = "登录接口")
public class LoginController {

    @ApiOperation(value = "登录之后获取token")
    @PostMapping("/login")
    public ResultResponse<String> login(AdminLoginParam adminLoginParam) {
        return ResultResponse.success();
    }

}
