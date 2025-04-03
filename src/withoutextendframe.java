import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class withoutextendframe {
    public withoutextendframe() {
        Frame frame =new Frame();


        TextField username = new TextField();
        username.setBounds(20,120,150,30);


        Label label=new Label("Good Luck");
        label.setBounds(20,90,150,30);


        Button button= new Button("Click Me");
        button.setBounds(20,40,80,30);


        frame.add(button);
        frame.add(label);
        frame.add(username);


        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        withoutextendframe obj = new withoutextendframe();
    }
}
