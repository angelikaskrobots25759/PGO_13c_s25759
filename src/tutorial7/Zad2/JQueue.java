package Zad2;

public class JQueue {
  private int[] arr;

  public JQueue() {
    arr = new int[10];
  }

  public JQueue(int length) {
    arr = new int[length];
  }

  public JQueue(int[] arr) {
    this.arr = arr;
  }

  public void put(int number){
    int[] arr = new int[this.arr.length+1];
    for(int i=0;i<this.arr.length;i++){
        arr[i] = this.arr[i];
    }
    arr[arr.length-1] = number;
    this.arr = arr;
  }

  public int pop(){
    int[] arr = new int[this.arr.length-1];
    for(int i=0;i<arr.length;i++){
        arr[i] = this.arr[i];
    }

    int tmp = this.arr[this.arr.length-1];
    this.arr = arr;
    return tmp;
  }

  public int peek(){
    return this.arr[this.arr.length-1];
  }

  public int length(){
    return arr.length;
  }
}
