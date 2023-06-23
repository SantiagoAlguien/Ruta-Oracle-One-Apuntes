public class EjmploScope {
    public static void main(String[] args) {
        System.out.println("hola mundo");

        int edad = 27;
        int cantidadpersonas = 2;

        boolean esPareja = cantidadpersonas > 1;
        boolean puedeEntrar = edad >= 18 && esPareja;

        System.out.println("El valor de la condicion es "+ esPareja);
        if( puedeEntrar){
            System.out.println("puedes pasar");
        }else{
            System.out.println("Nos es biemvenido");    
        }
    }   
}
