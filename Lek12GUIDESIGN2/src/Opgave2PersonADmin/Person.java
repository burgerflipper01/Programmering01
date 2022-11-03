package Opgave2PersonADmin;

public class Person {
	private String name;
	private String title;
	private boolean senior;

	public Person(String name, String title, boolean senior) {
		this.name = name;
		this.title = title;
		this.senior = senior;
	}

	public boolean isSenior(){
		return senior;
	}

	public String getTitle(){
		return this.title;
	}

	public String firstName() {
		return this.name;
	}

	public String toString() {
		String s = title + " " + name;
		if (senior) s = s + " (senior)";
		return s;


	}


}
