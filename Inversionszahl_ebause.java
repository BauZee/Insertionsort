package adsaufgabe1;

public class Inversionszahl_ebause implements IInversionszahl {
    
    public Inversionszahl_ebause(){

    }

    public int berechne(String[] feld) {
        /*
         * Die Umsetzung von Insertionsort wurde entsprechend den Lehrinhalten der Vorlesung gestaltet.
         */
        
        int inversionsZahl = 0;
        
        for(int i = 1; i < feld.length; i++) {
            String neu = feld[i];
            int k = i;
            while(k > 0 && compareStrings(feld[k - 1], neu) > 0) {
                feld[k] = feld[k - 1];
                k--;
            }
            feld[k] = neu;
            if(k != i) {
                inversionsZahl += i - k;
            }
        }
        return inversionsZahl;
    }

    private int compareStrings(String s, String t){
        
        /* 
         * Speichere die Indexe des ersten Auftretens von 'a' in den Zeichenketten s und t.
         * Hier hatte sich die indexOf-Methode besser geeignet, als die chatAt()-Methode.
        */

        int aIndexS = s.indexOf('a');
        int aIndexT = t.indexOf('a');

        // Speichere die Indexe des letzten Auftretens von 'b' in den Zeichenketten s und t.
        int bIndexS = s.lastIndexOf('b');
        int bIndexT = t.lastIndexOf('b');

        /*
         * // Überprüfe Fall 1: Das erste Vorkommen von 'a' in Zeichenkette s liegt vor dem ersten Vorkommen von 'a' in Zeichenkette t.
         * Wenn der Rückgabewert von checkCaseOne nicht null ist (dh. s < t oder s > t), geben wir diesen Wert direkt zurück & speichern
         * diesen in der Variable caseOneResult.
         * Wenn s = t für Fall 1), überprüfen wir Fall 2, um die  Reihenfolge zwischen s und t zu bestimmen.
         * Dazu wird die Methode checkCaseTwo aufgerufen, die die Positionen der letzten Vorkommen von 'b' in s und t vergleicht & endgültig returnt.
         */
        int caseOneResult = checkCaseOne(aIndexS, aIndexT);
        if(caseOneResult != 0){
            return caseOneResult;
        }else{
            return checkCaseTwo(s, t, bIndexS, bIndexT);
        }

    }

    private int checkCaseOne(int aIndexS, int aIndexT){
        
        /* Überprüfe, ob 'a' im String s vorkommt 
        -> setze den Index auf ∞, wenn 'a' nicht gefunden wird; Andernfalls bleibt der Index unverändert. */   
        if (aIndexS == -1){
            aIndexS = Integer.MAX_VALUE;
        }
        
        /* Überprüfe, ob 'a' im String t vorkommt 
        -> Setze den Index auf ∞, wenn 'a' nicht gefunden wird; Andernfalls bleibt der Index unverändert. */         
        if(aIndexT == -1){
            aIndexT = Integer.MAX_VALUE;
        }

        /* Überprüfe, ob das erste Vorkommen von 'a' in String s (am Index i) vor dem ersten Vorkommen von 
        'a' in String t (am Index j) passiert.
        Returne -1, falls (i < j).*/ 
        if(aIndexS < aIndexT){
            return -1;
        }
        /* Überprüfe, ob das erste Vorkommen von 'a' in String t vor dem ersten Vorkommen von 'a' in String s liegt
         Returne 1, falls (i > j)
         */
        else if (aIndexS > aIndexT){
            return 1;
        }
        /* Falls das erste Vorkommen von 'a' in s und t gleich sind (i=j), returne 0 */
        else{
            return 0;
        }
    }

    private int checkCaseTwo(String s, String t, int bIndexS, int bIndexT){
        
         /* Überprüfe, ob 'b' im String s vorkommt 
        -> Setze den Index auf ∞, wenn 'b' nicht gefunden wird; Andernfalls bleibt der Index unverändert. */  
        if (bIndexS == -1){
            //Setze den Index von S auf unendlich
            bIndexS = Integer.MAX_VALUE;
        }
        
         /* Überprüfe, ob 'b' im String t vorkommt 
        -> Setze den Index auf ∞, wenn 'b' nicht gefunden wird; Andernfalls bleibt der Index unverändert. */ 
        if(bIndexT == -1){
            //Setze den Index von t auf unendlich
            bIndexT = Integer.MAX_VALUE;
        }
    // Vergleiche die Abstände der letzten Vorkommen von 'b' zu den Enden der Strings s und t.

        return Integer.compare(s.length() - bIndexS, t.length() - bIndexT);

    }
}

    
