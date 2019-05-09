void setup(){
  size(600,700);
  background(#FFFFFF);
  noStroke();
  fill(#CB7127);
  ellipse(200,300,250,250);
  fill(#F7072C);
  ellipse(200,300,220,220);
  fill(#F2EC1D);
  ellipse(200,300,210,210);
  fill(#D80202);
  ellipse(160,365,30,30);
  fill(#D80202);
  ellipse(200,300,30,30);
  fill(#D80202);
  ellipse(280,280,30,30);
    fill(#D80202);
  ellipse(140,235,30,30);
}

void draw(){
  if(mousePressed){
    fill(#C4BB04);
  }
  else{
  fill(#F2EC1D);
  }
  rect(200,340,20,10);

}