import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};

        System.out.printf("%13s\n","Value Only");

        for(int number : array){
            System.out.printf("%13d\n", number);
        }

        Collection<String> nameList = new ArrayList<String>();
        nameList.add("Vichea");
        nameList.add("Dara");
        nameList.add("ZinToo");
        nameList.add("BCZin");

        for(String name: nameList){
            name = "Luis";
        }

        System.out.println(nameList);

        Collection<StringBuffer> bufferList = new ArrayList<StringBuffer>();
        bufferList.add(new StringBuffer("Vichea"));
        bufferList.add(new StringBuffer("Koko"));
        bufferList.add(new StringBuffer("XinXin"));

        for (StringBuffer name : bufferList){
            name.reverse();
        }

        System.out.println(bufferList);

    }
}