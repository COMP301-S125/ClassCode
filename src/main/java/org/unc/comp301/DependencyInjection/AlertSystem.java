package org.unc.comp301.DependencyInjection;

public class AlertSystem {
    private NotificationService notificationService;

    public AlertSystem(NotificationService notificationService){
        this.notificationService = notificationService; //Constructor Injection
    }

    public void notify(String msg){
        //If notify throws an error
        try{
            notificationService.notify(msg); //Delegation
        } catch (IllegalArgumentException e){
           System.err.println("Notification did not go out successfully:\n" + e);
        }
    }
}
