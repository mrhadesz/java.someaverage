import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUIFrom extends JFrame{
    private JButton myButton;
    private JTextArea myTextArea;
    private JPanel rootPanel;

    public MyGUIFrom(){
        add(rootPanel);

        setTitle("This is my Title");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPanel, "I'm a sqikz");
            }
        });
    }
}
