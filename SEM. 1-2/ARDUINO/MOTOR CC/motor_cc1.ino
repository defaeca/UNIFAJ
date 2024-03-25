void setup()
{
  pinMode(8, INPUT_PULLUP);
  pinMode(4, OUTPUT);
}
void loop()
{
  if(!digitalRead(8))
  {
    digitalWrite(4,HIGH);
    while(!digitalRead(8));
  }
  else
  {
    digitalWrite(4,LOW);
  }
}