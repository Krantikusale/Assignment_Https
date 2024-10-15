package day6;

public class InstanceVar2 {
	float data;//Step 1:Instance var.

	public static void main(String[] args) {
		InstanceVar2 i1 = new InstanceVar2();//3.Obj creation
		i1.data();//4.method calling via obj
	}

	public void data() {//2.Method creation
		System.out.println(data);
	}
}