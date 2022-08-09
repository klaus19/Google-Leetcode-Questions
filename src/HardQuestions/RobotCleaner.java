package HardQuestions;


import java.util.HashSet;
import java.util.Set;

// This is the robot's control interface.
  // You should not implement it, or speculate about its implementation
 interface Robot {
     // Returns true if the cell in front is open and robot moves into the cell.
     // Returns false if the cell in front is blocked and robot stays in the current cell.
     public boolean move();

      // Robot will stay in the same cell after calling turnLeft/turnRight.
      // Each turn will be 90 degrees.
      public void turnLeft();
      public void turnRight();

      // Clean the current cell.
      public void clean();
  }


public class RobotCleaner {

     private static int[][]DIRECTIONS = new int[][]{{-1,0},{0,1},{1,0},{0,-1}}; //UP,RIGHT,DOWN,LEFT

     public void cleanRobot(Robot robot){
         dfs(0,0,robot,0,new HashSet<>());
     }

    private void dfs(int row, int col, Robot robot, int currentDirection, Set<String> visited) {

         String key = String.valueOf(row + ',' + col);

         if (!visited.contains(key)){
             visited.add(key);

             robot.clean();

             for (int i=0;i<4;i++){
                 if (robot.move()){
                     int[]direction = DIRECTIONS[currentDirection];
                     int nextRow = row+direction[0];
                     int nextColumn = col+direction[1];

                     dfs(nextRow,nextColumn,robot,currentDirection,visited);

                 }
                 robot.turnRight();
                 currentDirection = (currentDirection+1)%4; // If current direction is LEFT, then move to UP (next direction)

             }
         }
         backTrack(robot);


    }

    private void backTrack(Robot robot) {

         robot.turnRight();
         robot.turnRight();
         robot.move();
         robot.turnLeft();
         robot.turnLeft();
    }
}
