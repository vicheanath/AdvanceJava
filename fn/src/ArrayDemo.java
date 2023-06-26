public class ArrayDemo {

    public static void main(String[] args){

        int[] c = new int[12]; // Primetive Type Array
        String[] b = new String[100]; // Reference Type Array

        int[] myArray;
        myArray = new int[10];

        int[] array = {10,20,30,40,50};

        for (int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d\n",counter,array[counter]);
        }

        /* // Output each array element value */
        System.out.printf("%5s%8s\n","Position","Value");

        for (int number: array){
            System.out.printf("%13d\n",number);
        }
    }

}
