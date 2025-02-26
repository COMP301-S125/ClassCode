package org.unc.comp301.Exceptions;

public class IllegalClassFormatException extends Exception{
    public IllegalClassFormatException(){}

    public IllegalClassFormatException(String msg){
        super(msg);
    }
}
