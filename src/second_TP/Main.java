package second_TP;

// Les notions d'héritage , encapsulation et polymorphismes
 class Animal{
	 private String nom;
		private int age;
	
	Animal(String nom, int age){
		this.nom=nom;
		this.age=age;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom= nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age= age;
	}
	void parler() {
		System.out.println("je suis un animal");
	}
}
class Chien extends Animal{
	Chien(String nom, int age){
		super(nom,age);
	}

	void parler() {
		System.out.println("woof");
	}
}
class Chat extends Animal{
	Chat(String nom, int age){
		super(nom,age);
	}

	void parler() {
		System.out.println("Meow");
	}
}

	


public class Main {
	
	static void faireParler(Animal animal) {
		animal.parler();
	}
	
	public static void main(String[] args) {
		Animal[]animaux = new Animal[2];
		animaux[0] = new Chien("Rex",5);
		animaux[1]= new Chat("Milou",10);
		
		for(Animal animal: animaux) {
			faireParler(animal);
		}
	}

}
