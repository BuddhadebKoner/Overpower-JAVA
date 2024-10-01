package object_oriented.inheritence.vehicle;

public class testInheritence {
	public  static  void main(String[] args){
		vehicle v1 = new vehicle();
		twoWheeler t1 = new twoWheeler();

		v1.commute();
		t1.commute(); // here i can access the vector class method commute()
	}
}
