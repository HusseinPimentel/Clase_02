/*
Programa para la Clase #2
 */
public class clase_02 {
    //Declaracion de variables
    int nume;
    char letra;
    double real;
    String hola;
    String nombre;

    /*
    Metodo que muestra algo
     */
 public void imprimir()
    {
      System.out.println("Clase #2");
      System.out.println("Mi Nombre -> " +nombre);
    }
    int resultado (int edad)
    {
      return edad+5;
    }
 public static void main (String[] arg)
    {
        // Estamos instanciando nuestro programa
        int temp;
        clase_02 n1 = new clase_02();
        n1.nombre = "Hussein Pimentel";
        n1.imprimir();

        temp = n1.resultado(10);
        System.out.println("El resultado es -> "+temp);

    }
}
