package bank.management.system;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class Signup2 extends JFrame implements ActionListener{
    long random;
//    JTextField nameTextField, fTextField, dobTextField, emailTextField, stateTextField, pincodeTextField,addressTextField, cityTextField;
    JTextField pan, aadhar;
    JRadioButton syes, sno, eyes, eno;
    JButton next;
    JComboBox religion, category, occupation, education, income;
    String formno;
    Signup2(String formno){
        this.formno = formno;
        setLayout(null);
        setTitle("New Acount Application Form page 2");
        setSize(900, 900);
        setLocation(350, 10);
        getContentPane().setBackground(Color.white);


        JLabel additionalDetails = new JLabel("Page 1: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 22));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        String valReligion[] = {"General", "OBC", "SC", "ST", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 22));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        String valCategory[] = {"Hindu", "Muslim","Sikh", "Cristtian", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 22));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String incomeCategory[] = {"Null", "<1,50,000","<2,50,000", "<5,00,000", "Upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway", Font.BOLD, 22));
        gender.setBounds(100, 290, 150, 30);
        add(gender);                   
        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 22));
        email.setBounds(100, 315, 150, 30);
        add(email);
        
        String educationValues[] = {"Non Graduate", "Graduate","Post-Graduate", "Doctrate", "Other"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway", Font.BOLD, 22));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        String occupationValues[] = {"Salaried", "Self-Employed","Business", "Student", "Retired","Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
                       
        JLabel address = new JLabel("PAN No.:");
        address.setFont(new Font("Raleway", Font.BOLD, 22));
        address.setBounds(100, 440, 100, 30);
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);        
        
        JLabel city = new JLabel("Aadhar Number:");
        city.setFont(new Font("Raleway", Font.BOLD, 22));
        city.setBounds(100, 490, 250, 30);
        add(city);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);        
        
        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", Font.BOLD, 22));
        state.setBounds(100, 540, 250, 30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,120,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,120,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup marriedGroup = new ButtonGroup();
        marriedGroup.add(syes);
        marriedGroup.add(sno);        
        
        JLabel pincode = new JLabel("Exisitng Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 22));
        pincode.setBounds(100, 590, 250, 30);
        add(pincode);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,120,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,120,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup emarriedGroup = new ButtonGroup();
        emarriedGroup.add(eyes);
        emarriedGroup.add(eno);   
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
//        String formno = ""+random;
        String Sreligion = (String)religion.getSelectedItem();
        String Scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)income.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected())
            seniorcitizen = "Yes";
        else if(sno.isSelected())
            seniorcitizen = "No";
        String existingaccount = null;
  
        if(eyes.isSelected())
            existingaccount = "Yes";
        else if(eno.isSelected())
            existingaccount = "No";
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        try{
          
                Conn c = new Conn();
                String query = "insert into signup2 values('"+formno+"', '"+Sreligion+"', '"+Scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"' , '"+span+"' , '"+saadhar+"','"+seniorcitizen+"', '"+existingaccount+"')";
                c.s.executeUpdate(query);
                
                //Signup 3 object will be formed here
                new Signup3(formno).setVisible(true);
        }
        catch(Exception e){
                System.out.println("e");
        }
    }
    public static void  main(String []args){
        new Signup2("");
    }
}
