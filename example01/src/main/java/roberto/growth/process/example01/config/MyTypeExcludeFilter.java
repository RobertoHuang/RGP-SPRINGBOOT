/**
 * FileName: MyTypeExcludeFilter
 * Author:   HuangTaiHong
 * Date:     2019-11-19
 * Description: 自定义过滤类.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.growth.process.example01.config;

import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;

import java.io.IOException;

/**
 * 〈自定义过滤类.〉
 *
 * @author HuangTaiHong
 * @since 2019-11-19
 */
public class MyTypeExcludeFilter extends TypeExcludeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        return "roberto.growth.process.example01.service.UserService".equals(metadataReader.getClassMetadata().getClassName());
    }
}
