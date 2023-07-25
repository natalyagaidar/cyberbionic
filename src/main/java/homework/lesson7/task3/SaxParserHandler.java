package homework.lesson7.task3;

import homework.lesson7.task4.Address;
import homework.lesson7.task4.AddressBook;
import homework.lesson7.task4.City;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SaxParserHandler extends DefaultHandler {
    Address address;
    List<Address> addresses = new ArrayList<>();

    private String currentTagName;

    public List<Address> getAddresses() {
        return addresses;

    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start document");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("End document");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("Start element " + qName);
        currentTagName = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("End element " + qName);
        currentTagName = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length);
        if(currentTagName != null) {
            if(currentTagName.equals("address")) {
                address = new Address();
            } else if(currentTagName.equals("country")) {
                address.setCountry(value);
            } else if(currentTagName.contains("city")) {
                City city = new City();
                city.setValue(value);
                String size = new String(ch, start-20, 20).split("\"")[1];
                city.setSize(size);
                address.setCity(city);
            } else if(currentTagName.equals("street")) {
                address.setStreet(value);
            } else if(currentTagName.equals("building")) {
                address.setBuilding(Integer.parseInt(value));
            } else if(currentTagName.equals("apartment")) {
                address.setApartment(Integer.parseInt(value));
            } else if(currentTagName.equals("zipCode")) {
                address.setZipCode(value);
                addresses.add(address);
            }
        }
    }
}
