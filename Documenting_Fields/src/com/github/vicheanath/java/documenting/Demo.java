package com.github.vicheanath.java.documenting;


/**
 * Demo class for demo static field documentation
 */
public class Demo {
	/**
	 * myInt holds the value of and int(Integer)
	 */
	public int myInt;
	
	/**
	 * The client's first name
	 * @serial
	 */
	private String firstName;
	
	/**
	 * We can reference the value with ({@value #STATIC_FIELD})
	 */
	public static final String STATIC_FIELD = "simple static myfield";
}
