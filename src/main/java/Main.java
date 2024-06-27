

public class Main {
  public static void main(String[] args) {


    int [] array = {1,223,3,4,5};

    MergeSort mergeSort = new MergeSort();

    int [] array2 = mergeSort.mergeSort(array);

    for(int i: array2){
      System.out.print(i + " ");
    }
    
  }


}