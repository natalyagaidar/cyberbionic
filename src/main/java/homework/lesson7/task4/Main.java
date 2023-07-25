package homework.lesson7.task4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
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

        Address address3 = new Address()
                .setCountry("Czech Republic")
                .setCity(new City("small", "Prague"))
                .setStreet("Na Znamenii")
                .setBuilding(500)
                .setApartment(404)
                .setZipCode("200OK");

        AddressBook addressBook = new AddressBook(Arrays.asList(address1, address2, address3));

        String filePath = System.getProperty("user.dir") + "\\src\\main\\java\\homework\\lesson7\\task4\\task4.xml";
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
