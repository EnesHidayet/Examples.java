package org.enes.lesson19.interfaceDemo;

public class Chef extends Employee implements IChef{
    private String specialization;

    public Chef(int id, String name, double salary, String startedDate, String specialization) {
        super(id, name, salary, startedDate);
        this.specialization = specialization;
    }

    public String getSpecializationGet() {
        return specialization;
    }

    public void setSpecializationSet(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "specialization='" + specialization + '\'' +
                '}';
    }

    @Override
    public void cookFood(){
        System.out.println(getName()+" adlý þef yemek piþiriyor.");
    }

    @Override
    public void checkFood(){
        System.out.println(getName()+" adlý þef yemeklerin malzemelerini kontrol ediyor.");
    }

}
