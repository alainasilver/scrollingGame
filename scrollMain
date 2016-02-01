Board board;
    int offset;
    int cycles; // how many times it's run
    float stepSize;
    float pos;
    PFont font;
     
    boolean forward;
    boolean back;
    float floorY;
    float playerX; //width
    Player hero;
    PGraphics buffer;
    PImage img; // credit for this idea/use goes to the people on stack overflow
    
    float runTime;
    float startTime;
    float stopTime;
    float now;
    float traveled;
     
    char [] binary;  
   
  
  
  
    
    float r = random(0,1);
     
     ArrayList<Shiny> shinies;
     
    //////////////////////
    //////////////////////
     
    void setup() {
      size(600,400); //,P2D);
     
      stroke(255);
      background(167, 238, 255);
       
      board = new Board(); 
      offset = 0;
      font = createFont("verdana",14);
      textFont(font);
       
      
           shinies = new ArrayList<Shiny>(); 
      
       binary = new char[8];
       
       for(int i = 0; i < 8; i++){
        binary[i] = 'x'; // fill array with x's
       }
       
      playerX = width*.33;
    hero = new Player(playerX);
     
      buffer = createGraphics(width, height);
      startTime = millis();
     
    }
    
     //////////////////////
    //////////////////////
    
      void draw() {
      if (forward && !back) {
        if (!hero.dead ) {
          hero.forward();   
        }
      }
        if(back && !forward){
         if(!hero.dead ){
           hero.back();
           
        }
      }
      
        
       if(r < .01){
       shinies.add(new Shiny()); // reference pacman line 82
       }
       
  for (int i = shinies.size()-1 ; i >= 0; i--) {
  
        //shinies.get(i).howGaudy();
        //shinies.get(i).drawShiny();
        //shinies.get(i).getValue();
        
     // boolean get = shinies.get(i).get();
     
     boolean get = hero.get();
      //}
       
       if(get){
         boolean place = false;
         
         for(int j = 0; j < 8; j++){
         if(binary[i] == 'x'){
           if(place == false){
         if( shinies.get(i).howGaudy() == 10){
           binary[i] = shinies.get(i).getValue();; // start filling array with Shiny's value
           place = true;
         }
         if( shinies.get(i).howGaudy() == 9){
           for(int k = 0; k <= 2; k++){
           binary[i] = shinies.get(i).getValue();; // fill multiple slots w/ shiny value
           place = true;
           }
         }
         
          if( shinies.get(i).howGaudy() == 8){ // HIGH RARITY GET! PURPLE RELIC YEAHHHH
           for(int g = 0; g <= 3; g++){
           binary[i] = shinies.get(i).getValue();; 
           place = true;
           }
         }
           }// end if place
         }// end binary[i] = 'x' 
         }// end for
        
        shinies.remove(0);
       
       }
       }// end get
      
       
      stepSize = hero.doPlayer();
      traveled += stepSize-10;
       
      offset = int(offset - stepSize);
         
      if (offset <= -1 * board.lastUnitW()) {
        offset = offset + board.moveForward();
      }
      buffer.beginDraw();
      buffer.background(0);
      board.drawBoard(pos, offset+100);
     hero.drawPlayer();
      if (hero.dead == false) {
        now = millis() - startTime;
      } 
      else if (millis() - stopTime > 3000) {
        startTime = millis();
        traveled = 0;
        hero = new Player(playerX);
      }
      buffer.text(now,20,20);
      buffer.text(traveled,20,50);
       
      buffer.endDraw();
       
      img = buffer.get(0, 0, buffer.width, buffer.height);
      image(img, 0, 0); // start in corner
    }
    
    //////////////////////
    //////////////////////
    
    void keyPressed() {
      if (keyCode==RIGHT) {
        forward = true;
        back = false;
        //println("RIGHT");
      } else if (keyCode == LEFT) {
        back = true;
        forward = false;
      } else if (key == ' ') {
        hero.jump();
      }
      
    }
    void keyReleased() {
      if (keyCode==RIGHT) {
        forward = false;
        stepSize = 0;
        cycles = 0;
      } else if (keyCode == LEFT) {
        back = false;
      }
    }
    
  
