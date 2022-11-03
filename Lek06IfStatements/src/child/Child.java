package child;

import java.util.Scanner;
/**
 * Write a description of class Barn here.
 */
public class Child {
	private int age;
	private boolean boy; // true if the child is a boy

	public Child(int age, boolean boy) {
		this.age = age;
		this.boy = boy;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBoy() {
		return boy;
	}

	public void setBoy(boolean boy) {
		this.boy = boy;
	}

	public String institution() {
		// TODO: implement!

		String result = "";

		if (age == 0) {
			result = "Home";
		} else if (age <= 2) {
			result = "Nursery";
		} else if (age <= 5) {
			result = "Kindergarten";
		} else if (age <= 16) {
			result = "School";
		} else {
			result = "Out of School";
		}
		return result;
	}

	public String gender() {
		String koen = "";

		if (boy == true){
		koen = "det er en dreng";
		}
		else{
			koen = "det er en pige";
		}
		return koen;
	}

	public String team(){
		String hold ="";

		if(age < 8 && boy != true){
			hold = "Tumbling Girls";
		}
		else if(age >=8 && boy != true){
			hold = "Springy Girls";
		}
		else if(age < 8 && boy == true){
			hold = "Young Cubs";
		}
		else{
			hold = "Cool Boys";
		}
		return hold;

	}
}



