package homework;

public class Circle extends Shape{

    private String name;
    private String color;

    public Circle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return "#872288";
    }
}
