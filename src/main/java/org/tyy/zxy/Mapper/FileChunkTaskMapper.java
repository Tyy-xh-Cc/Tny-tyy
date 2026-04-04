package org.tyy.zxy.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.tyy.zxy.entity.FileChunkTask;

public interface FileChunkTaskMapper extends BaseMapper<FileChunkTask> {
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
    int insert(FileChunkTask record);

    int insertOrUpdate(FileChunkTask record);

    int insertOrUpdateSelective(FileChunkTask record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(FileChunkTask record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    FileChunkTask selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(FileChunkTask record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(FileChunkTask record);

    int updateBatch(@Param("list") List<FileChunkTask> list);

    int updateBatchUseMultiQuery(@Param("list") List<FileChunkTask> list);

    int updateBatchSelective(@Param("list") List<FileChunkTask> list);

    int batchInsert(@Param("list") List<FileChunkTask> list);

    int batchInsertSelectiveUseDefaultForNull(@Param("list") List<FileChunkTask> list);

    int batchInsertOrUpdate(@Param("list") List<FileChunkTask> list);
}