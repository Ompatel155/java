class ATM{
    private int TotalBalance =1000000;
    public void getTotalB(){
        System.out.println(TotalBalance);
    }
    public void setWithdraw(int amount){
        if(amount>0 && TotalBalance>=amount){
            TotalBalance-=amount;
            System.out.println(TotalBalance);
        }
    }
        public void setDeposite( int amount){
            if(amount>0){
                TotalBalance +=amount;
                System.out.println(TotalBalance);
            }
        }
        }
    class BankBalance{
        public static void main(String[] args) {
            ATM a=new ATM();
            a.setDeposite(10000);
            a.setWithdraw(500);
        }
    }
