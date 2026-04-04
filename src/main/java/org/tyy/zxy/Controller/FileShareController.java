package org.tyy.zxy.Controller;
import org.tyy.zxy.entity.FileShare;
import org.tyy.zxy.Service.FileShareService;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* 文件分享表(file_storage_db.file_share)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/file_storage_db.file_share")
public class FileShareController {
/**
* 服务对象
*/
    @Autowired
    private FileShareService fileShareService;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public FileShare selectOne(Long id) {
    return fileShareService.selectByPrimaryKey(id);
    }

}
