package ocjp.question14;

public class Scoop {

	public static void main(String[] args) {
		int x = 5;
		try {
			//int x = 5;
		} catch (Exception e) {
			x++;
		} finally {
			System.out.println("x = "+ ++x);
		}
	}
}
