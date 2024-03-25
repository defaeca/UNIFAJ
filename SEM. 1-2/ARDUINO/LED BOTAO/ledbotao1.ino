// C++ code
//
void setup()
{
#define BOTAO 8
#define LED_VERMELHO 5
#define LED_AMARELO 4
#define LED_VERDE 3


pinMode (BOTAO,INPUT);
pinMode (LED_VERMELHO, OUTPUT);
pinMode (LED_AMARELO, OUTPUT);
pinMode (LED_VERDE, OUTPUT);
digitalWrite(BOTAO, HIGH);
  
}
void loop()
{

  if (digitalRead (BOTAO) == LOW)
  digitalWrite (LED_VERMELHO, HIGH);
  else digitalWrite (LED_VERMELHO, LOW);

  if (digitalRead (BOTAO) == LOW)
  digitalWrite (LED_AMARELO, HIGH);
  else digitalWrite (LED_AMARELO, LOW);

  if (digitalRead (BOTAO) == LOW)
  digitalWrite (LED_VERDE, HIGH);
  else digitalWrite (LED_VERDE, LOW);
 
}