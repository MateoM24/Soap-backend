
package logika.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.1.4.redhat-1
 * Sun Apr 23 21:39:06 CEST 2017
 * Generated source version: 3.1.4.redhat-1
 */

@XmlRootElement(name = "discountCart", namespace = "http://logika/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discountCart", namespace = "http://logika/", propOrder = {"arg0", "arg1"})

public class DiscountCart {

    @XmlElement(name = "arg0")
    private logika.Cart arg0;
    @XmlElement(name = "arg1")
    private double arg1;

    public logika.Cart getArg0() {
        return this.arg0;
    }

    public void setArg0(logika.Cart newArg0)  {
        this.arg0 = newArg0;
    }

    public double getArg1() {
        return this.arg1;
    }

    public void setArg1(double newArg1)  {
        this.arg1 = newArg1;
    }

}

