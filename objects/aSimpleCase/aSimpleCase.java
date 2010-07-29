class Dog{
	String name;
	String age;
	
	void bark() {
		System.out.println("Java, java");
	}
	
	void sleep(){
		System.out.println("Fiuuffff, fiuuuuuuffff");
	}
}

class Cat{
	String name;
	String age;
	
	void miau(){
		System.out.println(name + " ya hace Miauuu, Miauu y apenas tiene " + age);
	}
}

class aSimpleCase{
	
	public static void main(String[] args) {
		
		Dog p = new Dog();
		p.name = "Coquito";
		p.age = "4 years";
		p.bark();
		p.sleep();
		
		Cat c = new Cat();
		c.name = "Victor";
		c.age = "2 years";
		c.miau();
		
	}
}