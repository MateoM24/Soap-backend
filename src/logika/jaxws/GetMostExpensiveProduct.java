
package logika.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.1.4.redhat-1
 * Wed Apr 26 22:05:44 CEST 2017
 * Generated source version: 3.1.4.redhat-1
 */

@XmlRootElement(name = "getMostExpensiveProduct", namespace = "http://logika/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMostExpensiveProduct", namespace = "http://logika/")

public class GetMostExpensiveProduct {

    @XmlElement(name = "arg0")
    private logika.Cart arg0;

    public logika.Cart getArg0() {
        return this.arg0;
    }

    public void setArg0(logika.Cart newArg0)  {
        this.arg0 = newArg0;
    }

}

