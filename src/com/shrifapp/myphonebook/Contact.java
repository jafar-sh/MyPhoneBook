package com.shrifapp.myphonebook;

public class Contact {
    private String number;
    private String name;

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
