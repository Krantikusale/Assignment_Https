package day7;

public class Stud_Constructors {
	 public Stud_Constructors() {
		System.out.println("Default Constructor");
	}

	public Stud_Constructors(int ID) {
		System.out.println("int Constructor");
	}

	public Stud_Constructors(int ID, String Name) {
		System.out.println("2 Parameters Constructor");
	}

	public Stud_Constructors(String name, int ID) {
		System.out.println("2 PArameters with order change Constructor :" +name+" "+ID);
	}

	public static void main(String[] args) {
		Stud_Constructors sc=new Stud_Constructors("pk", 20);
		
	}

}
