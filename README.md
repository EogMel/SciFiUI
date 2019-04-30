# SciFi UI Project

Name: Eoghan Mellott

Student Number: C17426754


# Description of the assignment
For my assignment i chose to go with the inside of a cockpit of some futeristic spaceship. Not influenced by any specific movie/franchise just Sci Fi in general. I knew straight away what i wanted to include in my assignment: Stars that come towards you to simulate endless space travel, buttons and controls that controls the spacecraft as well as the speed and for the buttons to react also inside the spacecraft, I wanted an extra button that would send the ship into hyper speed speeding the stars and leaving trails behind them and make all the lights on the inside flicker. There is a reticle for when the mouse is in the window range and two laser beams sticking out of the space craft that send a beam out into space. This is all accomanied by some sound effects i found for ambience and the hyperjump and laserbeam.

PS. Forgot to commit early in Project should be more.

# Instructions
- w: up
- d: right
- a: left
- s: down 

- f: accelerate
- r: accelerate X2

- ' ': shoot laser beam
- h : hyperjump

# How it works
*Stars*:
- Each star is an ellipse from an array of a few hundred.
```
Stars[] stars = new Stars[600];
```

- They spawn from a random x and y value and z to some random 	value from 0 to width.

- Before drawing i get a sx and sy for each star. For this i divide x by z and map that value from 0 to 1 in the range of 0 to width/2 so as the frames go on the speed increases while z gets smaller so the effect of the star zooms by.
```
        sx = ui.map(x / z, 0, 1, 0, ui.width/2);
        sy = ui.map(y / z, 0, 1, 0, ui.height/2);


        float r = ui.map(z, 0, ui.width/2, 20, 0);
        ui.fill(249, 234, 255);
        ui.ellipse(sx, sy, r, r);
```

 - The size of the star is also increased in a similar way only slightly as to not have them just appear weirdly out of nowhere.
Im also keeping track of the previous star positions in order to do a cool looking hyper speed effect done simply by drawing a line  from the current star position to the previous position. 
```
ui.line(px,py,sx,sy)
```


- To keep hold a value from the previous position we do the same as what we do for sx and sy  but using pz instead of z. Finally to keep the stars coming as they're limited to what I set (slows down the program if i go up to [1000]. there a simple if(z<1) that resets the values when the stars have left the edge of the screen.
```
         float px = ui.map(x / pz, 0, 1, 0, ui.width/2);
         float py = ui.map(y / pz, 0, 1, 0, ui.height/2);
         ```

*Cockpit*: 
- Mostly done with just drawing lines and vertices.

- Realised pretty fast after doing some research the best way to do these trapazoidal shaped was to use the beginShape() and endShape() using vertex(x,y) to have my custom shape.
```
        ui.beginShape();
        ui.vertex(0, quart);
        ui.vertex(quart, third/2);
        ui.vertex(ui.width-quart, third/2);
        ui.vertex(ui.width,quart);
        ui.vertex(ui.width,0);
        ui.vertex(0, 0);
        ui.vertex(0, quart);
        ui.endShape();
        ```

- For the buttons that light up during use i drew them on the dashboard in a colour and then drew them again with the same coords in a lighter colour but only to appear when a key was pressed to trigger it.
```
        ui.fill(89, 18, 0);
        ui.triangle(quart/2, ui.height-quart, quart/4+10, ui.height-quart+50, quart/2+quart/4-10, ui.height-quart+50);
////
        if (ui.checkKey('w') )
        {
            ui.fill(255,0,0);
            ui.triangle(quart/2, ui.height-quart, quart/4+10, ui.height-quart+50, quart/2+quart/4-10, ui.height-quart+50);
            
        }
  ```

- The sine wave at the top of the screen was a late addition just to give it more jazz. i drew it with ellipses in an oval shape with the x's and y's barely off of eachother to make the shape appear as one. I also randomized the colour of each shape and thought it looked really cool when i ran it. Used increasing y values to make it go up and down in a for loop.
```
       for (int x = 0; x < ui.yvalues.length; x++) {
            ui.colorMode(UI.HSB);
            ui.fill(ui.random(100,255),ui.random(100,255),ui.random(100,255));
          ui.ellipse(x*ui.xspacing+(ui.width/13)*5, ui.height/12+ui.yvalues[x], 40, 16);
          ui.colorMode(UI.RGB);
          
        }
 ```

*Reticle*:
- This was quite easy to implement basically just three circles with the same x and y with differing radius and lines going through it all controlled by mouseX and Y while the X and Y were inside the window area i didnt want the reticle shown at all times. 
```

        if(ui.mouseY > quart/2 && ui.mouseY < ui.height - quart){
        ui.noFill();
        ui.stroke(255,0,0);
        ui.line(ui.mouseX+50,ui.mouseY, ui.mouseX-50,ui.mouseY);
        ui.line(ui.mouseX,ui.mouseY+50, ui.mouseX,ui.mouseY-50);
        ui.ellipse(ui.mouseX, ui.mouseY, 100, 100);
        ui.ellipse(ui.mouseX, ui.mouseY, 150, 150);
        ui.ellipse(ui.mouseX, ui.mouseY, 200, 200);
        }
```

- Laser beams also shot at where the middle of the reticle was form the turrets drawn earier. Basically just lines of varying thickness.
```
        if (ui.checkKey(' ') )
        {   
            ui.stroke(183, 62, 1);
            ui.strokeWeight(6);
            ui.line(quart + 55, ui.height-quart-50, ui.mouseX,ui.mouseY);
            ui.stroke(178, 37, 1);
            ui.strokeWeight(4);
            ui.line(quart + 55, ui.height-quart-50, ui.mouseX,ui.mouseY);
            ui.stroke(255);
            ui.strokeWeight(1);
            ui.line(quart + 55, ui.height-quart-50, ui.mouseX,ui.mouseY);
            ```
*Radar*:

- Used ellipses and a line that i rotated using the pushmatrix translate the new (0,0) , rotate(rotation)    finished with push matrix. 
```
        ui.pushMatrix();
        
        ui.translate(ui.width/2,midDash);
        ui.rotate(rotation);
        ui.stroke(0); 
        ui.noFill();
        ui.fill(21, 180, 37);

        ui.ellipse(0, 0, diameter, diameter);
        ui.noFill();
        ui.ellipse(0, 0, (diameter/4)*3, (diameter/4)*3);
        ui.ellipse(0, 0, diameter/2, diameter/2);
        ui.ellipse(0, 0, diameter/4, diameter/4);
        ui.line(0, 0, radius, 0);
        
        ui.popMatrix();
   ```
 
- At the end once i had all my basics worked out i added the circular blue rotating sci fi looking gizmo that had rotating arc once again just to add some jazz.
```
        ui.pushMatrix();
        ui.translate(ui.width-quart+radius+20, midDash);
        ui.rotate(rotation);
        ui.stroke(75);
        ui.strokeWeight(3);
        ui.fill(53, 94, 160);
        ui.ellipse(0, 0, diameter, diameter);

        ui.strokeWeight(8);
        ui.stroke(0,0,255);
        ui.arc(0, 0, diameter-18, diameter-18, 0, UI.HALF_PI *4/3);
        ui.stroke(250,0,250);
        ui.arc(0, 0, diameter-40, diameter-40, UI.HALF_PI, 3/2*UI.PI);
        ui.stroke(150,50,255);
        ui.arc(0, 0, diameter-60, diameter-60, 0-UI.PI, UI.HALF_PI-UI.QUARTER_PI);
        ui.stroke(255,50,50);
        ui.arc(0, 0, diameter-85, diameter-85, 0-UI.HALF_PI, UI.PI);


        ui.popMatrix();
        ```


*Audio*:
- Havent made an audio class i just implemented the audio cues in the class in which they relate to. 
```
 Minim minim;
 AudioPlayer player;
 minim = new Minim(this);
player = minim.loadFile("Rocket Thruster-SoundBible.com-1432176431.mp3");
```
 this is all i needed to load the song from my data folder.

To play it while you press a button i had to implement it as below so it would loop.
```
        if(player.position() == player.length())
        {
            player.rewind();
            player.play();
        }
        else{
            player.play();
        }
```



# What I am most proud of in the assignment
Probably the thing im most proud of has to be the Stars spawning and coming towards me and the ability to have somewhat control of the ship because even with research it took me a while to get it working correctly to the point where it didnt look off. The Hyperjump effect also i think turned out great, plus the way the lights inside the cockpit flicker when you go into hyper jump adds to the whole effect.
Im also proud of the design, the drawing of the shapes and buttons using the vertices all look nice and clean. 



[![YouTube](http://img.youtube.com/vi/GTQSYgKNQ80/0.jpg)](https://youtu.be/GTQSYgKNQ80 )



