int x = 0;
void setup(){
size (600,600);
background(0,0,0);
}

void draw() {
  float r = random(600);
  float y = random(600);
  makeMagical();
  for (int i = 300; i > 0; i--){
    fill(200,0,0);
    ellipse(getWormX(i), getWormY(i), 2, 2);
    
  }
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
  fill(0,0,0,10);
  
    
