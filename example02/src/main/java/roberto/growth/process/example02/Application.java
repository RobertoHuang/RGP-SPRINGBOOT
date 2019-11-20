/**
 * FileName: Application
 * Author:   HuangTaiHong
 * Date:     2019-11-20
 * Description: 项目启动类.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.growth.process.example02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;

/**
 * 〈项目启动类.〉
 *
 * @author HuangTaiHong
 * @since 2019-11-20
 */
@EnableAutoConfiguration
public class Application {
    public static void main(final String[] args) {
        final ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        final String testAutoConfiguration = applicationContext.getBean("testAutoConfiguration", String.class);
        System.out.println(testAutoConfiguration);
    }
}
