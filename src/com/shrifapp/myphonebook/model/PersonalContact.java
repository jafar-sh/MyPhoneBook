package com.shrifapp.myphonebook.model;

public class PersonalContact extends Contact{
    private String family;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public PersonalContact(String number, String name) {
        super(number, name, ContactType.PERSONAL);
    }
}
