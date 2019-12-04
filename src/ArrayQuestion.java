public class ArrayQuestion
{
    int tempNum = 0;
    int[] someArray;

    public ArrayQuestion(int[] someArray)
    {
        this.someArray = someArray;
    }

    public int[] sortArray()
    {
        /**You are a student who is tasked with sorting the grades of the class
         * the scores range from 0-100, your task is to arrange it in a new array that
         * sorts the scores from lowest to highest.
         * Ex
         * {0, 10, 100, 12, 50}
         *
         * Output: {100, 50, 12, 10, 0}
         */
        int[] Array2 = new int[someArray.length];
        int temp;
        for (int i = 1; i < someArray.length; i++)
        {
            for (int j = i; j > 0; j--)
            {
                if (someArray[j] < someArray[j - 1])
                {
                    temp = someArray[j];
                    someArray[j] = someArray[j - 1];
                    someArray[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < someArray.length; i++)
        {
            System.out.println(someArray[i]);
        }

            return someArray;

    }
}