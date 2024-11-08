package prototype;
class Product implements Cloneable{
	int pid;			// 0
	public Product() {
	System.out.println("object created..");
	}
	public void display() {
		System.out.println("pid is "+pid);
	}
	public Product getInstance() {
		try {
		Product p = (Product)clone();
		return p;
		}catch(Exception e) {
			System.err.println(e);
			return null;
		}
	}
}
public class CloneDemo {
	public static void main(String[] args) {
	Product p1 = new Product();
	Product p2 = new Product();
	Product p3 = p1;		// same memory two reference. 
	p1.pid=100;
	p2.pid=101;
	p3.pid=102;
	p1.display(); p2.display(); p3.display();
	Product p4 = p2.getInstance();
	System.out.println("After clone created");
	p2.display();
	p4.display();
	p4.pid=110;
	p2.display();
	p4.display();
	}

}
