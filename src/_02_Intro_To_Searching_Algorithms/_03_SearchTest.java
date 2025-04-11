package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] strs1 = {"asdfr", "sienu", "sdhfne", "vtfo", "iafs", "dfhrb"};
    	String[] strs2 = {"erhno", "iohaw", " sdibf", "ausd", "ahsdf", "sgu", "wibuf", "aiwube"};
        assertEquals(4, _01_LinearSearch.linearSearch(strs1, "iafs"));
        assertEquals(-1, _01_LinearSearch.linearSearch(strs2, "wertyu"));
        assertEquals(7, _01_LinearSearch.linearSearch(strs2, "aiwube"));

}

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] ints1 = {9, 21, 51, 98, 102, 128, 248, 429, 758, 912};
    	int[] ints2 = {12, 23, 44, 73, 84, 92, 102, 123, 274, 292, 342, 541, 1239, 12749, 12789};
        assertEquals(7, _02_BinarySearch.binarySearch(ints1, 429));
        assertEquals(0, _02_BinarySearch.binarySearch(ints2, 12));
        assertEquals(14, _02_BinarySearch.binarySearch(ints2, 12789));
    }
}
