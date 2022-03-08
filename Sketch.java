import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {

    // sun
    float fltSunX = random(0, 350);
    float fltSunY = random(0, width);
    float fltSunD = random(60, 120);
    fill(255, 255, 0);
    ellipse(fltSunX, fltSunY, fltSunD, fltSunD);

    // blue background green grass
    if (fltSunY <= 100) {
      background(135, 206, 235);
      ellipse(fltSunX, fltSunY, fltSunD, fltSunD);
      fill(86, 125, 70);
      rect(0, 350, 400, 50);
    }

    // orange background brown ground
      else if (fltSunY > 101 && fltSunY < 200) {
      background(255, 160, 1);
      ellipse(fltSunX, fltSunY, fltSunD, fltSunD);
      fill(120, 198, 51);
      rect(0, 350, 400, 50);
    }
    // pink background blue ground
        else if (fltSunY > 201 && fltSunY < 400) {
      background(180, 51, 198);
      ellipse(fltSunX, fltSunY, fltSunD, fltSunD);
      fill(46, 103, 180);
      rect(0, 350, 400, 50);
    }
    // time 
    fill(0, 0, 0);
    textSize(16);
    text(day() + "/" + month() + "/" + year() + "  " + (hour() + ":" + minute() + ":" + second()), 20, 30);

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // red square
    fill(203, 65, 84);
    rect(175, 150, 200, 200);

    // door
    fill(150, 75, 0);
    rect(225, 225, 50, 125);

    // door knob
    fill(172, 140, 24);
    ellipse(260, 300, 10, 10);

    // window
    fill(135, 206, 235);
    rect(300, 225, 50, 50);
    line(325, 225, 325, 275);
    line(300, 250, 350, 250);

    // roof
    fill(0, 0, 128);
    triangle(150, 150, 275, 50, 400, 150);

  }
  
  // define other methods down here.
}