/**
 * FileName: SpringApplication
 * Author:   HuangTaiHong
 * Date:     2019-11-19
 * Description: 启动类.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.growth.process.example01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import roberto.growth.process.example01.service.UserService;

/**
 * 〈启动类.〉
 *
 * @author HuangTaiHong
 * @since 2019-11-19
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        final ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        final UserService userService = applicationContext.getBean(UserService.class);
        System.out.println(userService);
    }
}
