package coffeProject;


import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkId(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
		return client.TCKimlikNoDogrula(customer.getIdCardNumber(), customer.getFirstName(), customer.getLastName(), customer.getBirthYear());
		} catch (RemoteException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			return false;
		
	}

}
