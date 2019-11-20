/**
 * FileName: CustomConfigration
 * Author:   HuangTaiHong
 * Date:     2019-11-20
 * Description: 自定义配置类.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.growth.process.example02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈自定义配置类.〉
 *
 * @author HuangTaiHong
 * @since 2019-11-20
 */
@Configuration
public class CustomConfiguration {
    @Bean
    public String testAutoConfiguration() {
        return "HELLO WORLD";
    }
}
