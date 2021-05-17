package coffeProject;


public abstract class BaseCustomerManager implements BaseCustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("Veritabanýna kaydedildi");
		
	}

}
