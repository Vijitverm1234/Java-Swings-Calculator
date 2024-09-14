import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
class GUI implements ActionListener{
    JFrame f1;
    JTextField t1;
    JPanel p;
    JButton nbtn[] = new JButton[10];
    JButton btnDes,btnEqual,btnRem,btnAc,btnDel,btnPlus,btnMinus,btnDiv,btnMult,btnZero,btn2Zero;
    Font ff1=new Font("Ink.Free",Font.BOLD,35);
    Font ff2=new Font("Ink.Free",Font.BOLD,20);
    char opr;
    Double num1,num2,result;
/**
 * 
 */
GUI(){
    f1=new JFrame();
    f1.setSize(390,500);    
    f1.setResizable(false);
    f1.getContentPane().setBackground(new Color(100,100,100));
    f1.setTitle("Calculator");
    f1.setLocationRelativeTo(null);
    
    t1=new JTextField();

    t1.setBounds(10,50,350,50);
    t1.setHorizontalAlignment(JTextField.RIGHT);
    t1.setFont(ff1);

    f1.add(t1);
    
    p=new JPanel();
    p.setLayout(new GridLayout(5, 4));
    p.setBounds(10, 150, 350,300 );
    f1.add(p);
    for(int i=1;i<10;i++){
    nbtn[i]=new JButton(String.valueOf(i));
    p.add(nbtn[i]);
    nbtn[i].setFont(ff2);
    nbtn[i].setBackground(new Color(40, 40, 40));
    nbtn[i].setForeground(Color.WHITE);
    nbtn[i].addActionListener(this);
}
   btnPlus=new JButton("+", null); //plus button
   btnPlus.setFont(ff2);
    btnPlus.setBackground(new Color(40, 40, 40));
    btnPlus.setForeground(Color.GREEN);
    btnMinus=new JButton("+", null);

    btnMinus=new JButton("-", null);
    btnMinus.setFont(ff2);              //minus button
    btnMinus.setBackground(new Color(40, 40, 40));
    btnMinus.setForeground(Color.GREEN);

btnDiv=new JButton("/", null);  // division button
   btnDiv.setFont(ff2);
    btnDiv.setBackground(new Color(40, 40, 40));
    btnDiv.setForeground(Color.GREEN);

    btnMult=new JButton("*", null);  //multiply button
   btnMult.setFont(ff2);
    btnMult.setBackground(new Color(40, 40, 40));
    btnMult.setForeground(Color.GREEN);

    btnZero=new JButton("0", null); //zero
   btnZero.setFont(ff2);
    btnZero.setBackground(new Color(40, 40, 40));
    btnZero.setForeground(Color.GREEN);

    btn2Zero=new JButton("00", null); //2zeroButton
   btn2Zero.setFont(ff2);
    btn2Zero.setBackground(new Color(40, 40, 40));
    btn2Zero.setForeground(Color.GREEN);

    btnDes=new JButton(".", null);
   btnDes.setFont(ff2);
    btnDes.setBackground(new Color(40, 40, 40));
    btnDes.setForeground(Color.GREEN);
    
    btnAc=new JButton("A/c", null);
   btnAc.setFont(ff2);
    btnAc.setBackground(new Color(40, 40, 40));
    btnAc.setForeground(Color.GREEN);

     btnDel=new JButton("Del", null);
   btnDel.setFont(ff2);
    btnDel.setBackground(new Color(40, 40, 40));
    btnDel.setForeground(Color.GREEN);

     btnRem=new JButton("%", null);
   btnRem.setFont(ff2);
    btnRem.setBackground(new Color(40, 40, 40));
    btnRem.setForeground(Color.GREEN);

       btnEqual=new JButton("=", null);
   btnEqual.setFont(ff2);
    btnEqual.setBackground(new Color(40, 40, 40));
    btnEqual.setForeground(Color.RED);


    p.add(btnAc);
    p.add(btnDel);
    p.add(btnRem);
    p.add(btnDiv);
    p.add(nbtn[7]);
    p.add(nbtn[8]);
    p.add(nbtn[9]);
    p.add(btnMult);
    p.add(nbtn[4]);
    p.add(nbtn[5]);
    p.add(nbtn[6]);
    p.add(btnMinus);
    p.add(nbtn[1]);
    p.add(nbtn[2]);
    p.add(nbtn[3]);
    p.add(btnPlus);
    p.add(btnZero);
    p.add(btnDes);
    p.add(btn2Zero);
    p.add(btnEqual);
    
    btn2Zero.addActionListener(this);
    btnZero.addActionListener(this);
    btnDes.addActionListener(this);
    btnAc.addActionListener(this);
    btnDel.addActionListener(this);
    btnPlus.addActionListener(this);
    btnMinus.addActionListener(this);
    btnDiv.addActionListener(this);
    btnEqual.addActionListener(this);
    btnMult.addActionListener(this);


    f1.setLayout(null);
    f1.setVisible(true);
   


}
 public void actionPerformed(ActionEvent e){
   for(int i=1;i<10;i++){
    if(e.getSource()==nbtn[i]){
        t1.setText(t1.getText().concat(String.valueOf(i)));
    }
}
    if(e.getSource()==btnZero){
        t1.setText(t1.getText().concat("0"));
    }
    if(e.getSource()==btn2Zero){
        t1.setText(t1.getText().concat("00"));
    }
    if(e.getSource()==btnDes){
        t1.setText(t1.getText().concat("."));
    }
    if(e.getSource()==btnAc){
        t1.setText("");
    }
    if(e.getSource()==btnDel){
        String back=null;
        if(t1.getText().length()>0){
            StringBuilder str=new StringBuilder(t1.getText());
            str.deleteCharAt(t1.getText().length()-1);
            back=str.toString();
            t1.setText(back);

        }
    }
    
    if(e.getSource()==btnPlus){
        num1=Double.parseDouble(t1.getText());
        opr='+';
        t1.setText("");
    }
    if(e.getSource()==btnPlus){
        num1=Double.parseDouble(t1.getText());
        opr='+';
        t1.setText("");
    }
    if(e.getSource()==btnMinus){
        num1=Double.parseDouble(t1.getText());
        opr='-';
        t1.setText("");
    }
    if(e.getSource()==btnMult){
        num1=Double.parseDouble(t1.getText());
        opr='*';
        t1.setText("");
    }
    if(e.getSource()==btnDiv){
        num1=Double.parseDouble(t1.getText());
        opr='/';
        t1.setText("");
    }
    if(e.getSource()==btnEqual){
        num2=Double.parseDouble(t1.getText());
        switch(opr){
            
            case '+':
            result=num1+num2;
            t1.setText(String.valueOf(result));
            break;

            case '-':
            result=num1-num2;
            t1.setText(String.valueOf(result));
            break;
            
            case '*':
            result=num1*num2;
            t1.setText(String.valueOf(result));
            break;
        
            case '/':
            result=num1/num2;
            t1.setText(String.valueOf(result));
            break;
            
            case '%':
            result=num1%num2;
            t1.setText(String.valueOf(result));
            break;
        }
    }


   

   
 }
}

class Calculator1{
    public static void main(String[] args) {
        new GUI();
    }
}