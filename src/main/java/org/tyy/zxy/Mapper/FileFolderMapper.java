package org.tyy.zxy.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.tyy.zxy.entity.FileFolder;

public interface FileFolderMapper extends BaseMapper<FileFolder> {
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
    int insert(FileFolder record);

    int insertOrUpdate(FileFolder record);

    int insertOrUpdateSelective(FileFolder record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(FileFolder record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    FileFolder selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(FileFolder record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(FileFolder record);

    int updateBatch(@Param("list") List<FileFolder> list);

    int updateBatchUseMultiQuery(@Param("list") List<FileFolder> list);

    int updateBatchSelective(@Param("list") List<FileFolder> list);

    int batchInsert(@Param("list") List<FileFolder> list);

    int batchInsertSelectiveUseDefaultForNull(@Param("list") List<FileFolder> list);

    int batchInsertOrUpdate(@Param("list") List<FileFolder> list);
}