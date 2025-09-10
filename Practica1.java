public class Practica1{

    public void Saludo(){
        System.out.println("Hola soy un saludo");
    }

    public void triangulo(Integer size){ //size es un numero 
        for(int fila  = 1; fila <= size; fila++){
           for(int columna = 1; columna <= fila; columna++){
                System.out.print("*");  
           }   
            System.out.println(" *");     
        }
    }

    public static void main(String[] args){
        System.out.println("Hola Mundo");
        Practica1 practica1 = new Practica1();
        practica1.Saludo();

        int numeroPrimitivo = 0;
        Integer numeroNoPrimitivo = null; //varible para verificar si es
    }
}