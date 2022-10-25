

/**
 * Created by chales on 3/3/2018.
 */
public class RunMyProgram {
    public static void main(String[] args) {
        World run;

        run = (new B2_TeachMeNestedLoops()   );
        run.planeIcon = "plane.png";
        run.pictureFileName="output-onlinepngtools.png";
        run.HEIGHT=700;
        run.WIDTH=1300;
        run.Refresh();

        //new Thread(run).start();
    }
}
