package org.ssm.demo.Dao;

import org.ssm.demo.Dto.UserDto;

/**
 * Created by zjccnu on 2018/1/25.
 */
public interface UserDao {
     UserDto selectByUserName(String user_name);
}
