package community.service;

import community.mapper.UserMapper;
import community.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 @author Alex
 @create 2023-04-03-20:06
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User getUserById(Integer id){
        User user = userMapper.getUserById(id);
        return user;
    }

}
