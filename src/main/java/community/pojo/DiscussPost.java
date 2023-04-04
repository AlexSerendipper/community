package community.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 帖子对应的实体类
 @author Alex
 @create 2023-04-03-14:39
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
// @Slf4j
public class DiscussPost {
    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;
    private int status;
    private Date createTime;
    private int commentCount;
    private double score;
}
