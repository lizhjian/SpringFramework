import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2020-05-09 07:44
 * </pre>
 */
public class MyFactoryBean implements FactoryBean ,InvocationHandler {

	private Class aClass;

	public MyFactoryBean(Class aClass) {
		this.aClass = aClass;
	}

	@Override
	public Object getObject() throws Exception {
		Class[] clazzs = new Class[]{CarDao.class};
		Object proxy = Proxy.newProxyInstance(this.getClass().getClassLoader(),clazzs,new MyInvocationHandler());

		return null;
	}

	@Override
	public Class<?> getObjectType() {
		return CarDao.class;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return null;
	}
}
