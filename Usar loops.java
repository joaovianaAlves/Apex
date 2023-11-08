	Integer totalGuests = 100; 
	Integer totalAmountSugar = 159; 
	Integer totalAmountTea = 35; 
	
	While(totalGuests > 0) { 
		System.debug(totalGuests + ' Guests Remaining'); 
			
		if(totalAmountSugar == 0 || totalAmountTea == 0) { 
			
			System.debug('Out of ingredients! Sugar: ' + totalAmountSugar + ' Tea: ' + totalAmountTea); break; 
				
		} 
				
			totalAmountSugar--; 
			totalAmountTea--; 
			totalGuests--; }
			
			
O código declara três variáveis inteiras: "totalGuests" é definida como 100, 
"totalAmountSugar" é definida como 159 e "totalAmountTea" é definida como 35. Em seguida, 
um loop é executado para adicionar uma colher de chá de açúcar e um saquinho de chá a uma xícara de chá, 
servindo até que não haja mais açúcar ou chá disponível. O loop é interrompido se não houver mais ingredientes. 

O número de convidados, quantidade de açúcar e quantidade de chá são exibidos usando a função "System.debug".



Integer totalGuests = 100;
Integer totalAmountSugar = 159;
Integer totalAmountTea = 35;
 do { 
	 totalAmountSugar--; 
	 totalAmountTea--; 
	 totalGuests--; 
	
	System.debug(totalGuests + ' Guests Remaining!');
		
		if(totalAmountSugar == 0 || totalAmountTea == 0) { 
		
			System.debug('Out of ingredients!'); break; 
			
			}
			 
   } while(totalGuests > 0);

O código declara três variáveis inteiras: "totalGuests" é definida como 100, 
"totalAmountSugar" é definida como 159 e "totalAmountTea" é definida como 35. Em seguida, 
um loop é executado para decrementar a quantidade de açúcar, 
a quantidade de chá e o número de convidados. A cada iteração, 
o número de convidados restantes é exibido usando a função "System.debug". 

O loop continua enquanto ainda houver convidados. Se a quantidade de açúcar ou de chá chegar a zero, 
uma mensagem é exibida indicando que os ingredientes acabaram e o loop é interrompido.
