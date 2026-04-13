package org.tyy.zxy.Service;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.tyy.zxy.Mapper.SysUserMapper;
import org.tyy.zxy.entity.SysUser;
@Service
public class SysUserService{

    @Autowired
    private SysUserMapper sysUserMapper;

    public SysUser login(String name,String password){
        SysUser user=sysUserMapper.selectByUsername(name);
        if(user==null){
            return null;
        }
        return user.getPassword().equals(password)?user:null;
    }
    public int deleteByPrimaryKey(Long id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    
    public int deleteByPrimaryKeyIn(List<Long> list) {
        return sysUserMapper.deleteByPrimaryKeyIn(list);
    }

    
    public int insert(SysUser record) {
        return sysUserMapper.insert(record);
    }

    
    public int insertOrUpdate(SysUser record) {
        return sysUserMapper.insertOrUpdate(record);
    }

    
    public int insertOrUpdateSelective(SysUser record) {
        return sysUserMapper.insertOrUpdateSelective(record);
    }

    
    public int insertSelective(SysUser record) {
        return sysUserMapper.insertSelective(record);
    }

    
    public SysUser selectByPrimaryKey(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(SysUser record) {
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SysUser record) {
        return sysUserMapper.updateByPrimaryKey(record);
    }

    
    public int updateBatch(List<SysUser> list) {
        return sysUserMapper.updateBatch(list);
    }

    
    public int updateBatchUseMultiQuery(List<SysUser> list) {
        return sysUserMapper.updateBatchUseMultiQuery(list);
    }

    
    public int updateBatchSelective(List<SysUser> list) {
        return sysUserMapper.updateBatchSelective(list);
    }

    
    public int batchInsert(List<SysUser> list) {
        return sysUserMapper.batchInsert(list);
    }

    
    public int batchInsertSelectiveUseDefaultForNull(List<SysUser> list) {
        return sysUserMapper.batchInsertSelectiveUseDefaultForNull(list);
    }

    public int batchInsertOrUpdate(List<SysUser> list) {
        return sysUserMapper.batchInsertOrUpdate(list);
    }

}
