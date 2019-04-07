package leetcode.problem_0348;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void ticTacToa_1() throws Exception {
        final Solution.TicTacToe ticTacToe = new Solution.TicTacToe(2);

        assertEquals(0, ticTacToe.move(0, 0, 1));
        assertEquals(0, ticTacToe.move(1, 1, 2));
        assertEquals(1, ticTacToe.move(1, 0, 1));
    }

    @Test
    public void ticTacToa_2() throws Exception {
        final Solution.TicTacToe ticTacToe = new Solution.TicTacToe(3);

        assertEquals(0, ticTacToe.move(0, 0, 1));
        assertEquals(0, ticTacToe.move(1, 1, 2));
        assertEquals(0, ticTacToe.move(2, 2, 1));
        assertEquals(0, ticTacToe.move(2, 0, 2));
        assertEquals(0, ticTacToe.move(0, 2, 1));
        assertEquals(0, ticTacToe.move(0, 1, 2));
        assertEquals(1, ticTacToe.move(1, 2, 1));
    }
}