class Person {
    void introduce() {
        System.out.println("I am a person.");
    }
}

class Student extends Person {
    void study() {
        System.out.println("I am studying.");
    }
}

class GraduateStudent extends Student {
    void research() {
        System.out.println("I am doing research.");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent();
        gs.research();
        gs.study();
        gs.introduce();
    }
}
