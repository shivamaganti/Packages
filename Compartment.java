package Test_package;

public class Compartment {

	int area;
	public Compartment(int height,int width,int breadth) {
	
		area = height * width * breadth;
	}
	public int get_comp() {
		return area;
	}
}
