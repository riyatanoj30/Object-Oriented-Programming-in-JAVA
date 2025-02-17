// class child extends parent {
// 	int n2 = 20;
// 	void displayc(){
// 		System.out.println("In child " + n1 + " " + n2 + " ");
// 	}
// }
// class parent {
// 	int n1 = 10;
// 	void displayp(){
// 		System.out.println("In parent");
// 	}
// }
// class inheritance{
// 	public static void main(String args[]){
// 		child c = new child ();
// 		parent p = new parent ();
// 			c.displayp();
// 			c.displayc();
// 			p.displayp();
// 	}
// }

class dog extends animal {
	void dogsound(){
		System.out.println("Bark");
	}
}
class cat extends animal {
	void catsound(){
		System.out.println("Meow");
	}
}
class goat extends animal {
	void goatsound(){
		System.out.println("Mehhh");
	}
}
class animal{
	public static void main(String args[]){
		dog d = new dog ();
		cat c = new cat ();
		goat g = new goat ();
			d.dogsound();
			c.catsound();
			g.goatsound();
	}
}