package top.maskpro.test;

import top.maskpro.model.*;

/**
 * 
 * @author Mask
 * @version 3.0-Finally
 *
 */
public class Hello {
	
	public static void line() {
		System.out.println("=========================================");
	}
	
	public static void main(String[] args) {
		Subject sub1 = new Subject("cs50","cs2019",(byte) 4);
		Student stu1 = new Student("Mask","2019040403132",(byte) 18,'ÄÐ');
		Student stu2 = new Student("Demo","2019040403133",(byte) 18,'ÄÐ');
		Student stu3 = new Student("Home","2019040403134",(byte) 18,'ÄÐ');
		sub1.addStudents(stu1,stu2,stu3);
		System.out.println(sub1.getMyStudents()[0].info());
	}

}
