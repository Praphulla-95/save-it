/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1894438
 */
public class StoreTest {
    
    public StoreTest() {
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

    @Test
    public void generateIdTest()
    {
        System.out.println("Display Store Details");
        Date date = new Date();
        String name = "";
        String expectedResult = "19-Mar-O-XX";
        String realResult = saveit.Store.generateid(date, name);
        assertEquals(expectedResult, realResult);
    }
}
