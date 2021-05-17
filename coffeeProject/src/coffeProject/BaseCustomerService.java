package coffeProject;

import java.rmi.RemoteException;

public interface BaseCustomerService {
	void Save(Customer customer) throws RemoteException;

}
