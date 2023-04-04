package community.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import community.mapper.DiscussPostMapper;
import community.pojo.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 @author Alex
 @create 2023-04-03-16:28
 */
@Service
public class DiscussPostService {
    @Autowired
    private DiscussPostMapper discussPostMapper;

    public PageInfo<DiscussPost> findDiscussPosts(int userId,int pageNum,int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<DiscussPost> posts = discussPostMapper.selectDiscussPosts(userId);
        // 设置导航栏显示7
        PageInfo<DiscussPost> pageInfo = new PageInfo<>(posts,7);
        return pageInfo;
    }

    public int countDiscussPosts(int userId){
        return discussPostMapper.countDiscussPosts(userId);
    }

}
