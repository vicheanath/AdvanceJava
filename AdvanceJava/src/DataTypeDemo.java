public class DataTypeDemo {

    public static void main(String[] args){
        // Primitive Datatype
        byte b =10;
        short s =10;
        int i = 10;
        long l = 10L;
        float f = 234.5f;
        double d = 123.4;
        char c = 'A';
        boolean bool = true;


        //Java Class/Object Type

        Byte myByte = new Byte("10"); // Allocating new memory
        Short myShort = new Short(s); // Allocating new memory
        Integer myInteger = Integer.valueOf(i); // use pool wrappers

        Long myLoong;
        Float myFloat;
        Double myDouble;
        Character myChar;
        Boolean myBoolean;

    }
}
