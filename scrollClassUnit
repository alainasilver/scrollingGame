 class Unit { //make blocks for the player to walk on
    int h; // height
    int w; // width
    int topY;
    int unitX;
    int[] blocks;
    int lastX;
    float r = random (0, 1);
    Unit(int _h, int _w) {
      h = _h;
      w = _w;
      blocks = new int[20]; // int array
      for (int i = 0 ; i < 20; i++) {
        if (i <= h) {
          blocks[i] = 1;
        } else {
          blocks[i] = 0;
        }
      }
      topY = int(height-(height*h)/20);
    
    }
     
    int drawunit(int x) {
      buffer.stroke(0,255,0);
      if(r < .5){
      buffer.fill(105,247,50);
      }
      else{
       buffer. fill(3,100,57);
      }
       
      int i;
      unitX = x;
      for (i=19;i>=0;i--) {
        if (blocks[i] == 1) {
          int y = int(height-(height*i)/20);
          int blockheight = int(height/20);
          buffer.rect(x,y,w,blockheight);
  
        }
      }
    
      if ((x+w > playerX) && (x < playerX + 20)) {
        floorY = topY;
      }
       
      return x+w;
    }
     
    int drawlittleunit(int x) { 
      stroke(0,255,0);
      if(r < .5){
      fill(20,220,0);
      }
      else{
        fill(124,40,6);
      }
       
      int i;
      for (i=19;i>=0;i--) {
        if (blocks[i] == 1) {
          int y = int(height-(height*i)/20);
          int blockheight = int(height/20);
          rect(x, y/5, w/5, blockheight/5); // a fifth of the normal blocks size
        }
      }
      return x+w;
    }
     
  }
