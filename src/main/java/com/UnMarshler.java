package com;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by Oops on 11/19/2016.
 */
public class UnMarshler {
    public static void main(String[] args) {
      try {
          File file = new File("D:\\file1.xml");
          JAXBContext jaxbContext=JAXBContext.newInstance(Customer.class);
          Unmarshaller  unmarshaller=jaxbContext.createUnmarshaller();
          Customer customer=(Customer) unmarshaller.unmarshal(file);
          System.out.println(customer);

      }catch (JAXBException e){
          e.printStackTrace();
      }

    }
}
