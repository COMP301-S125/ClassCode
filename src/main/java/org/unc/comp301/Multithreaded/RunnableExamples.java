package org.unc.comp301.Multithreaded;

public class RunnableExamples {
    public static void main(String[] args){
        Runnable task = new Runnable() {
            @Override
            public void run() {
                //Insert code here
            }
        };

        Runnable myTask = () -> {
            //Code to run here
        };
    }
}
