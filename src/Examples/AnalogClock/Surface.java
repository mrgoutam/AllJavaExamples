package Examples.AnalogClock;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.util.Date;

public class Surface extends javax.swing.JPanel implements Runnable {

    // <editor-fold defaultstate="collapsed" desc="variables"> 
    private Point center;
    private int radius = 158;
    private int width = 350, height = 350;

    private String caption = "Amir Hoseyn";
    
    private Color numberColor = Color.BLACK;
    private Color tickColor   = Color.BLACK;
    private Color hourColor   = Color.BLUE;
    private Color minuteColor = new Color(153, 0, 153);
    private Color secondColor = Color.RED;
    private Color textColor   = Color.WHITE;

    private Date currentDate = null;
    private Thread timer = null;

    private GeneralPath sMinute, sHour;
    private GeneralPath uMinute, uHour;
    //private AffineTransform at = null;

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="set & get method">
    public void setNumberColor(Color numbercolor){
        this.numberColor = numbercolor;
    }
    public void setTickColor(Color tickcolor){
        this.tickColor = tickcolor;
    }
    public void setHourColor(Color hourcolor){
        this.hourColor = hourcolor;
    }
    public void setMinuteColor(Color minutecolor){
        this.minuteColor = minutecolor;
    }
    public void setSecondColor(Color secondcolor){
        this.secondColor = secondcolor;
    }
    public void setTextColor(Color textcolor){
        this.textColor = textcolor;
    }
    public void setCaption(String caption){
        this.caption = caption;
    }
    public Color getNumberColor(){
        return this.numberColor;
    }
    public Color getTickColor(){
        return this.tickColor;
    }
    public Color getHourColor(){
        return this.hourColor;
    }
    public Color getMinuteColor(){
        return this.minuteColor;
    }
    public Color getSecondColor(){
        return this.secondColor ;
    }
    public Color getTextColor(){
        return this.textColor ;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="enum">
    public enum ClockStyles{
        Standard(0),
        Classic(1);

        int id;

        private ClockStyles(int id) {
            this.id = id;
        }

        public int getId(){
            return id;
        }
    }

    public enum HandStyles{
        Uniform(0), Sharp(1);
        int id;

        private HandStyles(int id) {
            this.id = id;
        }
        public int getId(){
            return id;
        }
    }

    public enum TickStyles{
        All(0), Twelve(1),
        Quadric(2),None(3);

        int id;

        private TickStyles(int id) {
            this.id = id;
        }
        public int getId(){
            return id;
        }
    }

    public enum DateStyles{
        Full(0), DayOfMonth(1), None(2);

        int id;

        private DateStyles(int id) {
            this.id = id;
        }
        public int getId(){
            return id;
        }
    }

    public enum NumberStyles{
        All(0), Quadric(1), None(2);
        int id;
        private NumberStyles(int id) {
            this.id = id;
        }
        public int getId(){
            return id;
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="enum variables">
    private ClockStyles   clockstyle   = ClockStyles.Standard;
    private HandStyles    handStyles   = HandStyles.Sharp;
    private TickStyles    tickstyle    = TickStyles.All;
    private DateStyles    datestyle    = DateStyles.Full;
    private NumberStyles  numberStyles = NumberStyles.All;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="set & get method for enum">
    public void setClockStyles(ClockStyles clockstyle){
        this.clockstyle = clockstyle;
    }
    public void setHandStyles(HandStyles handStyles){
        this.handStyles = handStyles;
    }
    public void setTickStyles(TickStyles tickstyle){
        this.tickstyle = tickstyle;
    }
    public void setDateStyles(DateStyles datestyle){
        this.datestyle = datestyle;
    }
    public void setNumberStyles(NumberStyles numberStyles){
        this.numberStyles = numberStyles;
    }
    public ClockStyles getClockStyles(){
        return this.clockstyle;
    }
    public HandStyles getHandStyles(){
        return this.handStyles;
    }
    public TickStyles getTickStyles(){
        return this.tickstyle;
    }
    public DateStyles getDateStyles(){
        return this.datestyle;
    }
    public NumberStyles getNumberStyles(){
        return this.numberStyles;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="start & stop timer">
    public void play(){
        if(timer == null)
            start();
        else
            stop();
    }
    public void start(){
        if(timer == null){
            timer = new Thread(this);
            timer.start();
        }
    }
    public void stop(){
        if(timer != null){
            timer.interrupt();
            timer = null;
        }
    }
    // </editor-fold>

    public Surface() {
        setBackground(new Color(170, 170, 170));
    }     

    private void setPath(){
        sMinute = new GeneralPath();

        sMinute.moveTo(-radius*0.1125, 0);
        sMinute.lineTo(0, -radius*0.05);
        sMinute.lineTo(radius * 0.8, 0);
        sMinute.lineTo(0, radius*0.05);
        sMinute.lineTo(-radius*0.1125, 0);

        sHour   = new GeneralPath();
        sHour.moveTo(-radius*0.125, 0);
        sHour.lineTo(0, -radius*0.0625);
        sHour.lineTo(radius * 0.6, 0);
        sHour.lineTo(0, radius*0.0625);
        sHour.lineTo(-radius*0.125, 0);

        uMinute = new GeneralPath();
        uMinute.moveTo(0, -radius*0.0375);
        uMinute.lineTo(radius*0.8 - 10, -radius*0.0375);
        uMinute.lineTo(radius*0.8, 0);
        uMinute.lineTo(radius*0.8 - 10, radius*0.0375);
        uMinute.lineTo(0, radius*0.0375);

        uHour = new GeneralPath();
        uHour.moveTo(0, -radius*0.04375);
        uHour.lineTo(radius*0.6 - 10, -radius*0.04375);
        uHour.lineTo(radius*0.6, 0);
        uHour.lineTo(radius*0.6 - 10, radius*0.04375);
        uHour.lineTo(0, radius*0.04375);
    }

    @Override public void paint(Graphics g){
        super.paint(g);

        Dimension d = getSize();
        width = d.width;
        height = d.height;

        center = new Point(width/2, height/2);
        radius =(int)(Math.min(width, height) * 0.9)/2;

        setPath();

        Graphics2D g2d = (Graphics2D)g;

        currentDate = new Date();
        int h = currentDate.getHours(),
            m = currentDate.getMinutes(),
            s = currentDate.getSeconds();

        h = h % 12;

        int date = currentDate.getDate(),
            day = currentDate.getDay();
               
        drawBackGround(g2d);
        drawCaption(g2d);
        drawTick(g2d);
        drawNumber(g2d);
        drawDate(g2d, day, date);
        
        if(clockstyle == ClockStyles.Standard){
            drawHands(g2d, h, m);
            drawSecond(g2d, s);
        }else if(clockstyle == ClockStyles.Classic){
            drawSecond(g2d, s);
            drawHands(g2d, h, m);
        }        
    }

    public void drawHands(Graphics2D g2d, int h, int m){
        AffineTransform at = AffineTransform.getTranslateInstance(center.getX(), center.getY());
        Shape hour   = sHour,
              minute = sMinute;

        if(handStyles == HandStyles.Sharp){
            hour   = sHour;
            minute = sMinute;

        }else if(handStyles == HandStyles.Uniform){
            hour   = uHour;
            minute = uMinute;
        }

        at.rotate(+Math.toRadians(h*30+m/2-90));
        g2d.setPaint(hourColor);
        g2d.fill(at.createTransformedShape(hour));

        double p = radius*0.075;
        if(handStyles == HandStyles.Uniform)
            g2d.fill(new Ellipse2D.Double(center.x - p, center.y - p, 2*p, 2*p));

        at.rotate(-Math.toRadians(h*30+m/2-90));
        at.rotate(+Math.toRadians(m*6-90));
        g2d.setPaint(minuteColor);
        g2d.fill(at.createTransformedShape(minute));

        p = radius*0.0625;
        if(handStyles == HandStyles.Uniform)
            g2d.fill(new Ellipse2D.Double(center.x - p, center.y - p, 2*p, 2*p));
            
    }

    private void drawClassicSecond(Graphics2D g2d, int s){
        int w = 82;
        int x = center.x ,
            y = center.y + 2*w/3 + 10;

        AffineTransform at = AffineTransform.getTranslateInstance(center.getX(), center.getY()+ 2*w/3 + 10);
        Line2D.Double line = new Line2D.Double(-8, 0, w/2, 0);

        at.rotate(+Math.toRadians(s*6-90));
        g2d.setPaint(secondColor);
        g2d.draw(at.createTransformedShape(line));

        g2d.setPaint(new GradientPaint(x-3, y-3, secondColor, x+ 3 , y + 3, Color.white, true));
        g2d.setStroke(new BasicStroke(1));
        g2d.fillOval(x - 3 , y - 3 , 6, 6);
        g2d.setPaint(secondColor);
        g2d.drawOval(x - 3 , y - 3 , 6, 6);

        Ellipse2D.Double ellipse = new Ellipse2D.Double(-3,-3,6,6);
        at.rotate(-Math.toRadians(s*6-90));

        g2d.setColor(Color.BLACK);
        for(int angle = 0; angle < 360; angle +=6){
            int xc  = (int) (Math.sin(angle * Math.PI / 180) * w/2   + x);
            int yc  = (int) (-Math.cos(angle * Math.PI / 180 ) * w/2 + y);

            g2d.fillOval(xc, yc, 3, 3);
        }
    }

    private void drawStandardSecond(Graphics2D g2d, int s){
        int h1 = (int)(radius * 0.9),
            h2 = (int)(radius * 0.2);
        
        AffineTransform at = AffineTransform.getTranslateInstance(center.getX(), center.getY());
        Line2D.Double line = new Line2D.Double(-h2, 0, h1, 0);

        at.rotate(+Math.toRadians(s*6-90));
        g2d.setPaint(secondColor);
        g2d.draw(at.createTransformedShape(line));

        float w = (float) (radius * 0.05);
        g2d.setPaint(new GradientPaint(center.x-w, center.y-w, secondColor,
                                       center.x+w ,  center.y+w, Color.white, true));

        g2d.fill(new Ellipse2D.Double(center.x - w, center.y - w, 2*w, 2*w));
        g2d.setPaint(secondColor);
        g2d.draw(new Ellipse2D.Double(center.x - w, center.y - w, 2*w, 2*w));
    }

    private void drawTick(Graphics2D g2d){
        if (tickstyle == TickStyles.None)
            return;

        g2d.setColor(tickColor);
        
        int angle = 30;
        int h1 = (int)radius - 7,
            h2 = (int)radius + 3;

        if (tickstyle == TickStyles.All || tickstyle == TickStyles.Twelve){
            for(int digit = 1; digit <= 12; ++digit){
                int x1 = (int) (Math.sin(angle * Math.PI / 180) * h1   + center.x);
                int y1 = (int) (-Math.cos(angle * Math.PI / 180 ) * h1 + center.y);

                int x2 = (int) (Math.sin(angle * Math.PI / 180) * h2   + center.x);
                int y2 = (int) (-Math.cos(angle * Math.PI / 180 ) * h2 + center.y);

                if(digit % 3 == 0)
                    g2d.setStroke(new BasicStroke((float) (radius * 0.04375)));
                else
                    g2d.setStroke(new BasicStroke((float) (radius * 0.03125)));

                g2d.drawLine(x1, y1, x2, y2);
                angle +=30;
            }
        }

        angle = 6;
        h1 = (int)radius - 5;

        if (tickstyle == TickStyles.All){
            for(angle = 6; angle < 360; angle += 6){
                if(angle % 5 == 0)
                    continue;
                
                int x1 = (int) (Math.sin(angle * Math.PI / 180) * h1   + center.x);
                int y1 = (int) (-Math.cos(angle * Math.PI / 180 ) * h1 + center.y);

                int x2 = (int) (Math.sin(angle * Math.PI / 180) * h2   + center.x);
                int y2 = (int) (-Math.cos(angle * Math.PI / 180 ) * h2 + center.y);

                g2d.setStroke(new BasicStroke((float) (radius * 0.00625)));
                g2d.drawLine(x1, y1, x2, y2);
            }
        }

        h1 = (int)radius - 7;
        if (tickstyle == TickStyles.Quadric){
            for(angle = 90; angle <= 360; angle += 90){

                int x1 = (int) (Math.sin(angle * Math.PI / 180) * h1   + center.x);
                int y1 = (int) (-Math.cos(angle * Math.PI / 180 ) * h1 + center.y);

                int x2 = (int) (Math.sin(angle * Math.PI / 180) * h2   + center.x);
                int y2 = (int) (-Math.cos(angle * Math.PI / 180 ) * h2 + center.y);

                g2d.setStroke(new BasicStroke((float) (radius * 0.04375)));
                g2d.drawLine(x1, y1, x2, y2);
            }
        }
    }

    private void drawBackGround(Graphics2D g2d){
        int length = (int)(Math.min(width, height) /** 0.9*/)/1;

         int x = width/2-length;
         int y = height/2-length;

         // around
         g2d.setStroke(new BasicStroke(2));
         g2d.setColor(Color.white);

         Color inner = Color.GREEN, outer = Color.BLUE;

         // arc
         int w2 = width/2;
         int h2 = height/2;

         g2d.setPaint(new GradientPaint(0, 0 ,outer, width*0.45f, height*0.45f, inner));
         g2d.fillRect(0, 0, w2, h2);
         
         g2d.setPaint(new GradientPaint(width,0,outer,width*0.55f,height*0.45f,inner));
         g2d.fillRect(w2, 0, w2, h2);

         g2d.setPaint(new GradientPaint(0,height,outer,width*0.45f,height*0.55f,inner));
         g2d.fillRect(0, h2, w2, h2);

         g2d.setPaint(new GradientPaint(width,height,outer,width*0.55f,height*0.55f,inner));
         g2d.fillRect(w2, h2, w2, h2);
    }

    private void drawDate(Graphics2D g2d, int day, int date){
        if(datestyle == DateStyles.None)
            return;

        String[] dates = {
          "Sun","Mon","Tue","Wed","Thu" ,"Fri","Sat"
        };

        int w = 35, r = 25, h = 20;
        int x = center.x + radius/2 - 15,
            y = center.y - 13;

        g2d.setColor(textColor);
        g2d.setFont(new Font("Tahoma", Font.BOLD, 15));
        g2d.setStroke(new BasicStroke(1));

        if(datestyle == DateStyles.Full){
            g2d.setColor(Color.white);
            g2d.fillRect(x, y, w, h);
            g2d.setColor(Color.BLACK);
            g2d.drawRect(x, y, w, h);
            g2d.drawString(dates[day], x+2, y+h-4);
        }
        // show day
        g2d.setColor(Color.white);
        g2d.fillRect(x+ w + 1, y, r, h);

        //g2d.setStroke(new BasicStroke(1));
        g2d.setColor(Color.BLACK);
        g2d.drawRect(x+w+1, y, r, h);        
        g2d.drawString(date + "", x+w+3, y+h-4);
    }

    private void drawSecond(Graphics2D g2d, int s){
        if(clockstyle == ClockStyles.Classic)
            drawClassicSecond(g2d, s);
        else if(clockstyle == ClockStyles.Standard)
            drawStandardSecond(g2d, s);
    }

    private void drawNumber(Graphics2D g2d){
        g2d.setFont(new Font("Tahoma", Font.BOLD, 20));
        g2d.setColor(numberColor);

        int angle = 30;
        int h = (int)radius - 27;

        g2d.setColor(numberColor);

        if(numberStyles == NumberStyles.None)
            return;

        if(numberStyles == NumberStyles.Quadric){
            angle = 90;
            for(int digit = 3; digit <= 12; digit += 3){

                int x = (int) (Math.sin(angle * Math.PI / 180) * h   + center.x);
                int y = (int) (-Math.cos(angle * Math.PI / 180 ) * h + center.y);
                g2d.drawString("" + digit, x-4, y+4);
                angle +=90;
            }
            return;
        }

        for(int digit = 1; digit <= 12; ++digit){            

            int _x = (int) (Math.sin(angle * Math.PI / 180) * h   + center.x);
            int _y = (int) (-Math.cos(angle * Math.PI / 180 ) * h + center.y);
            
            g2d.drawString("" + digit, _x-4, _y+4);
            angle +=30;
        }
    }

    private void drawCaption(Graphics2D g2d){
        g2d.setColor(textColor);
        g2d.setFont(new Font("Tahoma", Font.BOLD, 18));
        int len = caption.length();

        if(len >=0 && len <= 20)
            g2d.drawString(caption , center.x - 5*len, center.y - 50);
    }

    @Override public void run() {
        Thread me = Thread.currentThread();
        while (timer == me) {
            try {
                Thread.sleep(10);
            }catch (InterruptedException e) {
            }
            repaint();
        }
    }
}