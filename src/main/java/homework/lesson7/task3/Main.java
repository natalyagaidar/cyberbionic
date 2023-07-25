package homework.lesson7.task3;

import homework.lesson7.task4.Address;
import homework.lesson7.task4.AddressBook;
import homework.lesson7.task4.City;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //використовуючи готовий код з завдання 4 я створюю xml файл, а потім за допомогою SAXparser я його зчитую в об'єкт Address
        String filePath = System.getProperty("user.dir") + "\\src\\main\\java\\homework\\lesson7\\task3\\task3.xml";

        Address address1 = new Address()
                .setCountry("Ukraine")
                .setCity(new City("big", "Kyiv"))
                .setStreet("Ivana Franka")
                .setBuilding(25)
                .setApartment(101)
                .setZipCode("02222");

        Address address2 = new Address()
                .setCountry("USA")
                .setCity(new City("very big", "San Francisco"))
                .setStreet("Firebugs lane")
                .setBuilding(3687)
                .setApartment(1)
                .setZipCode("874538978469");

        createXmlFile(filePath, Arrays.asList(address1, address2));

        SaxParserHandler handler = new SaxParserHandler();

        AddressBook addressBook = saxParse(filePath, handler);

        System.out.println(addressBook);

    }

    public static AddressBook saxParse(String filePath, SaxParserHandler handler) {

        List<Address> addresses = new ArrayList<>();

        SAXParserFactory factory = SAXParserFactory.newInstance();

        SAXParser parser = null;
        try {
            parser = factory.newSAXParser();
        } catch (Exception e) {
            System.out.println("Open SAX parser exception. " + e);
            return new AddressBook();
        }
        File file = new File(filePath);
        try {
            parser.parse(file, handler);
        } catch (Exception e) {
            System.out.println("Can't parse. " + e);
            return new AddressBook();
        }

        addresses = handler.getAddresses();
        if (!addresses.isEmpty()) {
            return new AddressBook(addresses);
        } else return new AddressBook();
    }

    public static void createXmlFile(String filePath, List<Address> addresses) {

        AddressBook addressBook = new AddressBook(addresses);

        try {
            JAXBContext context = JAXBContext.newInstance(AddressBook.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(addressBook, new File(filePath));
        } catch (JAXBException e) {
            System.out.println("Can't serialize the object. " + e);
        }

    }
}
