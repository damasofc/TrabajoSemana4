
package trabajosemana4;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
    BlockBuster bb=new BlockBuster();
    Scanner sc=new Scanner(System.in);
    String resp="Si";
    
    int opc;
    
    
    
    do{
        System.out.println("*****Menu***** \n1.Buscar Item \n2.Agregar Item \n"
                + "3. renta \n4.Auditoria \n5.Salir");
        opc=sc.nextInt();
        
        switch (opc) {
            case 1:
                int cod;
                int tip;
                System.out.println("ingrese codigo");
                cod=sc.nextInt();
                System.out.println("Ingrese tipo sea 1 movie o 2 game");
                tip=sc.nextInt();
                bb.buscarItem(cod, tip);
                break;
            case 2:
                bb.agregarItem(opc, resp, opc);
                break;
            case 3:
                bb.rentar(opc, opc, opc);
                break;
            case 4:
                bb.auditarMovieEstados();
                break;
            case 5:
                break;  
        }
        
    
    }while (resp=="Si");
    
    }
   
    
    
    
    
    
}
