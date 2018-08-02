void setup(){
PImage face = loadImage("trump.jpg");
face.resize(width, height);
image(face, 0, 0);
 size(900, 900);
}



void draw(){
  
 
  fill(255,255,255);
  fill(mouseX,mouseY, 150);
ellipse(484, 417, 60, 60);
ellipse(594, 405, 60, 60);
 fill(0,0,0);
ellipse(484, 417, 30, 30);
 fill(0,0,0);
ellipse(594, 405, 30, 30);

}