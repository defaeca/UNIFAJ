int E = 13;
int D = 12;
int C = 11;
int DF = 10;
int B = 9;
int A = 8;
int F = 7;
int G = 6;

void apagado (){
  digitalWrite(E,LOW);
  digitalWrite(D, LOW);
  digitalWrite(C, LOW);
  digitalWrite(DF, LOW);
  digitalWrite(B, LOW);
  digitalWrite(A, LOW);
  digitalWrite(F, LOW);
  digitalWrite(G, LOW);
}

void ponto (){
  digitalWrite(E,LOW);
  digitalWrite(D, LOW);
  digitalWrite(C, LOW);
  digitalWrite(DF, HIGH);
  digitalWrite(B, LOW);
  digitalWrite(A, LOW);
  digitalWrite(F, LOW);
  digitalWrite(G, LOW);
}

void zero (){
  digitalWrite(E,HIGH);
  digitalWrite(D, HIGH);
  digitalWrite(C, HIGH);
  digitalWrite(DF, LOW);
  digitalWrite(B, HIGH);
  digitalWrite(A, HIGH);
  digitalWrite(F, HIGH);
  digitalWrite(G, LOW);
}
void um (){
  digitalWrite(E,LOW);
  digitalWrite(D, LOW);
  digitalWrite(C, HIGH);
  digitalWrite(DF, LOW);
  digitalWrite(B, HIGH);
  digitalWrite(A, LOW);
  digitalWrite(F, LOW);
  digitalWrite(G, LOW);
}
void dois (){
  digitalWrite(E,HIGH);
  digitalWrite(D, HIGH);
  digitalWrite(C, LOW);
  digitalWrite(DF, LOW);
  digitalWrite(B, HIGH);
  digitalWrite(A, HIGH);
  digitalWrite(F, LOW);
  digitalWrite(G, HIGH);
}
void tres (){
  digitalWrite(E,LOW);
  digitalWrite(D, HIGH);
  digitalWrite(C, HIGH);
  digitalWrite(DF, LOW);
  digitalWrite(B, HIGH);
  digitalWrite(A, HIGH);
  digitalWrite(F, LOW);
  digitalWrite(G, HIGH);
}
void quarto (){
  digitalWrite(E,LOW);
  digitalWrite(D, LOW);
  digitalWrite(C, HIGH);
  digitalWrite(DF, LOW);
  digitalWrite(B, HIGH);
  digitalWrite(A, LOW);
  digitalWrite(F, HIGH);
  digitalWrite(G,HIGH);
}
void cinco (){
  digitalWrite(E,LOW);
  digitalWrite(D, HIGH);
  digitalWrite(C, HIGH);
  digitalWrite(DF, LOW);
  digitalWrite(B, LOW);
  digitalWrite(A, HIGH);
  digitalWrite(F, HIGH);
  digitalWrite(G, HIGH);
}
void seis (){
  digitalWrite(E,HIGH);
  digitalWrite(D, HIGH);
  digitalWrite(C, HIGH);
  digitalWrite(DF, LOW);
  digitalWrite(B, LOW);
  digitalWrite(A, HIGH);
  digitalWrite(F, HIGH);
  digitalWrite(G, HIGH);
}
void sete (){
  digitalWrite(E,LOW);
  digitalWrite(D, LOW);
  digitalWrite(C, HIGH);
  digitalWrite(DF, LOW);
  digitalWrite(B, HIGH);
  digitalWrite(A, HIGH);
  digitalWrite(F, LOW);
  digitalWrite(G, LOW);
}
void oito (){
  digitalWrite(E,HIGH);
  digitalWrite(D, HIGH);
  digitalWrite(C, HIGH);
  digitalWrite(DF, LOW);
  digitalWrite(B, HIGH);
  digitalWrite(A, HIGH);
  digitalWrite(F, HIGH);
  digitalWrite(G, HIGH);
}
void nove (){
  digitalWrite(E,LOW);
  digitalWrite(D, HIGH);
  digitalWrite(C, HIGH);
  digitalWrite(DF, LOW);
  digitalWrite(B, HIGH);
  digitalWrite(A, HIGH);
  digitalWrite(F, HIGH);
  digitalWrite(G, HIGH);
}
void setup() {
pinMode (E, OUTPUT);
pinMode (D, OUTPUT);
pinMode (C, OUTPUT);
pinMode (DF, OUTPUT);
pinMode (B, OUTPUT);
pinMode (A, OUTPUT);
pinMode (F, OUTPUT);
pinMode (G, OUTPUT);
}
void loop()