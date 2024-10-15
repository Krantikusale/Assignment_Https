package day4;

public class ForLoopWithBreak {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5)
				break;//it will break output after 5
			System.out.println(i);
		}
	}

}
