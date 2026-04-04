package org.tyy.zxy.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.tyy.zxy.entity.FileOperationLog;

public interface FileOperationLogMapper extends BaseMapper<FileOperationLog> {
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
    int insert(FileOperationLog record);

    int insertOrUpdate(FileOperationLog record);

    int insertOrUpdateSelective(FileOperationLog record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(FileOperationLog record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    FileOperationLog selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(FileOperationLog record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(FileOperationLog record);

    int updateBatch(@Param("list") List<FileOperationLog> list);

    int updateBatchUseMultiQuery(@Param("list") List<FileOperationLog> list);

    int updateBatchSelective(@Param("list") List<FileOperationLog> list);

    int batchInsert(@Param("list") List<FileOperationLog> list);

    int batchInsertSelectiveUseDefaultForNull(@Param("list") List<FileOperationLog> list);

    int batchInsertOrUpdate(@Param("list") List<FileOperationLog> list);
}