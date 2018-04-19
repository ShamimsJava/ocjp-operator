package ocjp.question18;

public class Mixer {

	public Mixer() {}
	
	public Mixer(Mixer m) {
		m1 = m;
	}
	
	Mixer m1;
	
	public static void main(String[] args) {
		
		Mixer m2 = new Mixer();
		Mixer m3 = new Mixer(m2);
		m3.go();
		Mixer m4 = m3.m1;
		m4.go();
		//Mixer m5 = m2.m1;
		//m5.go();

	}

	private void go() {
		
		System.out.println("hi");
		
	}

}
