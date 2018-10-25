package harry.WebService;

import harry.WebService.server.service.CounterService;

import javax.xml.ws.Endpoint;

/**
 * 
 * @author harry
 *
 */
public class Server {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/api/CounterService", new CounterService());
	}
}
