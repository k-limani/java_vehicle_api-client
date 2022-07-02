package adapter;

// only meant to update the last static Automobile a1 object created;
// the previous ones are stored in l1 and accessed/edited through EditAuto interface
public interface UpdateAuto {
  // these methods in ProxyAutomobile

  // updates OptionSet name
  public abstract void updateOptionSetName(String OptionSetname, String newName);

  // updates option price
  public abstract void updateOptionPrice(String OptionSetname, String Option, String newprice);

  // adds option to choices
  public abstract void setOptionChoice(String optionSetName, String optionName);

  // prints auto, optionSets, options, and choices
  public abstract void printAuto(String modelname); // for debug
}
