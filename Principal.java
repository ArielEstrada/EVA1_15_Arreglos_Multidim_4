
import java.util.Scanner;



/**
 *
 * @author Ariel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] iEdades;
        int iNoGrp, iNoAlu;//Cantidad ee grupos y alumnos
        Scanner scCaptu = new Scanner(System.in);
        
        System.out.println("Introduce el numero de grupos: ");
        iNoGrp = scCaptu.nextInt();// El numero de grupos son las filas del arreglo
        iEdades = new int[iNoGrp][];
        
        for (int i = 0; i < iEdades.length; i++) {
            System.out.println("Cuantos Alumnos tiene el Grupo "+ (i+1) + ":");
            iNoAlu = scCaptu.nextInt();
            iEdades[i] = new int [iNoAlu]; //Para cada fila definen # de columnas
            
        }
        
        
        //Captura de las edades:
        for (int i = 0; i < iEdades.length; i++) {//Filas
            for (int j = 0; j < iEdades[i].length; j++) {
                System.out.println("Cual es la edad grupo " +i+ " Alumno "+j+"?");
                iEdades[i][j] = scCaptu.nextInt();
            }
        }
        //Imprimir las edades Capturadas
        for (int i = 0; i < iEdades.length; i++) {//Filas
            for (int j = 0; j < iEdades[i].length; j++) {
                System.out.println("La edad  de grupo " +i+ " Alumno " +j+ " es: "+ iEdades[i][j]);
            }
        }
        //Calcular el prom de edades
        int iAcum, iAcumTodos=0, iAcumAlum=0;
        for (int i = 0; i < iEdades.length; i++) {//Filas
            iAcum = 0;
            iAcumAlum= iAcumTodos +iEdades[i].length;
            for (int j = 0; j < iEdades[i].length; j++) {
               iAcum = iAcum + iEdades[i][j];
               iAcumTodos = iAcumTodos + iEdades[i][j];
               
            }
            System.out.println("El promedio del grupo "+ i + "="+ (iAcum/iEdades[i].length));
        }
        System.out.println("El promedio general es: "+ (iAcumTodos/iAcumAlum));
        
    }
    
}