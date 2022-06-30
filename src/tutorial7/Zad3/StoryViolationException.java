package Zad3;

public class StoryViolationException extends RuntimeException{

  public StoryViolationException(String causeMsg){
    super(causeMsg);
  }

  public void printMessage() {
  }
}
