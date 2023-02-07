package edu.cscc;

public class HoldingTank {
    int current, maxCapacity;

    public HoldingTank(int current, int maxCapacity) {
        this.current = current;
        this.maxCapacity = maxCapacity;
    }

    public int getCurrent() {
        return current;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void add(int volume) {
        current = getCurrent() + volume;
        if (current > getMaxCapacity()) {
            current = maxCapacity;
        }
    }
    public void drain(int volume) {
        current = getCurrent() - volume;
        if (current < 0){
            current = 0;
        }
    }
    public void print() {
        System.out.println("The tank volume is "+current+" gallons.");
    }
}
