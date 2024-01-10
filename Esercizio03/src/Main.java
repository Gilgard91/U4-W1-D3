//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(7, 4);
        Rettangolo rettangolo2 = new Rettangolo(8, 6);

        System.out.println("RETTANGOLO 1:");
        stampaRettangolo(rettangolo1);
        System.out.println("RETTANGOLO 2:");
        stampaRettangolo((rettangolo2));
        System.out.println("Entrambi i rettangoli:");
        stampaDueRettangoli(rettangolo1, rettangolo2);


    }

    public static void stampaRettangolo(Rettangolo rettangolo){
        System.out.println("L'area del rettangolo é: " + rettangolo.getArea() + "cm²");
        System.out.println("Il perimetro del rettangolo è: " + rettangolo.getPerimetro() + "cm");
    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2){

        System.out.println(("RETTANGOLO 1:"));
        stampaRettangolo(rettangolo1);
        System.out.println(("RETTANGOLO 2:"));
        stampaRettangolo(rettangolo2);

        int sommaAree = rettangolo1.getArea() + rettangolo2.getArea();
        int sommaPerimetri = rettangolo1.getPerimetro() + rettangolo2.getPerimetro();

        System.out.println("La somma delle aree è: " + sommaAree + "cm²");
        System.out.println("La somma dei perimetri è: " + sommaPerimetri + "cm");
    }
}