/**
 * ConfluenceSoapServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package no.marintek.mylyn.internal.wikitext.confluence.core.wsdl.confluenceservice_v1;

public class ConfluenceSoapServiceServiceLocator extends org.apache.axis.client.Service implements no.marintek.mylyn.internal.wikitext.confluence.core.wsdl.confluenceservice_v1.ConfluenceSoapServiceService {

    public ConfluenceSoapServiceServiceLocator() {
    }


    public ConfluenceSoapServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConfluenceSoapServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConfluenceserviceV1
    private java.lang.String ConfluenceserviceV1_address = "http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v1";

    public java.lang.String getConfluenceserviceV1Address() {
        return ConfluenceserviceV1_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConfluenceserviceV1WSDDServiceName = "confluenceservice-v1";

    public java.lang.String getConfluenceserviceV1WSDDServiceName() {
        return ConfluenceserviceV1WSDDServiceName;
    }

    public void setConfluenceserviceV1WSDDServiceName(java.lang.String name) {
        ConfluenceserviceV1WSDDServiceName = name;
    }

    public no.marintek.mylyn.internal.wikitext.confluence.core.wsdl.confluenceservice_v1.ConfluenceSoapService getConfluenceserviceV1() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConfluenceserviceV1_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConfluenceserviceV1(endpoint);
    }

    public no.marintek.mylyn.internal.wikitext.confluence.core.wsdl.confluenceservice_v1.ConfluenceSoapService getConfluenceserviceV1(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            no.marintek.mylyn.internal.wikitext.confluence.core.wsdl.confluenceservice_v1.ConfluenceserviceV1SoapBindingStub _stub = new no.marintek.mylyn.internal.wikitext.confluence.core.wsdl.confluenceservice_v1.ConfluenceserviceV1SoapBindingStub(portAddress, this);
            _stub.setPortName(getConfluenceserviceV1WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConfluenceserviceV1EndpointAddress(java.lang.String address) {
        ConfluenceserviceV1_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (no.marintek.mylyn.internal.wikitext.confluence.core.wsdl.confluenceservice_v1.ConfluenceSoapService.class.isAssignableFrom(serviceEndpointInterface)) {
                no.marintek.mylyn.internal.wikitext.confluence.core.wsdl.confluenceservice_v1.ConfluenceserviceV1SoapBindingStub _stub = new no.marintek.mylyn.internal.wikitext.confluence.core.wsdl.confluenceservice_v1.ConfluenceserviceV1SoapBindingStub(new java.net.URL(ConfluenceserviceV1_address), this);
                _stub.setPortName(getConfluenceserviceV1WSDDServiceName());
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
        if ("confluenceservice-v1".equals(inputPortName)) {
            return getConfluenceserviceV1();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v1", "ConfluenceSoapServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v1", "confluenceservice-v1"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConfluenceserviceV1".equals(portName)) {
            setConfluenceserviceV1EndpointAddress(address);
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
