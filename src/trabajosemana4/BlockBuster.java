
package trabajosemana4;

import java.util.ArrayList;
import java.util.Scanner;


public class BlockBuster {
    ArrayList<BlockBusterItem> arr;
    private static final int  movie = 1;
    private static final int game = 2;
    
    Scanner sc = new Scanner(System.in);
    public BlockBuster(){
        arr = new ArrayList<>();
    }
    public BlockBusterItem buscarItem(int codigo,int tipo){
        if(arr.size()> 0){
            for(BlockBusterItem i: arr){
                if(i.codigo == codigo){
                    if(tipo == movie && i.getClass().getName().equals("trabajosemana4.MovieItem")){
                        return i;
                    }
                    else if(tipo == game && i.getClass().getName().equals("trabajosemana4.VideoGameItem")){
                        return i;
                    }
                    else{continue;}
                }
            }
            return null;
        }
        return null;
    }
    public void agregarItem(int codigo, String nombre, int tipo){
            if(buscarItem(codigo, tipo) == null){
                if(tipo == 1 || tipo == 2){
                    if(tipo == 1){
                        System.out.print("Porfavor ingrese el precio de renta de la pelicua: ");
                        int prec = sc.nextInt();
                        BlockBusterItem nw = new MovieItem(nombre, codigo,prec);
                        arr.add(nw);
                    }
                    else{
                        System.out.print("Porfavor ingrese el precio de renta de el videoJuego: ");
                        int prec = sc.nextInt();
                        System.out.print("\nAhora ingrese para que consola es el videojuego: ");
                        String nomb = sc.next();
                        BlockBusterItem nw = new VideoGameItem(nombre, codigo, prec, nomb);
                        arr.add(nw);
                    }
                }
                else{
                    System.out.println("No existe ese numero de tipo");
                }
            }
            else{
                System.out.println("Ya existe ese codigo");
            }
    }
    
    public void rentar(int codigo, int tipo, int dias ){
        try {
            BlockBusterItem itm = buscarItem(codigo, tipo);
            System.out.println(itm.toString());
        } catch (Exception e) {
            System.out.println("Item no existente");
        }
    }
    
    public void auditarMovieEstados(int n){
       if(arr.size() == n){
           System.out.println("Termino de auditar");
       }
       else{
           if(arr.get(n).getClass().getName().equals("trabajosemana4.MovieItem")){
               MovieItem mi = (MovieItem) arr.get(n);
               mi.reEvaluarEstado();
           }
           auditarMovieEstados(n +1);
       }
   }
}


    
