import java.util.Scanner;
public class Avarage {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
    int mat,fiz,tur,kim,muz,avarage;
        System.out.print("Turkce Notu:");
       tur=in.nextInt();
        System.out.print("Fizik Notu:");
        fiz=in.nextInt();
        System.out.print("Matematik Notu:");
        mat=in.nextInt();
        System.out.print("Kimya Notu:");
        kim=in.nextInt();
        System.out.print("Muzik Notu:");
        muz=in.nextInt();
        if(tur<0||tur>100)
            tur=0;
        if(mat<0||mat>100)
            mat=0;
        if(fiz<0||fiz>100)
            fiz=0;
        if(muz<0||muz>100)
            muz=0;
        if(kim<0||kim>100)
            kim=0;
        avarage=(mat+fiz+tur+kim+muz)/5;
        if(avarage<=55)
            System.out.println("Kaldiniz");
        else
            System.out.println("Gectiniz");
        System.out.println("0rtalamaniz:"+avarage);


    }
}
