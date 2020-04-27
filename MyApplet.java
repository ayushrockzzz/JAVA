import java.applet.*;
import java.awt.*;

public class MyApplet extends Applet
{
	// create paint class to print on the screen.
	public void paint (Graphics g)
	{		
		setBackground(Color.red);
		Font f1=new Font("Times New Roman",Font.BOLD,40);
		g.setFont(f1);
		g.drawString ("hello world", 550, 325);
	  	}
}
Html code—
<html>
<head>
<title> first applet</title>
</head>
<body>
<Applet code="MyApplet.class" width="1024" height="650">
</applet>
</body>
</html>
