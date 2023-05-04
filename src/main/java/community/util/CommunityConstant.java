package community.util;

/**
 * 定义激活的状态
 @author Alex
 @create 2023-04-05-14:15
 */

public interface CommunityConstant {
    /**
     * 激活成功
     */
    int ACTIVATION_SUCCESS=0;

    /**
     * 重复激活
     */
    int ACTIVATION_REPEAT=1;

    /**
     * 激活成功
     */
    int ACTIVATION_FAILURE=2;

    /**
     * 默认登录凭证的超时时间，12小时
     */
    int DEFAULT_EXPIRED_SECONDS=3600*12;

    /**
     * 记住状态下的超时时间,30天
     */
    int REMEMBER_EXPIRED_SECONDS=3600*24*30;

    /**
     * 实体类型：帖子
     */
    int ENTITY_TYPE_POST =1;

    /**
     * 实体类型：评论
     */
    int ENTITY_TYPE_COMMENT =2;

    /**
     * 实体类型：人（关注）
     */
    int ENTITY_TYPE_USER=3;

    /**
     * 事件主题：评论
     */
    String TOPIC_COMMENT="comment";

    /**
     * 事件主题：点赞
     */
    String TOPIC_LIKE="like";

    /**
     * 事件主题：关注
     */
    String TOPIC_FOLLOW="follow";


    /**
     * 事件主题：发帖
     */
    String TOPIC_PUBLISH="publish";

    /**
     * 事件主题：删帖
     */
    String TOPIC_DELETE="delete";

    /**
     * 事件主题：分享
     */
    String TOPIC_SHARE="share";

    /**
     * 系统用户ID
     */
    int SYSTEM_USER_ID=1;

    /**
     * 权限：普通用户
     */
    String AUTHORITY_USER = "user";

    /**
     * 权限：管理员
     */
    String AUTHORITY_ADMIN = "admin";

    /**
     * 权限：版主
     */
    String AUTHORITY_MODERATOR = "moderator";
}
