package pk1;

public class helper {
	public  void banner(String text) {
		printStar(text.length());
		System.out.println(text);
		printStar(text.length());
		
	}
	private void printStar(int count) {
		for(int i =0; i<count; i++) {
			System.out.println("*");
		}
		System.out.println();
	}

}
