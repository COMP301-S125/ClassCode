package org.unc.comp301.Javadoc;

/**
 * This is an example class for Javadoc
 *
 * @author Prairie Goodwin
 * @version 1.0
 */
public class Example {
    /* this is a variable, noto a javadoc*/
    private int myInt = 5;


    /**
     * This is a method!  It does a thing!
     * @param anInt is a meaningless integer.
     * @return yup.  It's a string.
     */
    public String aMethod(int anInt){
        //A comment
        return "string";
    }

    /**
     * Beware! Here there be dragons
     * @return absolutely nothing!
     * @throws Exception that is important.
     */
    public String anException() throws Exception{
        throw new Exception("This is an exception");
    }


    /**
     * This is a main method!
     * @param args takes in arguments from the commandline
     */
    public static void main(String[] args){
        //Single comment

        /*
         * multiline comments
         */
    }

}
