int y = 0;
int x = 143;
int x2 = 50;
int y2 = 0;
int y3 = 0;
int x3 = 297;
int score = 0;
void setup(){
  size(300,300);
}

void draw(){
  y = y + 2;
  background(0,20,100);
  fill(0,0,0);
  textSize(16);
  text("Score: "+score,20,20);
  fill(#ff3399);
  stroke(0,0,0);
  rect(mouseX-20,270,50,50);
  fill(0,0,225);
  stroke(0,0,0);
  ellipse(x,5+y,10,10);
  if (y<=299&&y>=269){
    checkCatch(x);
    y = 0;
    int randomNumber = (int) random(width);
    x = randomNumber;
  }
  y2+=3;
  fill(0,0,255);
  stroke(0,0,0);
  ellipse(x2, -51+y2,10,10);
