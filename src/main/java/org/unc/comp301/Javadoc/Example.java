package org.unc.comp301.Javadoc;

/**
 * Example class shows how Javadoc can create documentation similar to the java API
 *
 * @author Prof Prairie Goodwin
 * @version 1.0
 *
 */
public class Example {
    /**
     * Variables are private but important
     */
    private int myInt = 5;

    /**
     *This method has both a parameter and a return value
     * @param anInt
     * @return That is very very important.
     */
    public String aMethod(int anInt){
        //A comment
        return "string";
    }

    /**
     * An exception is thrown in this method!
     * @return nothing.
     * @throws Exception
     */
    public String anException() throws Exception{
        throw new Exception("This is an exception");
    }

    /**
     * Main method is currently empty.
     * @param args exists to take arguments from the command line.
     */
    public static void main(String[] args){
        //A comment

        /*A
        * multiline
        * long
        * comment
        * */
    }

}
