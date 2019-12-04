import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListQuestion
{
    /**
     * You are given an the task of creating a program that simulates a storage room
     * You must be able to add and delete items from the program at will.
     * <p>
     * hint: The input is an array so you will have to convert to an arraylist
     * <p>
     * you will be expected to create an arrayList that will add someItem at index thisIndex
     * while also being  expected to remove an item from the index otherIndex;
     * <p>
     * Example: {a, b, c, d, f, f}, "e", 4, 6
     * <p>
     * The arrayList: a, b, c, d, e, f
     */
    String[] someArray;
    int thisIndex;
    String someItem;
    int otherIndex;

    public ArrayListQuestion(String[] someArray, int thisIndex, String someItem, int otherIndex)
    {
        this.someArray = someArray;
        this.thisIndex=thisIndex;
        this.someItem=someItem;
        this.otherIndex=otherIndex;
    }

    public List<String> simulateStorage()
    {
        int tempNum = 0;
        List<String> list = new ArrayList<String>();

      for(String text:someArray)
      {
          list.add(text);
      }
      list.add(thisIndex, someItem);
      list.remove(otherIndex);

      return list;

    }
}