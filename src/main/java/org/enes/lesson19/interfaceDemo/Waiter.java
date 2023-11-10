package org.enes.lesson19.interfaceDemo;

public class Waiter extends Employee implements IWaiter{
    private String areoOfResponsibility;

    public Waiter(int id, String name, double salary, String startedDate, String areoOfResponsibility) {
        super(id, name, salary, startedDate);
        this.areoOfResponsibility = areoOfResponsibility;
    }

    public String getAreoOfResponsibilityGet() {
        return areoOfResponsibility;
    }

    public void setAreoOfResponsibilitySet(String areoOfResponsibility) {
        this.areoOfResponsibility = areoOfResponsibility;
    }

    @Override
    public void takeOrder(){
        System.out.println(getName()+" adl� garson sipari� ald�.");
    }


    @Override
    public void serve(){
        System.out.println(getName()+" adl� garson servis yapt�.");
    }


    @Override
    public String toString() {
        return "Waiter{" +
                "areoOfResponsibility='" + areoOfResponsibility + '\'' +
                '}';
    }
}
