/**
 * CounterServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package harry.WebService.server.service;

public class CounterServiceServiceLocator extends org.apache.axis.client.Service implements harry.WebService.server.service.CounterServiceService {

    public CounterServiceServiceLocator() {
    }


    public CounterServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CounterServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CounterServicePort
    private java.lang.String CounterServicePort_address = "http://localhost:8080/api/CounterService";

    public java.lang.String getCounterServicePortAddress() {
        return CounterServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CounterServicePortWSDDServiceName = "CounterServicePort";

    public java.lang.String getCounterServicePortWSDDServiceName() {
        return CounterServicePortWSDDServiceName;
    }

    public void setCounterServicePortWSDDServiceName(java.lang.String name) {
        CounterServicePortWSDDServiceName = name;
    }

    public harry.WebService.server.service.CounterService getCounterServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CounterServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCounterServicePort(endpoint);
    }

    public harry.WebService.server.service.CounterService getCounterServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            harry.WebService.server.service.CounterServicePortBindingStub _stub = new harry.WebService.server.service.CounterServicePortBindingStub(portAddress, this);
            _stub.setPortName(getCounterServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCounterServicePortEndpointAddress(java.lang.String address) {
        CounterServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (harry.WebService.server.service.CounterService.class.isAssignableFrom(serviceEndpointInterface)) {
                harry.WebService.server.service.CounterServicePortBindingStub _stub = new harry.WebService.server.service.CounterServicePortBindingStub(new java.net.URL(CounterServicePort_address), this);
                _stub.setPortName(getCounterServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CounterServicePort".equals(inputPortName)) {
            return getCounterServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.server.WebService.harry/", "CounterServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.server.WebService.harry/", "CounterServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CounterServicePort".equals(portName)) {
            setCounterServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
