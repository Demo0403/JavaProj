package top.maskpro.model;

/**
 * 
 * @author Mask
 * @version 3.0-Finally
 *
 */
public class Subject {

	private String name;
	private String number;
	private byte life;
	private Student myStudents[];
	private byte studentsNumber;

	public Subject() {
		super();
	}

	public Subject(String subjectName, String subjectNumber, byte subjectLife) {
		super();
		// TODO
		this.setName(subjectName);
		this.setNumber(subjectNumber);
		this.setLife(subjectLife);
	}

	public String getName() {
		return name;
	}

	public void setName(String subjectName) {
		this.name = subjectName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String subjectNumber) {
		this.number = subjectNumber;
	}

	public byte getLife() {
		return life;
	}

	public void setLife(byte subjectLife) {
		if (subjectLife < 0) {
			return;
		}
		this.life = subjectLife;
	}
	
	public void setMyStudents(byte number) {
		myStudents = new Student[number];
	}
	
	public Student[] getMyStudents() {
		if(myStudents == null) {
			setMyStudents((byte) 100);
		}
		return myStudents;
	}
	
	public String getStudentNumber() {
		return "cs专业有" + studentsNumber + "名学生";
	}
	
	public void addStudents(Student... stu) {
		
		for(Student s:stu) {
			s.setMySubject(this);
			this.getMyStudents()[studentsNumber] = s;
			studentsNumber++;
		}
		
	}

	public String info() {
		String str = "专业信息如下\n" + "名称："
				+ getName() + "\n代码：" + getNumber() +
					"\n年限：" + getLife();
		return str;
	}

}
