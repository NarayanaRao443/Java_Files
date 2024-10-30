package addressBook;

import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class addressBook extends JFrame implements ActionListener {
public static final int WIDTH = 800;
public static final int HEIGHT = 600;
public JInternalFrame mFrame;
public JTextField f1;
public JTextField l1;
public JTextField address;
public JTextField address2;
public JTextField c1;
public JTextField s1;
public JTextField z1;
public JTextField ea1;
public JTextField ph1;
public String firstname;
public String lastname;
public String CityName;
public String StateName;
public String ZipName;
public String Email;
public String Phone;

public addressBook()

{

super();

setSize(WIDTH, HEIGHT);
setLocation(80,80); // setting the location on the screen
setTitle("Button Demo");
Container contentPane = getContentPane();
contentPane.setBackground(Color.gray);
addWindowListener(new WindowDestroyer());
JDesktopPane dtp = new JDesktopPane();
setContentPane(dtp);
JPanel buttonPanel = new JPanel(); // Java panel to hold buttons
buttonPanel.setLayout(new FlowLayout());// Setting the layout of buttons
JPanel textPanel = new JPanel();// Java panel to hold labels and text fields
textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.PAGE_AXIS));
JPanel FirstName = new JPanel();
FirstName.setLayout(new FlowLayout());
JLabel fname = new JLabel("First Name");
f1 = new JTextField(10);
JPanel LastName = new JPanel();
LastName.setLayout(new FlowLayout());
JLabel lname = new JLabel("Last Name");
l1 = new JTextField(10);
JPanel addrPanel = new JPanel();
addrPanel.setLayout(new FlowLayout());
JLabel addr = new JLabel("Address");
address = new JTextField(10);
JPanel addrPanel2 = new JPanel();
addrPanel2.setLayout(new FlowLayout());
JLabel addr2 = new JLabel("Address 2");
address2 = new JTextField(10); 

JPanel CityName = new JPanel();
CityName.setLayout(new FlowLayout());
JLabel cname = new JLabel ("City");
c1 = new JTextField(10);
JPanel StateName = new JPanel();
StateName.setLayout(new FlowLayout());
JLabel sname = new JLabel ("State");
s1 = new JTextField(10);

JPanel ZipName = new JPanel();
ZipName.setLayout(new FlowLayout());
JLabel zname = new JLabel ("Zip Code");
z1 = new JTextField(10);

JPanel EmailName = new JPanel();
EmailName.setLayout(new FlowLayout());
JLabel eaname = new JLabel ("Email Address");
ea1 = new JTextField(10);

JPanel PhoneNum = new JPanel();
PhoneNum.setLayout(new FlowLayout());
JLabel pname = new JLabel ("Phone Number");
ph1 = new JTextField(10);

   
FirstName.add(fname);
FirstName.add(f1);

LastName.add(lname);
LastName.add(l1);

addrPanel.add(addr);
addrPanel.add(address);

addrPanel2.add(addr2);
addrPanel2.add(address2);

CityName.add(cname);
CityName.add(c1);

StateName.add(sname);
StateName.add(s1);

ZipName.add(zname);
ZipName.add(z1);

EmailName.add(eaname);
EmailName.add(ea1);

PhoneNum.add(pname);
PhoneNum.add(ph1);

  

textPanel.add(FirstName);
textPanel.add(LastName);
textPanel.add(addrPanel);
textPanel.add(addrPanel2);
textPanel.add(CityName);
textPanel.add(StateName);
textPanel.add(ZipName);
textPanel.add(EmailName);
textPanel.add(PhoneNum);

  

  

mFrame = new JInternalFrame("First frame", true,true, true, true);
mFrame.setLayout(new BorderLayout());

JButton insertButton = new JButton("Insert");
insertButton.addActionListener(this);

JButton deleteButton = new JButton("Delete");
deleteButton.addActionListener(this);

JButton newButton = new JButton("New");
newButton.addActionListener(this);

buttonPanel.add(newButton);
buttonPanel.add(insertButton);
buttonPanel.add(deleteButton);

mFrame.setSize(400, 300);
mFrame.setLocation(50, 50);
mFrame.add(textPanel, BorderLayout.WEST); // adds textPanel to the main frame of the window
mFrame.add(buttonPanel, BorderLayout.SOUTH);// adds buttons to the main frame
mFrame.setVisible(true);

dtp.add(mFrame);

   }
   public void actionPerformed(ActionEvent e)
   {

	   if(e.getActionCommand().equals("Insert"))
	   {

		   try {

			   Class.forName("org.sqlite.JDBC");

			   Connection connection = DriverManager.getConnection("om.mysql.jdbc.Driver");
			   Statement statement = connection.createStatement();
			   String firstname = f1.getText();
			   String lastname = l1.getText();
			   statement.executeUpdate("INSERT INTO names (firstName, lastName) VALUES ('"+firstname+"','"+lastname+"')");

			   String addStr1 = address.getText();
			   String addStr2 = address2.getText();
			   statement.executeUpdate("INSERT INTO addresses (address1, address2) VALUES ('"+addStr1+"','"+addStr2+"')");

			   String cityStr = c1.getText();
			   statement.executeUpdate("INSERT INTO addresses (city) VALUES ('"+cityStr+"')");
			   
			   String stateStr = s1.getText();
			   statement.executeUpdate("INSERT INTO addresses (state) VALUES ('"+stateStr+"')");
			   
			   String zipStr = z1.getText();
			   statement.executeUpdate("INSERT INTO addresses (zipcode) VALUES ('"+zipStr+"')");

			   String emailStr = ea1.getText();
			   statement.executeUpdate("INSERT INTO emailAddresses (city) VALUES ('"+emailStr+"')");

			   String phoneStr = ph1.getText();
			   statement.executeUpdate("INSERT INTO phoneNumbers (phoneNumber) VALUES ('"+phoneStr+"')");

}

		   catch ( SQLException sqlException ) 
		   {
			   JOptionPane.showMessageDialog( null,
			   sqlException.getMessage(), "Database Error",
			   JOptionPane.ERROR_MESSAGE );

			   System.exit( 1 );

		   }

		   catch(ClassNotFoundException cnfex)
		   {
			   System.out.println("Problem in loading or "+ "registering MS Access JDBC driver");
			   cnfex.printStackTrace();

		   }

}

	   else if(e.getActionCommand().equals("New"))

	   {

	   }

	   else if(e.getActionCommand().equals("Delete"))

	   {

	   }

	   else

		   System.out.println("Error in button interface");

   }

   public static void main( String args[] )

   {

	   addressBook window = new addressBook();
	   window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

	   window.setVisible(true);
   }

}

	class WindowDestroyer extends WindowAdapter

	{

		public void windowClosing(WindowEvent e)
		{

			System.exit(0);

		}

}