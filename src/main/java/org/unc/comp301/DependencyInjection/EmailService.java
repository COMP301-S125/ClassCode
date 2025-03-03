package org.unc.comp301.DependencyInjection;

public class EmailService implements NotificationService{

    @Override
    public void notify(String msg) {
        if(msg == null){
            throw new IllegalArgumentException("Invalid Message");
        }
        System.out.println("Notify via email");
    }
}
