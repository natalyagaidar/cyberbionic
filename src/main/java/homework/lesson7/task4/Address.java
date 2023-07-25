package homework.lesson7.task4;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "address")
@XmlType(propOrder = {"country", "city", "street", "building", "apartment", "zipCode"})
@XmlAccessorType(XmlAccessType.NONE)
public class Address {
    @XmlElement
    private String country;
    @XmlElement
    private City city;
    @XmlElement
    private String street;
    @XmlElement
    private int building;
    @XmlElement
    private int apartment;
    @XmlElement
    private String zipCode;

    public String getCountry() {
        return country;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }

    public City getCity() {
        return city;
    }

    public Address setCity(City city) {
        this.city = city;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public int getBuilding() {
        return building;
    }

    public Address setBuilding(int building) {
        this.building = building;
        return this;
    }

    public int getApartment() {
        return apartment;
    }

    public Address setApartment(int apartment) {
        this.apartment = apartment;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Address setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    @Override
    public String toString() {
        return "Address{\n" +
                "country='" + country + '\'' +
                "\n city size=" + city.getSize() +
                "\n city name=" + city.getValue() +
                "\n street='" + street + '\'' +
                "\n building=" + building +
                "\n apartment=" + apartment +
                "\n zipCode='" + zipCode + '\'' +
                "\n}";
    }
}
