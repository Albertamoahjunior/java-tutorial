import javax.swing.JFrame;


public class myGUI {
    public static void main(String args[]){
        JFrame myFrame = new JFrame();
        String myTitle = "Blank";

        myFrame.setTitle(myTitle);
        myFrame.setSize(300,200);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
