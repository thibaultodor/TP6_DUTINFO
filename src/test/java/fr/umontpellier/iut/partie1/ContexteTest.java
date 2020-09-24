package fr.umontpellier.iut.partie1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ContexteTest {

    @Test
    public void test_no_exception() {
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
        Contexte c = new Contexte(new Taquin(data));
        assertDoesNotThrow(() -> c.resoudre());
    }

    @Test
    public void test_no_exceptionV2() {
        int[][] data = {{1, 2, 3}, {4, 5, 0}, {7, 8, 6}};
        Contexte c = new Contexte(new Taquin(data));
        assertDoesNotThrow(() -> c.resoudre());
    }

    @Test
    public void test_no_exceptionV3() {
        int[][] data = {{0, 2, 3}, {4, 5, 1}, {7, 8, 6}};
        Contexte c = new Contexte(new Taquin(data));
        assertDoesNotThrow(() -> c.resoudre());
    }

    @Test
    public void test_solution_2x2() {
        int[][] data = {{0,1},{3,2}};
        int[][] data1 = {{1,0},{3,2}};
        int[][] data2 = {{1,2},{3,0}};

        Contexte c = new Contexte(new Taquin(data));
        assertDoesNotThrow(() -> c.resoudre());
        ArrayList<Taquin> listesoluce = new ArrayList<>();
        listesoluce.add(new Taquin(data));
        listesoluce.add(new Taquin(data1));
        listesoluce.add(new Taquin(data2));

        assertEquals(listesoluce,c.getSolution());
    }

    @Test
    public void test_solution_2x2_error_listevide() {
        int[][] data = {{0,1},{0,2}};

        Contexte c = new Contexte(new Taquin(data));
        assertDoesNotThrow(() -> c.resoudre());
        ArrayList<Taquin> listesoluce = new ArrayList<>();

        assertEquals(listesoluce,c.getSolution());
    }

    @Test
    public void test_solution_3x3_k_sup_2() {
        int[][] data = {{1, 2, 3}, {0, 5, 6}, {4, 7, 8}};
        int[][] data1 = {{1, 2, 3}, {4, 5, 6}, {0, 7, 8}};
        int[][] data2 = {{1, 2, 3}, {4, 5, 6}, {7, 0, 8}};
        int[][] data3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};

        Contexte c = new Contexte(new Taquin(data));
        assertDoesNotThrow(() -> c.resoudre());
        ArrayList<Taquin> listesoluce = new ArrayList<>();
        listesoluce.add(new Taquin(data));
        listesoluce.add(new Taquin(data1));
        listesoluce.add(new Taquin(data2));
        listesoluce.add(new Taquin(data3));

        assertEquals(listesoluce,c.getSolution());
    }

    @Test
    public void test_solution_3x2_error_listevide() {
        int[][] data = {{0,1,3},{0,2,1}};

        Contexte c = new Contexte(new Taquin(data));
        assertDoesNotThrow(() -> c.resoudre());
        ArrayList<Taquin> listesoluce = new ArrayList<>();

        assertEquals(listesoluce,c.getSolution());
    }

    @Test
    public void test_solution_3x3_error_listevide() {
        int[][] data = {{2,1,3},{0,2,1},{0,2,4}};

        Contexte c = new Contexte(new Taquin(data));
        assertDoesNotThrow(() -> c.resoudre());
        ArrayList<Taquin> listesoluce = new ArrayList<>();

        assertEquals(listesoluce,c.getSolution());
    }
}