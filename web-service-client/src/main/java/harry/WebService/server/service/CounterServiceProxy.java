package harry.WebService.server.service;

public class CounterServiceProxy implements harry.WebService.server.service.CounterService {
  private String _endpoint = null;
  private harry.WebService.server.service.CounterService counterService = null;
  
  public CounterServiceProxy() {
    _initCounterServiceProxy();
  }
  
  public CounterServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCounterServiceProxy();
  }
  
  private void _initCounterServiceProxy() {
    try {
      counterService = (new harry.WebService.server.service.CounterServiceServiceLocator()).getCounterServicePort();
      if (counterService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)counterService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)counterService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (counterService != null)
      ((javax.xml.rpc.Stub)counterService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public harry.WebService.server.service.CounterService getCounterService() {
    if (counterService == null)
      _initCounterServiceProxy();
    return counterService;
  }
  
  public double sum(java.lang.Double[] arg0) throws java.rmi.RemoteException{
    if (counterService == null)
      _initCounterServiceProxy();
    return counterService.sum(arg0);
  }
  
  
}