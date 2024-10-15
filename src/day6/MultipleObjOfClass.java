package day6;

public class MultipleObjOfClass {

		public static void main(String[] args) {
			MultipleObjOfClass emp = new MultipleObjOfClass();
			emp.maintain();
			
			MultipleObjOfClass emp1=new MultipleObjOfClass();
			emp1.coding();
			
			MultipleObjOfClass emp2= new MultipleObjOfClass();
			emp2.testing();
			
		
		}

		public void testing() {
			System.out.println("I can test the code");
		}

		public void coding() {
			System.out.println("I can write codes");
		}

		public void maintain() {
			System.out.println("I can maintain the code");
			//testing();
			coding();
		}
	}


		
