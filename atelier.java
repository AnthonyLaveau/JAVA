package com.atelier;

public class DiagnosticQuiz {
    public static void main(String[] args) {
        // 1. Barème du quiz
        int a = 30;
        int b = 3;
        double ratio = (double) a / b;
        var coef = 2.5f;

        // 2. Points obtenus : 1 = bonne réponse, 0 = mauvaise
        int[] valeurs = {1, 0, 1};
        double total = 0;

        for (int i = 0; i < valeurs.length; ++i) {
            total += valeurs[i] * ratio;
        }

        // 3. Seuil de réussite
        int x = 10;
        {
            int y = 10;
            x += y;
        }

        // 4. Question bonus : réponse attendue et réponse donnée
        String s1 = "Java2026";
        String s2 = new String("Java2026");
        boolean memeTexte = s1.equals(s2);

        if (memeTexte) {
            total += coef;
        }

        // 5. Bilan du quiz
        System.out.println("Points par bonne réponse : " + ratio);
        System.out.println("Réponse bonus correcte ? " + memeTexte);
        System.out.println("Score : " + total);
        System.out.println("Seuil de réussite : " + x);
        System.out.println(
            "Diagnostic : " + (total >= x ? "niveau acquis" : "à réviser")
        );
    }
}
