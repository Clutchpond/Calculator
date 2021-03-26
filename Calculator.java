package solution;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculator
{   
    private String name;
    private JFrame calculator;
    private JLabel lab;
    private JTextField rightOperand;
    private JTextField leftOperand;
    public Calculator()
    {
        
        calculator = new JFrame();
        calculator.setLocation(100, 100);
        calculator.setSize(400, 135);
        calculator.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        calculator.setTitle("My Simple Calculator");
        
        initializeComponents();
        calculator.pack();
        calculator.setVisible(true);
        
    }
    public void initializeComponents()
    {
        JPanel buttonPanel = new JPanel();
        JPanel textBox = new JPanel();
        JPanel result = new JPanel();
        rightOperand = new JTextField(10);
        leftOperand = new JTextField(10);
        
        JButton jbAdd = new JButton("ADD");
        JButton jbSub = new JButton("SUB");
        JButton jbMult = new JButton("MULT");
        JButton jbDiv = new JButton("DIV"); 
        lab = new JLabel("Result = ");
        jbAdd.setName("addButton");
        jbSub.setName("subButton");
        jbMult.setName("multButton");
        jbDiv.setName("divButton");
        rightOperand.setName("rightOperand");
        leftOperand.setName("leftOperand");
        lab.setName("resultLabel");
        
        result.add(lab);
        buttonPanel.add(jbAdd);
        buttonPanel.add(jbSub);
        buttonPanel.add(jbMult);
        buttonPanel.add(jbDiv);
        textBox.add(leftOperand);
        textBox.add(rightOperand);
        
        
        calculator.add(textBox, BorderLayout.PAGE_START);
        calculator.add(result, BorderLayout.LINE_START);
        calculator.add(buttonPanel, BorderLayout.PAGE_END);
        
        
        jbAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            addUpdateClicked();    
            }
        });
        jbSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            subUpdateClicked();    
            }
        });
        jbMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                multUpdateClicked();    
            }
        });
        jbDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                divUpdateClicked();
            }
        });
    }
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
    }
    public void addUpdateClicked()
    {
        String t = leftOperand.getText();
        String x = rightOperand.getText();
        try
        {
        if(!t.trim().equals("") && !x.trim().equals(""))
        {
            int y = Integer.parseInt(t) + Integer.parseInt(x);
            
            lab.setText("Result = "+y);
        }
        else
        {
            lab.setText("Result = error");
        }
        }
        catch(NumberFormatException e)
        {
            lab.setText("Result = error");
        }
        
    }
    public void subUpdateClicked()
    {
        String t = leftOperand.getText();
        String x = rightOperand.getText();
        try
        {
        if(!t.trim().equals("") && !x.trim().equals(""))
        {
            int y = Integer.parseInt(t) - Integer.parseInt(x);
            
            lab.setText("Result = " + y);
        }
        else
        {
            lab.setText("Result = error");
        }
        }
        catch(NumberFormatException e)
        {
            lab.setText("Result = error");
        }
        
    }
    public void divUpdateClicked()
    {
        String t = leftOperand.getText();
        String x = rightOperand.getText();
        try 
        {
        if(!t.trim().equals("") && !x.trim().equals("") && !x.trim().equals("0"))
        {
            int y = Integer.parseInt(t) / Integer.parseInt(x);
            
            lab.setText("Result = "+y);
        }
        else
        {
            lab.setText("Result = error");
        }
        }
        catch(NumberFormatException e)
        {
            lab.setText("Result = error");
        }
        
    }
    public void multUpdateClicked()
    {
        String t = leftOperand.getText();
        String x = rightOperand.getText();
        try 
        {
        if(!t.trim().equals("") && !x.trim().equals(""))
        {   
            int y = Integer.parseInt(t) * Integer.parseInt(x);
            lab.setText("Result = "+y);
        }
        else
        {
            lab.setText("Result = error");
        }
        }
        catch(NumberFormatException e)
        {
            lab.setText("Result = error");
        }
        
    }
    public JFrame getFrame()
    {
        return calculator;
    }
    public String setName()
    {
        return name; 
    }
}