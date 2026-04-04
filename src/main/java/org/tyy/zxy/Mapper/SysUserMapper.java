package org.tyy.zxy.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.tyy.zxy.entity.SysUser;

public interface SysUserMapper extends BaseMapper<SysUser> {
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
    int insert(SysUser record);

    int insertOrUpdate(SysUser record);

    int insertOrUpdateSelective(SysUser record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(SysUser record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    SysUser selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SysUser record);

    int updateBatch(@Param("list") List<SysUser> list);

    int updateBatchUseMultiQuery(@Param("list") List<SysUser> list);

    int updateBatchSelective(@Param("list") List<SysUser> list);

    int batchInsert(@Param("list") List<SysUser> list);

    int batchInsertSelectiveUseDefaultForNull(@Param("list") List<SysUser> list);

    int batchInsertOrUpdate(@Param("list") List<SysUser> list);
}