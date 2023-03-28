
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
public class KitleEndeksHesaplama {
    public static void main(String[] args) {
        double boy,kilo,endeks;
        Scanner input=new Scanner(System.in);
        System.out.print("Boyunuzu Metre Cinsinden giriniz:");
        boy=input.nextDouble();
        System.out.print("Kilonuzu Kilogram cinsinde giriniz :");
        kilo= input.nextDouble();
        endeks=kilo/(boy*boy);
        System.out.print("Vücut Kitle Endeksini:"+endeks);


    }
}
