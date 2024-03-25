#include<Servo.h>           // Biblioteca
int ldr;                    // Variável de leitura

Servo m1;

void setup() {
  pinMode(5, OUTPUT);         // LED Verde
  pinMode(4, OUTPUT);         // LED Vermelho
  pinMode(6, INPUT);         // LDR
  Serial.begin(9600);
  m1.attach(7);               // Pino do Servo 

}
void loop() {
  ldr = digitalRead(6);     // ldr será igual ao valor obtido na porta A0
  Serial.println(ldr);

 if(ldr == 0){
    m1.write(90);
   digitalWrite(5,0);
   digitalWrite(4,1);
   delay(1500);
  }
  if(ldr == 1 ){
    m1.write(0);
   digitalWrite(5,1);
   digitalWrite(4,0);
   delay(1500);
  }
}
