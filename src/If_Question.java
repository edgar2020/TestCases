public class If_Question
{
    private int someNum;
    public If_Question(int someNum)
    {
        this.someNum=someNum;
    }
    public boolean greaterThan5()
    {
        /**You are a student in Mrs Rioux's class, here is your assignment:
         *
         * if someNum is greater than 5 return true, otherwise return false**/
        if(someNum>5)
            return true;
        return false;
    }
    @Override
    public String toString()
    {
        return  ""+someNum;
    }
}