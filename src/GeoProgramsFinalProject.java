public class GeoProgramsFinalProject extends World{

    public void go() {
        plane.teleport(-1000,-1000);
        ground();
        trees();
        mountains();
        airplane();
        sun(plane.random(0,4));

    }

    public void ground() {
        plane.teleport(-1,660);
        plane.trailWidth = 40;
        plane.pausetime = 0;
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.setColor(92,46,0);
        plane.move (1300);
    }
    public void trees() {
        for(int x=0;x<1351;x=x+50) {
            plane.teleport(x, 640);
            plane.startingAngle(-90);
            plane.setColor(46, 23, 0);
            plane.trailWidth = 25;
            plane.move(50);
            plane.setColor(0,100,0);
            plane.trailWidth = 30;
            plane.triangle(70);
        }
    }
    public void mountains() {
        plane.teleport(-70,520);
        plane.trailWidth = 3;
        plane.setColor(100,100,100);
        plane.isTrail = true;
        mountain();
        plane.teleport(295,441);
        mountain();
        plane.move(117);
        plane.teleport(637,344);
        plane.startingAngle(-60);
        plane.move(300);
        plane.turn(-120);
        plane.move(294);
        plane.teleport(784,466);
        mountain();
        plane.move(100);
    }
    public void mountain() {
        plane.startingAngle(-40);
        plane.move(300);
        plane.turn(-80);
        plane.move(300);
    }
    public void airplane() {
        plane.teleport(800,100);
        plane.loadBackGround("output-onlinepngtools.png");
        plane.showBackGround();
        plane.teleport(10000,10000);
    }
    public void sun(int a) {
        plane.setColor(250,250,0);
        plane.trailWidth = 30;
        for(int z=0;z<a;z++) {
            plane.teleport(plane.random(200, 600), 200);
            plane.fillCircle(1);
        }
    }


}


