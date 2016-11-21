package com;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.extended.EncodedByteArrayConverter;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import java.io.*;

/**
 * Created by Oops on 11/19/2016.
 */
public class XmlTrasformer {
    public static void main(String arg[]) {
        XmlTrasformer xmlTrasformer = new XmlTrasformer();

        Employee employee = new Employee();
        Address address = new Address();
        address.setAddressLine("Agawam Main Street");
        address.setState("Springfield");
        address.setCity("MA");
        address.setPincode(12345);

        employee.setAddress(address);
        employee.setEmployeeId(1);
        employee.setFirstName("Taj");
        employee.setLastName("Bist");
        String employeXml = xmlTrasformer.ObjectToXml(employee);
        xmlTrasformer.writeFile(employeXml);
        System.out.println(employeXml);
        Employee employee1 = xmlTrasformer.xmlTOObject("D:\\employee1.xml");
        System.out.println(employee1);
    }

    /* Xml to Object*/
    public Employee xmlTOObject(String xmlFileName) {
        XStream xStream = new XStream(new StaxDriver());
        xStream.registerConverter(new EncodedByteArrayConverter());
        xStream.alias("Employee", Employee.class);
        Employee employee = null;
        try {
            employee = (Employee) xStream.fromXML(new FileReader(xmlFileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return employee;
    }


    /* Object to Xml*/
    public String ObjectToXml(Employee employee) {
        XStream xStream = new XStream();
        xStream.alias("Employee", Employee.class);
        return xStream.toXML(employee);
    }

    /* Write xml String into file*/
    public void writeFile(String xmlString) {
        BufferedWriter out = null;
        try {

            out = new BufferedWriter(new FileWriter("D:\\employee1.xml"));
            out.write(xmlString);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(out !=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
