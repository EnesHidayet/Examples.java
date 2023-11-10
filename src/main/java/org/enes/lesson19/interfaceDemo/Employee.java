package org.enes.lesson19.interfaceDemo;
/*
Bütün çalýþanlar izin isteyebilir
zam isteyebilir
iþten çýkabilir

Garsonlar sipariþ alabilirler ve servis yapabilirler
Þefler yemek piþirebilirler ve malzeme kontrolü yapabilirler.
bu davranýþlarý uygulamamýza ekleyelim.
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
        System.out.println(name+" adlý çalýþan izin istiyor");
    }

    @Override
    public void leaveWork() {
        System.out.println(name+" adlý çalýþan iþten ayrýldý.");
    }

    @Override
    public void requestSalary() {
        System.out.println(name+" adlý çalýþan iþten zam istiyor.");
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
        System.out.println(name+" adlý çalýþan giriþ yapýyor");
    }

    @Override
    public void exit() {
        System.out.println(name+" adlý çalýþan çýkýþ yapýyor");
    }
}
