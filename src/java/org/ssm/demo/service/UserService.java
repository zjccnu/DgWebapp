package org.ssm.demo.service;

import org.ssm.demo.Dto.UserDto;

/**
 * Created by zjccnu on 2018/1/25.
 */
public interface UserService {
    UserDto selectByUserName(String user_name);
}
