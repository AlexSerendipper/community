package community.controller;

import com.github.pagehelper.PageInfo;
import community.pojo.DiscussPost;
import community.pojo.User;
import community.service.DiscussPostService;
import community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 @author Alex
 @create 2023-04-03-21:02
 */
@Controller
public class IndexController {
    @Autowired
    private DiscussPostService discussPostService;

    @Autowired
    private UserService userService;

    @GetMapping(value = {"/index/{pageNum}","/index"})
    public String getIndexPage(Model model, @PathVariable(value = "pageNum",required = false) Integer pageNum){
        if(pageNum==null){
            pageNum=1;
        }
        // 设置每页显示条数pageSize
        PageInfo<DiscussPost> pageInfo = discussPostService.findDiscussPosts(0, pageNum, 10);
        List<DiscussPost> discussPosts = pageInfo.getList();
        List<Map<String,Object>> posts = new ArrayList<>();
        if(discussPosts!=null){
            for(DiscussPost p:discussPosts){
                // 为增强客户体验，查询出posts后也要显示每个Post对应的User
                User user = userService.getUserById(p.getUserId());
                HashMap<String, Object> map = new HashMap<>();
                map.put("post",p);
                map.put("user",user);
                posts.add(map);
            }
        }
        // 返回查询到的posts已经对应的user
        model.addAttribute("posts",posts);
        // 返回分页相关数据
        model.addAttribute("pageInfo",pageInfo);
        return "index";
    }
}
