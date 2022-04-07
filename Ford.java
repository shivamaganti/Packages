package FourWheeler;
import com.automobile.*;
public class Ford extends Vehicle {

	@Override
	public String Model_name(String Model_name) {
		// TODO Auto-generated method stub
		return Model_name;
	}

	@Override
	public String Get_registration_number(String register_no) {
		// TODO Auto-generated method stub
		return register_no;
	}

	@Override
	public String Get_owner_name(String Oname) {
		// TODO Auto-generated method stub
		return Oname;
	}

	public int Speed(int speed) {
		return speed;
	}
	
	public void temp_control() {
		System.out.println("Air conditioner available.");
	}
}
