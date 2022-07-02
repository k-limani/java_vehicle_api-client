package client;

import java.util.*;
import model.*;

public class SelectCarOptions {

  /**************************************************************************/
  // DATA FIELDS
  /**************************************************************************/

  private Scanner in = new Scanner(System.in);
  /**************************************************************************/
  // CONSTRUCTORS
  /**************************************************************************/

  public SelectCarOptions() {}

  /**************************************************************************/
  // INSTANCE METHODS
  /**************************************************************************/

  public Automobile configureAuto(Object obj) {
    Automobile auto = (Automobile) obj;
    auto.printAutomobile();
    System.out.print(
        "Enter Option Set folloed by your Option choice, \n"
            + "separated by comma (for example \"Brakes,ABS\"): ");
    String choice = in.nextLine();
    String[] choiceArr = new String[2];
    choiceArr = choice.split(",");

    try {
      auto.addOptionChoice(choiceArr[0], choiceArr[1]);
      String tempconfig = "MODIFIED " + auto.getKey();
      auto.printAutomobile(tempconfig);
    } catch (NullPointerException e) {
      System.out.println("Error in configureAuto(obj) - no such choice exists: " + e.toString());
    }
    return auto;
  }

  // check if object is automobile
  public boolean isAutomobile(Object obj) {
    boolean isAutomobile = false;

    try {
      @SuppressWarnings("unused")
      Automobile a1 = (Automobile) obj;
      isAutomobile = true;
    } catch (ClassCastException e) {
      return isAutomobile;
    }
    return isAutomobile;
  }
}
