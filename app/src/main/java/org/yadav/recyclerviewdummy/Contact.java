package org.yadav.recyclerviewdummy;

public class Contact {
    public String cNumber;
    public String cName;

    public Contact(String cNumber, String cName) {
        this.cNumber = cNumber;
        this.cName = cName;
    }

    public String getcNumber() {
        return cNumber;
    }

    public String getcName() {
        return cName;
    }
}
