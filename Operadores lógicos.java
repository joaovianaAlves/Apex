String waterLevel = 'half';
  
if(waterLevel == 'empty') {
    System.debug('Fill the tea kettle');
    waterLevel = 'full';
} else if(waterLevel == 'half') {
    System.debug('Fill the tea kettle');
    waterLevel = 'full';
} else { //This statement only runs if line 3 and line 6 result in false.
    System.debug('The tea kettle is full');
}

String waterLevel = 'half';
  
if(waterLevel == 'empty' || waterLevel == 'half') {
    System.debug('Fill the tea kettle');
    waterLevel = 'full';
} else { //This statement only runs if line 3 false.
    System.debug('The tea kettle is full');
}
