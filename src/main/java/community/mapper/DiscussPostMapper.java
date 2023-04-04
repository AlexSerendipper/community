package community.mapper;

import community.pojo.DiscussPost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 @author Alex
 @create 2023-04-03-14:47
 */
@Mapper
public interface DiscussPostMapper {
    /**
     * 实现查询帖子的功能：
     * 动态sql实现：（ID为0时查询所有数据）（实现查询[我的帖子]的功能时需要传入ID）
     * @param userId
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId);

    /**
     * 实现根据ID查询所有帖子记录数
     * 动态sql实现：（ID为0时 查询所有数据）
     * @param userId
     * @return
     */
    int countDiscussPosts(int userId);
}
