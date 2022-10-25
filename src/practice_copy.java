public class practice_copy extends World {
    public void go() {

        village();
    }

    public void triangle(int side) {
        plane.startingAngle(0);
        plane.move(side);
        plane.turn(120);
        plane.move(side);
        plane.turn(120);
        plane.move(side);
        plane.turn(120);

    }
    public void square(int side) {
        plane.move(side);
        plane.turn(-90);
        plane.move(side);
        plane.turn(-90);
        plane.move(side);
        plane.turn(-90);
        plane.move(side);
        plane.turn(-90);
    }
    public void house(int size){
        plane.trailWidth = 15;
        plane.setColor(82,42,22);
        triangle(size);
        square(size);
    }
    public void house_row(){
        house(200);
        plane.teleport(230,200);
        house(200);
        plane.teleport(450,200);
        house(200);
        plane.teleport(670,200);
        house(200);
        plane.teleport(890,200);
        house(200);
        plane.teleport(1110,200);
        house(200);
        plane.teleport(1330,200);
        house(200);
    }
    public void road(){
        plane.teleport(-5,420);
        plane.trailWidth = 150;
        plane.setColor(90,90,90);
        plane.startingAngle(0);
        plane.move(1500);
        plane.turn(180);
        plane.teleport(1500,485);
        plane.setColor(255,255,0);
        plane.trailWidth = 15;
        road_lines();
        road_lines();
        road_lines();
        road_lines();
        road_lines();
        road_lines();
        road_lines();
        road_lines();
        road_lines();
        road_lines();

    }
    public void road_lines(){
        plane.isTrail = true;
        plane.move(75);
        plane.isTrail = false;
        plane.move(75);
    }
    public void grass(){
        grass_patch();
        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(150);
        grass_patch();
        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(150);
        grass_patch();
        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(150);
        grass_patch();
        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(150);
        grass_patch();
        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(150);
        grass_patch();
        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(150);
        grass_patch();
        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(150);

        }
    public void grass_patch(){
        plane.startingAngle(60);
        plane.setColor(72,166,0);
        plane.isTrail = true;
        plane.trailWidth = plane.random(1,20);
        plane.move(100);
        plane.turn(120);
        plane.move(100);
        plane.turn(180);
        plane.move(100);
        plane.turn(-150);
        plane.move(85);
    }
    public void lawn(){
        plane.teleport(30,590);
        grass();
        plane.teleport(30,690);
        grass();
    }
    public void village(){
        plane.teleport(10, 200);
        plane.pausetime = 0;
        plane.isTrail = true;
        house_row();
        road();
        lawn();
        person(plane.random(1,10));
    }
    public void person(int head_size){
        plane.teleport(500,450);
        plane.startingAngle(-60);
        plane.setColor(0,0,0);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.move(75);
        plane.turn(-120);
        plane.move(75);
        plane.turn(180);
        plane.move(75);
        plane.turn(-30);
        plane.move(60);
        plane.turn(180);
        plane.move(20);
        plane.turn(90);
        plane.move(35);
        plane.turn(180);
        plane.move(70);
        plane.turn(180);
        plane.move(35);
        plane.turn(90);
        plane.move(20);
        plane.startingAngle(180);
        for(int x=0; x<360; x=x+1) {

            plane.move(head_size);
            plane.turn(-10);
        }
        plane.teleport(400,400);
    }

}