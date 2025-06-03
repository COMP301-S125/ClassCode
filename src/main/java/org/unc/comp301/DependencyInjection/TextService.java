package org.unc.comp301.DependencyInjection;

public class TextService implements  NotificationService{
    @Override
    public void notify(String msg) {
        if(msg == null){
            throw new IllegalArgumentException("Invalid Message");
        }
        System.out.println("Notify via text");
    }

}
