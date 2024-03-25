#define LED 5
#define BA 3
#define BB 4

int PWM = 0;

void setup()
{
  pinMode (LED, OUTPUT);
  pinMode (BA, INPUT);
  pinMode (BB, INPUT);
}

void loop()
{
  if (digitalRead(BA)){
    if (PWM < 255){
      PWM++;
      delay (15);
    }
  }
  if (digitalRead(BB)){
    if (PWM > 0){
      PWM--;
      delay (15);
  }
}
 analogWrite (LED, PWM);
}