import FourWheeler.*;

public class FourWheeler {

	public static void main(String[] args) {
		Logan l = new Logan();
		System.out.println(l.Get_owner_name("Shiva"));
		System.out.println(l.Get_registration_number("Ap 16 AZ 4369"));
		System.out.println(l.Model_name("Indica"));
		System.out.println(l.Speed(100));
		l.gps_device();
		
		Ford f = new Ford();
		System.out.println(f.Get_owner_name("Shiva"));
		System.out.println(f.Get_registration_number("Ap 16 AZ 4369"));
		System.out.println(f.Model_name("Indica"));
		System.out.println(f.Speed(100));
		f.temp_control();

	}

}
