/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jerem
 */
public class ListsUtilityTest {
    
    public ListsUtilityTest() {
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
     * Test of GetCustomList method, of class ListsUtility.
     */
    @Test
    public void testGetCustomList_TwoItemsFound() {
        ArrayList<String> ipArray = new ArrayList<>();
        
        ListsUtility instance = new ListsUtility();
        ArrayList<String> expResult = new ArrayList<>();
        
        ipArray.add("Springfield");
        ipArray.add("Elmwood");
        ipArray.add("Springwood");
        ipArray.add("Willow Run");
        
        expResult.add("Springfield");
        expResult.add("Springwood");
        
        String ipItemInList = "SPr";
        
        ArrayList<String> result = instance.GetCustomList(ipArray, ipItemInList);
        assertEquals(expResult, result);
        
        ipItemInList = "sPrInG";
        result = instance.GetCustomList(ipArray, ipItemInList);
        assertEquals(expResult, result);
    }
    
        /**
     * Test of GetCustomList method, of class ListsUtility.
     */
    @Test
    public void testGetCustomList_NoItemsFound() {
        ArrayList<String> ipArray = new ArrayList<>();
        
        ListsUtility instance = new ListsUtility();
        ArrayList<String> expResult = new ArrayList<>();
        
        String ipItemInList = "SPr";
        
        ArrayList<String> result = instance.GetCustomList(ipArray, ipItemInList);
        assertEquals(expResult, result);
        
        ipItemInList = "sPrInG";
        result = instance.GetCustomList(ipArray, ipItemInList);
        assertEquals(expResult, result);
    }
    
}
