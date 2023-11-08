trigger UpdateContactDescriptionTrigger on Contact (after update) {
    for(Contact ctt : Trigger.new){
        if(ctt.MailingCity != Trigger.oldMap.get(ctt.Id).MailingCity) {
            ctt.Description = 'Cidade de correspondência atualizada: ' + ctt.MailingCity;
        }
    }
}
