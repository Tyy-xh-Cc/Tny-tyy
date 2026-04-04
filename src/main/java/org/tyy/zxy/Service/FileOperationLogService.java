package org.tyy.zxy.Service;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.tyy.zxy.entity.FileOperationLog;
import java.util.List;
import org.tyy.zxy.Mapper.FileOperationLogMapper;
@Service
public class FileOperationLogService{

    @Autowired
    private FileOperationLogMapper fileOperationLogMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return fileOperationLogMapper.deleteByPrimaryKey(id);
    }

    
    public int deleteByPrimaryKeyIn(List<Long> list) {
        return fileOperationLogMapper.deleteByPrimaryKeyIn(list);
    }

    
    public int insert(FileOperationLog record) {
        return fileOperationLogMapper.insert(record);
    }

    
    public int insertOrUpdate(FileOperationLog record) {
        return fileOperationLogMapper.insertOrUpdate(record);
    }

    
    public int insertOrUpdateSelective(FileOperationLog record) {
        return fileOperationLogMapper.insertOrUpdateSelective(record);
    }

    
    public int insertSelective(FileOperationLog record) {
        return fileOperationLogMapper.insertSelective(record);
    }

    
    public FileOperationLog selectByPrimaryKey(Long id) {
        return fileOperationLogMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(FileOperationLog record) {
        return fileOperationLogMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(FileOperationLog record) {
        return fileOperationLogMapper.updateByPrimaryKey(record);
    }

    
    public int updateBatch(List<FileOperationLog> list) {
        return fileOperationLogMapper.updateBatch(list);
    }

    
    public int updateBatchUseMultiQuery(List<FileOperationLog> list) {
        return fileOperationLogMapper.updateBatchUseMultiQuery(list);
    }

    
    public int updateBatchSelective(List<FileOperationLog> list) {
        return fileOperationLogMapper.updateBatchSelective(list);
    }

    
    public int batchInsert(List<FileOperationLog> list) {
        return fileOperationLogMapper.batchInsert(list);
    }

    
    public int batchInsertSelectiveUseDefaultForNull(List<FileOperationLog> list) {
        return fileOperationLogMapper.batchInsertSelectiveUseDefaultForNull(list);
    }

    
    public int batchInsertOrUpdate(List<FileOperationLog> list) {
        return fileOperationLogMapper.batchInsertOrUpdate(list);
    }

}
