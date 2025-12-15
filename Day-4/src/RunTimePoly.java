
class Creature {
    void sound() {
        System.out.println("Creature makes a sound");
    }
}

class Puppy extends Creature {
    void sound() {
        System.out.println("Puppy barks");
    }
}

class Cat extends Creature {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RunTimePoly {
    public static void main(String[] args) {
        Creature c;

        c = new Puppy();//object dog
        c.sound();

        c = new Cat();   // object cat
        c.sound();
    }
}

