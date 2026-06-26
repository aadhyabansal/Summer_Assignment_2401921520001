class Outer{
    void display(){
        System.out.println("Outer class");
    }
    class Inner{
        void display(){
             System.out.println("Inner class");
        }
    }
}
public class solution2 {
    public static void main(String[] args) {
        Outer a=new Outer();
        a.display();

        Outer.Inner b=a.new Inner();
        b.display();
    }
}
