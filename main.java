
import java.util.Scanner;


public class main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int ruta = 0;
        int RutaOne = 1700;
        int RutaTwo = 17792;
        int RutaThr = 14456;
        int RutaFou = 21572;
        int RutaFiv = 12500;

        int edad = 0;
        int edadTwo = 0;
        int edadThr = 0;
        int edadFou = 0;
        int edadFiv = 0;
        
        int boleto = 0;
        int precio = 0;
        int precioTotal = 0;
        int desTerrcEdad = 0; // *60 / 100 //
        int desFrecuEdad = 0;
        int descNiñoEdad = 0; //*35 / 100;
        int desEstudEdad = 0;  //*35 / 100//
        int precioTotalBol = 0;
        int precioTotalDes = 0;
        int IVA = precioTotalDes * 16 / 100;
        
        //Menu//
        
        System.out.println("----------------------------------------------------------------------");
        System.out.println("-Opcion -                   Destino                 -     Precio     -");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("-   1   - México - New York   -   New York - México -   $100 usd     -");
        System.out.println("-   2   - México - Paris      -      Paris - México -   $800 euros   -");
        System.out.println("-   3   - México - Madrid     -     Madrid - México -   $650 euros   -");
        System.out.println("-   3   - México - Atenas     -     Atenas - México -   $970 euros   -");
        System.out.println("-   4   - México - Sao Paulo  -   Sao Pulo - México -   $12, 500 MXN -");
        System.out.println("----------------------------------------------------------------------");
        
        System.out.println("Introduce el numero de la ruta que quieres adquirir");
        ruta = s.nextInt();

//Rutas//
        
        if (ruta == 1) {  
            precio = RutaOne;
       }  
        if(ruta == 2){
        	precio = RutaTwo;
       }
        if(ruta == 3){
        	precio = RutaThr;       	
        }
        if(ruta == 4) {
        	precio = RutaFou;
        }
        if(ruta == 5) {
        	precio = RutaFiv;
       }
        

        
        //Boletos//
        
        System.out.println("Introduce la cantidad de boletos");
        boleto = s.nextInt();
        
        //Total//
        precioTotal = precio;

        
        
        //opcion
        if(boleto == 1) {
        	System.out.println("Introduce la edad de los pasajeros");
        	edad = s.nextInt();
        	 if( edad >= 0 && edad <= 17) {
        	     	
        	    	 System.out.println("Total con descuento para su boleto de menores de edad es: "+ precioTotal*35 / 100+ "en total");
        	    	 precioTotalDes =  precioTotal*35 / 100 ;
        	     }else {
        	    	 System.out.println(" "); 
        	     }
        	     if( edad <=18 && edad >=29) {
        	     	//precioTotalDes = desEstudEdad;
        	    	 System.out.println("Total con descuento para su boleto de estudiante es: "+ precioTotal*35 / 100+ "en total");
        	     } else {
        	    	 System.out.println(" "); 
        	     }
        	     if( edad <=30 && edad >=59) {
        	      	//precioTotalDes = desFrecuEdad;
        	    	 System.out.println("Total con descuento para su boleto regular es: "+ precioTotal+ "en total");
        	      } else {
         	    	 System.out.println(" "); 
         	     }
        	     if( edad >=60 && edad <=100) {
        	      	//precioTotalDes = desTerrcEdad;
        	    	 System.out.println("Total con descuento para su boleto de tercera edad es: "+ precioTotal*60 / 100+ "en total");
        	      } else {
         	    	 System.out.println(" "); 
         	     }
        	     
        }
        
        //opcion 2
        
        if(boleto == 2) {
        	System.out.println("Introduce la edad de los pasajeros");
        	edad = s.nextInt();
        	System.out.println("Introduce la edad de los pasajeros");
        	edadTwo = s.nextInt();
        	 if( (edad >= 0 && edad <= 17) || (edadTwo >=0 && edadTwo <= 17)) {
        	     	//precioTotalDes = descNiñoEdad;
        	    	 System.out.println("Total con descuento para su boleto de menores de edad es: "+ precioTotal*35 / 100+ "en total");
        	     } else {
        	    	 System.out.println(" "); 
        	     }
        	     if( (edad <=18 && edad >=29) || (edadTwo <= 18 && edadTwo >=29)) {
        	     	//precioTotalDes = desEstudEdad;
        	    	 System.out.println("Total con descuento para su boleto de estudiante es: "+ precioTotal*35 / 100+ "en total");
        	     }else {
        	    	 System.out.println(" "); 
        	     }
        	     if(( edad <=30 && edad >=59) || (edadTwo <=30 && edadTwo >=59)) {
        	      	//precioTotalDes = desFrecuEdad;
        	    	 System.out.println("Total con descuento para su boleto regular es: "+ precioTotal+ "en total");
        	      }else {
         	    	 System.out.println(" "); 
         	     }
        	     if( (edad >60 && edad <=100) || (edadTwo >=60 && edadTwo <=100)) {
        	      	//precioTotalDes = desTerrcEdad;
        	    	 System.out.println("Total con descuento para su boleto de tercera edad es: "+ precioTotal*60 / 100+ "en total");
        	      }else {
         	    	 System.out.println(" "); 
         	     }
        	     
        }
        
        //opcion 3
        
        if(boleto == 3) {
        	System.out.println("Introduce la edad de los pasajeros");
        	edad = s.nextInt();
        	System.out.println("Introduce la edad de los pasajeros");
        	edadTwo = s.nextInt();
        	System.out.println("Introduce la edad de los pasajeros");
        	edadThr = s.nextInt();
        
        	 if( (edad >= 0 && edad <= 17) || (edadTwo >=0 && edadTwo <= 17) || (edadThr >=0 && edadThr <= 17)) {
        	     	precioTotalDes =  precioTotal*35 / 100;
        	    	 System.out.println("Total con descuento para su boleto de menores de edad es: "+ precioTotal*35 / 100+ "en total");
        	     }else {
        	    	 System.out.println(" "); 
        	     }
        	     if( (edad <=18 && edad >=29) || (edadTwo <= 18 && edadTwo >=29) || (edadThr <= 18 && edadThr >=29)) {
        	     	precioTotalDes = precioTotal*35 / 100;
        	    	 System.out.println("Total con descuento para su boleto de estudiante es: "+ precioTotal*35 / 100+ "en total");
        	     }else {
        	    	 System.out.println(" "); 
        	     }
        	     if( (edad <=30 && edad >=59) || (edadTwo <=30 && edadTwo >=59) || (edadThr <=30 && edadThr >=59)) {
        	      	precioTotalDes =  precioTotal;
        	    	 System.out.println("Total con descuento para su boleto regular es: "+ precioTotal+ "en total");
        	      }else {
         	    	 System.out.println(" "); 
         	     }
        	     if( (edad >60 && edad <=100) || (edadTwo >=60 && edadTwo <=100) || (edadThr >=60 && edadThr <=100)) {
        	      	precioTotalDes = precioTotal*60 / 100;
        	    	 System.out.println("Total con descuento para su boleto de tercera edad es: "+ precioTotal*60 / 100+ "en total");
        	      }else {
         	    	 System.out.println(" "); 
         	     }
        	     }
        
        //opcion4
        
        if(boleto ==4) {
        	System.out.println("Introduce la edad de los pasajeros");
        	edad = s.nextInt();
        	System.out.println("Introduce la edad de los pasajeros");
        	edadTwo = s.nextInt();
        	System.out.println("Introduce la edad de los pasajeros");
        	edadThr = s.nextInt();
        	System.out.println("Introduce la edad de los pasajeros");
        	edadFou = s.nextInt();
        	 if( (edad >= 0 && edad <= 17) || (edadTwo >=0 && edadTwo <= 17) || (edadThr >=0 && edadThr <= 17) || (edadFou >=0 && edadFou <= 17) || ( edadFiv >=0 && edadFiv <= 17) ) {
        	     	//precioTotalDes = descNiñoEdad;
        	    	 System.out.println("Total con descuento para su boleto de menores de edad es: "+ precioTotal*35 / 100+ "en total");
        	     }else {
        	    	 System.out.println(" "); 
        	     }
        	     if( edad <=18 && edad >=29 || edadTwo <= 18 && edadTwo >=29 || edadThr <= 18 && edadThr >=29 || edadFou <= 18 && edadFou >=29 || edadFiv <=18 && edadFiv >=29 ) {
        	     	//precioTotalDes = desEstudEdad;
        	    	 System.out.println("Total con descuento para su boleto de estudiante es: "+ precioTotal*35 / 100+ "en total");
        	     }else {
        	    	 System.out.println(" "); 
        	     }
        	     if( edad <=30 && edad >=59 || edadTwo <=30 && edadTwo >=59 || edadThr <=30 && edadThr >=59 || edadFou <=30 && edadFou >=59 || edadFiv <=30 && edadFiv >=59 ) {
        	      	//precioTotalDes = desFrecuEdad;
        	    	 System.out.println("Total con descuento para su boleto regular es: "+ precioTotal+ "en total");
        	      }else {
         	    	 System.out.println(" "); 
         	     }
        	     if( edad >60 && edad <=100 || edadTwo >=60 && edadTwo <=100 || edadThr >=60 && edadThr <=100 || edadFou >=60 && edadFou <=100 || edadFiv >=60 && edadFiv <=100 ) {
        	      	//precioTotalDes = desTerrcEdad;
        	    	 System.out.println("Total con descuento para su boleto de tercera edad es: "+ precioTotal*60 / 100+ "en total");
        	      }else {
         	    	 System.out.println(" "); 
         	     }
        	     
        }
        //opcion4
        if(boleto == 5) {
        	System.out.println("Introduce la edad de los pasajeros");
        	edad = s.nextInt();
        	System.out.println("Introduce la edad de los pasajeros");
        	edadTwo = s.nextInt();
        	System.out.println("Introduce la edad de los pasajeros");
        	edadThr = s.nextInt();
        	System.out.println("Introduce la edad de los pasajeros");
        	edadFou = s.nextInt();
        	System.out.println("Introduce la edad de los pasajeros");
        	edadFiv = s.nextInt();
        	 if( edad <= 17 || edadTwo >=0 && edadTwo <= 17 || edadThr >=0 && edadThr <= 17 || edadFou >=0 && edadFou <= 17 ||  edadFiv >=0 && edadFiv <= 17 ) {
        	     	//precioTotalDes = descNiñoEdad;
        	    	 System.out.println("Total con descuento para su boleto de menores de edad es: "+ precioTotal*35 / 100+ "en total");
        	     }else {
        	    	 System.out.println(" "); 
        	     }
        	     if( edad <=18 && edad >=29 || edadTwo <= 18 && edadTwo >=29 || edadThr <= 18 && edadThr >=29 || edadFou <= 18 && edadFou >=29 || edadFiv <=18 && edadFiv >=29 ) {
        	     	//precioTotalDes = desEstudEdad;
        	    	 System.out.println("Total con descuento para su boleto de estudiante es: "+ precioTotal*35 / 100+ "en total");
        	     }else {
        	    	 System.out.println(" "); 
        	     }
        	     if( edad <=30 && edad >=59 || edadTwo <=30 && edadTwo >=59 || edadThr <=30 && edadThr >=59 || edadFou <=30 && edadFou >=59 || edadFiv <=30 && edadFiv >=59 ) {
        	      	//precioTotalDes = desFrecuEdad;
        	    	 System.out.println("Total con descuento para su boleto regular es: "+ precioTotal+ "en total");
        	      }else {
         	    	 System.out.println(" "); 
         	     }
        	     if( edad >60 && edad <=100 || edadTwo >=60 && edadTwo <=100 || edadThr >=60 && edadThr <=100 || edadFou >=60 && edadFou <=100 || edadFiv >=60 && edadFiv <=100 ) {
        	      	//precioTotalDes = desTerrcEdad;
        	    	 System.out.println("Total con descuento para su boleto de tercera edad es: "+ precioTotal*60 / 100 + "en total");
        	      }else {
         	    	 System.out.println(" "); 
         	     }
        	     
        }
      
        precioTotalBol = precioTotal* boleto;
    
        System.out.println("La Ruta es " + ruta + " numero de boletos " + boleto + " seria " + precioTotalBol + "el total con descuento es" + precioTotalDes+ IVA   ) ;

}

        }
