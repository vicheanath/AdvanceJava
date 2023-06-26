

public class InheritanceDemo {
    public static void main (String[] agrs){
        String myShape = "circle";
        Shape shape;
        switch (myShape){
            case "circle":
                shape = new Circle();
                shape.draw();
                break;
            case "shape":
                shape = new Shape();
                shape.draw();
                break;

        }
    }
}
