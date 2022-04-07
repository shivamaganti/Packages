import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class Test_Vehicle {

	public static void main(String[] args) {
		System.out.println("Here the details of Honda vehicle");
		Honda h = new Honda();
		System.out.println(h.Get_owner_name("Shiva"));
		System.out.println(h.Get_registration_number("Ap 16 AZ 4369"));
		System.out.println(h.Model_name("Indica"));
		System.out.println(h.getspeed(100));
		h.cdplayer();
		
		System.out.println("Here the details of Hero vehicle");
		Hero e = new Hero();
		System.out.println(e.Get_owner_name("Chandu"));
		System.out.println(e.Get_registration_number("Ap 16 AZ 9550"));
		System.out.println(e.Model_name("Benz"));
		System.out.println(e.getspeed(80));
		e.radio();

	}

}
