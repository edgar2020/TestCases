public class for_Question
{
    int someNum=0;
    public for_Question(int someNum)
    {
        this.someNum=someNum;
    }
    public String starTriangle()
    {
        /**You have been learning about fractals, you decided to create a very simple fractal out of these little "*"
         * the fractal consists of creating multiple layers of "*" while each lower level is one less than the one before it
         *
         * Create a starTriangle based on the value of someNum
         * example: if someNum = 4
         * there should be a new line after each row, even if it is the last * in the program;
         *
         * output: ******
         *         *****
         *         ****
         *         ***
         *         **
         *         *
         */
        String someString="";
        for(int i = someNum; i > 0; i--)
        {
            for(int j = i; j>0;j--)
            {
                someString+="*";
            }
            someString+="\n";
        }
        return someString;
    }
}
