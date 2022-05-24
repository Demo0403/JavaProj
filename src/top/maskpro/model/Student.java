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
		String str = "ѧ����Ϣ����\n"+"���֣�" + getName()
			+ "\nѧ�ţ�"+ getNumber() + "\n���䣺" + getAge()
				+ "\n�Ա�" + getSex() + "\nרҵ���ƣ�" + mySubject.getName()
				+ "\nרҵ���룺" + mySubject.getNumber();
		return str;
	}
	
	public String info(String subjectName,String subjectNumber) {
		String str = "ѧ����Ϣ����\n"+"���֣�" + getName()
			+ "\nѧ�ţ�"+ getNumber() + "\n���䣺" + getAge()
				+ "\n�Ա�" + getSex() + "\nרҵ���ƣ�" + subjectName
					+ "\nרҵ���룺" + subjectNumber;
		return str;
	}
	
	public String info(Subject cs) {
		String str = "ѧ����Ϣ����\n"+"���֣�" + getName()
			+ "\nѧ�ţ�"+ getNumber() + "\n���䣺" + getAge()
				+ "\n�Ա�" + getSex() + "\nרҵ���ƣ�" + cs.getName()
					+ "\nרҵ���룺" + cs.getNumber();
		return str;
	}
}
