import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {

        Inmobiliaria inmobiliaria = new Inmobiliaria("Inmobiliaria Los Sauces", "Bogotá D.C", "Calle 93 No 11-43", "123456789");
        Inmueble inmueble = new Inmueble(1032500358, "Julia", "Marin", "Bogotá", "Calle 145 No 11-23", false, 12000000, 1500,true);
        inmueble.setCommission();
        Cliente cliente = new Cliente(0, "","","","","",0,0, "","");
        Contrato contrato = new Contrato(null, null, null, "","",0);
        List<Cliente> clientes = new ArrayList<>();
        List<Contrato> contratos = new ArrayList<>();

        boolean salir = false;

        System.out.println("Portal contratos - " + inmobiliaria.getNombreInmobiliaria());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(!salir) {
            try {
                System.out.println("Menu principal");
                System.out.println("Seleccione una opción: \n 1. Ver datos inmueble \n 2. Crear cliente \n 3. Ver contrato \n 4. Salir");
                int opcion = Integer.parseInt(br.readLine());

                switch (opcion) {
                    case 1:
                        inmueble.printPropertyInformation();
                        break;
                    case 2:
                        System.out.println("Creación de cliente");
                        System.out.println("Ingrese la identificación");
                        long id = Long.parseLong(br.readLine());
                        cliente.setIdentificacion(id);
                        System.out.println("Ingrese los nombres");
                        String nombre = br.readLine();
                        cliente.setNombre(nombre);
                        System.out.println("Ingrese los apellidos");
                        String apellidos = br.readLine();
                        cliente.setApellido(apellidos);
                        System.out.println("Ingrese el correo electrónico");
                        String email = br.readLine();
                        cliente.setEmail(email);
                        System.out.println("Ingrese la ciudad residencia");
                        String ciudadResidencia = br.readLine();
                        cliente.setCiudadResidencia(ciudadResidencia);
                        System.out.println("Ingrese la dirección de residencia");
                        String direccionResidencia = br.readLine();
                        cliente.setDireccionResidencia(direccionResidencia);
                        System.out.println("Ingrese el número de celular");
                        long celular = Long.parseLong(br.readLine());
                        cliente.setNoCelular(celular);
                        System.out.println("Ingrese el numero de cuenta bancaria");
                        long cuentaBancaria = Long.parseLong(br.readLine());
                        cliente.setNoCuentaBancaria(cuentaBancaria);
                        System.out.println("Ingrese la entidad Bancaria");
                        String entidadBancaria = br.readLine();
                        cliente.setEntidadBancaria(entidadBancaria);
                        System.out.println("Ingrese tipo de cuenta bancaria");
                        String tipoCuentaBancaria = br.readLine();
                        cliente.setTipoCuentaBancaria(tipoCuentaBancaria);
                        clientes.add(cliente);

                        System.out.println(cliente.toString());
                        break;
                    case 3:
                        if (!Objects.equals(cliente.getNombre(), "")) {
                            contrato.setInmuebleContrato(inmueble);
                            contrato.setInmobiliariaContrato(inmobiliaria);
                            contrato.setClienteContrato(cliente);
                            System.out.println("Crear contrato");
                            System.out.println("Ingrese número de contrato");
                            String numeroContrato = br.readLine();
                            contrato.setNumeroContrato(numeroContrato);
                            System.out.println("Ingrese la fecha del contrato");
                            String fechaContrato = br.readLine();
                            contrato.setFechaContrato(fechaContrato);
                            System.out.println("Ingrese la cantidad de meses del contrato");
                            int mesesContrato = Integer.parseInt(br.readLine());
                            contrato.setMesesContrato(mesesContrato);
                            System.out.println("Valor del contrato");
                            double valorContrato = contrato.getMesesContrato() * contrato.getInmuebleContrato().getValueRentPropertyCommission();
                            contrato.setValorContrato(valorContrato);
                            System.out.println(contrato.getValorContrato());
                            contratos.add(contrato);
                            contrato.mostrarContrato();
                        } else {
                            System.out.println("No se ha creado el cliente para elaborar el contrato");
                            System.out.println();
                        }
                        break;
                    case 4:
                        System.out.println("Gracias por usar la plataforma");
                        salir = true;
                        break;
                    default:
                        System.out.println("Ingrese un valor válido");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Intente de nuevo\n");
                System.out.println();
            }
        }

    }

}
