package patternsexamp;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

// Using Command Design Patttern (code based on DZone Command Pattern)

//Client
public class PizzaOrderer{
  public static void main(String[] args)    {
    PizzaOrderControl control = new PizzaOrderControl();
    PizzaOrder order = new PizzaOrder();
    PizzaCommand deepDish = new DeepDishCommand(order);
    PizzaCommand thinCrust = new ThinCrustCommand(order);
    PizzaCommand jackson = new JacksonCommand(order);
    PizzaCommand trevor = new TrevorCommand(order);
    PizzaCommand sohail = new SohailCommand(order);

    // Order a deep Dish pizza
    control.setCommand(deepDish);
    control.submitOrder();

    // Order a thinCrust pizza
    control.setCommand(thinCrust);
    control.submitOrder();

    // Order a Jackson pizza
    control.setCommand(jackson);
    control.submitOrder();

    // Order a Trevor pizza
    control.setCommand(trevor);
    control.submitOrder();

    // Order a Sohail pizza
    control.setCommand(sohail);
    control.submitOrder();
  }
}
