
public class Master {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.setName("����");
		myDog.setAge(5);
		String sound = myDog.bark();
		System.out.println(sound);
		String s = "��ͷ";
		myDog.eat(s);
		myDog.sleep();
		myDog.lookDoor();
		
	}
}	
	

