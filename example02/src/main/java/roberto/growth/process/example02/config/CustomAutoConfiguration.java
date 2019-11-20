/**
 * FileName: CustomAutoConfiguration
 * Author:   HuangTaiHong
 * Date:     2019-11-20
 * Description: 自定义自动装配类.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.growth.process.example02.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 〈自定义自动装配类.〉
 *
 * @author HuangTaiHong
 * @since 2019-11-20
 */
@Configuration
@Import(CustomConfiguration.class)
public class CustomAutoConfiguration {

}
