
package logika.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.1.4.redhat-1
 * Wed Apr 26 22:05:44 CEST 2017
 * Generated source version: 3.1.4.redhat-1
 */

@XmlRootElement(name = "NoCartException", namespace = "http://logika/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoCartException", namespace = "http://logika/")

public class NoCartExceptionBean {

    private java.lang.String message;

    public java.lang.String getMessage() {
        return this.message;
    }

    public void setMessage(java.lang.String newMessage)  {
        this.message = newMessage;
    }

}

