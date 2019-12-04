public class Q2DArray
{
    int tempNum = 0;
    int[][] someArray;
    /**You are a navy radar opperator tasked with finding the location of a ship
     * in a coordinate plane. The plane is represented by a 2D array where a 0 is empty water
     * and a 1 represents a ship. Your job is to return the coordinate of the ship from the 2D array by
     * returning a string of row number + collum number
     * if there is no ship return -1
     *
     * Ex:
     * 000000
     * 000100
     * 000000
     * 000000
     *
     * return: "1 3"
     */



    public Q2DArray(int[][] someArray)
    {
        this.someArray = someArray;
    }

    public String findShip()
    {
        String row="";
        String col="";
        for(int i=0;i<someArray.length;i++)
        {
            for(int j = 0; j<someArray[i].length;j++)
            {
                if(someArray[i][j]==1)
                {
                    row=""+i;
                    col=""+j;
                    return row+" "+col;
                }
            }
        }
        return "-1";

    }
}

