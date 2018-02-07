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
        int[] arr = null;
        Sorter instance = new Sorter();
        instance.selectionSort(arr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mergeSort method, of class Sorter.
     */
    @Test
    public void testMergeSort() {
        System.out.println("mergeSort");
        int[] arr = null;
        Sorter instance = new Sorter();
        instance.mergeSort(arr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of merge method, of class Sorter.
     */
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

    /**
     * Test of mergeParts method, of class Sorter.
     */
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
    }

    /**
     * Test of javaSort method, of class Sorter.
     */
    @Test
    public void testJavaSort() {
        System.out.println("javaSort");
        int[] arr = null;
        Sorter instance = new Sorter();
        instance.javaSort(arr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class Sorter.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        int[] arr = null;
        int k = 0;
        Sorter instance = new Sorter();
        int expResult = 0;
        int result = instance.select(arr, k);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
