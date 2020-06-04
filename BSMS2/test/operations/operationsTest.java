/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import java.util.ArrayList;
import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vijay
 */
public class operationsTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    /*public operationsTest() {
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
     * Test of upbookdetails method, of class operations.
     */
    
    /*
    @Test
    public void testUpbookdetails() {
        System.out.println("upbookdetails");
        String bname = "";
        operations instance = new operations();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.upbookdetails(bname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBook method, of class operations.
     
    @Test
    public void testUpdateBook() {
        System.out.println("updateBook");
        String bn = "";
        String bauthor1 = "";
        int bprice1 = 0;
        int bquant1 = 0;
        operations instance = new operations();
        instance.updateBook(bn, bauthor1, bprice1, bquant1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buyit method, of class operations.
     
    @Test
    public void testBuyit() {
        System.out.println("buyit");
        int qun = 0;
        String name = "";
        operations instance = new operations();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.buyit(qun, name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchbook method, of class operations.
     
    @Test
    public void testSearchbook() {
        System.out.println("searchbook");
        String cat1 = "";
        String bname1 = "";
        operations instance = new operations();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.searchbook(cat1, bname1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adds method, of class operations.
     
    @Test
    public void testAdds() {
        System.out.println("adds");
        String tname = "";
        String fname = "";
        String lname = "";
        String gender = "";
        long cno = 0L;
        String uname = "";
        String pass = "";
        operations instance = new operations();
        String expResult = "";
        String result = instance.adds(tname, fname, lname, gender, cno, uname, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of check method, of class operations.
     */
    @Test
    public void testCheck() {
        System.out.println("check");
        String tname = "sinfo";
        String name = "cypher";
        String pass = "cypher";
        operations instance = new operations();
        boolean expResult = true;
        boolean result = instance.check(tname, name, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of upbookdetails method, of class operations.
     
    @Test
    public void testUpbookdetails() {
        System.out.println("upbookdetails");
        String bname = "";
        operations instance = new operations();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.upbookdetails(bname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBook method, of class operations.
     
    @Test
    public void testUpdateBook() {
        System.out.println("updateBook");
        String bn = "";
        String bauthor1 = "";
        int bprice1 = 0;
        int bquant1 = 0;
        operations instance = new operations();
        instance.updateBook(bn, bauthor1, bprice1, bquant1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buyit method, of class operations.
     
    @Test
    public void testBuyit() {
        System.out.println("buyit");
        int qun = 0;
        String name = "";
        operations instance = new operations();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.buyit(qun, name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchbook method, of class operations.
     
    @Test
    public void testSearchbook() {
        System.out.println("searchbook");
        String cat1 = "";
        String bname1 = "";
        operations instance = new operations();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.searchbook(cat1, bname1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adds method, of class operations.
     
    @Test
    public void testAdds() {
        System.out.println("adds");
        String tname = "";
        String fname = "";
        String lname = "";
        String gender = "";
        long cno = 0L;
        String uname = "";
        String pass = "";
        operations instance = new operations();
        String expResult = "";
        String result = instance.adds(tname, fname, lname, gender, cno, uname, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stock method, of class operations.
     
    @Test
    public void testStock() {
        System.out.println("stock");
        operations instance = new operations();
        Vector expResult = null;
        Vector result = instance.stock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBook method, of class operations.
     
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        String bname = "";
        String btype = "";
        String bauthor = "";
        int bprice = 0;
        int bquant = 0;
        operations instance = new operations();
        String expResult = "";
        String result = instance.addBook(bname, btype, bauthor, bprice, bquant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of orders_add method, of class operations.
     
    @Test
    public void testOrders_add() {
        System.out.println("orders_add");
        String name = "";
        String bname = "";
        int quant = 0;
        int price = 0;
        String date = "";
        operations instance = new operations();
        instance.orders_add(name, bname, quant, price, date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of history method, of class operations.
     
    @Test
    public void testHistory() {
        System.out.println("history");
        operations instance = new operations();
        Vector expResult = null;
        Vector result = instance.history();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /*
     * Test of stock method, of class operations.
     
    @Test
    public void testStock() {
        System.out.println("stock");
        operations instance = new operations();
        Vector expResult = null;
        Vector result = instance.stock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBook method, of class operations.
     
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        String bname = "";
        String btype = "";
        String bauthor = "";
        int bprice = 0;
        int bquant = 0;
        operations instance = new operations();
        instance.addBook(bname, btype, bauthor, bprice, bquant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of orders_add method, of class operations.
     
    @Test
    public void testOrders_add() {
        System.out.println("orders_add");
        String name = "";
        String bname = "";
        int quant = 0;
        int price = 0;
        String date = "";
        operations instance = new operations();
        instance.orders_add(name, bname, quant, price, date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of history method, of class operations.
     
    @Test
    public void testHistory() {
        System.out.println("history");
        operations instance = new operations();
        Vector expResult = null;
        Vector result = instance.history();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/    

    /**
     * Test of upbookdetails method, of class operations.
     
    @Test
    public void testUpbookdetails() {
        System.out.println("upbookdetails");
        String bname = "";
        operations instance = new operations();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.upbookdetails(bname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBook method, of class operations.
     
    @Test
    public void testUpdateBook() {
        System.out.println("updateBook");
        String bn = "";
        String bauthor1 = "";
        int bprice1 = 0;
        int bquant1 = 0;
        operations instance = new operations();
        instance.updateBook(bn, bauthor1, bprice1, bquant1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buyit method, of class operations.
     
    @Test
    public void testBuyit() {
        System.out.println("buyit");
        int qun = 0;
        String name = "";
        operations instance = new operations();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.buyit(qun, name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchbook method, of class operations.
     
    @Test
    public void testSearchbook() {
        System.out.println("searchbook");
        String cat1 = "";
        String bname1 = "";
        operations instance = new operations();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.searchbook(cat1, bname1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adds method, of class operations.
     
    @Test
    public void testAdds() {
        System.out.println("adds");
        String tname = "";
        String fname = "";
        String lname = "";
        String gender = "";
        long cno = 0L;
        String uname = "";
        String pass = "";
        operations instance = new operations();
        String expResult = "";
        String result = instance.adds(tname, fname, lname, gender, cno, uname, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stock method, of class operations.
     
    @Test
    public void testStock() {
        System.out.println("stock");
        operations instance = new operations();
        Vector expResult = null;
        Vector result = instance.stock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBook method, of class operations.
     
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        String bname = "";
        String btype = "";
        String bauthor = "";
        int bprice = 0;
        int bquant = 0;
        operations instance = new operations();
        instance.addBook(bname, btype, bauthor, bprice, bquant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of orders_add method, of class operations.
     
    @Test
    public void testOrders_add() {
        System.out.println("orders_add");
        String name = "";
        String bname = "";
        int quant = 0;
        int price = 0;
        String date = "";
        operations instance = new operations();
        instance.orders_add(name, bname, quant, price, date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of history method, of class operations.
     */
    /*@Test
    public void testHistory() {
        System.out.println("history");
        operations instance = new operations();
        Vector expResult = null;
        Vector result = instance.history();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");*/
    }


