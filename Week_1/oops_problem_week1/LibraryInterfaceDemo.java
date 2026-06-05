package Week_1.oops_problem_week1;

public class LibraryInterfaceDemo {
    public static void main(String[] args){
        KidUsers kid=new KidUsers();
        kid.age=10;
        kid.registerAccount();
        kid.bookType="Kids";
        kid.requestBook();

        kid.age=18;
        kid.registerAccount();
        kid.bookType="Fiction";
        kid.requestBook();

        AdultUser adult=new AdultUser();
        adult.age=5;
        adult.registerAccount();
        adult.bookType="Kids";
        adult.requestBook();

        adult.age=23;
        adult.registerAccount();
        adult.bookType="Fiction";
        adult.requestBook();
    }
}
interface LibraryUser{
    void registerAccount();
    void requestBook();
}
class KidUsers implements LibraryUser{
    int age;
    String bookType;

    public void registerAccount(){
        if(this.age<12){
            System.out.println("You have successfully registered under a Kids Account.");
        }
        else{
            System.out.println("Sorry, Age must be less than 12 to register as a kid.");
        }
    }
    public void requestBook(){
        if(this.bookType.equalsIgnoreCase("Kids")){
            System.out.println("Book issued successfully, please return the book within 10 days.");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}
class AdultUser implements LibraryUser{
    int age;
    String bookType;

    public void registerAccount(){
        if(this.age>12){
            System.out.println("You have successfully registered under an Adult Account.");
        }
        else{
            System.out.println("Sorry, Age must be greater than 12 to register as an adult.");
        }
    }
    public void requestBook(){
        if(this.bookType.equalsIgnoreCase("Fiction")){
            System.out.println("Book issued successfully, please return the book within 7 days.");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }
}