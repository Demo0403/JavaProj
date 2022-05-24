package top.maskpro.model;


/**
 * 
 * @author Mask
 * @version 1.0
 *
 */
public class Student {
	
	private String name;
	private String number;
	private byte age;
	private char sex;
	
	public Student() {
		super();
	}
	public Student(String studentName, String studentNumber, byte studentAge, char studentSex) {
		super();
		//TODO
		setName(studentName);
		setNumber(studentNumber);
		setAge(studentAge);
		setSex(studentSex);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		if(age < 0 || age > 200)
			return;
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public String info() {
		String str = "学生信息如下\n"+"名字：" + getName()
			+ "\n学号："+ getNumber() + "\n年龄：" + getAge()
				+ "\n性别：" + getSex();
		return str;
	}
}
