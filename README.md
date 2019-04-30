# SciFi UI Project

Name:

Student Number: 

Fork this repository and use it a starter project for your assignment

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

- They spawn from a random x and y value and z to some random 	value from 0 to width.

- Before drawing i get a sx and sy for each star. For this i divide x by z and map that value from 0 to 1 in the range of 0 to width/2 so as the frames go on the speed increases while z gets smaller so the effect of the star zooms by.

 - The size of the star is also increased in a similar way only slightly.
Im also keeping track of the previous star positions in order to execute a cool looking hyper speed effect done simply by drawing a line (ui.line(px,py,sx,sy)) from the current star position to the previous position. 

- To keep hold a value from the previous position we do the same as what we do for sx and sy  but using pz instead of z. Finally to keep the stars coming as they're limited to what I set (slows down the program if i go up to [1000]. there a simple if(z<1) that resets the values when the stars have left the viewport.

*Cockpit*: 
- Mostly done with just drawing lines

- Realised pretty fast after doing some research the best way to do these none regular trapazoidal shaped was to use the beginShape() and endShape() using vertex(x,y) to have my custom shape.

- For the buttons that light up during use i drew them on the dashboard in a colour and then drew them again with the same coords in a lighter colour but only to appear when a key was pressed to trigger it.

- The sine wave at the top of the screen was a late addition just to give it more jazz. i drew it with ellipses in an oval shape with the x's and y's barely off of eachother to make the shape appear as one. I also randomized the colour of each shape and thought it looked really cool when i ran it.

*Reticle*:
- This was quite easy to implement basically just three circles with the same x and y with differing radius and lines going through it all controlled by mouseX and Y while the X and Y were inside the window area i didnt want the reticle shown at all times. 

- Laser beams also shot at where the middle of the reticle was form the turrets drawn earier. Basically just lines of varying thickness.

*Radar*:

- Used ellipses and a line that i rotated using the pushmatrix translate the new (0,0) , rotate(rotation)    finished with push matrix. 

- At the end once i had all my basics worked out i added the circular blue rotating sci fi looking gizmo that had rotating arc once again just to add some jazz.


*Audio*:
- Havent made an audio class i just implemented the audio cues in the class in which they relate to. 
'''
 Minim minim;
 AudioPlayer player;
 minim = new Minim(this);
player = minim.loadFile("Rocket Thruster-SoundBible.com-1432176431.mp3");
'''
 this is all i needed to load the song from my data folder.

To play it while you press a button i had to implement it as below so it would loop.
'''
        if(player.position() == player.length())
        {
            player.rewind();
            player.play();
        }
        else{
            player.play();
        }
'''



# What I am most proud of in the assignment
Probably the thing im most proud of has to be the Stars spawning and coming towards me because even with research it took me a while to get it working correctly to the point where it didnt look terrible. The Hyperjump effect also i think turned out great, plus the way the lights inside the cockpit flicker when you go into hyper jump adds to the whole effect



[![YouTube](http://img.youtube.com/vi/GTQSYgKNQ80/0.jpg)](https://youtu.be/GTQSYgKNQ80 )



