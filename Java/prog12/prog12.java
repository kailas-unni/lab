class Account{
    String name, adr, type;
    int num, intl, bal;
    Account(String n,int no,int i)
    {
        name = n;
        num = no;
        intl = i;
    }
    Account(String n,int no,String a,String t, int b)
    {
        name = n;
        num = no;
        adr = a;
        type = t;
        bal = b;
    }
    void Deposit(int b)
    {
        bal+= b;
        System.out.println("New Balance : "+bal);
    }
    void Withdraw(int w)
    {
        bal-= w;
        System.out.println("New Balance : "+bal);
    }
    void Get_Balance()
    {
        System.out.println("Balance : "+bal);
    }
}

class Main {
    public static void main(String[] arg) {
    Account acc1 = new Account("Venu", 99, 9);
    Account acc2 = new Account("Unni", 10, "North Paravur", "FD",12046557);
    acc1.Deposit(10);
    acc2.Withdraw(1000);
    acc1.Get_Balance();
    }
}
