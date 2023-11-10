package org.enes.lesson19.interfaceDemo;
/*
B�t�n �al��anlar izin isteyebilir
zam isteyebilir
i�ten ��kabilir

Garsonlar sipari� alabilirler ve servis yapabilirler
�efler yemek pi�irebilirler ve malzeme kontrol� yapabilirler.
bu davran��lar� uygulamam�za ekleyelim.
 */

public class Employee implements IEmployee ,ICommonBehavior{
    private int id;
    private String name;
    private double salary;
    private String startedDate;

    public Employee(int id, String name, double salary, String startedDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.startedDate = startedDate;
    }

    @Override
    public void requestVacation() {
        System.out.println(name+" adl� �al��an izin istiyor");
    }

    @Override
    public void leaveWork() {
        System.out.println(name+" adl� �al��an i�ten ayr�ld�.");
    }

    @Override
    public void requestSalary() {
        System.out.println(name+" adl� �al��an i�ten zam istiyor.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(String startedDate) {
        this.startedDate = startedDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", startedDate='" + startedDate + '\'' +
                '}';
    }

    @Override
    public void enter() {
        System.out.println(name+" adl� �al��an giri� yap�yor");
    }

    @Override
    public void exit() {
        System.out.println(name+" adl� �al��an ��k�� yap�yor");
    }
}
