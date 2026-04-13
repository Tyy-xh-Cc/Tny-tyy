package org.tyy.zxy.Controller;
import lombok.extern.log4j.Log4j2;
import org.tyy.zxy.common.Result;
import org.tyy.zxy.common.ResultCode;
import org.tyy.zxy.entity.SysUser;
import org.tyy.zxy.Service.SysUserService;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.tyy.zxy.utils.JwtUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
* 系统用户表(file_storage_db.sys_user)表控制层
*
* @author xxxxx
*/
@Log4j2
@RestController
@RequestMapping("/api/auth")
public class SysUserController {
/**
* 服务对象
*/
    private final SysUserService sysUserService;
    private final JwtUtils jwtUtils;

    public SysUserController(SysUserService sysUserService, JwtUtils jwtUtils) {
        this.sysUserService = sysUserService;
        this.jwtUtils = jwtUtils;
    }

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public SysUser selectOne(Long id) {
    return sysUserService.selectByPrimaryKey(id);
    }

    @PostMapping("login")
    public Result<?> login(@RequestParam String username,
                          @RequestParam String password) {
        SysUser user =sysUserService.login(username,password);
        if(user==null) {
            return Result.fail(ResultCode.PASSWORD_ERROR.getCode(), "密码或账号错误");
        }
        Long refreshExpire = 7 * 24 * 60 * 60 * 1000L; // 7天
        String refreshToken = jwtUtils.generateRefreshToken(user.getId(), user.getUsername(), refreshExpire);
        Map<String,Object>  map = new HashMap<>();
        map.put("refreshToken",refreshToken);
        map.put("user",user);
        map.put("tokenType", "Bearer");
        return Result.success(map);
    }
    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "时间："+"中文";
    }
}
