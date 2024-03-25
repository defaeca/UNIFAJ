#define POT A0
#define LED 2

int valor;

void setup()
{
  pinMode (LED,OUTPUT);
  Serial.begin(9600);
}
void loop()
{
  valor = analogRead (POT);
  
  digitalWrite (LED,HIGH);
  delay(valor);
  digitalWrite (LED, LOW);
  delay(valor);
  
  Serial.print("Valor lido: ");
  Serial.println(valor);
  valor = map(valor, 0,1023, 0, 100);
  Serial.print("Valor mapeado: ");
  Serial.println(valor);
  Serial.println();
  delay;
               
}