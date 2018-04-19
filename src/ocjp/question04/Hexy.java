package ocjp.question04;

public class Hexy {

	public static void main(String[] args) {
		
		Integer integer = 42;
		
		String string = (integer<40)?"life":(integer>50)?"universe":"everything";
		
		System.out.println(string);
	}
}