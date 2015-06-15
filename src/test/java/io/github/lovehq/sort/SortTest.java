package io.github.lovehq.sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static io.github.lovehq.common.Utils.*;
import static org.junit.Assert.*;

public abstract class SortTest {

    public abstract Sort getInstance();

    private Sort sort;
    private static final Random random = new Random();

    @Before
    public void setUp(){
        sort = getInstance();
    }

    @Test
    public void test10(){
        test(10);
    }
    @Test
    public void test50(){
        test(50);
    }
    @Test
    public void test100(){
        test(100);
    }

    private void test(int size){
        //initial sorted array
        Integer[] testData = makeTestArray(size);
        sort.sort(testData);
        assertSorted(testData);

        //reversed array
        reverseArray(testData);
        sort.sort(testData);
        assertSorted(testData);

        //shuffled array
        shuffle(testData);
        sort.sort(testData);
        assertSorted(testData);
    }

    private Integer[] makeTestArray(int capacity){
        assertTrue(capacity > 0);
        Integer[] result = new Integer[capacity];
        for(int i = 0; i < capacity; i++){
            result[i] = i + 1;
        }
        return result;
    }

    private void reverseArray(Object[] array){
        int length = array.length;
        for(int i = 0; i < length / 2; i++){
            swap(array, i, length - i - 1);
        }
    }


    // Knuth shuffle
    private void shuffle(Object[] array) {
        int n = array.length;
        while (n > 1) {
            int k = random.nextInt(n--); //decrements after using the value
            swap(array, n, k);
        }
    }

    private void assertSorted(Comparable[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i+1]) > 0) {
                fail("Not sorted");
            }
        }
    }

}
