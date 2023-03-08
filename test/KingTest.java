import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;

public class KingTest {

    @Test
    public void testCalculatePossibleMoves() {
        // Creamos un tablero de ajedrez vacío
        ChessGameBoard board = new ChessGameBoard();
        // Creamos un Rey blanco en la esquina superior izquierda
        King king = new King(board, 1, 2, ChessGamePiece.WHITE);
        // Obtenemos la lista de movimientos posibles
        ArrayList<String> moves = king.calculatePossibleMoves(board);
        // Verificamos que haya exactamente 3 movimientos posibles
        assertEquals(3, moves.size());
        // Verificamos que los movimientos sean los esperados
        assertTrue(moves.contains("B1"));
        assertTrue(moves.contains("A2"));
        assertTrue(moves.contains("B2"));
    }

}