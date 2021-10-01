public class Cliente extends Persona {
    private long noCuentaBancaria;
    private String entidadBancaria;
    private String tipoCuentaBancaria;

    public Cliente() {
    }

    public Cliente(long identificacion, String nombre, String apellido, String email, String ciudadResidencia, String direccionResidencia, long noCelular, long noCuentaBancaria, String entidadBancaria, String tipoCuentaBancaria) {
        super(identificacion, nombre, apellido, email, ciudadResidencia, direccionResidencia, noCelular);
        this.noCuentaBancaria = noCuentaBancaria;
        this.entidadBancaria = entidadBancaria;
        this.tipoCuentaBancaria = tipoCuentaBancaria;
    }

    public long getNoCuentaBancaria() {
        return noCuentaBancaria;
    }

    public void setNoCuentaBancaria(long noCuentaBancaria) {
        this.noCuentaBancaria = noCuentaBancaria;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public String getTipoCuentaBancaria() {
        return tipoCuentaBancaria;
    }

    public void setTipoCuentaBancaria(String tipoCuentaBancaria) {
        this.tipoCuentaBancaria = tipoCuentaBancaria;
    }

    public void registro(){

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Cliente registrado");
        sb.append("\n Identificación: ");
        sb.append(getIdentificacion());
        sb.append("\n Nombres y apellidos: ");
        sb.append(getNombre()).append(" ").append(getApellido());
        sb.append("\n Email: ");
        sb.append(getEmail());
        sb.append("\n Ciudad residencia: ");
        sb.append(getCiudadResidencia());
        sb.append("\n Dirección residencia: ");
        sb.append(getDireccionResidencia());
        sb.append("\n Celular: ");
        sb.append(getNoCelular());
        sb.append("\n Número de cuenta: ");
        sb.append(getNoCuentaBancaria());
        sb.append("\n Entidad bancaria: ");
        sb.append(getEntidadBancaria());
        sb.append("\n Tipo de cuenta: ");
        sb.append(getTipoCuentaBancaria());
        sb.append("\n ---------------------- \n");
        return sb.toString();
    }

}
