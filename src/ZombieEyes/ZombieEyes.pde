void setup(){
size(800,800);
PImage face = loadImage("cat.jpg");
face.resize(800,800);
image(face,0,0);
}

void draw(){
  noStroke();
  
  fill(mouseY,mouseX,mouseX-mouseY);
  ellipse(337,270,134,134);
  ellipse(473,270,134,134);
  fill(#000000);
  ellipse(337,270,20,20);
  fill(#000000);
  ellipse(473,270,12,12);
}