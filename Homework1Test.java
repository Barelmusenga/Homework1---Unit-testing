package IUS;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class Homework1Test {
    @Test
    public void testSize_InitialListEmpty(){
        LinkedList list = new LinkedList();
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testSize_oneElement(){
        LinkedList list = new LinkedList();
        list.add(20);
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testNext_node(){
        Homework1 <String> list = new Homework1<>();
        ILinkedList<String> j = list;
        ILinkedList expected = null;
        ILinkedList actual = list.next();
        Assert.assertEquals("Should be null", expected, actual);
    }
    @Test
    public void testNext2_node(){
        Homework1 <String> list = new Homework1<>();
        ILinkedList<String> j = list;
        ILinkedList expected = list;
        ILinkedList actual = list;
        Assert.assertEquals("Not null", expected, actual);
    }

    @Test
    public void testLast_node(){
        Homework1<Integer> list = new Homework1<>();
        ILinkedList<Integer> s = list;
        ILinkedList expected = list;
        ILinkedList actual = list;
        Assert.assertEquals("1, 2, 3, 4, 5", expected, actual);
    }
    @Test
    public void testLast2_node(){
        Homework1<Integer> list = new Homework1<>();
        ILinkedList<Integer> s = list;
        ILinkedList expected = list;
        ILinkedList actual = list;
        Assert.assertEquals("67", expected, actual);
    }

    @Test
    public  void testAfter_node(){
        Homework1<Integer> list = new Homework1<>();
        //int n = list.data;
        ILinkedList<Integer> m = list;
        ILinkedList expected = list;
        ILinkedList actual = list;
        Assert.assertEquals("3, 6, 8, 12, 29", expected, actual);
    }
    @Test
    public  void testAfter2_node(){
        Homework1<Integer> list = new Homework1<>();
        ILinkedList<Integer> m = list;
        ILinkedList expected = list;
        ILinkedList actual = list;
        Assert.assertEquals("30", expected, actual);
    }

    @Test
    public void testDetach_node(){
        Homework1<String> list = new Homework1<>();
        ILinkedList<String> s = list;
        ILinkedList expected = list;
        ILinkedList actual = list;
        Assert.assertEquals("'barel', 'william'", expected, actual);
    }
    @Test
    public void testDetach2_node(){
        Homework1<String> list = new Homework1<>();
        ILinkedList<String> s = list;
        ILinkedList expected = list;
        ILinkedList actual = list;
        Assert.assertEquals("barel", expected, actual);
    }

    @Test
    public void testGet_currentNode(){
        Homework1<Integer> list = new Homework1<>();
        ILinkedList<Integer> k = list;
        ILinkedList expected = list;
        ILinkedList actual = list;
        Assert.assertEquals("23, 56, 78", expected, actual);
    }
    @Test
    public void testGet2_currentNode(){
        Homework1<Integer> list = new Homework1<>();
        ILinkedList<Integer> k = list;
        ILinkedList expected = list;
        ILinkedList actual = list;
        Assert.assertEquals("78", expected, actual);
    }

    @Test
    public void testSet_node(){
        Homework1<Integer> list = new Homework1<>();
        ILinkedList<Integer> d = list;
        ILinkedList expected = null;
        ILinkedList actual = (ILinkedList) ((Homework1) list).data;
        Assert.assertEquals("4, 7, 8", expected, actual);
    }
    @Test
    public void testSet2_node(){
        Homework1<Integer> list = new Homework1<>();
        ILinkedList<Integer> d = list;
        ILinkedList expected = list;
        ILinkedList actual = list;
        Assert.assertEquals("8", expected, actual);
    }

    @Test
    public void testSetNext_node(){
        Homework1<Integer> list = new Homework1<>();
        ILinkedList<Integer> g = list;
        ILinkedList expected = list;
        ILinkedList actual = list;
        Assert.assertEquals("4", expected, actual);
    }
    @Test
    public void testSetNext2_node(){
        Homework1<Integer> list = new Homework1<>();
        ILinkedList<Integer> g = list;
        ILinkedList expected = list;
        ILinkedList actual = list;
        Assert.assertEquals(String.valueOf(44), expected, actual);
    }

    @Test
    public void testAppend_node(){
        Homework1<Integer> list = new Homework1<>();
        ILinkedList<Integer> k = list;
        ILinkedList expect = list;
        ILinkedList actual = list;
        Assert.assertEquals("4", expect, actual);
    }
    @Test
    public void testAppend2_node(){
        Homework1<Integer> list = new Homework1<>();
        ILinkedList<Integer> k = list;
        ILinkedList expect = list;
        ILinkedList actual = list;
        Assert.assertEquals("4, 6", expect, actual);
    }

    @Test
    public void testInsert_node(){
        Homework1<Integer> list = new Homework1<>();
        ILinkedList<Integer> z = list;
        ILinkedList expected = list;
        ILinkedList actual = list;
        Assert.assertEquals("45, 67", expected, actual);
    }
    @Test
    public void testInsert2_node(){
        Homework1<Integer> list = new Homework1<>();
        ILinkedList<Integer> z = list;
        ILinkedList expected = list;
        ILinkedList actual = list;
        Assert.assertEquals("8", expected, actual);
    }
}