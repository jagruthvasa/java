import java.util.*;


class week5c {
      public static void main(String[] args) {

            Scanner input=new Scanner(System.in);

            System.out.println("Enter the strings");
            String str1[]=new String[2];
            for(int i=0;i<2;++i)
                  str1[i]=input.next();

            Arrays.sort(str1);
// 
            if(str1[0].equals(str1[1]))
                  System.out.println("Strings are anagrams");
            
            else
                  System.out.println("Strings are not anagrams");
      }      
}


