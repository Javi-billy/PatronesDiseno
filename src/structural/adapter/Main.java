package structural.adapter;

public class Main {

	public static void main(String[] args) {
		
		InternationalMoneyOrganization inter;
		
		inter = new InternationalMoneyAdapter(new BancoNostrumIml());
		inter.transfer(100, "Test");
		
		System.out.println(inter.state("Test"));

	}

}
