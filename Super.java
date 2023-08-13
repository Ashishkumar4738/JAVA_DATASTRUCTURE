public class Super {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.getClass();
        
    }
}
abstract class Animal{
    Animal(){
        System.out.println("Animal Constructor");
    }
    Animal(int legs){
        System.out.println("Animal have "+legs+" legs");
    }
}
class Horse extends Animal{
    Horse(){
        super(4);//this line call base class constructer.
        System.out.println("Horse class constructer");
    }
}
