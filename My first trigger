trigger AccountAddressTrigger on Account (before insert, before update) {
    for(Account acc : Trigger.new){	
        if(acc.Match_Billing_Address__c == true){
			acc.ShippingPostalCode = acc.BillingPostalCode;
        }
    }
}

//Este acionador é definido para ser executado antes da inserção e antes da atualização de registros de Conta. Dentro do acionador, iteramos por todas as contas no contexto do acionador (Trigger.new). Se a caixa de seleção "Match Billing Address" (campo personalizado Match_Billing_Address__c) estiver marcada (true), definimos o CEP de envio (ShippingPostalCode) para ser igual ao CEP de cobrança (BillingPostalCode).

Observação: Certifique-se de ter um campo de caixa de seleção personalizado chamado "Match Billing Address" (Match_Billing_Address__c) no objeto Conta para usá-lo na condição do acionador. Além disso, lembre-se de habilitar o acionador depois de criá-lo em sua organização Salesforce.
