package org.tyy.zxy.Service;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.tyy.zxy.Mapper.FileShareMapper;
import org.tyy.zxy.entity.FileShare;
@Service
public class FileShareService{

    @Autowired
    private FileShareMapper fileShareMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return fileShareMapper.deleteByPrimaryKey(id);
    }

    
    public int deleteByPrimaryKeyIn(List<Long> list) {
        return fileShareMapper.deleteByPrimaryKeyIn(list);
    }

    
    public int insert(FileShare record) {
        return fileShareMapper.insert(record);
    }

    
    public int insertOrUpdate(FileShare record) {
        return fileShareMapper.insertOrUpdate(record);
    }

    
    public int insertOrUpdateSelective(FileShare record) {
        return fileShareMapper.insertOrUpdateSelective(record);
    }

    
    public int insertSelective(FileShare record) {
        return fileShareMapper.insertSelective(record);
    }

    
    public FileShare selectByPrimaryKey(Long id) {
        return fileShareMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(FileShare record) {
        return fileShareMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(FileShare record) {
        return fileShareMapper.updateByPrimaryKey(record);
    }

    
    public int updateBatch(List<FileShare> list) {
        return fileShareMapper.updateBatch(list);
    }

    
    public int updateBatchUseMultiQuery(List<FileShare> list) {
        return fileShareMapper.updateBatchUseMultiQuery(list);
    }

    
    public int updateBatchSelective(List<FileShare> list) {
        return fileShareMapper.updateBatchSelective(list);
    }

    
    public int batchInsert(List<FileShare> list) {
        return fileShareMapper.batchInsert(list);
    }

    
    public int batchInsertSelectiveUseDefaultForNull(List<FileShare> list) {
        return fileShareMapper.batchInsertSelectiveUseDefaultForNull(list);
    }

    
    public int batchInsertOrUpdate(List<FileShare> list) {
        return fileShareMapper.batchInsertOrUpdate(list);
    }

}
