package chapter1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class TestAlgs4 {
    public static void main(String[] args) {
        // Test de la sortie standard
        StdOut.println("Test de la bibliothèque algs4");
        
        // Test de la génération de nombres aléatoires
        int n = 5;
        StdOut.println("Génération de " + n + " nombres aléatoires :");
        for (int i = 0; i < n; i++) {
            double r = StdRandom.uniformDouble();
            StdOut.printf("  %d: %.4f%n", i+1, r);
        }
        
        // Test du formatage de sortie
        double pi = 3.14159;
        StdOut.printf("Valeur de π avec 2 décimales: %.2f%n", pi);
        
        // Test de la fonction mathématique
        double x = 2.0;
        double y = 4.0;
        StdOut.printf("Test mathématique: %.2f^%.2f = %.2f%n", x, y, Math.pow(x, y));
    }
}
