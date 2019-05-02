void setup(){
  size(600,700);
  background(0,255,0);
  noStroke();
  fill(#CB7127);
  ellipse(200,300,250,250);
  fill(#F7072C);
  ellipse(200,300,220,220);
  fill(#F2EC1D);
  ellipse(200,300,210,210);
}

void draw(){
  if(mousePressed){
    fill(#D80202);
  }
  else{
  fill(#F2EC1D);
  }
  ellipse(200,360,40,40);
}