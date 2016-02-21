   class Board {
      ArrayList Units;
       
      Board() {
        Units = new ArrayList();
        int unitheight = 5;
        for (int i=0;i<50;i++) {
          Units.add(new Unit(unitheight,20));
          if (random(1) < .10) {
            if (random(1) < .5) {
              if (unitheight > 0) unitheight--;
            } else {
              if (unitheight < 15) unitheight++;
            }
          }
        }
      }
       
      int moveForward() {
         
        int unitheight;
        unitheight = ((Unit)Units.get(Units.size()-1)).h;
        if (random(1) < .10) {
          if (random(1) < .5) {
            if (unitheight > 17 && unitheight >= 2) unitheight--;
          } 
          else {
            if (unitheight < 17) unitheight++;
          }
          Units.add(new Unit(unitheight,20));
          Units.remove(0);
          return ((Unit)Units.get(Units.size()-1)).w;//build
        } 
        
        else if (random(1) < .2) { // extra terrain
          Units.add(new Unit(0,20));
          Units.add(new Unit(0,20));
          Units.add(new Unit(0,20));
          Units.add(new Unit(0,20));
          Units.add(new Unit(unitheight,20));
          Units.remove(0);
          Units.remove(0);
          Units.remove(0);
          Units.remove(0);
          Units.remove(0);
          return 100;
         
        } else {
          Units.add(new Unit(unitheight,20));
          Units.remove(0);
          return ((Unit)Units.get(Units.size()-1)).w;
        }
        
      }
       
      void drawBoardLeftRight(int offset) {
        Unit unit;
        int x = offset;
        for (int i=10;i<Units.size();i++) {
          unit = (Unit)Units.get(i);
          x = unit.drawunit(x);
        } 
      }
      
      void drawBoardRightLeft(int offset){
       Unit unit;
      int x = offset;
     for(int i = Units.size(); i > 10; i--){
      unit = (Unit)Units.get(i);
      x = unit.drawunit(x);
     } 
      }
       
      void drawBoard(float pos,int offset) {
        Unit unit;
        int x = width+offset;
        for (int i= (Units.size()-1); i>1; i--) {
          unit = (Unit)Units.get(i);
          unit.drawunit(x);
          unit = (Unit)Units.get(i-1);
     
          x = x-unit.w;
        }
      }
   /*   void drawTinyB(int offset) {
        Unit unit;
        int x=width+offset;
        for (int i=Units.size()-1;i>0;i--) {
          unit = (Unit)Units.get(i);
          unit.drawlittleunit(x);
          x = x-int(unit.w/5);
        }
      }*/
      
      int lastUnitW() {
        return ((Unit)Units.get(0)).w;
    
      }
       
       
      float whereIsFloor(float x1, float w) {
         
        //find the highest point
        //between x and x+w (those represent the feet of the character)
        x1 -= 100;
        float x2 = x1+w;
        float floor = height*2;
        Unit unit;
        int x=width+offset;
        boolean show = false;
        if (random(0, 1) > .98){
         
          show = true;
        }
        
        for (int i=(Units.size()-1);i>1;i--) {
          unit = (Unit)Units.get(i);
           
          //falls off a forward edge too soon
       
          if (((x >= x1-unit.w) && (x <= x2))) {
            if (unit.topY < floor) {
              floor = unit.topY;
            }
          }
          x = x-unit.w;
        }
        
        return floor; 
      }
      
     
      
    }
