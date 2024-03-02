// Superclass
class Shape {
    private String color; // Existing field
    private String name;  // New field

    // Constructor
    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }

    void draw() {
        System.out.println("Drawing a " + name);
    }

    // Getter and setter for the color field
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter and setter for the name field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Subclass 1
class Circle extends Shape {
    public Circle(String color, String name) {
        super(color, name);
    }

    void draw() {
        System.out.println("Drawing a circle named " + getName());
    }
}

// Subclass 2
class Rectangle extends Shape {
    public Rectangle(String color, String name) {
        super(color, name);
    }

    void draw() {
        System.out.println("Drawing a rectangle named " + getName());
    }
}

// Subclass 3
class Triangle extends Shape {
    public Triangle(String color, String name) {
        super(color, name);
    }

    void draw() {
        System.out.println("Drawing a triangle named " + getName());
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an array of shapes
        Shape[] shapes = {
            new Circle("Red", "Circle"),
            new Rectangle("Green", "Rectangle"),
            new Triangle("Blue", "Triangle")
        };

        // Polymorphic method calls
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Color: " + shape.getColor());
        }
    }
}
