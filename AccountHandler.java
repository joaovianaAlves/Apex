public class AccountHandler {
    public static void insertAccount(Integer numAccounts){
        List<Account> addAccounts = new List<Account>();
        Integer c = 1;
        while(c <= numAccounts){
            Account acct = new Account();
            acct.Name = 'Acme Inc N' + c;
            acct.AccountNumber ='A000n' + c;
            addAccounts.add(acct);
            c = c + 1;
        }
        insert addAccounts;
    }
}
