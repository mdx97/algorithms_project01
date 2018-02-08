/*
 * Author: Mathew Horner
 * Project: _
 * File: _
 * Description: _
 */
package project01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 *
 * @author Horner
 */
public class SorterTest {
    
    public SorterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of selectionSort method, of class Sorter.
     */
    @Test
    public void testSelectionSort() {
        System.out.println("selectionSort");
        int[] arr = new int[] {9, 2, 4, 7, 5};
        Sorter instance = new Sorter();
        instance.selectionSort(arr);
        assert (arr[0] == 2);
        assert (arr[1] == 4);
        assert (arr[2] == 5);
        assert (arr[3] == 7);
        assert (arr[4] == 9);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mergeSort method, of class Sorter.
     */
    @Test
    public void testMergeSort() {
        System.out.println("mergeSort");
        int[] arr = new int[] {9, 2, 4, 7, 5};
        Sorter instance = new Sorter();
        instance.mergeSort(arr);
        assert (arr[0] == 2);
        assert (arr[1] == 4);
        assert (arr[2] == 5);
        assert (arr[3] == 7);
        assert (arr[4] == 9);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /*
    @Test
    public void testMerge() {
        System.out.println("merge");
        int lowIdx = 0;
        int highIdx = 0;
        Sorter instance = new Sorter();
        instance.merge(lowIdx, highIdx);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testMergeParts() {
        System.out.println("mergeParts");
        int lowIdx = 0;
        int mid = 0;
        int highIdx = 0;
        Sorter instance = new Sorter();
        instance.mergeParts(lowIdx, mid, highIdx);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of javaSort method, of class Sorter.
     */
    @Test
    public void testJavaSort() {
        System.out.println("javaSort");
        int[] arr = new int[] {9, 2, 4, 7, 5};
        Sorter instance = new Sorter();
        instance.javaSort(arr);
        assert (arr[0] == 2);
        assert (arr[1] == 4);
        assert (arr[2] == 5);
        assert (arr[3] == 7);
        assert (arr[4] == 9);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class Sorter.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        ArrayList<Integer> arrList = new ArrayList();
        arrList.add(9);
        arrList.add(2);
        arrList.add(4);
        arrList.add(7);
        arrList.add(5);
        int k = 1;
        Sorter instance = new Sorter();
        int expResult = 1;
        int result = instance.select(arrList, k);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
