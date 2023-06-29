class Carro{
    private int ano;
    private String modelo;
    private double precio;

    public Carro(int ano, String modelo, double precio){
        if(ano >= 1891){
            this.ano = ano;
        }else{
            System.out.println("El año informado no es válido. Por eso usaremos 2017!");
            this.ano = 2017;
        }

        if( modelo != null){
            this.modelo = modelo;
        }else{
            System.out.println("El modelo no fue informado. Por eso usaremos Gol!");
            this.modelo = "Gol";
        }

        if(precio > 0){
            this.precio = precio;
        }else{
            System.out.println("EL precio no es válido. Por eso usaremos 40000.0!");
            this.precio = 40000.0;
        }
    }

    //Nuevo constructor AQUI!
    public Carro(String modelo, double precio){
        this(2017, modelo, precio);
    }

    //getters e setters omitidos


    //En Java, es posible llamar a un constructor dentro de otro, y esto se hace para evitar la duplicación de códigos y reglas. Después de todo, una regla aplicada en un constructor normalmente será la misma para el otro caso. Para esto, se usa this (), pasando los parámetros correspondientes al constructor al que desea llamar.
}