package org.enes.lesson19.interfaceDemo;

public class Test {
    public static void main(String[] args) {

        Chef chef=new Chef(1,"John",3500,"1.1.10","Tatlý");
        Waiter waiter=new Waiter(2,"Jonny",2850,"1.2.10","Area A");
        chef.requestSalary();
        waiter.requestVacation();
        chef.cookFood();
        chef.checkFood();
        waiter.serve();
        waiter.takeOrder();


        Customer customer=new Customer();
        customer.enter();
        customer.exit();
        chef.enter();
        waiter.exit();
        waiter.toString();

    }
}
