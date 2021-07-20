package logic;
public class Start {
	public static void main(String[] args) {
		Calculations c = new Calculations();
		c.sum(2, 3);
		c.subtraction(6, 3);
		c.division(6, 3);
		c.radiceQuadrata(9);
		System.out.println("Logaritmo: " + c.log(222.7));
	}

}
