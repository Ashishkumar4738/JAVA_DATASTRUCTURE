abstract class Animal {
    String color;

    Animal() {
        this.color = "brown";
    }

    void animalColor() {
        System.out.println("Color is" + color);
    }

    void eat() {
        System.out.println("Animal eat");
    }

    abstract void walk();
}

class Dog extends Animal {
    

    public void walk() {
        System.out.println("Dog walks on four legs");
    }
}

interface Car {
    void speed();

    void gear();

    void wheel();
}

interface Service {
    void dueDate();

    void buyDate();
}

class Farrari implements Car, Service {
    public void speed() {
        System.out.println("For speed");

    }

    public void gear() {
        System.out.println("Information about gear");
    }

    public void wheel() {
        System.out.println("About gear");
    }

    public void buyDate() {
        System.out.println("Buy date");

    }

    public void dueDate() {
        System.out.println("Duy date of licence");
    }
}

public class Abs {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.walk();
        Farrari f = new Farrari();
        f.buyDate();
        f.dueDate();
        f.gear();
        f.speed();
        f.wheel();
        Student s1 = new Student();
        s1.clgName = "bbdniit";
        s1.name ="Ashish";
        s1.rollNo = "2000560130012";

        Student s2 = new Student();
        s2.clgName = "ed";
        System.out.println(s2.clgName);
    }

    // static

}

class Student {
    String clgName;//static keyword got allocated by one object and reflect same for all object. 
    String rollNo;
    String name;

    void info() {
        System.out.println("Student info is " + rollNo + " Name is " + name);
    }
}