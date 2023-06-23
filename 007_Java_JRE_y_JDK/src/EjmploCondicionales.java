public class EjmploCondicionales {
    
    public static void main(String[] args) {
        System.out.println("hola mundo");

        int edad = 17;
        int cantidad = 2;

        if( edad >= 18){
            System.out.println("puedes pasar");
        }else{
            if (cantidad >= 2) {
                System.out.println("no tienes 18 años, pero puedes ingresar" 
                + "porque estás acompañado");    
            }else{
                System.out.println("Nos es biemvenido");    
            }
        }

    }

}
