public class while_Question
{
    int someNum=0;
    public while_Question(int someNum)
    {
        this.someNum=someNum;
    }
    public String countdown()
    {
        /**With the launch of the new FalconX rocket you are more excited than ever
         * YOu decide the best way to wait for the next launch is to create a coutdown using a while loop
         * because why not.**/
        String someString="";
        while(someNum>=0)
        {
            someString += someNum + " ";
            someNum--;
        }
        return someString;

    }
}
