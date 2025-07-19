package chapter1.fundamentals.basic_programming_model.notes;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 *  Array operations
 */
public class ArrayOperations {
    
    /**
     * Find the maximum value in an array
     */
    public static double findMax(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
    /**
     * Compute the average of array values
     */
    public static double computeAverage(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        
        double sum = 0.0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }
    
    /**
     * Copy an array to a new array
     */
    public static double[] copyArray(double[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        
        double[] copy = new double[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);
        return copy;
    }
    
    // Test client
    public static void main(String[] args) {
        // Create a sample array
        double[] values = new double[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = StdRandom.uniform(0.0, 100.0);
        }
        
        // Test findMax
        double max = findMax(values);
        StdOut.println("Array values:");
        for (double v : values) {
            StdOut.printf("%.2f ", v);
        }
        StdOut.printf("%nMaximum value: %.2f%n", max);
        
        // Test computeAverage
        double avg = computeAverage(values);
        StdOut.printf("Average value: %.2f%n", avg);
        
        // Test copyArray
        double[] copy = copyArray(values);
        StdOut.println("\nOriginal array and its copy:");
        for (int i = 0; i < values.length; i++) {
            StdOut.printf("Original[%d]=%.2f, Copy[%d]=%.2f%n", 
                         i, values[i], i, copy[i]);
        }
    }
}