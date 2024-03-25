
#define farold 11 
#define farole 10 
#define ree 9 
#define red 8 
#define echod 5 
#define trigd 4 
#define echoe 7 
#define trige 6 

float distanciad;
float distanciae;
unsigned long duracao;

void setup(){
  Serial.begin(9600);
  pinMode (farold, OUTPUT);
  pinMode (farole, OUTPUT);
  pinMode (ree, OUTPUT);
  pinMode (red, OUTPUT);
  pinMode (echod, INPUT);
  pinMode (trigd, OUTPUT);
  pinMode (echoe, INPUT);
  pinMode (trige, OUTPUT);
}

void loop(){
  digitalWrite(trigd,LOW);
  delayMicroseconds(2);
  digitalWrite(trigd, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigd, LOW);
  duracao = pulseIn(echod, HIGH);
  distanciad = 0.0340 *(duracao/2);
  Serial.print(distanciad,1);
  Serial.println(" cm do sensor direito");
  delay(500);
  
  digitalWrite(trige,LOW);
  delayMicroseconds(2);
  digitalWrite(trige, HIGH);
  delayMicroseconds(10);
  digitalWrite(trige, LOW);
  duracao = pulseIn(echoe, HIGH);
  distanciae = 0.0340 *(duracao/2);
  Serial.print(distanciae,1);
  Serial.println(" cm do sensor esquerdo");
  delay(500);
  
  if (distanciad > 10){
    digitalWrite(farold, HIGH);
    delay (500);}
  if (distanciad < 10 )
    digitalWrite (farold, LOW);
  
  if (distanciae > 10){
    digitalWrite(farole, HIGH);
    delay (500);}
  if (distanciae < 10 )
    digitalWrite (farole, LOW);
  
  if (distanciae < 10 && distanciad < 10){
    digitalWrite (red, HIGH);
    digitalWrite (ree, HIGH);
    delay(2000);
  }
  
  else if(distanciae > 10 && distanciad > 10){
    digitalWrite (red, LOW);
    digitalWrite (ree, LOW);
  }
}