package homework;

public class Test {

    public static void main(String[] args) {
        Shape circle = new Circle("circle 1", "#535353");
        Shape circle2 = new Circle("circle 2", "#899898");
        ShapeCharacteristics[] characteristics = {ShapeCharacteristics.COLOR, ShapeCharacteristics.NAME};

        ShapePrinter sp = new ConsoleShapePrinter();
        sp.print(circle);
        sp.print(circle2, characteristics);
    }
}
