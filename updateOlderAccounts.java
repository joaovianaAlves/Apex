public class OlderAccountsUtility {
    public static void updateOlderAccounts(){	
        //Puxa as 5 contas mais antigas
        //Select = Usado para recuperar dados de um banco de dados.
        //FROM = Usada em uma consulta SELECT para especificar a fonte dos dados que você deseja recuperar do banco de dados.
        //ORDER BY = Usada em uma consulta SELECT para especificar a ordenação dos resultados retornados pela consulta.
        //ASC = Usado para especificar que os resultados devem ser ordenados em ordem crescente.
        //LIMIT = Usado para limitar o número de registros retornados pela consulta.
    Account[] oldAccounts = [SELECT Id, Description FROM Account ORDER BY CreatedDate ASC LIMIT 5];
   		//Loop através deles e atualize o campo Descrição
   for(Account acct : oldAccounts){
        acct.Description = 'Heritage Account';
    }
    //update = Usada para modificar registros existentes em um banco de dados.
    update oldAccounts;
	}
}
