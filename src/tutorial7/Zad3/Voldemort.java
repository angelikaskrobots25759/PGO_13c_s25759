package Zad3;

import java.util.ArrayList;
import java.util.List;

public class Voldemort extends Character{

  private List<String> horcruxes = new ArrayList<>();

  public Voldemort(Riddle riddle) {
    super(riddle.getName(), riddle.getLocation());
  }

  public void createHorcruxes(int amount){
    for(int i=1;i<=amount;i++){
      horcruxes.add("horcrux "+(horcruxes.size()+1));
    }
  }

  public void printHorcruxes(){
    System.out.println("Created horcruxes:");
    for(String s:horcruxes)
      System.out.println("\t\t" + s);
  }

  public void target(Character character){
    character.setHealth(0);
  }

  public void castSpell(Spell spell){

  }
}
