import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2020-04-27 22:25
 * </pre>
 */
@Configuration
public class MyConf {

	@Bean
	public UserService userService(){
		return new UserService();
	}


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);
		String[] names = context.getBeanDefinitionNames();
		for (String beanName : names){
			System.out.println(beanName);
		}
	}
}
