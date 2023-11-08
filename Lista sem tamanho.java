//Lista sem tamanho definido
// declara uma lista de sequências de caracteres chamada groceries e define seu tamanho como 4 sequências de caracteres
List<String> groceries = new List<String>();

//add = o método add() é usado para adicionar um elemento a uma lista. Ele permite inserir um novo elemento no final da lista existente.
groceries.add('Tea');
groceries.add('Sugar');
groceries.add('Honey');
groceries.add('Milk');

//Mostra o nome de cada string da lista
System.debug('Initialized groceries: ' + groceries);
//Mostra o indice de cada string da lista
System.debug('Item 0: ' + groceries[0]);
