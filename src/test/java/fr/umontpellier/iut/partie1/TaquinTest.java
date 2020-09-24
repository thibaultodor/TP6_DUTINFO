package fr.umontpellier.iut.partie1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TaquinTest {
    @Test
    public void test_est_gagnant_faux_3_X_3() {
        int[][] data = {{1, 2, 0}, {4, 5, 3}, {7, 8, 6}};
        Taquin t = new Taquin(data);
        assertFalse(t.estGagnant());
    }

    @Test
    public void test_est_gagnant_faux_4_X_4() {
        int[][] data = {{1, 2, 0 , 9}, {4, 5, 3 , 10}, {7, 8, 6 , 11},{12, 13, 14 , 15}};
        Taquin t = new Taquin(data);
        assertFalse(t.estGagnant());
    }

    @Test
    public void test_est_gagnant_vrai_3_X_3() {
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
        Taquin t = new Taquin(data);
        assertTrue(t.estGagnant());
    }

    @Test
    public void test_est_gagnant_vrai_4_X_4() {
        int[][] data = {{1, 2, 3 , 4}, {5, 6, 7 , 8}, {9, 10, 11 , 12},{13, 14, 15 , 0}};
        Taquin t = new Taquin(data);
        assertTrue(t.estGagnant());
    }

    @Test
    public void test_trouver_trou_coin_hd_3_X_3() {
        int[][] data = {{1, 2, 0}, {4, 5, 3}, {7, 8, 6}};
        Taquin t = new Taquin(data);
        int[] res = t.trouverTrou();
        int[] res2 = {0, 2};
        assertArrayEquals(res2, res);
    }

    @Test
    public void test_trouver_trou_coin_bd_3_X_3() {
        int[][] data = {{1, 2, 6}, {4, 5, 3}, {7, 8, 0}};
        Taquin t = new Taquin(data);
        int[] res = t.trouverTrou();
        int[] res2 = {2, 2};
        assertArrayEquals(res2, res);
    }

    @Test
    public void test_trouver_trou_coin_hd_4_X_4() {
        int[][] data = {{1, 2, 3 , 0}, {5, 6, 7 , 8}, {9, 10, 11 , 12},{13, 14, 15 , 4}};
        Taquin t = new Taquin(data);
        int[] res = t.trouverTrou();
        int[] res2 = {0, 3};
        assertArrayEquals(res2, res);
    }

    @Test
    public void test_trouver_trou_coin_bd_4_X_4() {
        int[][] data = {{1, 2, 3 , 4}, {5, 6, 7 , 8}, {9, 10, 11 , 12},{13, 14, 15 , 0}};
        Taquin t = new Taquin(data);
        int[] res = t.trouverTrou();
        int[] res2 = {3, 3};
        assertArrayEquals(res2, res);
    }

    @Test
    public void test_equals_vrai_3_X_3() {
        int[][] data = {{1, 2, 0}, {4, 5, 3}, {7, 8, 6}};
        Taquin t = new Taquin(data);
        int[][] data2 = {{1, 2, 0}, {4, 5, 3}, {7, 8, 6}};
        Taquin t2 = new Taquin(data2);
        assertEquals(t, t2);
    }

    @Test
    public void test_equals_faux_3_X_3() {
        int[][] data = {{1, 2, 0}, {4, 5, 3}, {7, 8, 6}};
        Taquin t = new Taquin(data);
        int[][] data2 = {{1, 2, 0}, {4, 3, 5}, {7, 8, 6}};
        Taquin t2 = new Taquin(data2);
        assertNotEquals(t, t2);
    }

    @Test
    public void test_equals_vrai_4_X_4() {
        int[][] data = {{1, 2, 3 , 4}, {5, 6, 7 , 8}, {9, 10, 11 , 12},{13, 14, 15 , 0}};
        Taquin t = new Taquin(data);
        int[][] data2 = {{1, 2, 3 , 4}, {5, 6, 7 , 8}, {9, 10, 11 , 12},{13, 14, 15 , 0}};
        Taquin t2 = new Taquin(data2);
        assertEquals(t, t2);
    }

    @Test
    public void test_equals_faux_4_X_4() {
        int[][] data = {{1, 2, 3 , 4}, {5, 6, 7 , 8}, {9, 10, 11 , 12},{13, 15, 14 , 0}};
        Taquin t = new Taquin(data);
        int[][] data2 = {{1, 2, 3 , 4}, {5, 6, 7 , 8}, {9, 10, 11 , 12},{13, 14, 15 , 0}};
        Taquin t2 = new Taquin(data2);
        assertNotEquals(t, t2);
    }

    @Test
    public void test_generer_Fils_coin_3_X_3() {
        int[][] data = {{1, 2, 0}, {4, 5, 3}, {7, 8, 6}};
        Taquin t = new Taquin(data);
        ArrayList<Taquin> res = t.genererFils();

        ArrayList<Taquin> res2 = new ArrayList<>();
        int[][] datafils1 = {{1, 2, 3}, {4, 5, 0}, {7, 8, 6}};
        Taquin fils1 = new Taquin(datafils1);
        int[][] datafils2 = {{1, 0, 2}, {4, 5, 3}, {7, 8, 6}};
        Taquin fils2 = new Taquin(datafils2);
        res2.add(fils1);
        res2.add(fils2);
        assertTrue(res.containsAll(res2) && res2.containsAll(res));
    }

    @Test
    public void test_generer_Fils_coin_2_X_3() {
        int[][] data = {{1, 0}, {4, 2}, {3, 5}};
        Taquin t = new Taquin(data);
        ArrayList<Taquin> res = t.genererFils();

        ArrayList<Taquin> res2 = new ArrayList<>();
        int[][] datafils1 = {{1, 2}, {4, 0}, {3, 5}};
        Taquin fils1 = new Taquin(datafils1);
        int[][] datafils2 = {{0, 1}, {4, 2}, {3, 5}};
        Taquin fils2 = new Taquin(datafils2);
        res2.add(fils1);
        res2.add(fils2);
        assertTrue(res.containsAll(res2) && res2.containsAll(res));
    }

    @Test
    public void test_generer_Fils_bg_4_X_4() {
        int[][] data = {{1, 2, 3 , 4}, {5, 6, 7 , 8}, {13, 10, 11 , 12},{0, 15, 14 , 9}};
        Taquin t = new Taquin(data);
        ArrayList<Taquin> res = t.genererFils();

        ArrayList<Taquin> res2 = new ArrayList<>();
        int[][] datafils1 = {{1, 2, 3 , 4}, {5, 6, 7 , 8}, {0, 10, 11 , 12},{13, 15, 14 , 9}};
        Taquin fils1 = new Taquin(datafils1);
        int[][] datafils2 = {{1, 2, 3 , 4}, {5, 6, 7 , 8}, {13, 10, 11 , 12},{15, 0, 14 , 9}};
        Taquin fils2 = new Taquin(datafils2);
        res2.add(fils1);
        res2.add(fils2);
        assertTrue(res.containsAll(res2) && res2.containsAll(res));
    }
}