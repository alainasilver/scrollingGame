 public class Shiny extends Sprite{
    float xShiny = xS;
    float yShiny = yS;
    int flavor; // prvsly float
    char value;

    float r = random(0, 1);
    float r1 = random(0, 1);
 
    
   // float thefloorS = board.whereIsFloor(xShiny, 20);
  
  int green = 10;
  int blue = 9;
  int purple = 8;
   
    public Shiny(){ // I really need to learn how to use a constructor properly
  /*
     xShiny = random(0, width);
     yShiny = random(thefloor - 8, thefloor);
     
     diffX = abs(x - xShiny);
     diffY = abs(y - yShiny);
     */
    
  
   
    }//constructor
    
    public int howGaudy(){ // idk what im doing, specifically "public", "static", etc
      if(r < .1){
        flavor = green;
      }
      if( .1 <= r && r < .17){
       flavor = blue; 
      }
     if( .17 <= r && r < .2){
      flavor = purple;  
     }
    else{
     flavor = 0; // oh man I hope I'm doing this correctly
    } 
      
      return flavor;
    }
    
   char getValue(){
     if(r1 < .5){
       value = '0';
     }
     else{
      value = '1'; 
     }
      return value; 
    }
  
    
    void drawShiny(){
    if(flavor == green){
      fill(48, 250, 56);
      ellipse(xShiny, yShiny, 10, 10);
    }
    
    if(flavor == blue){
      
      if(r < .5){
      fill(0, 87, 255);
      }
      else{
      fill(64, 218, 255);
      }
      ellipse(xShiny, yShiny, 10, 10);
    }
    
    if(flavor == purple){
      
      if(r < .33){
      fill(212, 129, 255);
      }
      if(.33 <= r && r < .66){
      fill(142, 11, 209);
      }
      else{
      fill(252, 23, 252);
      }
      ellipse(xShiny, yShiny, 10, 10);
    }
    
    
    }
    
    
  }
