public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
    //    plane.isTrail=true;
    //    plane.trailWidth = 50;\
    //    plane.pausetime=0;
    //    plane.teleport(0,0);
    //    prettysquares(1);
    //    plane.teleport(2000,2000);
        scene(plane.random(100,600));

    }

    public void prettysquares(int size) {

        for(int y=0;y<height;y=y+1) {

            for (int x=0;x<width;x=x+1) {
                System.out.println(x);
                plane.setColor(y,0,x);
                plane.square(size);
                plane.move(size);

            }

            plane.teleport((y+1)*size,0);

        }

    }

    public void scene(int a){
        plane.pausetime = 0;
        plane.teleport(0,0);
        plane.trailWidth = 2000;
        plane.setColor(0,plane.random(0,200),255);
        plane.square(2000);
        plane.teleport(a,100);
        plane.setColor(255,255,0);
        plane.trailWidth = 10;
        for (int w=0;w<90;w=w+1){
            plane.move(1);
            plane.turn(4);
        }
        plane. startingAngle(180);
        sunray();
        plane.teleport(a+60,100);
        plane.startingAngle(0);
        sunray();
        plane.teleport(a+30,130);
        plane.startingAngle(90);
        sunray();
        plane.teleport(a+30,70);
        plane.startingAngle(-90);
        sunray();
        plane.teleport(1000,1000);





    }
    public void sunray(){
        plane.isTrail = false;
        plane.move(20);
        plane.isTrail = true;
        plane.move(40);
    }

}


