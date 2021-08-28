import java.util.*;

class employe{
      int emid;
      String emname;
      double emsal;

      void set(int id,String name,double sal){
            emid=id;
            emname=name;
            emsal=sal;
      }

      void get(employe em){
            
           System.out.println("\nid is " + em.emid + " name is " + em.emname +" salary is " + em.emsal);
      }

}

public class week8c {
            public static void main(String[] args) {

                  Map <Integer, employe> map = new HashMap<Integer,employe>();

                  Scanner input= new Scanner(System.in);
                  int id,temp;
                  String name;
                  double sal;
                  
                  do{
                        System.out.println("\n1.add \t 2.Display \t 3.search \t 4.exit");
                        temp=input.nextInt();
                        switch(temp){
                              case 1:

                                    System.out.println("Enter id , name , sal");
                                    id=input.nextInt();
                                    name=input.next();
                                    sal=input.nextDouble();

                                    employe em = new employe();

                                    em.set(id, name, sal);

                                    map.put(id,em);

                                    System.out.println("\nAdded");
                                    break;

                              case 2:

                                    for(Map.Entry m : map.entrySet()){

                                          employe emm = (employe)m.getValue();

                                          emm.get(emm);
                                    }
                                    break;

                              case 3:

                                    System.out.print("enter the id to search :");

                                    int search=input.nextInt();
                                    
                                    int flag=0;

                                    for(Map.Entry m : map.entrySet())

                                          if(search == (int)m.getKey()) {

                                                employe emobj = (employe)m.getValue();

                                                emobj.get(emobj);

                                                flag=1;
                                                break;
                                          }

                                    if(flag == 0)
                                          System.out.println("\nNot Found\n");

                                    break;

                              case 4:
                                    System.exit(0);
                        }

                  }while(true);
            }
}
