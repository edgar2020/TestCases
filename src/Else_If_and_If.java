public class Else_If_and_If
{
    int age=0;
    public Else_If_and_If(int age)
    {
        this.age=age;
    }
    public String discount()
    {
        /**You have been hired to create a discount organizer for a local movie theater
         * If person is younger than 9 return "child", if younger than 18 return "student", if under 65 give "regular"
         * and if 65 or greater give "senior".*/
        if(age<9)
            return "child";
        else if(age<19)
            return "student";
        else if(age<65)
            return "regular";
        else if(age>=65)
            return "senior";
        else
            return "error";
    }
}
