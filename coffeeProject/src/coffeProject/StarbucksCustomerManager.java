package coffeProject;


public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	
	public void Save(Customer customer) {
		
		if(customerCheckService.checkId(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("Kimlik doðrulamasý baþarýsýz oldu");
		}
		
		
		
		
	}
	
	
	



}
