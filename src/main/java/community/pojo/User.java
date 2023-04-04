package community.pojo;

import javafx.print.PaperSource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 @author Alex
 @create 2023-04-03-20:11
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
// @Slf4j
public class User {
    private Integer id;
    private String username;
    private String password;
    private String salt;
    private String email;
    // 是否为置顶帖
    private Integer type;
    // 是否为精华帖
    private Integer status;
    private String activationCode;
    // 头像url
    private String headerUrl;
    private Date createTime;
}
