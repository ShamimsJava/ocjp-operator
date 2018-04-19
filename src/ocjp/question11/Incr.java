package ocjp.question11;

public class Incr {

	public static void main(String[] args) {
		
		Integer x = 7;
		int y = 2;
		
		x*=x; // x=49
		y*=y; // y=4
		y*=y; // y=16
		x-=y;
		
		System.out.println(x);
	}

}


/*	
 * have to use each fragments
 * 	y	y	y	y
 * 	y	x	x	
 * 	-=	*=	*=	*=
 * 
 * 
 * */
 