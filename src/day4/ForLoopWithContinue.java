package day4;

public class ForLoopWithContinue {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5)
				continue;// it will continue output after 5(doesn't print 5)
			System.out.println(i);
		}
	}

}
