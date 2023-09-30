/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author lenovo
 */
public class RubberDuck extends Duck {
    
    public RubberDuck(){
    flyBehavior = new FlyNoWay();
   
    quackBehavior = () -> System.out.println("Sueak");
    
    }
           public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior ){
           
               this.flyBehavior = flyBehavior;
               this.quackBehavior = quackBehavior;
               
           }
    @Override
            public void display(){
                System.out.println("I'm a rubber duckie ");
            
            }
    @Override
    public void quack() {
        System.out.println("Mallard Duck: Quack quack!");
    }

    @Override
    public void swim() {
        System.out.println("Mallard Duck: Berenang di danau.");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck: Terbang tinggi.");
    }
    
}
