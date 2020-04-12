/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hp
 */
public class GameChildTest {
    
    public GameChildTest() {
        
        
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
     * Test of play method, of class GameChild.
     */
    
    //--------------------good username-----------------------------
     @Test
    public void goodUsername() {
        System.out.println("Enter username should not  contain any character");
        String s = "abcdefghi67";
        boolean expResult = true;
       boolean result = GameChild.UserName(s);
       assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    //----------------------bad username -------------------------
         @Test
    public void BadUsername() {
        System.out.println("Enter username should not  contain any  character");
        String s = "$$";
        boolean expResult = false;
       boolean result = GameChild.UserName(s);
       assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    //----------------------boundary username
         @Test
    public void BoundaryUsername() {
        System.out.println("Enter username should not  contain any character");
        String s = "$$&&&";
        boolean expResult = false;
       boolean result = GameChild.UserName(s);
       assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //--------good 
    @Test
    public void GoodCardNo(){
        int j =3;
        boolean expResult= true;
        boolean result = GameChild.CardNo(j);
        assertEquals(expResult, result);
      }
    // bad
    @Test
    public void BadCardNo(){
        int j =-1;
        boolean expResult= false;
        boolean result = GameChild.CardNo(j);
        assertEquals(expResult, result);
      }
    //boundary--
    @Test
    public void BoundaryCardNo( ){
        int j =0;
        boolean expResult= true;
        boolean result = GameChild.CardNo(j);
        assertEquals(expResult, result);
      }
    //--------------------
    // ----------------            GOOD
    @Test
    public void GoodNumberOfPlayer(){
    int j1=2;
    boolean expResult = true;
    boolean result = GameChild.NumberOfPlayer(j1);
    assertEquals(expResult, result);
    
    }
    // Bad 
    
    @Test
      public void BadNumberOfPlayer(){
    int j1=0;
    boolean expResult = false;
    boolean result = GameChild.NumberOfPlayer(j1);
    assertEquals(expResult, result);
    
    }
    // Boundary 
    @Test
      public void BounaryNumberOfPlayer(){
    int j1=3;
    boolean expResult = true;
    boolean result = GameChild.NumberOfPlayer(j1);
    assertEquals(expResult, result);
    
    }
    
    
    
    
    
    
    
    
    
    
}
