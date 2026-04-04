package org.tyy.zxy.Controller;
import org.tyy.zxy.entity.SysUser;
import org.tyy.zxy.Service.SysUserService;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* 系统用户表(file_storage_db.sys_user)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/file_storage_db.sys_user")
public class SysUserController {
/**
* 服务对象
*/
    @Autowired
    private SysUserService sysUserService;

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

}
