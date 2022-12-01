import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class AddTasksDeadlinesPage extends JPanel {
    AddTasksDeadlinesPage() {
        addField("Task: ");
        addField("Deadline: ");
        addField("For Team: ");
    }

    private void addField(String name) {
        JPanel panel = new JPanel();
        panel.add(new JLabel(name));
        panel.add(new JTextField(10));
        add(panel);
    }
}