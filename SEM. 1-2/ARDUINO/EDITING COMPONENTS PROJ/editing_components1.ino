int led_red = 0; 
int led_yellow = 1; 
int led_green = 2; 

void setup() {
 
  pinMode(led_red, OUTPUT);
  pinMode(led_yellow, OUTPUT);
  pinMode(led_green, OUTPUT);
}

void loop() {
  
  digitalWrite(led_red, HIGH); 
  digitalWrite(led_yellow, HIGH);
  digitalWrite(led_green, HIGH);
  delay(2000);   
  
  digitalWrite(led_red, LOW);   
  digitalWrite(led_yellow, LOW);
  digitalWrite(led_green, LOW);
  delay(1000); 
  
  digitalWrite(led_red, HIGH);  
  digitalWrite(led_yellow, HIGH);
  digitalWrite(led_green, HIGH);
  delay(3000);        
}