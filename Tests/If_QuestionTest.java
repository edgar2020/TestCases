import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class If_QuestionTest
{

    @Test
    void ArrayListQuestion1()
    {
        String[]tempArray={"a","b","c"};
        List<String> list = new ArrayList<String>();
        list.add("b");
        list.add("c");
        list.add("d");
        ArrayListQuestion first = new ArrayListQuestion(tempArray, 3, "d", 0);
        assertArrayEquals(list.toArray(), first.simulateStorage().toArray());
    }
    @Test
    void ArrayListQuestion2()
    {
        String[]tempArray={"a","b","c", "c", "e"};
        List<String> list = new ArrayList<String>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        ArrayListQuestion second = new ArrayListQuestion(tempArray, 4, "d", 3);
        assertArrayEquals(list.toArray(), second.simulateStorage().toArray());
    }
    @Test
    void ArrayListQuestion3()
    {
        String[]tempArray={"a"};
        List<String> list = new ArrayList<String>();
        list.add("a");

        ArrayListQuestion third = new ArrayListQuestion(tempArray, 1, "b", 1);

        assertArrayEquals(list.toArray(), third.simulateStorage().toArray());
    }
    @Test
    void ArrayListQuestion4()
    {
        String[]tempArray={"box", "TV", "desk", "computer"};
        List<String> list = new ArrayList<String>();
        list.add("box");
        list.add("Fridge");
        list.add("TV");
        list.add("computer");

        ArrayListQuestion fourth = new ArrayListQuestion(tempArray, 1, "Fridge", 3);

        assertArrayEquals(list.toArray(), fourth.simulateStorage().toArray());
    }
    @Test
    void ArrayListQuestion5()
    {
        String[]tempArray={"Skittles", "M&M", "Brownies", "Cookies", "Milk"};
        List<String> list = new ArrayList<String>();
        list.add("Cake");
        list.add("Skittles");

        list.add("M&M");
        //list.add("Brownies");
        list.add("Cookies");
        list.add("Milk");

        ArrayListQuestion fifth = new ArrayListQuestion(tempArray, 0, "Cake", 3);
        assertArrayEquals(list.toArray(), fifth.simulateStorage().toArray());
    }
    @Test
    void Q2DArray1()
    {
        int[][] tempArray = {{0,0,0,0,1},
                             {0,0,0,0,0},
                             {0,0,0,0,0}};
        Q2DArray first = new Q2DArray(tempArray);
        assertEquals("0 4", first.findShip());
    }
    @Test
    void Q2DArray2()
    {
        int[][] tempArray = {{0,0,0,0,0},
                            {0,0,1,0,0},
                            {0,0,0,0,0}};
        Q2DArray second = new Q2DArray(tempArray);
        assertEquals("1 2", second.findShip());
    }
    @Test
    void Q2DArray3()
    {
        int[][] tempArray = {{0,0,0,0,0},
                             {0,0,0,0,0},
                             {0,0,0,0,0}};
        Q2DArray third = new Q2DArray(tempArray);
        assertEquals("-1", third.findShip());
    }
    @Test
    void Q2DArray4()
    {
        int[][] tempArray = {{0,0,0,0,0,0,0},
                             {0,0,0,0,0,0,0},
                             {0,0,0,0,0,0,0},
                             {0,0,0,0,0,0,0},
                             {1,0,0,0,0,0,0},
                             {0,0,0,0,0,0,0}};
        Q2DArray fourth = new Q2DArray(tempArray);
        assertEquals("4 0", fourth.findShip());
    }
    @Test
    void Q2DArray5()
    {
        int[][] tempArray = {{0,0,0,0,0,0,0},
                             {0,0,0,0,0,0,0},
                             {0,0,0,0,0,0,0},
                             {0,0,0,0,0,0,0},
                             {0,0,0,0,0,0,0},
                             {0,0,0,0,0,0,1}};
        Q2DArray fifth = new Q2DArray(tempArray);
        assertEquals("5 6", fifth.findShip());
    }
    @Test
    void simpleOutput()
    {
        SimpleOutput first = new SimpleOutput();
        assertEquals("Hello", first.returnHello());
    }
    @Test
    void ArrayQuestion1()
    {
        int[] tempArray = {10, 20, 100, 40, 60, 90, 99, 89, 0, 10};
        int[] sortedArray = {0, 10, 10, 20, 40, 60, 89, 90, 99, 100};
        ArrayQuestion first = new ArrayQuestion(tempArray);
        assertArrayEquals(sortedArray, first.sortArray());
    }
    @Test
    void ArrayQuestion2()
    {
        int[] tempArray = {100, 0};
        int[] sortedArray = {0, 100};
        ArrayQuestion second = new ArrayQuestion(tempArray);
        assertArrayEquals(sortedArray, second.sortArray());
    }
    @Test
    void ArrayQuestion3()
    {
        int[] tempArray = {10,10,10,10,10,10, 0};
        int[] sortedArray = {0,10,10,10,10,10,10};
        ArrayQuestion third = new ArrayQuestion(tempArray);
        assertArrayEquals(sortedArray, third.sortArray());
    }
    @Test
    void ArrayQuestion4()
    {
        int[] tempArray = {0,0,0,0,0,0,0,0,0,0,0,0};
        int[] sortedArray = {0,0,0,0,0,0,0,0,0,0,0,0};
        ArrayQuestion fourth = new ArrayQuestion(tempArray);
        assertArrayEquals(sortedArray, fourth.sortArray());
    }
    @Test
    void ArrayQuestion5()
    {
        int[] tempArray = {90,30,10,20,50,60,40,80,100,70};
        int[] sortedArray = {10,20,30,40,50,60,70,80,90,100};
        ArrayQuestion five = new ArrayQuestion(tempArray);
        assertArrayEquals(sortedArray, five.sortArray());
    }
    @Test
    void ArrayQuestion6()
    {
        int[] tempArray = {1};
        int[] sortedArray = {1};
        ArrayQuestion sixth = new ArrayQuestion(tempArray);
        assertArrayEquals(sortedArray, sixth.sortArray());
    }
    @Test
    void forLoop_1()
    {
        for_Question first = new for_Question(0);
        assertEquals("", first.starTriangle());
    }
    @Test
    void forLoop_2()
    {
        for_Question second = new for_Question(3);
        assertEquals("***\n**\n*\n", second.starTriangle());
    }
    @Test
    void forLoop_3()
    {
        for_Question third = new for_Question(-1);
        assertEquals("", third.starTriangle());
    }
    @Test
    void forLoop_4()
    {
        for_Question fourth = new for_Question(5);
        assertEquals("*****\n****\n***\n**\n*\n", fourth.starTriangle());
    }
    void forLoop_5()
    {
        for_Question fifth = new for_Question(10);
        assertEquals("**********\n*********\n********\n*******\n******\n*****\n****\n***\n**\n*\n", fifth.starTriangle());
    }
    @Test
    void countDown_1()
    {
        while_Question first = new while_Question(1);
        assertEquals("1 0 ", first.countdown());
    }
    @Test
    void countDown_2()
    {
        while_Question second = new while_Question(0);
        assertEquals("0 ", second.countdown());
    }
    @Test
    void countDown_3()
    {
        while_Question third = new while_Question(-1);
        assertEquals("", third.countdown());
    }
    @Test
    void countDown_4()
    {
        while_Question fourth = new while_Question(10);
        assertEquals("10 9 8 7 6 5 4 3 2 1 0 ", fourth.countdown());
    }
    @Test
    void countDown_5()
    {
        while_Question fifth = new while_Question(-8);
        assertEquals("", fifth.countdown());
    }
    @Test
    void discount_1()
    {
        Else_If_and_If first = new Else_If_and_If(8);
        assertEquals("child", first.discount());
    }
    @Test
    void discount_2()
    {
        Else_If_and_If second = new Else_If_and_If(9);
        assertEquals("student", second.discount());
    }
    @Test
    void discount_3()
    {
        Else_If_and_If third = new Else_If_and_If(15);
        assertEquals("student", third.discount());
    }
    @Test
    void discount_4()
    {
        Else_If_and_If fourth = new Else_If_and_If(19);
        assertEquals("regular", fourth.discount());
    }
    @Test
    void discount_5()
    {
        Else_If_and_If fifth = new Else_If_and_If(23);
        assertEquals("regular", fifth.discount());
    }
    @Test
    void discount_6()
    {
        Else_If_and_If sixth = new Else_If_and_If(64);
        assertEquals("regular", sixth.discount());
    }
    @Test
    void discount_7()
    {
        Else_If_and_If seventh = new Else_If_and_If(65);
        assertEquals("senior", seventh.discount());
    }
    @Test
    void discount_8()
    {
        Else_If_and_If eight = new Else_If_and_If(84);
        assertEquals("senior", eight.discount());
    }


    @Test
    void greaterThan5_1()
    {
        If_Question first = new If_Question(8);
        assertEquals(true, first.greaterThan5());
    }
    @Test
    void greaterThan5_2()
    {
        If_Question second = new If_Question(5);
        assertEquals(false, second.greaterThan5());
    }
    @Test
    void greaterThan5_3()
    {
        If_Question third = new If_Question(4);
        assertEquals(false, third.greaterThan5());
    }
    @Test
    void greaterThan5_4()
    {
        If_Question fourth = new If_Question(-2);
        assertEquals(false, fourth.greaterThan5());
    }
    @Test
    void equalTo0_1()
    {
        If_Else_Question first = new If_Else_Question(-2);
        assertEquals(false, first.equalto0());
    }
    @Test
    void equalTo0_2()
    {
        If_Else_Question second = new If_Else_Question(0);
        assertEquals(true, second.equalto0());
    }
    @Test
    void equalTo0_3()
    {
        If_Else_Question third = new If_Else_Question(4);
        assertEquals(false, third.equalto0());
    }
    @Test
    void equalTo0_4()
    {
        If_Else_Question fourth = new If_Else_Question(45323);
        assertEquals(false, fourth.equalto0());
    }

}