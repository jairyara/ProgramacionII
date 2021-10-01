public class Inmueble extends Persona {


    private String cityProperty;
    private String addressProperty;
    private boolean typeProperty;
    private int valueBuyProperty;
    private int valueRentPropertyNoCommission;
    private double valueRentPropertyCommission;
    private boolean availableProperty;

    public Inmueble(long identificacion, String nombre, String apellido, String cityProperty, String addressProperty, boolean typeProperty, int valueBuyProperty, int valueRentPropertyNoCommission, boolean availableProperty) {
        super(identificacion, nombre, apellido );
        this.cityProperty = cityProperty;
        this.addressProperty = addressProperty;
        this.typeProperty = typeProperty;
        this.valueBuyProperty = valueBuyProperty;
        this.valueRentPropertyNoCommission = valueRentPropertyNoCommission;
        this.availableProperty = availableProperty;
    }

    public String getCityProperty() {
        return cityProperty;
    }

    public void setCityProperty(String cityProperty) {
        this.cityProperty = cityProperty;
    }

    public String getAddressProperty() {
        return addressProperty;
    }

    public void setAddressProperty(String addressProperty) {
        this.addressProperty = addressProperty;
    }

    public boolean isTypeProperty() {
        return typeProperty;
    }

    public void setTypeProperty(boolean typeProperty) {
        this.typeProperty = typeProperty;
    }

    public int getValueBuyProperty() {
        return valueBuyProperty;
    }

    public void setValueBuyProperty(int valueBuyProperty) {
        this.valueBuyProperty = valueBuyProperty;
    }

    public int getValueRentPropertyNoCommission() {
        return valueRentPropertyNoCommission;
    }

    public void setValueRentPropertyNoCommission(int valueRentPropertyNoCommission) {
        this.valueRentPropertyNoCommission = valueRentPropertyNoCommission;
    }

    public double getValueRentPropertyCommission() {
        return valueRentPropertyCommission;
    }

    public void setValueRentPropertyCommission(double valueRentPropertyCommission) {
        this.valueRentPropertyCommission = valueRentPropertyCommission;
    }

    public boolean isAvailableProperty() {
        return availableProperty;
    }

    public void setAvailableProperty(boolean availableProperty) {
        this.availableProperty = availableProperty;
    }

    public void printPropertyInformation() {
        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println();
        System.out.println("Detalles del inmueble");
        System.out.println("Identificacion del propietario: " + getIdentificacion());
        System.out.println("Nombres y apellidos del propietario: " + getNombre() + " " + getApellido());
        System.out.println("Ciudad del inmueble: " + cityProperty);
        System.out.println("Direccion del inmueble: " + addressProperty);
        String typePropertyString;
        if (typeProperty) {
            typePropertyString = "Local";
        } else {
            typePropertyString = "Apartamento";
        }
        System.out.println("Tipo de inmueble: " + typePropertyString);
        System.out.println("Valor comercial del inmueble: " + valueBuyProperty);
        System.out.println("Valor arrendamiento del inmueble sin comision: $" + valueRentPropertyNoCommission);
        System.out.println("Valor arrendamiento del inmueble con comision: $" + getValueRentPropertyCommission() );
        String availablePropertyString;
        if (availableProperty) {
            availablePropertyString = "Disponible";
        } else {
            availablePropertyString = "No disponible";
        }
        System.out.println("Disponibilidad del inmueble: " + availablePropertyString);
        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println();
    }

    //Metodo para verificar si es posible arrendar a partir de un monto dado
    public void verifyRent(int offerRent) {
        double diference = offerRent - valueRentPropertyCommission;

        if (offerRent >= valueRentPropertyCommission) {
            System.out.println("Se puede arrendar el inmueble");
            String s = diference > 0 ? "Sobran $" + diference : "No sobra dinero";
            System.out.println(s);
        } else  {
            System.out.println("No cuenta con el dinero suficiente, le faltan $"  + (diference*-1) );
        }
    }

    public void setCommission() {
        double setCommission;
        if (typeProperty) {
            setCommission = valueRentPropertyNoCommission * 1.12;
        } else {
            setCommission = valueRentPropertyNoCommission * 1.07;
        }
        setValueRentPropertyCommission(setCommission);
    }

}
