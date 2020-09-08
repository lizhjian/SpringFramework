import java.util.List;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2020-04-29 08:17
 * </pre>
 */
//模拟第一个类
public class User //implements Sport
{
	private String age;

	private String name;

	private Person person;

//	@Override
//	public void run() {
//
//	}

	public String getAge() {
		return age;
	}
	public void initMethod(){
		System.out.println("User...initMethod...");
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
