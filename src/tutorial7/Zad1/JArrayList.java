package Zad1;

public class JArrayList {

  public int length;
  private int[] arr;

  public JArrayList() {
    arr = new int[10];
  }

  public JArrayList(int length) {
    arr = new int[length];
  }

  public JArrayList(int[] arr) {
    setTable(arr);
  }

  private void setTable(int[] arr){
    this.arr = arr;
    length = arr.length;
  }

  public void add(int number){
    addElement(number);
  }

  public void add(JArrayList otherList){
    for(int i=0;i<otherList.length;i++){
      addElement(otherList.get(i));
    }
  }

  private void addElement(int number){
    this.arr[length] = number;
    length = length+1;
  }

  public void remove(int index){
    int[] arr = new int[length-1];
    for(int i=0;i<arr.length;i++){
      if(i != index)
        arr[i] = this.arr[i];
    }
    this.arr = arr;
    length = length-1;
  }

  public int get(int index){
    return arr[index];
  }
}
