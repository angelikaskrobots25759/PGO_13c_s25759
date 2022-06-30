package Zad3;

public class Dumbledore extends Child{

  public Dumbledore(String name, Location location) {
    super(name, location);
  }

  public void moveTo(Orphanage orphanage){
    orphanage.addChild(this);
  }
}
