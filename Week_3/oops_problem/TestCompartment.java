package Week_3.oops_problem;

import java.util.Random;

abstract class Compartment{
    public abstract String notice();
}

class FirstClass extends Compartment{
    public String notice(){
        return "This compartment is first class.";
    }
}

class Ladies extends Compartment{
    public String notice(){
        return "This compartment is for ladies.";
    }
}

class General extends Compartment{
    public String notice(){
        return "This is general compartment.";
    }
}

class Luggage extends Compartment{
    public String notice(){
        return "This compartment is for luggage.";
    }
}

public class TestCompartment {
    public static void main(String[] args){
        Compartment[] arr=new Compartment[10];
        Random r=new Random();

        for(int i=0; i<10; i++){
            int n=r.nextInt(4)+1;

            switch(n){
                case 1:
                    arr[i]=new FirstClass();
                    break;
                    
                case 2:
                    arr[i]=new Ladies();
                    break;
                
                case 3:
                    arr[i]=new General();
                    break;

                case 4:
                    arr[i]=new Luggage();
                    break;
                
            }
            System.out.println(arr[i].notice());
        }
    }
}
