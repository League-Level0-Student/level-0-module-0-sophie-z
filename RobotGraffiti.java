package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot Rob = new Robot ();
	Rob.penDown();
	Rob.setSpeed(50);
	Rob.turn(90);
	Rob.move(100);
	Rob.turn(270);
	Rob.move(100);
	Rob.turn(270);
	Rob.move(100);
	Rob.turn(90);
	Rob.move(100);
	Rob.turn(90);
	Rob.move(100);
}
}
