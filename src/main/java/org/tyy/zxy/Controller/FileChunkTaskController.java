package org.tyy.zxy.Controller;
import org.tyy.zxy.entity.FileChunkTask;
import org.tyy.zxy.Service.FileChunkTaskService;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* 大文件分片上传任务表(file_storage_db.file_chunk_task)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/api/file_storage_db.file_chunk_task")
public class FileChunkTaskController {
/**
* 服务对象
*/
    @Autowired
    private FileChunkTaskService fileChunkTaskService;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public FileChunkTask selectOne(Long id) {
    return fileChunkTaskService.selectByPrimaryKey(id);
    }

}
