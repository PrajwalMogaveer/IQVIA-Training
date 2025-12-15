
abstract class Shape {
    abstract void draw();

    void info() { // concrete method
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.info();
    }
}

