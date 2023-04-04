package community.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 @author Alex
 @create 2023-04-03-16:32
 */
@SpringBootApplication(scanBasePackages="community")
@MapperScan(value = "community.mapper")
public class CommunityApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommunityApplication.class, args);
    }
}
