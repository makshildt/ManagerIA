import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

class AddEmployeesPage extends JPanel {
    AddEmployeesPage() {
        addField("ID: ");
        addField("First Name: ");
        addField("Last Name: ");
        addField("Email: ");
        addField("Role: ");
    }

    private void addField(String name) {
        JPanel panel = new JPanel();
        panel.add(new JLabel(name));
        panel.add(new JTextField(10));
        add(panel);
    }
}