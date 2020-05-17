import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * desc ：给外部提供一个接口
 * author ：lizj
 * date ：2020-05-09 06:55
 * </pre>
 */
@Component
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		System.out.println(importingClassMetadata);
		System.out.println(registry);
		// 得到bd
		// 扫描所有接口
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition();
		GenericBeanDefinition definition = (GenericBeanDefinition)beanDefinitionBuilder.getBeanDefinition();

		definition.setBeanClass(MyFactoryBean.class);
		registry.registerBeanDefinition("", definition);

	}
}
