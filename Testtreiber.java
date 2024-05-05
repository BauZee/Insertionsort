package adsaufgabe1;

public class Testtreiber {
    public static void main (String[] args) {
	IInversionszahl invz = new Inversionszahl_ebause2();
	int inv;
	
	// Tesfall 1
	String[] feld1 = { "aaa", "bba", "aba", "aab" };
	int inv1 = 5; 
	inv = invz.berechne(feld1);
	if (inv == inv1)
	    System.out.println("Testfall 1 erfolgreich");
	else
	    System.out.println("Fehler bei der Bearbeitung von Testfall 1 ("+inv+" statt "+inv1+")");

	
	// Testfall 2
	String[] feld2 = { "aba", "baaza", "cccba", "abab", "bab", "baaaa", "bazbab" };
	int inv2 = 9;
	inv = invz.berechne(feld2);
	if (inv == inv2)
	    System.out.println("Testfall 2 erfolgreich");
	else
	    System.out.println("Fehler bei der Bearbeitung von Testfall 2 ("+inv+" statt "+inv2+")");

	// Testfall 3
	String[] feld3 = { "abc", "abfds", "abbbbaaa", "fff", "ddd", "bbabba", "babababababa", "bbb", "aaa", "bazbab", "aeioub" };
	int inv3 = 27;
	inv = invz.berechne(feld3);
	if (inv == inv3)
		System.out.println("Testfall 3 erfolgreich");
	else
		System.out.println("Fehler bei der Bearbeitung von Testfall 3 ("+inv+" statt "+inv3+")");

	// Testfall 3
	String[] feld4 = { "abcenu", "awjvndskb", "nnewbbbaaa", "abbbbbb", "bbbabbab", "bbbbaaaaa", "mmbbbbabba", "abcdefg", "fafafafabb", "aaabbbffff" };
	int inv4 = 20;
	inv = invz.berechne(feld4);
	if (inv == inv4)
		System.out.println("Testfall 3 erfolgreich");
	else
		System.out.println("Fehler bei der Bearbeitung von Testfall 3 ("+inv+" statt "+inv4+")");

	
	// Testfall 3
	String[] feld5 = { "kjkjaaab", "dhkdfjjd", "uihfdjhskb", "sdajekwjrlwer", "akjdsfhaksdfhka", "kjghlkjhlkjgk" };
	int inv5 = 8;
	inv = invz.berechne(feld5);
	if (inv == inv5)
		System.out.println("Testfall 3 erfolgreich");
	else
		System.out.println("Fehler bei der Bearbeitung von Testfall 3 ("+inv+" statt "+inv5+")");

	}}