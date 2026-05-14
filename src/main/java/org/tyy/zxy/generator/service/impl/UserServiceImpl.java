package org.tyy.zxy.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.tyy.zxy.generator.domain.User;
import org.tyy.zxy.generator.service.UserService;
import org.tyy.zxy.generator.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author LXJZ
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2026-05-11 00:27:22
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




