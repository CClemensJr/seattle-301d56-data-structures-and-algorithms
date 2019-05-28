import java.util.Arrays;

public class ArrayReverse {
  public static void main (String[] args) {
    int[] startArr = new int[] {1,2,3,4,5,10};
    System.out.println(Arrays.toString(startArr));

    int[] endArr = reverseArray(startArr);
    System.out.println(Arrays.toString(endArr));
  }

  public static int[] reverseArray(int[] inputArray) {
    int length = inputArray.length;
    int[] reverseArray = new int[length];

    for (int i = 0; i < length; i++) {
      reverseArray[i] = inputArray[length -i - 1];
    }

    return reverseArray;
  }
    
}