package org.tyy.zxy.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.tyy.zxy.entity.FileRecord;

public interface FileRecordMapper extends BaseMapper<FileRecord> {
    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    int deleteByPrimaryKeyIn(List<Long> list);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(FileRecord record);

    int insertOrUpdate(FileRecord record);

    int insertOrUpdateSelective(FileRecord record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(FileRecord record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    FileRecord selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(FileRecord record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(FileRecord record);

    int updateBatch(@Param("list") List<FileRecord> list);

    int updateBatchUseMultiQuery(@Param("list") List<FileRecord> list);

    int updateBatchSelective(@Param("list") List<FileRecord> list);

    int batchInsert(@Param("list") List<FileRecord> list);

    int batchInsertSelectiveUseDefaultForNull(@Param("list") List<FileRecord> list);

    int batchInsertOrUpdate(@Param("list") List<FileRecord> list);
}