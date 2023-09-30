/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author lenovo
 */
public class ReadHeadDuck extends Duck {
    
   public  ReadHeadDuck(){
       flyBehavior = new FlyWithWings();
       quackBehavior = new Quack();
       
   }
   @Override
   public void display(){
       System.out.println("I'm a real red Headed duck ");
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
