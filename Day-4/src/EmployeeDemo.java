
class Employee {
    void work() {
        System.out.println("Employee is working.");
    }

    void report() {
        System.out.println("Employee submits a general report.");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager is planning and supervising work.");
    }

    @Override
    void report() {
        System.out.println("Manager submits a team progress report.");
    }

    void conductMeeting() {
        System.out.println("Manager conducts a meeting.");
    }
}

class Developer extends Manager {
    @Override
    void work() {
        System.out.println("Developer is writing code.");
    }

    @Override
    void report() {
        System.out.println("Developer submits a code status report.");
    }

    void writeCode() {
        System.out.println("Developer writes Java code.");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.work();
        dev.report();
        dev.conductMeeting();
        dev.writeCode();

        System.out.println("---- Polymorphism ----");

        dev.conductMeeting();

        dev.work();
        dev.report();
    }
}

