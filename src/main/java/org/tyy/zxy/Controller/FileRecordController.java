package org.tyy.zxy.Controller;
import org.tyy.zxy.entity.FileRecord;
import org.tyy.zxy.Service.FileRecordService;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* 核心文件记录表(file_storage_db.file_record)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/file_storage_db.file_record")
public class FileRecordController {
/**
* 服务对象
*/
    @Autowired
    private FileRecordService fileRecordService;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public FileRecord selectOne(Long id) {
    return fileRecordService.selectByPrimaryKey(id);
    }

}
