package com.shrifapp.myphonebook;

public class Contact {
    private String number;
    private String name;

    @Override
    public String toString() {
        return "Name: "+name + ": Number: "+number;

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
    public void setNumber(int number) {
        this.number ="0"+ number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = capitalizeFirestCharacter(name);
    }
}
