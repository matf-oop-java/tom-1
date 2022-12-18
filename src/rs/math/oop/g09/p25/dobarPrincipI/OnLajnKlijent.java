package rs.math.oop.g09.p25.dobarPrincipI;

public class OnLajnKlijent {
   private String ime;
   private String adresa;
   private String email;
   private Porudzbina porudzbina;
   private Placanje placanje;


   public OnLajnKlijent(String ime, String adresa, String email,
                        Porudzbina porudzbina, Placanje placanje) {
      this.ime = ime;
      this.adresa = adresa;
      this.email = email;
      this.porudzbina = porudzbina;
      this.placanje = placanje;
   }

   public Porudzbina uzmiPorudzbina() {
      return porudzbina;
   }

   public void setPorudzbina(Porudzbina porudzbina) {
      this.porudzbina = porudzbina;
   }

   public Placanje uzmiPlacanje() {
      return placanje;
   }

   public void setPlacanje(Placanje placanje) {
      this.placanje = placanje;
   }

}
