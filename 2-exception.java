/*Write a program that reads two numbers from the user to perform integer division
into Num1 and Num2 variables. The division of Num1 and Num2 is displayed if they
are integers. If Num1 or Num2 were not an integer, the program would throw a Number
Format Exception. If Num2 were Zero, the program would throw an Arithmetic
Exception.*/


import java.util.*;

class week10a{

      public static void main(String[] args) {
            
            Scanner input= new Scanner(System.in);
            int res=0;

            try{
                  int num1=Integer.parseInt((input.next()));

                  int num2=Integer.parseInt((input.next()));
                  
                  res= num1/num2;
                  
                  System.out.println("Division is : " + res);
            }
            
            catch(NumberFormatException E){
                  System.out.println("Number Format Exception called : " + E.getMessage());
            }
            
            catch(ArithmeticException E){
                  System.out.println("Arthemetic Exception called : " + E.getMessage());
            }
            
      }
}