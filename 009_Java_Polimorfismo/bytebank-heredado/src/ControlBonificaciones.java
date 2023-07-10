public class ControlBonificaciones {

    private double suma;

    public double RegistrarSalario(Funcionario funcionario) {
        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println(this.suma);
        return this.suma;
    }
}
