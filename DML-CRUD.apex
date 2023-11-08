Account acct = new Account();
acct.Name = 'DML-5';
insert acct;

Id idAcct = acct.Id;
System.debug('Id: ' + idAcct + ' da conta: ' + acct.Name);

Account AcctPhone = [
    SELECT Id, Phone 
    FROM Account 
    WHERE Id = :idAcct 
    LIMIT 1
];
AcctPhone.Phone = '12312132321';
update AcctPhone;
System.debug('Campo Phone atualizado na conta: ' + acct.Name);

Account acctDel = [    
    SELECT Id
    FROM Account 
    WHERE Id = :idAcct 
    LIMIT 1
];
delete acctDel;
System.debug('Conta com id: ' + idAcct + ' e nome: ' + acct.Name + ' foi deletada');

Account acctUndel = [
    SELECT Id
    FROM Account
    WHERE Id = :idAcct
    LIMIT 1 ALL ROWS
];
undelete acctUndel;
System.debug('Conta com id: ' + idAcct + ' e nome: ' + acct.Name + ' foi recuperada');
