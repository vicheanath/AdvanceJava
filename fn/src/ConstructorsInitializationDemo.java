public class ConstructorsInitializationDemo {
    int x;
    char c;
    Car demo;
    public ConstructorsInitializationDemo(){
        x = 5;
        c = 'A';
        demo = new Car();
    }

    public ConstructorsInitializationDemo(int x){
        this.x = x;
    }

    public ConstructorsInitializationDemo(Car demo){
        this.demo = demo;
    }
    public static void main(String[] args){

    }
}

