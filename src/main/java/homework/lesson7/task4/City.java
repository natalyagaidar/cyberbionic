package homework.lesson7.task4;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "city")
public class City {
    private String size;
    private String value;

    public City(String size, String value) {
        this.size = size;
        this.value = value;
    }

    public City() {
    }

    public String getSize() {
        return size;
    }

    @XmlAttribute(name = "size")
    public void setSize(String size) {
        this.size = size;
    }

    public String getValue() {
        return value;
    }

    @XmlValue
    public void setValue(String value) {
        this.value = value;
    }
}
