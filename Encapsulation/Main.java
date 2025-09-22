class BankAccount {
    private long accountNo;
    private String name;
    private String email;
    private float amount;

    public long getaccountNo(){
        return accountNo;
    }
    public void setAccountNo(long accountNo){
        this.accountNo=accountNo;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public float getAmount(){
        return amount;
    }
    public void setAmount(float amount){
        this.amount=amount;
    }
}

public class Main{
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountNo(96325874458464L);
        account.setName("Rabbi");
        account.setEmail("abcd@gmail.com");
        account.setAmount(700000f);

        System.out.println(account.getaccountNo());
        System.out.println(account.getName());
        System.out.println(account.getEmail());
        System.out.println(account.getAmount());
    }
}