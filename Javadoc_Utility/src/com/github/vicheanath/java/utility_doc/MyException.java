package com.github.vicheanath.java.utility_doc;

/**
 * MyException for handle all Exception
 */
public class MyException extends Exception {
    private static final long serialVersionUID = 1L;

	// Constructors
    public MyException() {
        super();
    }
  
    public MyException(String message) {
        super(message);
    }
  
    // Additional methods, if needed
}
