package harry.WebService.server.service;

import javax.jws.WebService;

import harry.WebService.server.api.CounterApi;

/**
 * 
 * @author harry
 *
 */
@WebService
public class CounterService implements CounterApi {

	@Override
	public double sum(double... nums) {
		double sum = 0;
		
		for (double num : nums) {
			sum += num;
		}
		
		return sum;
	}

}
