package homework.lesson7.task4;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "addressBook")
public class AddressBook {
    @XmlElement(name = "address")
    List<Address> addresses;

    public AddressBook(List<Address> addresses) {
        this.addresses = addresses;
    }

    public AddressBook() {}

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        String addressesString = "";
        for(Address a : addresses) {
            addressesString += a + "\n";
        }
        return "AddressBook{\n" +
                addressesString + "}";
    }
}
