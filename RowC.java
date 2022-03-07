package supermarketInheritance;

public class RowC extends RowB {
	public void darkChokkies() {
		System.out.println("DairyMilk");
		System.out.println("Cadbury");
	}
	
	public static void main(String [] args) {
		RowC Z = new RowC();
		Z.freshVeggies();
		Z.freshFruits();
		Z.darkChokkies();
	}

}
