package src.view;

import javax.swing.*;
import java.awt.*;

public class View {

    public static final int WIDTH = 900, HEIGHT = 600;

    JFrame mainFrame;
    JPanel mapPanel, dataPanel, frontierPanel, exploredPanel;
    JLabel algorithmLabel;


    public View() {
        mainFrame = new JFrame("Artificial Intelligence - Search");
        mapPanel  = new JPanel();
        dataPanel = new JPanel();
        frontierPanel = new JPanel();
        exploredPanel = new JPanel();
        algorithmLabel = new JLabel();

    }

    public void init() {
        initMainFrame();
        initMapPanel();
        initDataPanel();
        initDataComponents();
    }

    private void initDataComponents() {
        initAlgorithmLabel();
        initFrontierPanel();
        initExploredPanel();
    }

    private void initAlgorithmLabel(){

    }

    private void initFrontierPanel(){

    }

    private void initExploredPanel(){

    }

    private void initMainFrame() {
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setMinimumSize(new Dimension(WIDTH,HEIGHT));
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setLayout(new BorderLayout());
    }

    private void initMapPanel() {
        mapPanel.setPreferredSize(new Dimension(2*WIDTH/3,HEIGHT));
        mapPanel.setVisible(true);
        mapPanel.setBackground(Color.BLUE);
        mainFrame.add(mapPanel, BorderLayout.EAST);
    }

    private void initDataPanel() {
        dataPanel.setPreferredSize(new Dimension(WIDTH/3,HEIGHT));
        dataPanel.setVisible(true);
        dataPanel.setBackground(Color.RED);
        dataPanel.setLayout(new BoxLayout(dataPanel, BoxLayout.Y_AXIS));
        mainFrame.add(dataPanel, BorderLayout.WEST);
    }
}
