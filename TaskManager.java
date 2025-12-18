import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TaskManager extends JFrame {

    private JTextField taskInput;
    private DefaultListModel<String> listModel;
    private JList<String> taskList;

    public TaskManager() {
        // Cấu hình cơ bản cho cửa sổ
        setTitle("Team Task Manager - Version 1.0");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initUI();
    }

    private void initUI() {
        // Layout chính
        setLayout(new BorderLayout());

        // Panel nhập liệu
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        taskInput = new JTextField(20);
        JButton addButton = new JButton("Thêm");

        // --- VỊ TRÍ CODE CỦA MEMBER 1 (Thêm chức năng Add) ---
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Member 1 sẽ code logic thêm task vào đây
                JOptionPane.showMessageDialog(null, "Chức năng chưa được cài đặt!");
            }
        });

        // --- VỊ TRÍ CODE CỦA MEMBER 2 (Thêm chức năng Clear) ---
        JButton clearButton = new JButton("Xóa Hết");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Member 2 sẽ code logic xóa hết task vào đây
                JOptionPane.showMessageDialog(null, "Chức năng chưa được cài đặt!");
            }
        });

        inputPanel.add(taskInput);
        inputPanel.add(addButton);
        inputPanel.add(clearButton);

        add(inputPanel, BorderLayout.NORTH);

        // Danh sách hiển thị
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        add(new JScrollPane(taskList), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TaskManager().setVisible(true);
        });
    }
}