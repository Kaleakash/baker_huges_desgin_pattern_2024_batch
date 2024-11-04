package lsp;
interface Bike {
	public void speed();
}
class HeroHonda implements Bike {
	public void speed(){
		System.out.println("40km/hr");
	}
}
class Pulsar implements Bike {
	public void speed() {
		System.out.println("80km/hr");
	}
}
public class LiskovSubstitutionPrinciple {
	public static void main(String[] args) {
		Bike heroHonda = new HeroHonda();
		heroHonda.speed();
		Bike pulsar = new Pulsar();
		pulsar.speed();
	}
}
