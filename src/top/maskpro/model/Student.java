package top.maskpro.model;


/**
 * 
 * @author Mask
 * @version 3.0-Finally
 *
 */
public class Student {
	
	private String name;
	private String number;
	private byte age;
	private char sex;
	private Subject mySubject;
	
	public Student() {
		super();
	}
	public Student(String studentName, String studentNumber, byte studentAge, char studentSex) {
		super();
		//TODO
		this.setName(studentName);
		this.setNumber(studentNumber);
		this.setAge(studentAge);
		this.setSex(studentSex);
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
	
	public Subject getMySubject() {
		return mySubject;
	}
	public void setMySubject(Subject subject) {
		this.mySubject = subject;
	}
	public String info() {
		String str = "学生信息如下\n"+"名字：" + getName()
			+ "\n学号："+ getNumber() + "\n年龄：" + getAge()
				+ "\n性别：" + getSex() + "\n专业名称：" + mySubject.getName()
				+ "\n专业代码：" + mySubject.getNumber();
		return str;
	}
	
	public String info(String subjectName,String subjectNumber) {
		String str = "学生信息如下\n"+"名字：" + getName()
			+ "\n学号："+ getNumber() + "\n年龄：" + getAge()
				+ "\n性别：" + getSex() + "\n专业名称：" + subjectName
					+ "\n专业代码：" + subjectNumber;
		return str;
	}
	
	public String info(Subject cs) {
		String str = "学生信息如下\n"+"名字：" + getName()
			+ "\n学号："+ getNumber() + "\n年龄：" + getAge()
				+ "\n性别：" + getSex() + "\n专业名称：" + cs.getName()
					+ "\n专业代码：" + cs.getNumber();
		return str;
	}
}
