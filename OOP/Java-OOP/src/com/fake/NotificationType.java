package com.fake;

interface Notification {
    void send(String message);
}

public enum NotificationType implements Notification {
    EMAIL {
        public void send(String message) {
            System.out.println("Sending email" + message);
        }
    },
    SMS {
        public void send(String message) {
            System.out.println("Sending SMS: " + message);
        }
    },
    PUSH {
        public void send(String message) {
            System.out.println("Sending push notification" + message);
        }
    },
}
