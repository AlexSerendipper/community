package community.boot;

import com.github.pagehelper.PageInfo;
import community.mapper.UserMapper;
import community.pojo.DiscussPost;
import community.pojo.User;
import community.service.DiscussPostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 @author Alex
 @create 2023-04-03-16:44
 */
@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserMapper userMapper;
    @Test
    public void test1(){
        User user = userMapper.getUserById(101);
        System.out.println(user);
    }


}
