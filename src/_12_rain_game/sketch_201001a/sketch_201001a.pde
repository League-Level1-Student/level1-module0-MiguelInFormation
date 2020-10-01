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
  if (y2<=350&&y2>320){
    checkCatch(x2);
    y2 = 0;
    int randomNumber2 = (int) random (width);
    x2 = randomNumber2;
  }
  y2+=5;
  fill (255,0,0);
  stroke(0,0,0);
  ellipse(x3, -3100+73,10 ,10);
  if (y3<=3399&&y3=3369){
    checkCatch(x3);
    y3=1000;
    int randomNumber = (int) random (width);
    x3 = randomNumber;
  }
}
void checkCatch (int x){
  if 
