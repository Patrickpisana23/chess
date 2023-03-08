import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import org.junit.Before;
import org.junit.Test;

public class BishopTest {
    
    private ChessGameBoard board;
    private Bishop bishop;
    
    @Before
    public void setUp() {
        board = new ChessGameBoard();
        bishop = new Bishop(board, 4, 4, ChessGamePiece.WHITE);
    }
    
    @Test
    public void testCalculatePossibleMoves() {
        ArrayList<String> expectedMoves = new ArrayList<String>();
        expectedMoves.add("a1");
        expectedMoves.add("b2");
        expectedMoves.add("c3");
        expectedMoves.add("d4");
        expectedMoves.add("e5");
        expectedMoves.add("f6");
        expectedMoves.add("g7");
        expectedMoves.add("h8");
        expectedMoves.add("a7");
        expectedMoves.add("b6");
        expectedMoves.add("c5");
        expectedMoves.add("e3");
        expectedMoves.add("f2");
        expectedMoves.add("g1");
        expectedMoves.add("e5");
        expectedMoves.add("f6");
        expectedMoves.add("g7");
        expectedMoves.add("h8");
        expectedMoves.add("a1");
        expectedMoves.add("b2");
        expectedMoves.add("c3");
        expectedMoves.add("d4");
        ArrayList<String> actualMoves = bishop.calculatePossibleMoves(board);
        assertEquals(expectedMoves, actualMoves);
    }
    
    @Test
    public void testCreateImageByPieceType() {
        ImageIcon expectedImage = new ImageIcon(getClass().getResource("chessImages/WhiteBishop.gif"));
        ImageIcon actualImage = bishop.createImageByPieceType();
        assertEquals(expectedImage.getImage(), actualImage.getImage());
    }
}