class Demoframe
{
     Demoframe()
	 {
	   javax.swing.JFrame frame=new javax.swing.JFrame();
	   frame.setVisible(true);
	   frame.setSize(500,500);
	   frame.setLocation(400,100);
	   frame.setTitle("Login Page");
	   frame.getContentPane().setBackground(java.awt.Color.CYAN);
	   frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
	   
	 }
}
class Testframe
{
    public static void main(String args[])
	{
		Demoframe dframe=new Demoframe();
	}
}