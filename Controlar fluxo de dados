//Essa variável mantém o controle do status do nível de água: cheio ou vazio.
String waterLevel = 'full';
  
//Uma vez que o bule de chá é preenchido, a variável é alterada para "cheio". (usando uma estrutura "if"):
if(waterLevel == 'empty') {
    System.debug('Fill the tea kettle');
    waterLevel = 'full';
} else {
    System.debug('The tea kettle is full');
}

//Instruções condicionais

//Instruções if-else:

String waterLevel = 'half';
  
if(waterLevel == 'empty') {
    
    System.debug('Fill the tea kettle');
    waterLevel = 'full';
    
} else if(waterLevel == 'half') {
    
    System.debug('Fill the tea kettle');
    waterLevel = 'full';

//Esta instrução só é executada se a linha 3 e a linha 6 resultarem em falso.     
    
} else {
    
    System.debug('The tea kettle is full');

}

//Instruções switch:

String waterLevel = 'empty';
  
//option 1 using a single value
switch on waterLevel {
    when 'empty' {
        System.debug('Fill the tea kettle');
    }
    when 'half' {
        System.debug('Fill the tea kettle');
    }
    when 'full' {
        System.debug('The tea kettle is full');
    }
    when else {
        System.debug('Error!');
    }
}
  
//option 2 using multiple values
switch on waterLevel {
    when 'empty', 'half' { //when waterLevel is either empty or half
        System.debug('Fill the tea kettle');
    }
    when 'full' {
        System.debug('The tea kettle is full');
    }
    when else {
        System.debug('Error!');
    }
}
