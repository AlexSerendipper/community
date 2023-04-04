package community.boot;

import com.github.pagehelper.PageInfo;
import community.pojo.DiscussPost;
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
public class DiscussPostServiceTest {
    @Autowired
    DiscussPostService discussPostService;
    @Test
    public void test1(){
        PageInfo<DiscussPost> pageInfo = discussPostService.findDiscussPosts(103, 3, 10);
        List<DiscussPost> posts = pageInfo.getList();
        for(DiscussPost post:posts){
            System.out.println(post);
        }
    }

    @Test
    public void test2(){
        int i = discussPostService.countDiscussPosts(103);
        System.out.println(i);
    }
}
