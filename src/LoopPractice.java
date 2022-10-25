public class LoopPractice extends World {

    public void go() {
        plane.pausetime = 0;
        for(int x=0;x<1000;x=x+1){
            plane.teleport(plane.random(100,1400),plane.random(100,700));
            drawRandomShape();
        }


        }

    public void drawRandomShape(){
        int random = plane.random(2,2);
        System.out.println(random);
        if(random == 0){
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.move(10);
            plane.square(100);
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.move(10);
            plane.square(100);
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.move(10);
            plane.square(100);
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.move(10);
            plane.square(100);
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.move(10);
            plane.square(100);
        }
        if(random == 1){
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.move(10);
            plane.house(100);
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.move(10);
            plane.house(100);
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.move(10);
            plane.house(100);
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.move(10);
            plane.house(100);
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.move(10);
            plane.house(100);
        }
        if(random == 2){
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.move(10);
            plane.fillCircle(100);
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.move(10);
            plane.fillCircle(100);
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.move(10);
            plane.fillCircle(100);
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.move(10);
            plane.fillCircle(100);
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.move(10);
            plane.fillCircle(100);
        }
    }

}
