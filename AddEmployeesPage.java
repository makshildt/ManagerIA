import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.BoxLayout;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;

public class AddEmployeesPage extends JPanel {
    AddEmployeesPage() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JTextField id = new JTextField(10);
        JTextField firstName = new JTextField(10);
        JTextField lastName = new JTextField(10);
        JTextField email = new JTextField(10);
        JTextField role = new JTextField(10);
        JComboBox team = new JComboBox();


        // JTextField id = addTextField("ID: ");
        // addTextField("First Name: ");
        // addTextField("Last Name: ");
        // addTextField("Email: ");
        // addTextField("Role: ");
        // addField("Team", createTeamsComboBox());

        JButton AddEmployeesPageSubmit = new JButton("Add Employee");
        add(AddEmployeesPageSubmit);

        AddEmployeesPageSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Add Teams Page Submit Button Clicked");
                TestDb db = new TestDb().connect();
                db.update("INSERT INTO users (user_id, first_name, last_name, email, role) VALUES ('" + id.getText() + "', '" + firstName.getText() + "', '" + lastName.getText() + "', '" + email.getText() + "', '" + role.getText() + "')");
                db.disconnect();
                id.setText("");
                firstName.setText("");
                lastName.setText("");
                email.setText("");
                role.setText("");
                //team.setSelectedItem("");
            }
        });
    }

    // private JTextField addTextField(String name) {
    //     addField(name, new JTextField(10));
    // }

    // private void addField(String name, JComponent component) {
    //     JPanel panel = new JPanel();
    //     panel.add(new JLabel(name));
    //     panel.add(component);
    //     add(panel);
    // }

    private JComboBox createTeamsComboBox() {
        JComboBox teamComboBox = new JComboBox();
        TestDb db = new TestDb().connect();
        try {
            ResultSet resultSet = db.query("SELECT team_name FROM teams");
            while (resultSet.next()) {
                teamComboBox.addItem(resultSet.getString("team_name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return teamComboBox;
    }
}