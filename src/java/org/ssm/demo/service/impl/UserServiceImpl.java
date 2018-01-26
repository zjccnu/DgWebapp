package org.ssm.demo.service.impl;

import org.springframework.stereotype.Service;
import org.ssm.demo.Dao.UserDao;
import org.ssm.demo.Dto.UserDto;
import org.ssm.demo.service.UserService;

import javax.annotation.Resource;

/**
 * Created by zjccnu on 2018/1/25.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;
    public UserDto selectByUserName(String user_name) {
        return userDao.selectByUserName(user_name);
    }
}
