public class bank {
    private String imie;
    private String nazwisko;
    private Double stanKonta;

    public bank(String imie, String nazwisko, Double stanKonta) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanKonta = stanKonta;
    }

    private String getImie() {
        return imie;
    }

    private void setImie(String imie) {
        this.imie = imie;
    }

    private String getNazwisko() {
        return nazwisko;
    }

    private void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    private Double getStanKonta() {
        return stanKonta;
    }

    private void setStanKonta(Double stanKonta) {
        this.stanKonta = stanKonta;
    }

    public String wplata (Double kwota){
        stanKonta = stanKonta + kwota;
        return "Wpłacono " + kwota + "PLN. Obecnie na koncie jest " + stanKonta+"PLN.";
    }

    public String wyplata(Double kwota){
        stanKonta = stanKonta - kwota;
        return "Wypłacono " + kwota + "PLN. Obecnie na koncie jest " + stanKonta+"PLN.";
    }

    public String przelew (bank klient, Double kwota){
        wyplata(kwota);
        klient.wplata(kwota);
        return "Wykonano przelew do %s %s w wysokości %.2f PLN.".formatted(klient.imie, klient.nazwisko, kwota);
    }

    @Override
    public String toString() {
        return "Na koncie "+ imie + " "+nazwisko+" jest "+stanKonta+"PLN.";
    }
}
