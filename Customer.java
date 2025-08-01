public class Customer {
     String cnic,name;
     double balance;
     int pin;  // 4 digits
     String accountNo;
     String card;   // xxxx xxxx xxxx xxxx

    public Customer() {
    }

    public Customer(String cnic, String name, double balance, int pin, String accountNo, String card) {
        this.cnic = cnic;
        this.name = name;
        this.balance = balance;
        this.pin = pin;
        this.accountNo = accountNo;
        this.card = card;
    }

      public boolean withdraw(double amount){
              if(this.balance-amount>=0){
              this.balance-=amount;
              return true;
              }
              return false;
      }
     
      public void deposit(double amount){
              this.balance+=amount;
      }

    public String getCnic() {
        return cnic;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getCard() {
        return card;
    }

    @Override
    public String toString() {
        return cnic+";"+name+";"+ balance+";"+pin+ ";" + accountNo + ";"+card ;
    }     
}