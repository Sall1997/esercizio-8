public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        boolean a =  2 <= 2 && !true; // false perchè  2 <= 2  ma "!true" diventa falso
        boolean b = !false && 3 > 2; // true perchè !false(TRUE)  && 3 > 2(TRUE)

        boolean t = false;
        boolean f = true;

        boolean c = !(!t || f); /* falso perchè il "!" dentro parentesi fa diventare t= true e poi il "!"
                                   nella parentesi fa diventare t e f falsi*. Quindi nessuna delle 2 comparazioni
                                   è true*/

        boolean d = 6 > 6 ^ !(true && true); /* falso perchè l'operatore XOR restituisce "true" solo se i suoi operandi
                                                sono diversi */
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}