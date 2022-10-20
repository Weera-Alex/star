import java.applet.Applet;
import java.util.Random;
import java.awt.*;
/*<applet code="star" width=1400 height=900></applet>*/ 
public class star extends Applet{
Image picture;
 public void init() {       
        setBackground(Color.decode("#ADD8E6"));
picture = getImage(getCodeBase(),"Ness_-_Super_Smash_Bros.png"); 
}
public void paint(Graphics g)
{
//ears
g.setColor(Color.decode("#F1C89B"));
g.fillOval(285,185,210,90);
g.setColor(Color.black);
g.drawOval(284,185,211,90);
//outline
g.setColor(Color.black);
g.drawArc(299,89,181,205,360,360);
g.setColor(Color.black);
g.drawArc(299,115,181,205,360,360);
g.drawImage(picture, 1200,900, this);// ex
//head
g.setColor(Color.decode("#F1C89B"));
g.fillOval(300,110,180,210); 
//hat
g.setColor(Color.decode("#C54736"));
g.fillArc(300, 90, 180, 200,0,180);
//extra head
g.setColor(Color.decode("#F1C89B"));
g.fillArc(300,150,180,100,0,180);
//hair
g.setColor(Color.black);
g.fillOval(360,150,25,45);
g.setColor(Color.black);
g.fillOval(370,149,25,40);
g.setColor(Color.black);
g.fillOval(375,149,25,43);
g.setColor(Color.black);
g.fillOval(380,149,25,40);
g.setColor(Color.black);
g.fillOval(390,150,25,45);
g.drawLine(370,151,400,151);
//eye
g.setColor(Color.black);
g.fillOval(335,200,20,30);
g.setColor(Color.black);
g.fillOval(425,200,20,30);
//outline
g.setColor(Color.black);
g.drawArc(300,149,180,100,0,180);
//smile pls
g.setColor(Color.black);
g.drawArc(370,255,40,20,180,180);
//body first layer
g.setColor(Color.decode("#302020"));
g.fillRect(300,320,180,20);
g.setColor(Color.decode("#7070f0"));
g.fillRect(320,320,140,20);
g.setColor(Color.decode("#302020"));
g.fillRect(340,320,100,20);
g.setColor(Color.decode("#C89878"));
g.fillRect(380,320,20,20);
//body second layer
g.setColor(Color.decode("#302020"));
g.fillRect(280,340,220,20);
g.setColor(Color.decode("#e0d020"));
g.fillRect(300,340,180,20);
g.setColor(Color.decode("#7070f0"));
g.fillRect(340,340,100,20);
//body third layer
g.setColor(Color.decode("#302020"));
g.fillRect(260,360,260,20);
g.setColor(Color.decode("#f0b090"));
g.fillRect(280,360,220,20);
g.setColor(Color.decode("#7070f0"));
g.fillRect(300,360,200,20);
g.setColor(Color.decode("#e0d020"));
g.fillRect(340,360,100,20);
//body fourth layer
g.setColor(Color.decode("#302020"));
g.fillRect(240,380,300,20);
g.setColor(Color.decode("#f0f0f0"));
g.fillRect(260,380,20,20);
g.setColor(Color.decode("#f0b090"));
g.fillRect(280,380,240,20);
g.setColor(Color.decode("#7070f0"));
g.fillRect(300,380,200,20);
g.setColor(Color.decode("#302020"));
g.fillRect(300,380,180,20);
g.setColor(Color.decode("#7070f0"));
g.fillRect(320,380,140,20);
//body fifth layer
g.setColor(Color.decode("#302020"));
g.fillRect(240,400,280,20);
g.setColor(Color.decode("#f0b090"));
g.fillRect(260,400,240,20);
g.setColor(Color.decode("#302020"));
g.fillRect(300,400,180,20);
g.setColor(Color.decode("#e0d020"));
g.fillRect(320,400,140,20);
//body sixth layer
g.setColor(Color.decode("#302020"));
g.fillRect(260,420,240,20);
g.setColor(Color.decode("#7070f0"));
g.fillRect(300,420,140,20);
//body seventh layer
g.setColor(Color.decode("#302020"));
g.fillRect(280,440,240,20);
g.setColor(Color.decode("#7070f0"));
g.fillRect(300,440,140,20);
g.setColor(Color.decode("#302020"));
g.fillRect(380,440,20,20);
g.setColor(Color.decode("#302020"));
g.fillRect(420,440,20,20);
g.setColor(Color.decode("#c8c8c8"));
g.fillRect(440,440,40,20);
g.setColor(Color.decode("#507060"));
g.fillRect(480,440,20,20);
//body eight and ninth layer :/
g.setColor(Color.decode("#302020"));
g.fillRect(300,460,220,40);
g.setColor(Color.decode("#7070f0"));
g.fillRect(340,460,40,20);
g.setColor(Color.decode("#c8c8c8"));
g.fillRect(420,460,20,40);
g.setColor(Color.decode("#507060"));
g.fillRect(440,460,60,40);
g.setColor(Color.decode("#507060"));
g.fillRect(280,480,20,20);
g.setColor(Color.decode("#507060"));
g.fillRect(280,480,20,20);
g.setColor(Color.decode("#f00060"));
g.fillRect(320,480,40,20);
// tenth body layer
g.setColor(Color.decode("#507060"));
g.fillRect(240,500,320,20);
g.setColor(Color.decode("#302020"));
g.fillRect(280,500,20,20);
g.setColor(Color.decode("#f0f0f0"));
g.fillRect(300,500,20,20);
g.setColor(Color.decode("#302020"));
g.fillRect(340,500,40,20);
g.setColor(Color.decode("#302020"));
g.fillRect(400,500,20,20);
g.setColor(Color.decode("#302020"));
g.fillRect(480,500,20,20);
//final bodylayer
g.setColor(Color.decode("#507060"));
g.fillRect(280,520,240,20);
g.setColor(Color.decode("#302020"));
g.fillRect(300,520,60,20);
g.setColor(Color.decode("#302020"));
g.fillRect(420,520,60,20);
}
}
