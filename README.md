# 📘 Algorithms, 4th Edition – Part I

Ce repo contient tous les exercices de la Partie I du livre de Sedgewick & Wayne.

## 🚀 Configuration du projet

### Prérequis
- Java 17 ou supérieur
- Maven 3.6 ou supérieur

### Installation
1. Cloner le dépôt :
   ```bash
   git clone [URL_DU_REPO]
   cd algorithms-4e-part1
   ```

2. La bibliothèque algs4.jar est déjà incluse dans le dossier `lib/`

## 🛠 Structure du projet
```
src/main/java/
├── chapter1/     # Chapitre 1 - Fondamentaux
│   ├── 1.1-basic-programming-model/
│   ├── 1.1-basic-programming-model/
│   │   ├── Exercise_1_1_01.java
│   │   ├── ArrayOperations.java
│   │   └── ...
│   └── ...
└── ...
```

## 🏃 Exécution des exercices

### Compilation
```bash
mvn clean compile
```

### Exécution d'un exercice
```bash
# Exemple pour exécuter l'exercice 1.1.1
mvn exec:java -Dexec.mainClass="Exercise_1_1_01"

# Exemple pour exécuter les opérations sur les tableaux
mvn exec:java -Dexec.mainClass="chapter1.fundamentals.basic_programming_model.notes.ArrayOperations"
```

## 📚 Bibliothèque algs4

Le projet utilise la bibliothèque algs4.jar de Princeton, qui fournit des classes utilitaires pour les algorithmes et les structures de données, notamment :
- `StdOut` pour l'affichage formaté
- `StdIn` pour la lecture d'entrées
- `StdRandom` pour la génération de nombres aléatoires
- `StdDraw` pour le dessin

### Exemple d'utilisation
```java
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Example {
    public static void main(String[] args) {
        double r = StdRandom.uniform();  // Nombre aléatoire entre 0 et 1
        StdOut.printf("Nombre aléatoire: %.2f%n", r);
    }
}
```

## 📝 Notes
- Les solutions sont organisées par chapitre et section comme dans le livre
- Chaque exercice est dans son propre fichier
- Les noms de fichiers suivent la convention `Exercise_CH_S_XX`

## 📖 Références
- [Site officiel du livre](https://algs4.cs.princeton.edu/home/)
- [Documentation de la bibliothèque algs4](https://algs4.cs.princeton.edu/code/)
