/**
 * Klasse der beskriver en ansat
 *
 * @author mad
 *
 */
public class Employee {
	/*
	 * Attributter der beskriver den ansattes tilstand
	 */
	private String name;
	private boolean trainee;

	private int age;

	private String fornavn;

	private String efternavn;

	/*
	 * Constructor, når den ansatte oprettes, skal den have et navn. Ved
	 * oprettelse er den ansatte en trainee
	 */
	public Employee(String inputFornavn, String inputEfternavn, int inputAge) {
		fornavn = inputFornavn;
		efternavn = inputEfternavn;
		trainee = true;
		age = inputAge;
	}

	/*
	 * Den ansattes navn kan ændres ved kald af setName metoden
	 */
	public void setName(String inputName) {
		name = inputName;
	}

	/*
	 * Man kan få oplyst den ansattes navn, ved at kalde metoden getName
	 */
	public String getName() {
		return name;
	}

	/*
	 * Den ansatte kan få ændret trainee status ved at kalde metoden setTrainess
	 */
	public void setTrainee(boolean isTrainee) {
		trainee = isTrainee;
	}

	/*
	 * Man kan få oplyst den ansatte er trainess aktivitet, ved at kalde metoden
	 * isTrainee
	 */
	public boolean isTrainee() {
		return trainee;
	}


	public int getAge() {
		return age;

	}

	public void setAge(int inputAge) {
		age = inputAge;
	}

	public void birthday(){
		age = age + 1;
	}

	public String getfornavn(){
		return fornavn;
	}
	public void setFornavn(String inputFornavn){
		fornavn = inputFornavn;

	}
	public String getEfternavn(){
		return fornavn;
	}
	public void setEfternavn(String inputEfternavn){
		efternavn = inputEfternavn;
	}

	public void printEmployee() {
		System.out.println("*******************");
		System.out.println("Fornavn: " + fornavn);
		System.out.println("Efternavn: " + efternavn);
		System.out.println("Trainee: " + trainee);
		System.out.println("Alder: " + age);
		System.out.println("*******************");
	}
}
