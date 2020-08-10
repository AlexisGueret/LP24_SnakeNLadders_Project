package Views;

import Controllers.MenuController;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public MenuController menuController;
    public GlobalContent globalContent;

    public int gridWidth;
    public int gridHeight;

    private JMenuBar menuBar;

    private JMenu fileMenu;
    private JMenu helpMenu;

    public JMenuItem playItem;
    public JMenuItem closeItem;
    public JMenuItem rulesItem;

    public JScrollPane rulesScrollPane;

    public Window() {
        initAttributes();
        draw();
    }

    /**
     * init all parameters, attributes and components for main view
     */
    public void initAttributes() {

        this.menuController = new MenuController(this);

        //init window parameters
        this.setTitle("Snakes and Ladders");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //init grid size
        this.gridWidth = 6;
        this.gridHeight = 9;
        this.globalContent = new GlobalContent(this.gridHeight, this.gridWidth);

        //init components
        this.menuBar = new JMenuBar();

        this.fileMenu = new JMenu("File");
        this.helpMenu = new JMenu("Help");

        this.playItem = new JMenuItem("Play again ?");
        this.closeItem = new JMenuItem("Close");
        this.rulesItem = new JMenuItem("Games rules");

        rulesScrollPane = new JScrollPane(new Rules());
        rulesScrollPane.setBorder(null);

        // ------ Menu Bar ------
        this.playItem.addActionListener(menuController);
        this.fileMenu.add(playItem);
        this.fileMenu.addSeparator();
        this.closeItem.addActionListener(menuController);
        this.fileMenu.add(closeItem);
        this.menuBar.add(fileMenu);

        this.rulesItem.addActionListener(menuController);
        this.helpMenu.add(rulesItem);
        this.menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
    }

    /**
     * display the objects previously set on the user screen
     */
    public void draw() {

        this.setContentPane(this.globalContent);
        this.pack();
        this.setCenter();
        this.setVisible(true);



        QuestionDialog questionDialog = new QuestionDialog();

        if (questionDialog.askQuestion()) {
            System.out.println("Good work");
        } else {
            System.out.println("You're a shit");
        }



    }

    /**
     * set the window in the center of the screen of the user
     */
    public void setCenter() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * update the content of the window according to the new values of the grid
     */
    public void update() {
        this.globalContent.gridPanel.update(gridHeight, gridWidth);
        this.pack();
        this.setCenter();
    }

}
