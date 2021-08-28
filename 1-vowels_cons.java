import java.util.*;

class week5b{
      public static void main(String[] args) {

            Scanner input=new Scanner(System.in);

            int n,i;

            System.out.println("Enter the no of strings");

            n=input.nextInt();

            String[] str=new String[n];

            System.out.println("Enter the "+ n + " strings");
            
            for(i=0;i<n;++i)
                  str[i]=input.next();

            int vowels,consonants,j;

            for(i=0;i<n;++i){

                  vowels=0;
                  consonants=0;

                  for(j=0;j<str[i].length();++j){

                        if(str[i].charAt(j) == 'a' || str[i].charAt(j) == 'A' || str[i].charAt(j) == 'e' || str[i].charAt(j) == 'E' || str[i].charAt(j) == 'i' || str[i].charAt(j) == 'I' || str[i].charAt(j) == 'o' || str[i].charAt(j) == 'O' || str[i].charAt(j) == 'u' || str[i].charAt(j) == 'U')
                              ++vowels;
                        
                        else
                              ++consonants;

                  }
                  System.out.println(str[i] + ":  consonanst are : " + consonants + "  vowel are : "  +vowels);
            }     

      }
}