/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.ArrayList;
import javax.swing.ImageIcon;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 51937
 */
public class QueenTest {
    
    public QueenTest() {
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
     * Test of calculatePossibleMoves method, of class Queen.
     */
    @Test
    public void testCalculatePossibleMoves() {
        System.out.println("calculatePossibleMoves");
        ChessGameBoard board = new ChessGameBoard();
        Queen instance = new Queen(board, 1, 2, ChessGamePiece.WHITE);
        ArrayList<String> expResult = new ArrayList<String>();
        expResult.add("e3");
        ArrayList<String> result = instance.calculatePossibleMoves(board);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testCreateImageByPieceType() {
        System.out.println("createImageByPieceType");
        Queen instance = new Queen(new ChessGameBoard(), 1, 2, ChessGamePiece.WHITE);
        ImageIcon expResult = new ImageIcon(getClass().getResource("chessImages/WhiteQueen.gif"));
        ImageIcon result = instance.createImageByPieceType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
