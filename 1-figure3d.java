import java.util.*;

class Figure_3D{
      
      void volume(){};

      void area(){};
}

class Cylinder extends Figure_3D{

      double radius,height;

      Cylinder(double radius,double height){

            this.radius=radius;
            this.height=height;

      }
      void volume(){

            System.out.println("The Volume of Cylinder is " + Math.PI*radius*radius*height);
      }

      void area(){

            System.out.println("The area of Cylinder is " + 2 * Math.PI * radius * (height+radius));
      }
}

class Cone extends Figure_3D{

      double radius,height,length;

      Cone(double radius,double height,double length){

            this.radius=radius;
            this.height=height;
            this.length=length;

      }
      void volume(){

            System.out.println("The area of cone is " + Math.PI*radius*(radius + length));
      }

      void area(){
            
            System.out.println("The volume of cone is " + (Math.PI * radius * height *radius)/3);
      }
}

class Circle extends Figure_3D{

      double radius;

      Circle(double radius){

            this.radius=radius;

      }

      void volume(){

            System.out.println("The volume of Circle is " + 4 * 1.3 * Math.PI * radius * radius * radius);
      }

      void area(){
            
            System.out.println("The area of Circle is " + 4 * Math.PI * radius *radius);
      }
}

class week6b{
      public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the radius and height of cylinder ");

            double cylradius,cylheight;

            cylradius=input.nextDouble();
            cylheight=input.nextDouble();


            System.out.println("Enter the radius , height and lenght of cone ");

            double conradius,conheight,conlength;

            conradius=input.nextDouble();
            conheight=input.nextDouble();
            conlength=input.nextDouble();

            System.out.println("Enter the radius of circle");

            double cirradius;
            cirradius=input.nextDouble();

            Figure_3D obj[]=new Figure_3D[3];

            obj[0]=new Cylinder(cylradius,cylheight);
            
            obj[1]=new Cone(conradius, conheight, conlength);

            obj[2]= new Circle(cirradius);

            int i;

            for(i=0;i<3;++i){
                  obj[i].area();
                  obj[i].volume();
            }
      }
}
