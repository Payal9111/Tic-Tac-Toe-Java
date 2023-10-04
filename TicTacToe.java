//tic tac toe game 

import java.awt.*;
import java.awt.event.*;
class fdemo extends Frame implements ActionListener
{
	Boolean d1=false;
	Boolean d2=false;
    int x=100,y=100,w=100,h=100;
	Button b[]=new Button[9];
	fdemo()
	{
setTitle("tictactoe");
 Font f=new Font("Bauhaus 93",Font.BOLD,25);	
	setFont(f);
	int k=0;
		setLayout(null);
	 for(int i=0;i<3;i++)
	 {
	 for(int j=0;j<3;j++)
	  {
         b[k]=new Button();		 
		 b[k].setSize(w,h);
		  b[k].setLocation(x,y);
		  add(b[k]);
		  b[k].addActionListener(this);
		  x+=100; 
         k++;	
	} 
	 x=100;
	 y+=100;
	 }
	 	 
	}
	public void paint(Graphics g)
 {
	 if(d1){	 
	 g.drawString("0 wins",50,50);	 
	 }
	 if(d2)
	 {g.drawString("X wins",50,50);	 
     } 
 }
Boolean bb=true;
   int k=0;
  public void actionPerformed(ActionEvent e)
  {
   
   Button b1=(Button)e.getSource();
   
      k++;
	  if(bb)
	  {
	   if(k%2==0)
	   {
		   b1.setLabel("X");
		} 
       else
	   {
		  b1.setLabel("0");
	   }
   b1.removeActionListener(this);
     }   
   
   if(b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0" ||
   b[3].getLabel()=="0" && b[4].getLabel()=="0" && b[5].getLabel()=="0" ||
   b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0" ||
   b[0].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0" ||
   b[1].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0" ||
   b[2].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0" ||
   b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0" ||
   b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0" )
   {
   d1=true;
   d2=false;   
	  bb=false;
	  repaint();
	 // System.out.print("0 wins");
   }
  else if(b[0].getLabel()=="X" && b[1].getLabel()=="X" && b[2].getLabel()=="X" ||
   b[3].getLabel()=="X" && b[4].getLabel()=="X" && b[5].getLabel()=="X" ||
   b[6].getLabel()=="X" && b[7].getLabel()=="X" && b[8].getLabel()=="X" ||
   b[0].getLabel()=="X" && b[3].getLabel()=="X" && b[6].getLabel()=="X" ||
   b[1].getLabel()=="X" && b[4].getLabel()=="X" && b[7].getLabel()=="X" ||
   b[2].getLabel()=="X" && b[5].getLabel()=="X" && b[8].getLabel()=="X" ||
   b[0].getLabel()=="X" && b[4].getLabel()=="X" && b[8].getLabel()=="X" ||
   b[2].getLabel()=="X" && b[4].getLabel()=="X" && b[6].getLabel()=="X" )
   {
	   
	   d2=true;
	   d1=false;
	   bb=false;
     repaint();	  
	  //System.out.print("X wins");
   }
  }	

}
class ss
{
	public static void main(String arg[])
		{
			fdemo f=new fdemo();
			 f.setVisible(true);
			 f.setSize(600,500);
			 f.setLocation(200,100);
		}
}