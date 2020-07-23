import org.springframework.beans.factory.InitializingBean;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2020-06-26 19:39
 * </pre>
 */
public class TestInitlizationBean implements InitializingBean {

	public void initMehtod(){
		System.out.println("TestInitlizationBean....initMehtod.....");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("TestInitlizationBean....afterPropertiesSet");
	}
}
