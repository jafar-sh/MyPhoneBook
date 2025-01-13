package com.shrifapp.myphonebook.model;

public abstract class Contact {
    private String number;
    private String name;
    private final ContactType type;

    public Contact(String number, String name,ContactType type) {
        this.number = number;
        this.name = name;
        this.type=type;
    }


    public ContactType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    private String capitalizeFirestCharacter(String str){
        if (str!=null&& !str.isEmpty()){
            return  Character.toUpperCase(str.charAt(0))+str.substring(1);
        }
        return  str;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = capitalizeFirestCharacter(name);
    }
}
