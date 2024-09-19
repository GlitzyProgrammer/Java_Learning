import javax.swing.JOptionPane;

public class Display {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        String message=  String.format("Welcome, %s, to Java!", name);
        JOptionPane.showMessageDialog(null, args, message, 0);
        //simple display window with the javax.swing.JoptionPane package
        // the text used was a static method which are stuff used frquently enough that programers made it a simple call
      ///  PS C:\Users\ljwil\Desktop\Java Folder> javac Display.java
        //PS C:\Users\ljwil\Desktop\Java Folder> java Display
    }
}
