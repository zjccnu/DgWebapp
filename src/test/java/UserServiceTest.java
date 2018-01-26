import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.ssm.demo.Dto.UserDto;
import org.ssm.demo.service.impl.UserServiceImpl;

import javax.annotation.Resource;

/**
 * Created by zjccnu on 2018/1/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:applicationContext.xml"})
public class UserServiceTest {
    @Resource(name = "userService")
    public UserServiceImpl userService;

    @Test
    public void getUserByIdTest(){

        UserDto user = userService.selectByUserName("测试");
        System.out.println(user.getPassword());
    }
}
