class sstudent{
      int roll;
      String name;
      int phone;
      public sstudent(int roll,String name,int phone){
          this.roll=roll;
          this.name=name;
          this.phone=phone;
      }

      void get(sstudent s){
            System.out.println("Roll Number:"+s.roll+"\nName:"+s.name+"\nMobile Number:"+s.phone);
      }
  }
  class week7b{
      public static void main(String ar[]){
          sstudent s[]=new sstudent[3];
          s[0]=new sstudent(1,"a",978675);
          s[1]=new sstudent(2,"s",9101001);
          s[2]=new sstudent(3,"e",9752672);

          ArrayList <sstudent> list = new ArrayList<>();
          Iterator i =list.iterator();
          list.add(s[0]);
          list.add(s[1]);
          list.add(s[2]);

          while(i.hasNext()){
                sstudent ss = (sstudent)i.next();
                  ss.get(ss);
          }
          
      }
  }
