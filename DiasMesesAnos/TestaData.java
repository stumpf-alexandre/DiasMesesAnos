package DiasMesesAnos;

import java.util.Scanner;

/**
 * Created by als on 11/08/2017.
 */
public class TestaData{
    public static void main(String[] args) {
        int d;
        int m;
        int a;
        Data data=new Data();
        Scanner tc=new Scanner(System.in);
        System.out.println("Digite uma data: ");
        d=tc.nextInt();
        System.out.println("Digite um mes:");
        m=tc.nextInt();
        m=data.validarMeses(d, m);
        System.out.println("Digite um ano");
        a=tc.nextInt();

        System.out.println("Dia "+d);
        System.out.println("Mes "+m);
        System.out.println("Ano "+a);
    }
}
