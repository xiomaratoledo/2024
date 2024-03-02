// Superclass
class Shape {
    private String color; // New field

    void draw() {
        System.out.println("Drawing a shape");
    }

    // Getter and setter for the color field
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

// Subclass 1
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Subclass 2
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Subclass 3
class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an array of shapes
        Shape[] shapes = {new Circle(), new Rectangle(), new Triangle()};

        // Setting color for each shape
        shapes[0].setColor("Red");
        shapes[1].setColor("Green");
        shapes[2].setColor("Blue");

        // Polymorphic method calls
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Color: " + shape.getColor()); // Printing color for each shape
        }
    }
}
