import javax.swing.*;

public class Account {

    private String name;
    private String lastName;
    private int idNumber;
    private long phone;
    private String email;
    private double balance;

    public Account(String name, String lastName, int idNumber, long phone, String email, double balance) {
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.phone = phone;
        this.email = email;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public long getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double quantity) {
        balance += quantity;
    }

    public void withdrawals(double quantity) {
        if (quantity < balance) {
            balance -= quantity;
            JOptionPane.showMessageDialog(null, "Ha retirado $: " + quantity);

            JOptionPane.showMessageDialog(null, "Saldo actual $:" + balance);
        } else {
            JOptionPane.showMessageDialog(null,"Excede la cantidad que tiene en la cuenta");
        }

    }
}
