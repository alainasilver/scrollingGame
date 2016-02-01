 class Player extends Sprite {
  float x;
  float xSpeed;
     
    float y;
    float ySpeed;
    boolean dead;
     
float diffX;
float diffY;
     
    
   
     
    Player(float xpos) { // constructorrrrr desctructorrrr
      x = xpos;
      y = 0;
      dead = false;
      
           
     diffX = abs(x - xS);
     diffY = abs(y - yS);
     
      
    }
     
    void forward() {
      if (dead){
        return;
      } // stay still if dead
      xSpeed += 0.15; // if you're alive, speed up 
      if (xSpeed > 2.2){
        xSpeed = 2.2; // max out on speed
      }
      return;
    }
    
    void back(){
     if (dead){
       return;
     }
     xSpeed -= .1;
     if (xSpeed < -2.2){
       xSpeed = -2.2;
       
     }
      return;
    }
     
    void jump() {
      if (dead) return;
      if (y == board.whereIsFloor(x,20)) {
        ySpeed = -8; // go up 
      }
    }
     
    float doPlayer() {
      float startx=x; // start position
      float thefloor = board.whereIsFloor(x, 20);
       
       
      //gravity yo
      if (y < thefloor){
        ySpeed += .2; // if above floor, go down 
      }
       
      //friction 
      if (xSpeed > 0) { // slideeeee
        xSpeed -= .1; //
        if (xSpeed < 0) xSpeed = 0;// no negatives 
      }
       
      x += xSpeed;
      y += ySpeed;
   
       
       
       
       
      if (y > thefloor) {
        //println("Below the floor!"); 
        if (ySpeed > 0) ySpeed = 0;
        y=thefloor;
      }
       
      //dont run through walls
      if (xSpeed > 0) {
        if (y > board.whereIsFloor(int(x+xSpeed),20)) {
          xSpeed = 0;
        }
      }
      //println(y);
      if (dead == false) {
        if (y >= height) {
          dead = true;
          xSpeed = 0;
          ySpeed = -12;
          stopTime = millis();
        }
      }
       
     
      return xSpeed;
    }// end doPlayer
    
    
     
    void drawPlayer() {
      buffer.stroke(255,0,0);
      buffer.fill(255,171,3);
      buffer.rect(x , y-20, 20, 20);
    }
    
      boolean get(){
     if((diffX < 5) && (diffY < 5)){
  
       return true;
     }
  
     return false;
      
    }
    
    
     
  }// end player
