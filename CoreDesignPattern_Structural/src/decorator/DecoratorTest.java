package decorator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

interface IceCream {
	public String makeIceCream();
}
class SimpleIceCream implements IceCream {
	public String makeIceCream(){
	return "Base IceCream";
	}
}
abstract class IceCreamDecorator implements IceCream {
	IceCream specialIceCream;
	IceCreamDecorator(IceCream specialIceCream) {
		this.specialIceCream = specialIceCream;
	}
	public String makeIceCream(){
	return specialIceCream.makeIceCream();
	}	
}
class NuttyDecorator extends IceCreamDecorator {
	NuttyDecorator(IceCream specialIceCream){
		super(specialIceCream);
	}
	public String makeIceCream() {
		return specialIceCream.makeIceCream()+addNuts();
	}
	public String addNuts() {
		return " cruncy nuts";
	}
}
class HoneyDecorator extends IceCreamDecorator {
	HoneyDecorator(IceCream specialIceCream) {
		super(specialIceCream);
	}
	public String makeIceCream() {
		return specialIceCream.makeIceCream()+addHoney();
	}
	public String addHoney() {
		return " sweat honey";
	}
}
class DecoratorTest {
	public static void main(String args[]) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	IceCream simpleIceCream = new SimpleIceCream();
	System.out.println(simpleIceCream.makeIceCream());
	IceCream nuttIceCream = new NuttyDecorator(new SimpleIceCream());
	System.out.println(nuttIceCream.makeIceCream());
	 IceCream honeyIceCream = new HoneyDecorator(new NuttyDecorator(new SimpleIceCream()));
	System.out.println(honeyIceCream.makeIceCream());
	}
}
