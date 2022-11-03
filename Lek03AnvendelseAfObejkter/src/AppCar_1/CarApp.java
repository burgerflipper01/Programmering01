package AppCar_1;

public class CarApp {

	public static void main(String[] args) {
		//Car myCar = new Car("VW UP", "White");
		//System.out.println(myCar.getBrand());
		//myCar.setRegistrationNumber("AB 11 123");
		//System.out.println(myCar.getRegistrationNumber());
		//System.out.println(myCar.getKm());

		Car myCar2 = new Car("Toyota Aygo", " Red");
		System.out.println("*************************");
		System.out.print(myCar2.getBrand());
		System.out.println(myCar2.getColor());
		myCar2.setRegistrationNumber("CM 70 320");
		myCar2.setKm(2765);
		System.out.print(myCar2.getRegistrationNumber());
		System.out.println(" har kørt "+myCar2.getKm()+"km");
		System.out.println("*************************");




	}

}
