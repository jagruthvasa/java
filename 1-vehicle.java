import java.util.*;

class vehicle{

	String type;
	vehicle(String type){
		this.type=type;
	}
}

class brand extends vehicle{

	String brand;
	brand(String type , String brand){
		super(type);
		this.brand=brand;
	}

}

class cost extends brand{

	int cost;

	cost(String type ,String brand, int cost){

		super(type,brand);
		this.cost=cost;
	}


	void display(){

		System.out.println( "Type is "+ type + " brand is " + brand + " cost is " + cost);
	}
}

class week6a{
	public static void main(String[] args) {
            
		Scanner input= new Scanner (System.in);

		System.out.println("Enter type of vehicle brand and cost : ");

		String type= input.next();
		String brand= input.next();
		int cost= input.nextInt();

		cost obj=new cost(type,brand,cost);

		obj.display();
		System.out.println(obj.brand);
	}
}