package harry.WebService;

import harry.WebService.server.service.CounterService;
import harry.WebService.server.service.CounterServiceProxy;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;


/**
 * 
 * @author harry
 *
 */
public class Client {
	public static void main(String[] args) throws RemoteException, ServiceException {
		CounterService counterService = new CounterServiceProxy().getCounterService();
		System.out.println(counterService.sum(new Double[]{1.0,2.0,3.0,4.0,5.0}));
	}
}
