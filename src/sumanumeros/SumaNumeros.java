/*
 2. Escriba un algoritmo que obtenga la suma e imprima además los términos de la siguiente
serie:
2, 5, 7, 10, 12, 15, 17, ..., 1800
 */
package sumanumeros;

/**
 *
 * @author Antonio Aranda
 */
public class SumaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int secuencia[]={0,2,5,7};
        
        int suma = 0;
        
        for(int i= 0; i<1800; i+=10)
        {
            for(int j=0;j<4;j++)
            {
                suma += (i+secuencia[j]);
                
                System.out.println(i+secuencia[j]);
            }
        }
        
        System.out.println("1800");
        System.out.println("La suma es: "+suma);
        
    }
    
}
