package modelchild;

public class ChildApp {

	public static void main(String[] args) {
		Child c1 = new Child(0, true);// boy 4 years old
		Child c2 = new Child(2, false);// girl 2 years old

		System.out.println("Et barn på " + c1.getAge());
		System.out.println("Et barn på" + c2.getAge() + c2.getWeight());

	}

}
