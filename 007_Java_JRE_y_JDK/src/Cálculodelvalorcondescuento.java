public class Cálculodelvalorcondescuento {

        public static void main(String[] args) {
    
            double valorCompra = 300.0;
            double descuento = 0.0;
            // ifs aqui

            if(valorCompra >= 100.0 && valorCompra <=199.00){
                System.out.println("el descuento es del 10%.");
            }else if(valorCompra >= 200.0 && valorCompra <=299.00){
                System.out.println("el descuento es del 15%.");
            }else if(valorCompra >= 300.0){
                System.out.println("el descuento es del 20%.");
            }
            double valorFinal = valorCompra - (valorCompra * (descuento / 100));

            System.out.println("Valor de la compra: $" + valorCompra);
            System.out.println("Descuento: " + descuento + "%");
            System.out.println("Valor final: $" + valorFinal);
        }
    
    
}
