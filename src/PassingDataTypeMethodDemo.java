import java.awt.image.CropImageFilter;

public class PassingDataTypeMethodDemo {

    public static void main(String[] args){
        double d = 2.0;
        changeMe(d);

        Car lamborghini = new Car();
        lamborghini.setSpeed(65.0);
        changeCarParameters(lamborghini);
        System.out.println("the speed = "+ lamborghini.getSpeed() );

        changeCar(lamborghini);
        System.out.println("the speed = "+ lamborghini.getSpeed());


    }

    public static void changeMe(double d){
        d =345.0;
    }

    public static void changeCarParameters(Car c){
        c.setSpeed(200.0);
    }

    public static void changeCar(Car c){
        Car ford = new Car();
        ford.setSpeed(75.0);
        c = ford;
    }

}
