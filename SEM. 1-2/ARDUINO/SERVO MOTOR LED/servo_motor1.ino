#include <Servo.h>

int posicao = 0;
Servo servo;

#define bt1 2
#define bt2 3


void setup()
{
  Serial.begin(9600);
  servo.attach(7);
  servo.write(0);//INICIA O MOTOR NA POSIÇÃO 0º
  pinMode(bt1, INPUT);
  pinMode(bt2, INPUT);
}

void loop()
{
  Serial.println(digitalRead(bt1));
  Serial.println(digitalRead(bt2));
  
  if(digitalRead(bt1) == HIGH && posicao <=180){
    
    posicao++;
    servo.write(posicao);
    delay(5);
  }
  
  if(digitalRead(bt2) == HIGH && posicao >=0){
    
    posicao--;
    servo.write(posicao);
    delay(5);
  }
}