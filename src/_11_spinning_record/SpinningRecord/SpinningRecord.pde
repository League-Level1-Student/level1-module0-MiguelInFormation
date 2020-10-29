PImage pictureOfRecord;
import ddf.minim.*;
AudioPlayer song;
Minim minim;
int x = 40;
void setup () {
  minim = new Minim(this);
  size(600,600);
  pictureOfRecord= loadImage ("record.jpg");
  pictureOfRecord.resize (height,width);
  image(pictureOfRecord, 0 ,0);
  song = minim.loadFile("yay.wav", 512);
}

void draw() {
  if (mousepressed) {
    rotateImage(pictureOfRecord, x++);
    image(pictureOfRecord,0,0);
    song.play();
  }
  else {
    song.pause();
  }
}

void rotateImage (PImage image, int amountToRotate) {
  translate(-image.width/2, -image.height/2);
}

  
