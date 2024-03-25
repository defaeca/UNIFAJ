void setup()
{
  pinMode(2, INPUT_PULLUP);// botao para frente
  pinMode(3, OUTPUT);	   //transitor para frente
  
  pinMode(4, INPUT_PULLUP);// botao para trás
  pinMode(5, OUTPUT);      // transitor para trás
  
  pinMode(6, INPUT_PULLUP);// botao direita
  pinMode(7, OUTPUT);      // transitor direita
  
  pinMode(8, INPUT_PULLUP);// botao esquerda
  pinMode(9, OUTPUT);      // transitor esquerda
}
void loop()
{
  // FRENTE
  if(!digitalRead(2))
  {
    digitalWrite(3,HIGH);
    
    while(!digitalRead(2));
  }
  else
  {
    digitalWrite(3,LOW);
  }
  
  
  // TRÁS
  if(!digitalRead(4))
  {
    digitalWrite(5,HIGH);

    
    while(!digitalRead(4));
  }
  else
  {
    digitalWrite(4,LOW);
    
  }
 /* 
  //direita
  if(!digitalRead(6))
  {
    digitalWrite(7,HIGH);
   

    while(!digitalRead(6));
  }
  else
  {
    digitalWrite(6,LOW);
  }
  
  
  //esquerda
  if(!digitalRead(8))
  {
    digitalWrite(9,HIGH);
   

    while(!digitalRead(8));
  }
  else
  {
    digitalWrite(8,LOW);
  }
  */
}