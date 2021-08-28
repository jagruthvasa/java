
import java.util.Scanner;
class ageexception extends Exception{
   
}
public class week10b {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age:");
        try{
            int age=sc.nextInt();
            if(age<0||age>120)
            throw new ageexception();
            else
            System.out.println("Enter age is "+age);
        }
        catch(ageexception ae){
            System.out.println("Enter correct age");
        }
        finally{
            sc.close();
        }
    }   
}
