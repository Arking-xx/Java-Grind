package com.fake;


public class Pizza {
    private PizzaStatus status;

    public enum PizzaStatus {
        ORDERED,
        READY,
        DELIVERED;
    }

    public PizzaStatus getStatus() {
        return status;
    }

    public void setStatus(PizzaStatus pickStatus) {
        this.status = pickStatus;
    }

    public boolean isDeliverable() {
        if (getStatus() == PizzaStatus.READY) {
            return true;
        }
        return false;
    }
}
