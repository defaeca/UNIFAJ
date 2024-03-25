// C++ co//
#define trigPin 13
#define echoPin 12
#define ledv 11
#define leda 10
#define ledr 9
#define g 8
#define f 7
#define a 6
#define b 5
#define e 4
#define d 3
#define c 2
#define botao 1

  int click = 0;
  float distancia;
  unsigned long duracao;

void setup(){
  Serial.begin(9600);
  pinMode (botao, INPUT_PULLUP);
  pinMode(trigPin, OUTPUT);
  pinMode (echoPin, INPUT);
  pinMode (ledv, OUTPUT);//led verde
  pinMode (leda, OUTPUT);//led amarelo
  pinMode (ledr, OUTPUT);// led vermelho
}
void loop(){
  digitalWrite(trigPin,LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);
  duracao = pulseIn(echoPin, HIGH);
  distancia = 0.0340 *(duracao/2);
  Serial.print(distancia,1);
  Serial.println("cm");
  delay(500);
  
  if (distancia > 30)
    digitalWrite (ledv, HIGH);
  else digitalWrite (ledv, LOW);
  
  if (distancia < 30 && distancia > 10)
      digitalWrite (leda, HIGH);
  else digitalWrite (leda, LOW);
  
  if(distancia < 10){
    click = (click +1);
  digitalWrite (ledr, HIGH);
  }
 else digitalWrite (ledr,LOW);
  
  
  if (click == 0){
    digitalWrite(a, HIGH);
    digitalWrite(b, HIGH);
    digitalWrite(c, HIGH);
    digitalWrite(d, HIGH);
    digitalWrite(e, HIGH);
    digitalWrite(f, HIGH);
    digitalWrite(g, LOW);
    delay(1500);
  }
  
  if (click == 1){
    digitalWrite(a, LOW);
    digitalWrite(b, HIGH);
    digitalWrite(c, HIGH);
    digitalWrite(d, LOW);
    digitalWrite(e, LOW);
    digitalWrite(f, LOW);
    digitalWrite(g, LOW);
    delay(1500);
  }
   if (click == 2){
    digitalWrite(a, HIGH);
    digitalWrite(b, HIGH);
    digitalWrite(c, LOW);
    digitalWrite(d, HIGH);
    digitalWrite(e, HIGH);
    digitalWrite(f, LOW);
    digitalWrite(g, HIGH);
    delay(1500);
   }
   if (click == 3){
    digitalWrite(a, HIGH);
    digitalWrite(b, HIGH);
    digitalWrite(c, HIGH);
    digitalWrite(d, HIGH);
    digitalWrite(e, LOW);
    digitalWrite(f, LOW);
    digitalWrite(g, HIGH);
    delay(1500);
   }
   if (click == 4){
    digitalWrite(a, LOW);
    digitalWrite(b, HIGH);
    digitalWrite(c, HIGH);
    digitalWrite(d, LOW);
    digitalWrite(e, LOW);
    digitalWrite(f, HIGH);
    digitalWrite(g, HIGH);
    delay(1500);
   }
   if (click == 5){
    digitalWrite(a, HIGH);
    digitalWrite(b, LOW);
    digitalWrite(c, HIGH);
    digitalWrite(d, HIGH);
    digitalWrite(e, LOW);
    digitalWrite(f, HIGH);
    digitalWrite(g, HIGH);
    delay(1500);
   }
   if (click == 6){
    digitalWrite(a, HIGH);
    digitalWrite(b, LOW);
    digitalWrite(c, HIGH);
    digitalWrite(d, HIGH);
    digitalWrite(e, HIGH);
    digitalWrite(f, HIGH);
    digitalWrite(g, HIGH);
    delay(1500);
   }
   if (click == 7){
    digitalWrite(a, HIGH);
    digitalWrite(b, HIGH);
    digitalWrite(c, HIGH);
    digitalWrite(d, LOW);
    digitalWrite(e, LOW);
    digitalWrite(f, LOW);
    digitalWrite(g, LOW);
    delay(1500);
   }
   if (click == 8){
    digitalWrite(a, HIGH);
    digitalWrite(b, HIGH);
    digitalWrite(c, HIGH);
    digitalWrite(d, HIGH);
    digitalWrite(e, HIGH);
    digitalWrite(f, HIGH);
    digitalWrite(g, HIGH);
    delay(1500);
   }
   if (click == 9){
    digitalWrite(a, HIGH);
    digitalWrite(b, HIGH);
    digitalWrite(c, HIGH);
    digitalWrite(d, HIGH);
    digitalWrite(e, LOW);
    digitalWrite(f, HIGH);
    digitalWrite(g, HIGH);
    delay(1500);
   }
  if (digitalRead(botao) == HIGH);
    click == 0;
  delay(1000);
}
  