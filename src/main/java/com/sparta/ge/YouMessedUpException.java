package com.sparta.ge;

public class YouMessedUpException extends Exception{

    private  String name;

    public YouMessedUpException(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getMessage(){
        return getName() + " messed up!";
    }
}
