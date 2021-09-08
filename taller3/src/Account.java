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

    public void deposit(double quantity) {
        balance += quantity;
    }

    public void withdrawals (double quantity) {
        if (balance > 0 ) {
            balance -= quantity;
        } else {
            System.out.println("No dispone de la cantidad de dinero que quiere retirar");
        }
    }
}
