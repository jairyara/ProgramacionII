import javax.swing.*;

public class Bank {

    Account account = new Account("", "", 0, 0, "",0);

    public void menu() {
        String[] menu = {"1 Crear cuenta", "2 Retirar", "3 Consignar", "4 Consultar saldo", "5 Salir"};

        boolean exit = false;

        while (!exit) {
            try {
                int option = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la opcion deseada" + "Bienvenido al banco Chase \n" + "Menu \n" + menu[0] + " \n" + menu[1] + " \n" + menu[2] + " \n" + menu[3] + " \n" + menu[4] + " \n"));

                switch (option) {
                    case 1:
                        createAccount();
                        break;
                    case 2:
                        if (account == null) {
                            JOptionPane.showMessageDialog(null, "No existen cuentas creadas para realizar operaciones");
                        } else {
                            withDrawal();
                        }
                        break;
                    case 3:
                        if (account == null) {
                            JOptionPane.showMessageDialog(null, "No existen cuentas creadas para realizar operaciones");
                        } else {
                            deposit();
                        }
                        break;
                    case 4:
                        if (account == null) {
                            JOptionPane.showMessageDialog(null, "No existen cuentas creadas para realizar operaciones");
                        } else {
                            JOptionPane.showMessageDialog(null, "Saldo actual $:" + account.getBalance());
                        }
                        break;
                    case 5:
                        exit = true;
                        JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios");
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Ingrese un valor valido");
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor valido");
            }
        }
    }

    public void createAccount() {
        String name = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        String lastName = JOptionPane.showInputDialog(null, "Ingrese su apellido");
        int idNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su numero de identificacion"));
        long phone = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese su numero de celular"));
        String email = JOptionPane.showInputDialog(null, "Ingrese su correo electronico");
        double deposit = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el deposito inicial de la cuenta"));
        account.setName(name);
        account.setLastName(lastName);
        account.setIdNumber(idNumber);
        account.setPhone(phone);
        account.setEmail(email);
        account.setBalance(deposit);
        JOptionPane.showMessageDialog(null, "Cuenta creada correctamente \n" + "Datos registrados \n"
                + "Nombre y apellido: " + account.getName() + " " + account.getLastName() +
                "\n Identificacion: " + account.getIdNumber() +
                "\n Celular: " + account.getPhone() + "email: " + account.getEmail() +
                " \n Saldo inicial: $" + account.getBalance());
    }

    public void deposit() {
        double newDeposit;
        newDeposit = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor a depositar"));
        account.deposit(newDeposit);
        JOptionPane.showMessageDialog(null, "Nuevo deposito realizado \n" + "Valor realizado : $"
                + newDeposit + "\n Nuevo saldo: $" + account.getBalance());
    }

    public void withDrawal() {
        double newWithDrawal;
        newWithDrawal = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor a retirar"));

        account.withdrawals(newWithDrawal);
        JOptionPane.showMessageDialog(null, "Ha retirado $: " + newWithDrawal);

        JOptionPane.showMessageDialog(null, "Saldo actual $:" + account.getBalance());
    }


}
