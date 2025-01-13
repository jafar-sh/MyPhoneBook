package com.shrifapp.myphonebook.model;

public class BusinessContact extends Contact{
    private String fax;

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public BusinessContact(String number, String name) {
        super(number, name, ContactType.BUSINESS);
    }
}
