package rs.math.oop.g09.p19.losPrincipS;

public class Zaposleni{
   private String ime;
   private String prezime;
   private String opisPosla;
   private double plata;

   public Zaposleni(String ime, String prezime, String opisPosla, double plata) {
      this.ime = ime;
      this.prezime = prezime;
      this.opisPosla = opisPosla;
      this.plata = plata;
   }

   public Zaposleni(){
      this("","", "", 0);
   }
   public String uzmiIme(){
      return ime;
   }

   public void postaviIme(String ime) {
      this.ime = ime;
   }

   public String uzmiPrezime(){
      return prezime;
   }

   public void postaviPrezime(String prezime) {
      this.prezime = prezime;
   }

   public String uzmiOpisPosla(){
      return opisPosla;
   }

   public void postaviOpisPosla(String opisPosla) {
      this.opisPosla = opisPosla;
   }

   public double uzmiPlatu(){
      return plata;
   }

   public void postaviPlatu(double plata) {
      this.plata = plata;
   }

   @Override
   public String toString() {
      return "[име: " + ime + " " + prezime + ", посао: '" + opisPosla
            + "', плата: " + plata + "]";
   }

   public int sacuvajBazaPodataka(){
      System.out.println("Чува информација о примерку класе '"
              + this.getClass().getSimpleName() + "' у бази података.");
      System.out.println("Чувају се следећи подаци: " + this);
      // овде треба да буду наредбе за чување објекта у базу
      return 0;
   }
}
