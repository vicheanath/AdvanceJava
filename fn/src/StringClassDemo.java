import java.awt.*;
import java.awt.desktop.SystemEventListener;

public class StringClassDemo {
    public static void String(String[] args){
        String s1 = "Hello"; // Literal
        String s2 = new String("Hello"); // Explicitly create a new Object in memory
        switch (s1){
            case "Hola":
                System.out.println("Spanish Greeting! " + s1);
                break;
            case "Ciao":
                System.out.println("Itaian Greeting! " + s1);
                break;
            case "Hello":
                System.out.println("English Greeting! "+ s1);
                break;
            default:
                System.out.println("Error: '" + s1 +"'is not a recognized greeting");
                break;
        }
    }

    private static void concatStringBuffer(){
//        System.out.print("concatStringBuffer ->" );
//        long startTime = System.currentTimeMillis();
//        StringBuffer concat = new StringBuffer(BUFFSIZE);
//        for (int i =0;i < ITERATIONS; i++){
//            concat.append(i%10);
//        }
//
//        long endTime = System.currentTimeMillis();
//        System.out.print("length: " + concat.length());
//        System.out.println("time: " + (endTime - startTime));

    }

    public static void main(String[] args){
        String str = new String("Hello ");
        str += "Stanford";

        StringBuffer strb = new StringBuffer("Hello ");
        strb.append("Stanford");

        System.out.println("");
    }




}
