public class Main {
    public static void main(String[] args) {
        bank klient1 = new bank("Jan", "Kowalski", 100.00);
        bank klient2 = new bank("Piotr", "Nowak", 300.00);
        System.out.println(klient1);
        System.out.println(klient1.wplata(20.00));
        System.out.println(klient1);
        System.out.println(klient1.wyplata(10.00));
        System.out.println(klient1);
        System.out.println(klient2);
        System.out.println(klient1.przelew(klient2,2.00));
        System.out.println(klient1);
        System.out.println(klient2);
        System.out.println(klient1.equals(klient2));


    }
}