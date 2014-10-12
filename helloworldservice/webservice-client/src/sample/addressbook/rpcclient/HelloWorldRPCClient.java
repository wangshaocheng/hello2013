package sample.addressbook.rpcclient;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

import com.test.entity.Student;

public class HelloWorldRPCClient {

    public static void main(String[] args1) throws AxisFault {
        RPCServiceClient serviceClient = new RPCServiceClient();
        Options options = serviceClient.getOptions();
        EndpointReference targetEPR = new EndpointReference("http://127.0.0.1:8080/axis2/services/HelloWorld");
        options.setTo(targetEPR);
        // QName of the target method 
        QName qName = new QName("http://test.com", "sayHello");
        // Constructing the arguments array for the method invocation
        Object[] opArgs = new Object[] {};
        Class[] returnTypes = new Class[] { String.class };
        // Invoking the method
        Object[] response = serviceClient.invokeBlocking(qName, opArgs, returnTypes);
        System.out.println(response[0]);
        
        //如何返回一个对象？？
        //
        qName = new QName("http://test.com", "query");
        opArgs = new Object[]{};
        returnTypes = new Class[] {Student.class};
        response = serviceClient.invokeBlocking(qName, opArgs, returnTypes);
        System.out.println(response[0]);
        
        //如何传递参数到web service方法中？
        qName = new QName("http://test.com", "addTowNumbers");
        //opArgs = new Object[]{Integer.valueOf(3), Integer.valueOf(4)};
        opArgs = new Object[]{33, 44};
        returnTypes = new Class[]{Integer.class};
        response = serviceClient.invokeBlocking(qName, opArgs, returnTypes);
        System.out.println(response[0]);
        
        
    }
}
