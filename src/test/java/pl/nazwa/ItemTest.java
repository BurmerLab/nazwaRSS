///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package pl.nazwa;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author Michał
// */
//public class ItemTest {
//    
//    public ItemTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of foundTitle method, of class Item.
//     */
//    @Test
//    public void testFoundTitle() throws Exception {
//        System.out.println("foundTitle");
//        int count = 1;
//        Item instance = new Item();
//        String expResult = "revelka.pl";
//        String result = instance.foundTitle(count);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of foundHref method, of class Item.
//     */
//    @Test
//    public void testFoundHref() throws Exception {
//        System.out.println("foundHref");
//        int count = 1;
//        Item instance = new Item();
//        String expResult = "http://www.nazwa.pl/gielda-domen/szczegoly/?saleId=135559";
//        String result = instance.foundHref(count);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of foundDescription method, of class Item.
//     */
//    @Test
//    public void testFoundDescription() throws Exception {
//        System.out.println("foundDescription");
//        int count = 1;
//        Item instance = new Item();
//        String expResult = "2.000,00 zł";
//        String result = instance.foundDescription(count);
//        assertEquals(expResult, result);
//    }
//}
