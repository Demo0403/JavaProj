package top.maskpro.test;

import top.maskpro.model.*;

/**
 * 
 * @author Mask
 * @version 1.0
 *
 */
public class Hello {
	
	public static void line() {
		System.out.println("=========================");
	}
	
	public static void main(String[] args) {
		Subject sub1 = new Subject("cs50","cs2019",(byte) 4);
		System.out.println(sub1.info());
		line();
		Student stu1 = new Student("Mask","2019040403132",(byte) 18,'ÄÐ');
		System.out.println(stu1.info());
		
	}

}
