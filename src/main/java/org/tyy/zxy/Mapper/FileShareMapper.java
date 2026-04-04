package org.tyy.zxy.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.tyy.zxy.entity.FileShare;

public interface FileShareMapper extends BaseMapper<FileShare> {
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
    int insert(FileShare record);

    int insertOrUpdate(FileShare record);

    int insertOrUpdateSelective(FileShare record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(FileShare record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    FileShare selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(FileShare record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(FileShare record);

    int updateBatch(@Param("list") List<FileShare> list);

    int updateBatchUseMultiQuery(@Param("list") List<FileShare> list);

    int updateBatchSelective(@Param("list") List<FileShare> list);

    int batchInsert(@Param("list") List<FileShare> list);

    int batchInsertSelectiveUseDefaultForNull(@Param("list") List<FileShare> list);

    int batchInsertOrUpdate(@Param("list") List<FileShare> list);
}