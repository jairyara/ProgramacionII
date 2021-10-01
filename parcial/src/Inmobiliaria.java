public class Inmobiliaria {

    private String nombreInmobiliaria;
    private String ciudadUbicacionInmobiliaria;
    private String direccionUbicacionInmobiliaria;
    private String nitInmobiliaria;

    public Inmobiliaria() {

    }

    public Inmobiliaria(String nombreInmobiliaria, String ciudadUbicacionInmobiliaria, String direccionUbicacionInmobiliaria, String nitInmobiliaria) {
        this.nombreInmobiliaria = nombreInmobiliaria;
        this.ciudadUbicacionInmobiliaria = ciudadUbicacionInmobiliaria;
        this.direccionUbicacionInmobiliaria = direccionUbicacionInmobiliaria;
        this.nitInmobiliaria = nitInmobiliaria;
    }

    public String getNombreInmobiliaria() {
        return nombreInmobiliaria;
    }

    public void setNombreInmobiliaria(String nombreInmobiliaria) {
        this.nombreInmobiliaria = nombreInmobiliaria;
    }

    public String getCiudadUbicacionInmobiliaria() {
        return ciudadUbicacionInmobiliaria;
    }

    public void setCiudadUbicacionInmobiliaria(String ciudadUbicacionInmobiliaria) {
        this.ciudadUbicacionInmobiliaria = ciudadUbicacionInmobiliaria;
    }

    public String getDireccionUbicacionInmobiliaria() {
        return direccionUbicacionInmobiliaria;
    }

    public void setDireccionUbicacionInmobiliaria(String direccionUbicacionInmobiliaria) {
        this.direccionUbicacionInmobiliaria = direccionUbicacionInmobiliaria;
    }

    public String getNitInmobiliaria() {
        return nitInmobiliaria;
    }

    public void setNitInmobiliaria(String nitInmobiliaria) {
        this.nitInmobiliaria = nitInmobiliaria;
    }
}
