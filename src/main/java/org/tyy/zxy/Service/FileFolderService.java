package org.tyy.zxy.Service;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.tyy.zxy.entity.FileFolder;
import org.tyy.zxy.Mapper.FileFolderMapper;
@Service
public class FileFolderService{

    @Autowired
    private FileFolderMapper fileFolderMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return fileFolderMapper.deleteByPrimaryKey(id);
    }

    
    public int deleteByPrimaryKeyIn(List<Long> list) {
        return fileFolderMapper.deleteByPrimaryKeyIn(list);
    }

    
    public int insert(FileFolder record) {
        return fileFolderMapper.insert(record);
    }

    
    public int insertOrUpdate(FileFolder record) {
        return fileFolderMapper.insertOrUpdate(record);
    }

    
    public int insertOrUpdateSelective(FileFolder record) {
        return fileFolderMapper.insertOrUpdateSelective(record);
    }

    
    public int insertSelective(FileFolder record) {
        return fileFolderMapper.insertSelective(record);
    }

    
    public FileFolder selectByPrimaryKey(Long id) {
        return fileFolderMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(FileFolder record) {
        return fileFolderMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(FileFolder record) {
        return fileFolderMapper.updateByPrimaryKey(record);
    }

    
    public int updateBatch(List<FileFolder> list) {
        return fileFolderMapper.updateBatch(list);
    }

    
    public int updateBatchUseMultiQuery(List<FileFolder> list) {
        return fileFolderMapper.updateBatchUseMultiQuery(list);
    }

    
    public int updateBatchSelective(List<FileFolder> list) {
        return fileFolderMapper.updateBatchSelective(list);
    }

    
    public int batchInsert(List<FileFolder> list) {
        return fileFolderMapper.batchInsert(list);
    }

    
    public int batchInsertSelectiveUseDefaultForNull(List<FileFolder> list) {
        return fileFolderMapper.batchInsertSelectiveUseDefaultForNull(list);
    }

    
    public int batchInsertOrUpdate(List<FileFolder> list) {
        return fileFolderMapper.batchInsertOrUpdate(list);
    }

}
