package factory;

public class StaticFactory {
   	int  a;
   	int b;
 	StaticFactory(int a, int b){
      	this.a=a;
      	this.b=b;
   	};
 	public static StaticFactory getInstance(int a, int b){
      	return new StaticFactory(a, b);
   	}
	public int add() {
		return a+b;
	}
 
   public static void main(String[] args){
      	//Instantiation with a constructor
      	StaticFactory a = new StaticFactory(1, 2);
	System.out.println("Result "+a.add());
      	//Instantiation with a static factory method
      	StaticFactory b = StaticFactory.getInstance(1, 2);
	System.out.println("Result "+b.add());
   	}
}
