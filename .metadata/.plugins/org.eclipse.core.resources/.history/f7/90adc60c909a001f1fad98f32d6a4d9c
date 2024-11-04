package chainresponsibility;

class Complaint {
	private int count;
	private String name;
	Complaint(int count, String name){
		this.count = count;
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public String getName() {
		return name;
	}
}
abstract class Staff {
	Staff stf;
	Staff(Staff stf) {
		this.stf = stf;
	}
	public abstract void handleComplaint(Complaint cpt);
}
class ClassTeacher extends Staff {
	ClassTeacher(Staff stf) {
		super(stf);
	}
	public void handleComplaint(Complaint cpt){
		if(cpt.getCount()<=4) {
		System.out.println("Complaint handle by Class Teacher "+cpt.getName());
		}else {
		stf.handleComplaint(cpt);
		}
	}	
}
class VicePrincipal extends Staff {
	VicePrincipal(Staff stf) {
		super(stf);
	}
	public void handleComplaint(Complaint cpt){
		if(cpt.getCount()<=10) {
		System.out.println("Complaint handle by Vice Principal "+cpt.getName());
		}else {
		stf.handleComplaint(cpt);
		}
	}	
}
class ChainResponsibility {
	public static void main(String args[]) {
	ClassTeacher ct = new ClassTeacher(new VicePrincipal(null));
	ct.handleComplaint(new Complaint(6,"Raj"));	
	}
}

