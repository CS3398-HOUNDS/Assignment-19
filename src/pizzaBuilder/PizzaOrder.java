package patternsexamp;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

// Using Command Design Patttern (code based on DZone Command Pattern)

//Receiver
public class PizzaOrder{
  private boolean orderReady;
  public Pizza.Builder pb;
  public Pizza p;

  public void bakeDeepDish(){
	System.out.format("Baking a deepdish... \n");
    pb = new Pizza.Builder("Deep Dish");
    p = pb.pizzas(1).build();
    reportOrder();

  }
  public void bakeThinCrust(){
  	System.out.format("Baking a thincrust... \n");
  	pb = new Pizza.Builder("Thin Crust");
    p = pb.pizzas(1).build();
    reportOrder();
  }

  public void bakeJacksonPizza(){
    System.out.format("Baking delicious Jackson Pizza... \n");
    pb = new Pizza.Builder("Jackson Pizza");
    p = pb.pizzas(1).build();
    reportOrder();
  }

  public void bakeDonevanPizza(){
    System.out.format("Baking a delicious Donevan Pizza... \n");
    pb = new Pizza.Builder("Donevan Pizza");
    p = pb.pizzas(1).build();
    reportOrder();
  }

  public void bakeTrevorPizza(){
    System.out.format("Baking a nice Trevor Pizza... \n");
    pb = new Pizza.Builder("Trevor Pizza");
    p = pb.pizzas(1).build();
    reportOrder();
  }

  public void bakeSohailPizza(){
    System.out.format("Baking the stupendously satisfying Sohail Pizza... \n");
    pb = new Pizza.Builder("Sohail Pizza");
    p = pb.pizzas(1).build();
    reportOrder();
  }

  private void reportOrder() {
      System.out.format("\nBuilt %s - num pies: %d, pepperoni: %b, onion: %b, frenchfries %b\n",
    	p.getName(),
      p.getNumber(),
      p.toppings.pepperoni,
      p.toppings.onion,
      p.toppings.frenchfries );
  }
}
