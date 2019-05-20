//import javax.swing.*;
//
//public class HelloWorld {
//    public static void main(String[] args){//driver class main method- gets run first
//        //public means it can be accessed by other classes
//        //void is the return type, main will never return anything
//        //static is the context
//      //  System.out.println("Hello,World!");// shortcut was sout and tab button
//        //system.out.println is the same as console.log
//        //run control shift r to get it to run the program
//        javax.swing.SwingUtilities.invokeLater(new Runnable(){
//            public void run(){
//                createAndShowGUI();
//            }
//        });
//    }                                  
//    private static void createAndShowGUI(){
//                JFrame frame = new JFrame("HelloWorldSwing");
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        //add hello world label
//        JLabel label = new JLabel("Hello World");
//        frame.getContentPane().add(label);  //when inside a closed parethesis
//
//        //display the window
//        frame.pack();
//        frame.setVisible(true);
//    }
//}
//
      import java.awt.*;
     public class HelloWorld{
    public static void main(String[] args){
        World world = new World();             // create the world first the lower case world is the variable of the function
        Turtle tom = new Turtle(world); // give the turtle a world to be in so world is inside turtle
        //String world1 = "string";
        Turtle randy = new Turtle(world);

//        //all variables in java
//        int 1=0;     // integer goes to 2^64 -1 long number     n^32-1
//        double 1= 0.9;    // double the percision of the float, used more than float
//        float k - 0.0f;
//        String string= "new string";      // "" means a string
//        char c = 'c';                 // ' ' is for the one character only
//        boolean b = true;
//        long l = 90001;

       // do a barrellroll
        tom.setBodyColor(Color.blue);
        tom.setPenColor(Color.blue);
       tom.forward();
       tom.turnLeft();
       tom.forward();
       tom.turnLeft();
       tom.forward();
       tom.turnLeft();
       tom.forward();
       tom.turnLeft();

       randy.setBodyColor(Color.red);
       randy.setPenColor(Color.red);
       //randy.penUp();
       randy.turn(45);
       randy.forward();
       randy.turn(45);
       randy.forward();
       randy.turn(45);
       randy.forward();
       randy.turn(45);
       randy.forward();
       randy.turn(45);
       randy.forward();
       randy.turn(45);
       randy.forward();
       randy.turn(45);
       randy.forward();
       randy.turn(45);
       randy.forward();  
     //randy.penDown();

       //0 is up
        randy.setHeading(0);
        randy.forward();

        for (int i= 0; i < 8; i++) {
            tom.forward();
            tom.turn(45);
            tom.setPenColor(Color.getColor(""; int v););
            randy.turn(60);
            randy.forward();
        }




      



    }

}
