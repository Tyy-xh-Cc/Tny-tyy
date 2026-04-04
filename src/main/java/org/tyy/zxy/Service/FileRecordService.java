package org.tyy.zxy.Service;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.tyy.zxy.Mapper.FileRecordMapper;
import org.tyy.zxy.entity.FileRecord;
@Service
public class FileRecordService{

    @Autowired
    private FileRecordMapper fileRecordMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return fileRecordMapper.deleteByPrimaryKey(id);
    }

    
    public int deleteByPrimaryKeyIn(List<Long> list) {
        return fileRecordMapper.deleteByPrimaryKeyIn(list);
    }

    
    public int insert(FileRecord record) {
        return fileRecordMapper.insert(record);
    }

    
    public int insertOrUpdate(FileRecord record) {
        return fileRecordMapper.insertOrUpdate(record);
    }

    
    public int insertOrUpdateSelective(FileRecord record) {
        return fileRecordMapper.insertOrUpdateSelective(record);
    }

    
    public int insertSelective(FileRecord record) {
        return fileRecordMapper.insertSelective(record);
    }

    
    public FileRecord selectByPrimaryKey(Long id) {
        return fileRecordMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(FileRecord record) {
        return fileRecordMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(FileRecord record) {
        return fileRecordMapper.updateByPrimaryKey(record);
    }

    
    public int updateBatch(List<FileRecord> list) {
        return fileRecordMapper.updateBatch(list);
    }

    
    public int updateBatchUseMultiQuery(List<FileRecord> list) {
        return fileRecordMapper.updateBatchUseMultiQuery(list);
    }

    
    public int updateBatchSelective(List<FileRecord> list) {
        return fileRecordMapper.updateBatchSelective(list);
    }

    
    public int batchInsert(List<FileRecord> list) {
        return fileRecordMapper.batchInsert(list);
    }

    
    public int batchInsertSelectiveUseDefaultForNull(List<FileRecord> list) {
        return fileRecordMapper.batchInsertSelectiveUseDefaultForNull(list);
    }

    
    public int batchInsertOrUpdate(List<FileRecord> list) {
        return fileRecordMapper.batchInsertOrUpdate(list);
    }

}
