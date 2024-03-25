// Definir os pinos utilizados
const int buttonPin = 2; // Pino do botão
const int relayPin = 3; // Pino do relé

// Variáveis para armazenar o estado do botão e do relé
int buttonState = 0;
int relayState = LOW;

void setup() {
  // Inicializar os pinos
  pinMode(buttonPin, INPUT);
  pinMode(relayPin, OUTPUT);
  
  // Iniciar comunicação serial
  Serial.begin(9600);
}

void loop() {
  // Verificar o estado do botão
  buttonState = digitalRead(buttonPin);
  
  // Controle do relé com o botão
  if (buttonState == HIGH) {
    relayState = !relayState; // Inverter o estado do relé
    digitalWrite(relayPin, relayState); // Atualizar o estado do relé
    delay(200); // Pequeno atraso para evitar o bounce do botão
  }
  
  // Controle do relé com comando serial
  if (Serial.available() > 0) {
    char command = Serial.read();
    
    if (command == '1') {
      relayState = HIGH; // Ligar o relé
      digitalWrite(relayPin, relayState); // Atualizar o estado do relé
    } else if (command == '0') {
      relayState = LOW; // Desligar o relé
      digitalWrite(relayPin, relayState); // Atualizar o estado do relé
    }
  }
}