package ocjp.question15;

class Alien{
	
	String invade(int i) { // if we use short then compilation fails
		return "a few";
	}
	
	String invade(short... ships) {
		return "many";
	}
}

public class Defender {

	public static void main(String[] args) {
		
		System.out.println(new Alien().invade(7));

	}

}
