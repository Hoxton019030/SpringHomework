package tw.ispan.springdemo.model;

import org.springframework.stereotype.Component;


//<bean id="student" class="xxxxxxxxxxxxxxx"></bean>
@Component("student") // id ，預設是 class 開頭改小寫的名子
public class Student {

	private Integer id;

	private String name;

	private String nickName;

	public Student() {
	}

	public Student(Integer id, String name, String nickName) {
		super();
		this.id = id;
		this.name = name;
		this.nickName = nickName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
