package org.tyy.zxy.Service;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.tyy.zxy.entity.FileChunkTask;
import org.tyy.zxy.Mapper.FileChunkTaskMapper;
@Service
public class FileChunkTaskService{

    @Autowired
    private FileChunkTaskMapper fileChunkTaskMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return fileChunkTaskMapper.deleteByPrimaryKey(id);
    }

    
    public int deleteByPrimaryKeyIn(List<Long> list) {
        return fileChunkTaskMapper.deleteByPrimaryKeyIn(list);
    }

    
    public int insert(FileChunkTask record) {
        return fileChunkTaskMapper.insert(record);
    }

    
    public int insertOrUpdate(FileChunkTask record) {
        return fileChunkTaskMapper.insertOrUpdate(record);
    }

    
    public int insertOrUpdateSelective(FileChunkTask record) {
        return fileChunkTaskMapper.insertOrUpdateSelective(record);
    }

    
    public int insertSelective(FileChunkTask record) {
        return fileChunkTaskMapper.insertSelective(record);
    }

    
    public FileChunkTask selectByPrimaryKey(Long id) {
        return fileChunkTaskMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(FileChunkTask record) {
        return fileChunkTaskMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(FileChunkTask record) {
        return fileChunkTaskMapper.updateByPrimaryKey(record);
    }

    
    public int updateBatch(List<FileChunkTask> list) {
        return fileChunkTaskMapper.updateBatch(list);
    }

    
    public int updateBatchUseMultiQuery(List<FileChunkTask> list) {
        return fileChunkTaskMapper.updateBatchUseMultiQuery(list);
    }

    
    public int updateBatchSelective(List<FileChunkTask> list) {
        return fileChunkTaskMapper.updateBatchSelective(list);
    }

    
    public int batchInsert(List<FileChunkTask> list) {
        return fileChunkTaskMapper.batchInsert(list);
    }

    
    public int batchInsertSelectiveUseDefaultForNull(List<FileChunkTask> list) {
        return fileChunkTaskMapper.batchInsertSelectiveUseDefaultForNull(list);
    }

    
    public int batchInsertOrUpdate(List<FileChunkTask> list) {
        return fileChunkTaskMapper.batchInsertOrUpdate(list);
    }

}
