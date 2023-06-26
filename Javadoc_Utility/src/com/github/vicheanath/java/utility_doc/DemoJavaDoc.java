package com.github.vicheanath.java.utility_doc;

/**
 * Description of your class
 * @author vichea
 * @version 7.0 Build 900
 */
public class DemoJavaDoc {
	
	/**
	 * Descriptions of my field
	 */
	public int i;
	
	/**
	 * Description of DemoJavaDoc()
	 * @throws MyException description of MyException
	 */
	public DemoJavaDoc() throws MyException{
		
	}
	/**
	 * Description of calculateSomething
	 * @param a Description parameter
	 * @param b Description parameter
	 * @return description of int
	 */
	public int calculateSomething(int a, int b) {
		return i+a+b;
	}
}
