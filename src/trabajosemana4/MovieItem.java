

package trabajosemana4;

import java.util.Calendar;


public class MovieItem extends BlockBusterItem {

   private boolean estreno;
    //constructor
   public MovieItem(String nombre,int codigo,int precioRenta){
       super(nombre,codigo,precioRenta);
       estreno=true;
   }
   //funciones
   @Override
   public double pagoRenta(int dias){
   
       if(estreno==true&&dias>2){
       int retraso=dias-2;
       return pagoRenta(retraso*50);
       
       }else if(estreno==false&&dias>5){
       int retraso=dias-5;
       return pagoRenta(retraso*30);
       
       }else{
       return 0;
       }
   }
    //Fecha Importante Leer
   public void reEvaluarEstado(){
       Calendar f1=Calendar.getInstance();
       int mesActual=f1.get(Calendar.MONTH)+1;
       int mesSaco=fecha.get(Calendar.MONTH)+1;
       
       if(mesActual-mesSaco==5){
           estreno=false;
       }else{
           estreno=true;
       }
   }
    
    
}
