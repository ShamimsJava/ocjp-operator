package ocjp.question22;

public class Bigger {

	public static void main(String[] args) {
		
		Better.Faster faster = Better.Faster.Higher;
		Better.Faster faster2;
		faster2 = Better.Faster.Longer;
		
		System.out.println(faster);
		System.out.println(faster2);
	}
}

class Better{
	
	enum Faster{
		Higher, Longer
	}
}
