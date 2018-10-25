/**
 * CounterServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package harry.WebService.server.service;

public interface CounterServiceService extends javax.xml.rpc.Service {
    public java.lang.String getCounterServicePortAddress();

    public harry.WebService.server.service.CounterService getCounterServicePort() throws javax.xml.rpc.ServiceException;

    public harry.WebService.server.service.CounterService getCounterServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
