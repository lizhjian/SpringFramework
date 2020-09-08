import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import service.UserService;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2020-04-27 22:25
 * </pre>
 */
@Configuration
public class MyConfClass {

//	@Bean
//	public UserService userService(){
//		return new UserService();
//	}


	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.register(MyConfClass.class);
//		context.addBeanFactoryPostProcessor(new MyBeanFactoryProcessor());
//		context.refresh();
//		UserService service1 = context.getBean(UserService.class);
//			UserService service2 = context.getBean(UserService.class);
//		System.out.println("service1--->"+service1.hashCode()+"===="+service2.hashCode());
//		String[] names = context.getBeanDefinitionNames();
//		for (String beanName : names){
//			System.out.println(beanName);
//		}
 		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		User user = (User) context.getBean("user1");
		//context.addBeanFactoryPostProcessor(new MyBeanFactoryProcessor());

		System.out.println(user.getAge());
		System.out.println(user.getPerson().getHeight());
//		Sport sport = (Sport) context.getBean(PersonSportImpl1.class);

//		User user2 = (User) context.getBean("user1");
//		System.out.println(sport);
//		System.out.println(user2);
//		System.out.println(user.getAge());
//		System.out.println(user.getName());

		//根据Xml配置文件创建Resource资源对象，该对象中包含了BeanDefinition的信息
//		ClassPathResource resource =new ClassPathResource("application-context.xml");
////创建DefaultListableBeanFactory
//		DefaultListableBeanFactory factory =new DefaultListableBeanFactory();
////创建XmlBeanDefinitionReader读取器，用于载入BeanDefinition。之所以需要BeanFactory作为参数，是因为会将读取的信息回调配置给factory
//		XmlBeanDefinitionReader reader =new XmlBeanDefinitionReader(factory);
////XmlBeanDefinitionReader执行载入BeanDefinition的方法，最后会完成Bean的载入和注册。完成后Bean就成功的放置到IOC容器当中，以后我们就可以从中取得Bean来使用
//		reader.loadBeanDefinitions(resource);

//		UserService userService = context.getBean(UserService.class);
//		userService.login();

	}
}
