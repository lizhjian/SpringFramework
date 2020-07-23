import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		User user = (User) context.getBean("user4");
		System.out.println(user.getAge());
		System.out.println(user.getName());

	}
}
