/**
 * FileName: MyTypeExcludeFilterApplicationContextInitializer
 * Author:   HuangTaiHong
 * Date:     2019-11-19
 * Description: 自定义过滤器配置类.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.growth.process.example01.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;

/**
 * 〈自定义过滤器配置类.〉
 *
 * @author HuangTaiHong
 * @since 2019-11-19
 */
public class MyTypeExcludeFilterApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        applicationContext.addBeanFactoryPostProcessor(new MyTypeExcludeFilterPostProcessor());
    }

    private static class MyTypeExcludeFilterPostProcessor implements PriorityOrdered, BeanDefinitionRegistryPostProcessor {
        public static final String BEAN_NAME = "roberto.growth.process.example01.config.MyTypeExcludeFilter";

        @Override
        public int getOrder() {
            return Ordered.HIGHEST_PRECEDENCE;
        }

        @Override
        public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        }

        @Override
        public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
            RootBeanDefinition definition = new RootBeanDefinition(MyTypeExcludeFilter.class);
            registry.registerBeanDefinition(BEAN_NAME, definition);
        }
    }
}
