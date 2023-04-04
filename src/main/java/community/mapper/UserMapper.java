package community.mapper;

import community.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 @author Alex
 @create 2023-04-03-20:14
 */
@Mapper
public interface UserMapper {
   /**
    * 根据用户id查询用户
     * @param id
    * @return
    */
   User getUserById(Integer id);
}
