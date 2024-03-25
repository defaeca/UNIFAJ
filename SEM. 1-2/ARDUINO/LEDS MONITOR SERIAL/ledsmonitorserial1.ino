#define VM 2
#define VD 3
#define YL 4

char opcao;

void setup()
{
pinMode (VM, OUTPUT);
pinMode (VD, OUTPUT);
pinMode (YL, OUTPUT);
Serial.begin(9600);
}
void loop()
{
  if (Serial.available()){
opcao = Serial.read();
 
    switch (opcao) {
      case 'A': digitalWrite (VM, HIGH);
  break;
      case 'a': digitalWrite (VM, LOW);
  break;
      case 'B': digitalWrite (VD, HIGH);
  break;
      case 'b': digitalWrite (VD, LOW);
  break;
      case 'C': digitalWrite (YL, HIGH);
  break;
      case 'c': digitalWrite (YL, LOW);
  break;
      default: Serial.println("vc errou");
    }
  }
}