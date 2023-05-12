public class Numeros{
    
    //variables globales: usar o utilizar en cualquier parte del programa
    String nombre;
    // modificador de acceso para aplicar encapsulamiento
    private float nota1, nota2;
    // uso de los metodos setters an getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getNota1() {
        return nota1;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    public float getNota2() {
        return nota2;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public void calcular(){
        // variable local: son de uso especifico para el metodo
        float promedio;
        promedio=(nota1 + nota2)/2;
        if (promedio >= 3.0){
            System.out.println("El promedio alcanzado es: "+promedio);
            System.out.println("El alumno ha aprobado el curso");
        }else{
            System.out.println("El alumno No ha aprobo el curso, debe realizar recuperacion");
        }
    }

}
