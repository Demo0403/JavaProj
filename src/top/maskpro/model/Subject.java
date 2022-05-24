package top.maskpro.model;

/**
 * 
 * @author Mask
 * @version 1.0
 *
 */
public class Subject {

	private String name;
	private String number;
	private byte life;

	public Subject() {
		super();
	}

	public Subject(String subjectName, String subjectNumber, byte subjectLife) {
		super();
		// TODO
		setName(subjectName);
		setNumber(subjectNumber);
		setLife(subjectLife);
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

	public String info() {
		String str = "专业信息如下\n" + "名称："
				+ getName() + "\n代码：" + getNumber() +
					"\n年限：" + getLife();
		return str;
	}

}
