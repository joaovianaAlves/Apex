public class NewAccounts {
    public static void sObjectsInsert(Integer value){
        Integer counter = 1;
        List<Account> teaFactoryAccounts = new List<Account>();
        while(counter <= value){
            Account store = new Account();
            store.Name = 'The Tea Factory ' + counter;
            store.AccountNumber = '35629' + counter;
            teaFactoryAccounts.add(store);
            counter = counter + 1;
        }
        insert teaFactoryAccounts;
    }
}
