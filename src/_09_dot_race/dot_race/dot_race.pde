int X=50;
void setup() {
    size(800, 200);
}

void draw() {
   //3. make the ellipse a nice color
fill(0,255,151);
    //4. If the mouse is pressed change the X co-ordinate so that the dot moves to the right
if (mousePressed) {
  X+=10;
}
    //5. Make your dot move faster
    //  (you have to figure out what part of your code to change)
if(X>800){
playSound();
}
background(#93A79F);
    //2. Draw an ellipse of height and width 10. Make sure to use your variable for the X position.
 ellipse(X,100,10,10);
    //6. Use the playSound() method to play a ding when your dot crosses the finish line. 
}

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding.wav");
        sound.trigger();
        soundPlayed = true;
    }
    
}
