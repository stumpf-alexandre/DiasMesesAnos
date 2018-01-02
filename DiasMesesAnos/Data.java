package DiasMesesAnos;

import java.util.Scanner;

/**
 * Created by als on 09/08/2017.
 */
public class Data {


    public int validarMeses(int dia, int mes){
        Scanner tc =new Scanner(System.in);
        if (dia>=29 && mes==2){
             do{
                 System.out.println("Mes invalido");
                 System.out.println("Digite um mes valido: ");
            }while (mes!=2);
            mes=tc.nextInt();
        }
        else if (dia>=30 && mes==4 || mes==6 || mes==9 || mes==11){
             do{
                 System.out.println("Mes invalido");
                 System.out.println("Digite um mes valido: ");
            }while (!(mes==4||mes==6||mes==9||mes==11));
            mes=tc.nextInt();
        }
        return mes;
    }
}
