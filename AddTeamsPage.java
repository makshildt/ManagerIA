import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddTeamsPage extends JPanel {
    AddTeamsPage() {
        JLabel label = new JLabel("Add Teams Page");
        add(label);
        JTextField textField = new JTextField((10));
        add(textField);
        JButton AddTeamsPageSubmit = new JButton("Add Team");
        add(AddTeamsPageSubmit);
        //write input from text field to sql.sql as a new team
    }
}