public class Contrato {

    private Inmueble inmuebleContrato;
    private Cliente clienteContrato;
    private Inmobiliaria inmobiliariaContrato;
    private String numeroContrato;
    private String fechaContrato;
    private double mesesContrato;
    private double valorContrato;

    public Contrato(Inmueble inmuebleContrato, Cliente clienteContrato, Inmobiliaria inmobiliariaContrato, String numeroContrato, String fechaContrato, int mesesContrato) {
        this.inmuebleContrato = inmuebleContrato;
        this.clienteContrato = clienteContrato;
        this.inmobiliariaContrato = inmobiliariaContrato;
        this.numeroContrato = numeroContrato;
        this.fechaContrato = fechaContrato;
        this.mesesContrato = mesesContrato;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public double getMesesContrato() {
        return mesesContrato;
    }

    public void setMesesContrato(double mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public Inmueble getInmuebleContrato() {
        return inmuebleContrato;
    }

    public void setInmuebleContrato(Inmueble inmuebleContrato) {
        this.inmuebleContrato = inmuebleContrato;
    }

    public Cliente getClienteContrato() {
        return clienteContrato;
    }

    public void setClienteContrato(Cliente clienteContrato) {
        this.clienteContrato = clienteContrato;
    }

    public Inmobiliaria getInmobiliariaContrato() {
        return inmobiliariaContrato;
    }

    public void setInmobiliariaContrato(Inmobiliaria inmobiliariaContrato) {
        this.inmobiliariaContrato = inmobiliariaContrato;
    }

    public void mostrarContrato() {
        System.out.println("Contrato No." + getNumeroContrato());
        System.out.println("Fecha de contrato : " + getFechaContrato());
        System.out.println("Cantidad de meses del contrato : " + getMesesContrato() + " meses");
        System.out.println("Valor contrato: $" + getValorContrato());
        System.out.println();
        System.out.println("Se celebra contrato de arrendamiento entre " + getInmobiliariaContrato().getNombreInmobiliaria() + "identificada con NIT " + getInmobiliariaContrato().getNitInmobiliaria());
        System.out.println(" y la persona " + getClienteContrato().getNombre() + " " + getClienteContrato().getApellido() + " identificada con documento número " + getClienteContrato().getIdentificacion());
        
    }


}
