package org.tyy.zxy.Controller;
import org.tyy.zxy.entity.FileFolder;
import org.tyy.zxy.Service.FileFolderService;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* 文件目录表(file_storage_db.file_folder)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/file_storage_db.file_folder")
public class FileFolderController {
/**
* 服务对象
*/
    @Autowired
    private FileFolderService fileFolderService;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("selectOne")
    public FileFolder selectOne(Long id) {
    return fileFolderService.selectByPrimaryKey(id);
    }

}
