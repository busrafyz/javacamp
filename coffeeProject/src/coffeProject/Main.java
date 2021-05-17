package coffeProject;


public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager starbucks = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucks.Save(new Customer(0, null, null, 0, 0));
		

	}

}
