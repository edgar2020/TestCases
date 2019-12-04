public class If_Else_Question
{
    private int someNum;
    public If_Else_Question(int someNum)
    {
        this.someNum=someNum;
    }
    public boolean equalto0()
    {
        /**You have been asked to find all the zero's in a list of assignments,
         * if the grade is equal to zero return true to let the teacher know, otherwise right no
         *
         */
        if(someNum==0)
            return true;
        else
            return false;
    }
}
