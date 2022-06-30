package Zad3;

import java.util.ArrayList;
import java.util.List;

public class Orphanage {
  private String name;
  private Location location;
  private List<Child> childList = new ArrayList<>();

  public Orphanage(String name, Location location) {
    this.name = name;
    this.location = location;
  }

  public void addChild(Child child){
    child.setLocation(this.location);
    childList.add(child);
  }
}
