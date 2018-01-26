package org.ssm.demo.Dto;

import java.io.Serializable;

/**
 * Created by zjccnu on 2018/1/25.
 */
public class UserDto implements Serializable {
    private int id;
    private String user_name;
    private String password;
    private String age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
