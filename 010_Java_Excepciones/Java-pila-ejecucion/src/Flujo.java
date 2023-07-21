public class Flujo {

  public static void main(String[] args) {
    System.out.println("Inicio main");//inicio del primer metodo
    metodo1();//inicio de la funcion metodo1 
    System.out.println("Fim main");//Mesaje que imprime al finalizar la funcion llamada metodo1 
  }
  public static void metodo1(){
    System.out.println("Inicio de metodo1");
    metodo2();
    System.out.println("Fin de metodo1");
  }
  public static void metodo2(){
    System.out.println("Inicio metodo2");
    for(int i =1; i<= 5; i++){
      System.out.println(i);
      try {
        int num = 0;
        int resultado = i/num;
        System.out.println(resultado);
      } catch (ArithmeticException exception) {
        System.out.println(exception);       
      }
    }
    System.out.println("Fin metodo2");
  }
}