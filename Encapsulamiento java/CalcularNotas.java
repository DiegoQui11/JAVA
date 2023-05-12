import java.util.Scanner;

public class CalcularNotas{
    public static void main(String[] args) {
        // creacion o instanciacion de un objeto
        Numeros notas = new Numeros();
        String nom;
        float n1,n2;  // captura de notas

        // uso de clase Scanner
        Scanner captura=new Scanner(System.in);

        System.out.println("Digite el nombre del estudiante");
        nom=captura.next();

        // Capturar las notas

        System.out.println("Digite las notas numero 1 para el estudiante");
        n1=captura.nextFloat();

        System.out.println("Digita la nota numero 2 para el estudiante");
        n2=captura.nextFloat();


        notas.setNombre(nom);
        notas.setNota1(n1);
        notas.setNota2(n2);
        
        System.out.println("El nombre del estudiante es: "+ notas.getNombre());

        System.out.println("La nota 1 del estudiante es: " +notas.getNota1());
        System.out.println("La nota 1 del estudiante es: " +notas.getNota2());

        //conocer si el estudiante aprobo o No

        notas.calcular();
        
    }
}
