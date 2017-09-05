package Examples.AnalogClock;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class MyFrame extends javax.swing.JFrame {

    private Surface clock;

    public MyFrame(String title){
        super(title);        
        initComponents();
        
        Dimension d = getToolkit().getScreenSize();
        this.setLocation(d.width/2 - getWidth()/2, d.height/2 - getHeight()/2);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponents(){
        javax.swing.UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        java.awt.Container content = getContentPane();
        content.setLayout(new BoxLayout(content, BoxLayout.X_AXIS));

        JButton startStop = new JButton("Start/Stop");
        
        JPanel startPanel = new JPanel(new GridLayout()){
            @Override
            public Dimension getPreferredSize(){
                return new Dimension(150, 25);
            }
            @Override
            public Dimension getMinimumSize(){
                return getPreferredSize();
            }
            @Override
            public Dimension getMaximumSize(){
                return getPreferredSize();
            }
        };
        startPanel.add(startStop);   
       
        JPanel left = new JPanel();
        left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
        
        clock = new Surface();

        JPanel clockStylePanel = getClockStylePanel();
        JPanel handStylePanel = getHandStylePanel();
        JPanel comboboxPanel = getComboBoxPanel();
        JPanel buttonPanel = getButtonPanel();
        JPanel captionPanel = getCaptionPanel();

        left.add(Box.createRigidArea(new Dimension(1, 5)));
        left.add(startPanel);        
        left.add(Box.createRigidArea(new Dimension(1, 5)));
        left.add(clockStylePanel);
        left.add(Box.createRigidArea(new Dimension(1, 5)));
        left.add(handStylePanel);        
        left.add(Box.createRigidArea(new Dimension(1, 5)));
        left.add(comboboxPanel);
        left.add(buttonPanel);
        left.add(captionPanel);

        startStop.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                clock.play();
            }
        });

        content.add(left);
        content.add(clock);
        setResizable(false);

        startStop.doClick();        
        setSize(new Dimension(500, 355));  
        setIconImage(Toolkit.getDefaultToolkit().getImage("./src/img/time.png"));
    }

    private JPanel getClockStylePanel(){
        JPanel panel = new JPanel() {
            @Override public Dimension getMinimumSize(){
                return getPreferredSize();
            }
            @Override public Dimension getMaximumSize(){
                return getPreferredSize();
            }
            @Override public Dimension getPreferredSize(){
                return new Dimension(155, 40);
            }            
        };
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.setBorder(new TitledBorder("Clock Style"));

        final JRadioButton standard = new JRadioButton("Standard");
        final JRadioButton classic  = new JRadioButton("Classic");

        standard.setSelected(true);

        standard.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                clock.setClockStyles(Surface.ClockStyles.Standard);
            }
        });
        classic.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                clock.setClockStyles(Surface.ClockStyles.Classic);
            }
        });

        ButtonGroup clokStyle = new ButtonGroup();
        clokStyle.add(standard);
        clokStyle.add(classic);       

        panel.add(standard);
        panel.add((Box.createRigidArea(new Dimension(10, 1))));
        panel.add(classic);

        return panel;
    }

    private JPanel getHandStylePanel(){
        JPanel panel = new JPanel() {
            @Override public Dimension getMinimumSize(){
                return getPreferredSize();
            }
            @Override public Dimension getMaximumSize(){
                return getPreferredSize();
            }
            @Override public Dimension getPreferredSize(){
                return new Dimension(155, 40);
            }
        };
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.setBorder(new TitledBorder("Hand Style"));     
        
        final JRadioButton uniform = new JRadioButton("Uniform");
        final JRadioButton sharp = new JRadioButton("Sharp");

        sharp.setSelected(true);

        ButtonGroup handStyle = new ButtonGroup();
        handStyle.add(uniform);
        handStyle.add(sharp);

        uniform.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                clock.setHandStyles(Surface.HandStyles.Uniform);
            }
        });
        sharp.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                clock.setHandStyles(Surface.HandStyles.Sharp);
            }
        });

        panel.add(uniform);
        panel.add((Box.createRigidArea(new Dimension(25, 1))));
        panel.add(sharp);
        
        return panel;
    }

    private JPanel getComboBoxPanel(){
        JPanel panel = new JPanel(new GridLayout(3, 1, 5, 5)){
            @Override public Dimension getMinimumSize(){
                return getPreferredSize();
            }
            @Override public Dimension getMaximumSize(){
                return getPreferredSize();
            }
            @Override public Dimension getPreferredSize(){
                return new Dimension(170, 80);
            }
        };
        
        Surface.TickStyles[] Tick = {
            Surface.TickStyles.All,
            Surface.TickStyles.Twelve,
            Surface.TickStyles.Quadric,
            Surface.TickStyles.None
        };
        Surface.DateStyles[] Date = {
            Surface.DateStyles.Full,
            Surface.DateStyles.DayOfMonth,
            Surface.DateStyles.None
        };

        Surface.NumberStyles[] Number = {
            Surface.NumberStyles.All,
            Surface.NumberStyles.Quadric,
            Surface.NumberStyles.None
        };

        final JComboBox tick   = getComboBox(Tick);
        final JComboBox date   = getComboBox(Date);
        final JComboBox number = getComboBox(Number);
        

        tick.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                Surface.TickStyles style = (Surface.TickStyles)tick.getSelectedItem();
                clock.setTickStyles(style);
            }
        });
        date.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                Surface.DateStyles style = (Surface.DateStyles)date.getSelectedItem();
                clock.setDateStyles(style);
            }
        });
        number.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                Surface.NumberStyles style = (Surface.NumberStyles)number.getSelectedItem();
                clock.setNumberStyles(style);
            }
        });
        
        panel.setBorder(new EmptyBorder(0, 7, 0, 5)); 

        Box box1 = new Box(BoxLayout.X_AXIS);        
        box1.add(getLabel("Ticks :"));
        box1.add(tick);

        Box box2 = new Box(BoxLayout.X_AXIS);
        box2.add(getLabel("Date :"));
        box2.add(date);

        Box box3 = new Box(BoxLayout.X_AXIS);
        box3.add(getLabel("Number :"));
        box3.add(number);

        panel.add(box1);   
        panel.add(box2);
        panel.add(box3);

        return panel;
    }

    private JLabel getLabel(String text) {        
        JLabel label = new JLabel(text) {
            @Override public Dimension getMinimumSize() {
                return getPreferredSize();
            }
            @Override public Dimension getMaximumSize() {
                return getPreferredSize();
            }
            @Override public Dimension getPreferredSize() {
                return new Dimension(60, 22);
            }            
        };
        label.setFont(new Font("Tahoma", Font.PLAIN, 12));
        
        return label;
    }
    
    private JComboBox getComboBox(Object[] items){
        JComboBox combo = new JComboBox(items){            
            @Override public Dimension getMinimumSize() {
                return getPreferredSize();
            }
            @Override public Dimension getMaximumSize() {
                return getPreferredSize();
            }
            @Override public Dimension getPreferredSize() {
                return new Dimension(95, 22);
            }
        };
        return combo;
    }
   
    private JPanel getButtonPanel(){
        JPanel panel = new JPanel(new GridLayout(3, 2, 2, 2)){
            @Override
            public Dimension getMinimumSize(){
                return getPreferredSize();
            }
            @Override
            public Dimension getMaximumSize(){
                return getPreferredSize();
            }
            @Override
            public Dimension getPreferredSize(){
                return new Dimension(170, 90);
            }
        };

        JButton numberColor = new JButton("Number");
        JButton tickColor   = new JButton("Tick");
        JButton hourColor   = new JButton("Hour");
        JButton minColor    = new JButton("Minute");
        JButton secondColor = new JButton("Second");
        JButton textColor   = new JButton("Text");
        
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));

        numberColor.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                Color initialCol = clock.getNumberColor();
                Color c = javax.swing.JColorChooser.showDialog(null, "", initialCol);
                if(c != null)
                    clock.setNumberColor(c);
            }
        });

        tickColor.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                Color initialCol = clock.getTickColor();
                Color c = javax.swing.JColorChooser.showDialog(null, "", initialCol);
                if(c != null)
                    clock.setTickColor(c);
            }
        });

        hourColor.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                Color initialCol = clock.getHourColor();
                Color c = javax.swing.JColorChooser.showDialog(null, "", initialCol);
                if(c != null)
                    clock.setHourColor(c);
            }
        });

        minColor.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                Color initialCol = clock.getMinuteColor();
                Color c = javax.swing.JColorChooser.showDialog(null, "", initialCol);
                if(c != null)
                    clock.setMinuteColor(c);
            }
        });

        secondColor.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                Color initialCol = clock.getSecondColor();
                Color c = javax.swing.JColorChooser.showDialog(null, "", initialCol);
                if(c != null)
                    clock.setSecondColor(c);
            }
        });

        textColor.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                Color initialCol = clock.getTextColor();
                Color c = javax.swing.JColorChooser.showDialog(null, "", initialCol);
                if(c != null)
                    clock.setTextColor(c);
            }
        });

        panel.add(numberColor);
        panel.add(tickColor);
        panel.add(hourColor);
        panel.add(minColor);
        panel.add(secondColor);
        panel.add(textColor);

        return panel;
    }

    private JPanel getCaptionPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.setBorder(new EmptyBorder(2, 2, 2, 2));

        panel.add(new JLabel("Caption : "));
        panel.add(Box.createRigidArea(new Dimension(10, 1)));
        final JTextField caption = new JTextField(){

            @Override public Dimension getMaximumSize(){
                return getPreferredSize();
            }
            @Override public Dimension getMinimumSize(){
                return getPreferredSize();
            }
            @Override public Dimension getPreferredSize(){
                return new Dimension(100, 20);
            }
        };
        caption.addKeyListener(new KeyAdapter() {
            @Override public void keyReleased(KeyEvent e) {
                String text = caption.getText().trim();
                clock.setCaption(text);
            }
        });
        panel.add(caption);

        return panel;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here        
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
                if(info.getName().equals("Windows"))
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
            }            
        }catch(Exception e){            
        }
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override public void run() {
                new MyFrame("My Clock").setVisible(true);
            }
        });
    }
}