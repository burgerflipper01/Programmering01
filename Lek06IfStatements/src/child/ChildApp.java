package child;

import com.sun.net.httpserver.Authenticator;

public class ChildApp {

	public static void main(String[] args) {
		Child c1 = new Child(4, true);// boy 4 years old
		Child c2 = new Child(2, false);// girl 2 years old

		System.out.println("Et barn på " + c2.getAge() + " går i " + c2.institution() + " " + c2.gender()+ " der er i team " +c2.team());




	}

}
