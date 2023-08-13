class Pen {
    String name;
    String gender;
    String address;
    String password;
    int marks[];
    public Pen() {
        System.out.println("Constructor will be called");
        marks = new int[3];
        
    }
// this constructor is shallow copy constructor because it copy all.
    // public Pen(Pen p1){
    //     marks = new int[3];
    //     this.name = p1.name;
    //     this.gender = p1.gender;
    //     this.address = p1.address;
    //     this.marks = p1.marks;
        
    // }
    //Deep copy constructer.
    public Pen(Pen p1){
        marks = new int[3];
        this.name = p1.name;
        this.gender = p1.gender;
        this.address = p1.address;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = p1.marks[i];
        }
        
    }
    // Shallow & Deep Copy
    

    public void penNib() {
        System.out.println("This is pen newNib");

    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.name = "ashish";
        p1.gender = "male";
        p1.address = "lh";
        p1.password = "abcd";
        p1.marks[0] = 100;
        p1.marks[1] = 200;
        p1.marks[2] = 300;

        Pen p2 = new Pen(p1);//here we copy the constructor 
        p2.password = "xyz";
        p1.marks[2] = 23;//update value of p1 constructor after constructor

        for(int i=0;i<p1.marks.length;i++){
            System.out.println(p2.marks[i]);
        }

    }
}