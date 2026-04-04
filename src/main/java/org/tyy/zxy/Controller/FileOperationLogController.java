package org.tyy.zxy.Controller;
import org.tyy.zxy.entity.FileOperationLog;
import org.tyy.zxy.Service.FileOperationLogService;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* 文件操作审计日志表(file_storage_db.file_operation_log)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/file_storage_db.file_operation_log")
public class FileOperationLogController {
/**
* 服务对象
*/
    @Autowired
    private FileOperationLogService fileOperationLogService;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public FileOperationLog selectOne(Long id) {
    return fileOperationLogService.selectByPrimaryKey(id);
    }

}
