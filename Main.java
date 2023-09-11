import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, biyoloji, müzik, turkce, sosyal ;
        Scanner inp = new Scanner (System.in);
        System.out.print("Matematik notunuzu giriniz :") ;
        mat = inp.nextInt() ;

        System.out.print("fizik notunuzu giriniz :") ;
        fizik = inp.nextInt() ;

        System.out.print("kimya notunuzu giriniz :") ;
        kimya = inp.nextInt() ;

        System.out.print("biyoloji notunuzu giriniz :") ;
        biyoloji = inp.nextInt() ;

        System.out.print("müzik notunuzu giriniz :") ;
        müzik = inp.nextInt() ;

        System.out.print("turkce notunuzu giriniz :") ;
        turkce = inp.nextInt() ;

        System.out.print("sosyal notunuzu giriniz :") ;
        sosyal = inp.nextInt() ;
        double ortalama = (mat + kimya + biyoloji + fizik + müzik + turkce + sosyal ) / 7 ;
        System.out.println("Ortalamanız "  +  ortalama) ;
        double  a = ortalama ;
        boolean kosul1 = a <60.0 ;
        boolean kosul2 = a >60.0 ;
        boolean durum = kosul1 && kosul2 ;
        String str = durum ? "Geçtiniz" : "Kaldınız" ;
        System.out.println(str) ;
    }
}