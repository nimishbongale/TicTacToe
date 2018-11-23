import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
import java.io.*;
@SuppressWarnings("serial")
public class TicPane extends JFrame
{
	public static int i,j;
	private JPanel mousepanel;
    int A[][]=new int[3][3];
    int count=-1,count1=1,a=0,b=0,c=0,d=0;
    char Winner =  ' ';
    public void paint(Graphics g)
    {
        g.drawLine(210,150,210,345);//vertical
	    g.drawLine(270,150,270,345);//vertical
	    g.drawLine(130,275,346,275);//horizontal
	    g.drawLine(130,215,346,215);//horizontal
	}
	
	public TicPane()
	{
	    for(int i=0;i<3;i++)
	    {
	        for(j=0;j<3;j++)
	        {
	            A[i][j]=0;
	        }
	    }
		setTitle("Line");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		
		mousepanel=new JPanel();
        mousepanel.setBackground(Color.WHITE);
        add(mousepanel, BorderLayout.CENTER);
        
        Handlerclass handler=new Handlerclass();
        mousepanel.addMouseListener(handler);
	}
	
	class Handlerclass implements MouseListener
    {
        public void mouseClicked(MouseEvent event)
        {
            try
            {
                if(count1==1)
                ++count;
                count1++;
                Graphics g=mousepanel.getGraphics();
                int n=event.getX();
                int m=event.getY();
                if(n>=202 && n<=262 && m>=184 && m<=240 && A[1][1]==0)
                {
                    if(count%2!=0)
                    {
                        g.setColor(Color.BLACK);
                        g.drawOval(207,190,50,50);
                        A[1][1]=2;
                        count1=1;
                    }
                    else
                    {
                        g.drawLine(213,193,249,233);
                        g.drawLine(251,191,212,235);
                        A[1][1]=1;
                        count1=1;
                    }
                 }
            
                else if(n>=121 && n<=201 && m>=186 && m<=245 && A[1][0]==0)
                {
                   if(count%2==0)
                   {
                        g.drawLine(144,193,177,235);
                        g.drawLine(187,193,140,235);
                        A[1][0]=1;
                        count1=1;
                   }
                   else
                   {
                       g.drawOval(139,191,50,50);
                       A[1][0]=2;
                       count1=1;
                   }
                }
            
                else if(n>=125 && n<=202 && m<=184 && m>=119 && A[0][0]==0)
                {
                    if(count%2!=0)
                    {
                        g.drawOval(140,124,50,50);
                        A[0][0]=2;
                        count1=1;
                    }
                    else
                    {
                        g.drawLine(138,123,186,169);
                        g.drawLine(183,125,143,165);
                        A[0][0]=1;
                        count1=1;
                    }
                }
            
                else if(n>=202 && n<=261 && m>=120 && m<=185 && A[0][1]==0)
                {
                    if(count%2==0)
                    {
                        g.drawLine(210,123,255,177);
                        g.drawLine(256,125,213,170);
                        A[0][1]=1;
                        count1=1;
                    }
                    else
                    {
                        g.drawOval(207,126,50,50);
                        A[0][1]=2;
                        count1=1;
                    }
                }
                else if(n>=262 && n<=339 && m>=120 && m<=185 && A[0][2]==0)
                {
                    if(count%2==0)
                    {
                        g.drawLine(276,125,325,172);
                        g.drawLine(321,127,278,170);
                        A[0][2]=1;
                        count1=1;
                    }
                    else
                    {
                        g.drawOval(275,128,50,50);
                        A[0][2]=2;
                        count1=1;
                    }
                }
                else if(n>=262 && n<=339 && m>=187 && m<=245 && A[1][2]==0)
                {
                    if(count%2==0)
                    {
                        g.drawLine(277,194,319,229);
                        g.drawLine(319,194,279,231);
                        A[1][2]=1;
                        count1=1;
                    }
                    else
                    {
                        g.drawOval(277,191,50,50);
                        A[1][2]=2;
                        count1=1;
                    }
                }
                else if(n>=122 && n<=203 && m>=245 && m<=314 && A[2][0]==0)
                {
                    if(count%2==0)
                    {
                        g.drawLine(140,257,178,303);
                        g.drawLine(180,260,138,303);
                        A[2][0]=1;
                        count1=1;
                    }
                    else
                    {
                        g.drawOval(137,257,50,50);
                        A[2][0]=2;
                        count1=1;
                    }
                }
                else if(n>=203 && n<=262 && m>=244 && m<=315 && A[2][1]==0)
                {
                    if(count%2==0)
                    {
                        g.drawLine(211,258,249,302);
                        g.drawLine(253,260,213,302);
                        A[2][1]=1;
                        count1=1;
                    }
                    else
                    {
                        g.drawOval(207,259,50,50);
                        A[2][1]=2;
                        count1=1;
                    }
                }
                else if(n>=262 && n<=339 && m>=245 && m<=314 && A[2][2]==0)
                {
                    if(count%2==0)
                    {
                        g.drawLine(275,258,319,302);
                        g.drawLine(321,259,280,305);
                        A[2][2]=1;
                        count1=1;
                    }
                    else
                   {
                        g.drawOval(272,256,50,50);
                        A[2][2]=2;
                        count1=1;
                   }
                }
            
                if (A[0][0]== 1 && A[0][1] == 1 && A[0][2] == 1) Winner = 'X';
                else if (A[1][0] == 1 && A[1][1] == 1 && A[1][2] == 1) Winner = 'X';
                else if (A[2][0] == 1 && A[2][1] == 1 && A[2][2] == 1) Winner = 'X';
                else if (A[0][0] == 1 && A[1][0] == 1 && A[2][0] == 1) Winner = 'X';
                else if (A[0][1] == 1 && A[1][1] == 1 && A[2][1] == 1) Winner = 'X';
                else if (A[0][2] == 1 && A[1][2] == 1 && A[2][2] == 1) Winner = 'X';
                else if (A[0][0] == 1 && A[1][1] == 1 && A[2][2] == 1) Winner = 'X';
                else if (A[0][2] == 1 && A[1][1] == 1 && A[2][0] == 1) Winner = 'X';
                else if (A[0][0] == 2 && A[0][1] == 2 && A[0][2] == 2) Winner = 'O';
                else if (A[1][0] == 2 && A[1][1] == 2 && A[1][2] == 2) Winner = 'O';
                else if (A[2][0] == 2 && A[2][1] == 2 && A[2][2] == 2) Winner = 'O';
                else if (A[0][0] == 2 && A[1][0] == 2 && A[2][0] == 2) Winner = 'O';
                else if (A[0][1] == 2 && A[1][1] == 2 && A[2][1] == 2) Winner = 'O';
                else if (A[0][2] == 2 && A[1][2] == 2 && A[2][2] == 2) Winner = 'O';
                else if (A[0][0] == 2 && A[1][1] == 2 && A[2][2] == 2) Winner = 'O';
                else if (A[0][2] == 2 && A[1][1] == 2 && A[2][0] == 2) Winner = 'O';
                
                if(count==8 && Winner==' ')
                {
                    Winner='D';
                }
                
                if(Winner!=' ')
                End();
            }
            catch(Exception e)
            {}
        }
        
        public void mousePressed(MouseEvent event)
        {}
        
        public void mouseReleased(MouseEvent event)
        {}
        
        public void mouseEntered(MouseEvent event)
        {}

        public void mouseExited(MouseEvent event)
        {}
    }
    
    public void End() throws Exception
    {
        if(Winner=='X')
        {
            JOptionPane.showMessageDialog(null, "X Won!","WINNER", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
        
        else if(Winner=='O')
        {
            JOptionPane.showMessageDialog(null, "O Won!","WINNER", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
        else if(Winner=='D')
        {
            JOptionPane.showMessageDialog(null, "It\'s a draw!","WINNER", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
    }
	
	public static void main(String args[])throws Exception
	{
		TicPane obj=new TicPane();
		obj.repaint();
	}
	
	
}


