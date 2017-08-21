/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binomio;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class binomiocode implements ActionListener {
    
    //Jframe en donde esta contenido todo(ventana)
    private Container cont;
    private JFrame ventana;
    private JTextField numeroa, numerob,resu;
    private JButton b1;
    //metodo para mostrar la ventana
    
       public binomiocode(){
        //se crea la ventana
        ventana = new JFrame("Binomio :3");//establecer titulo
        ventana.setBounds(200, 200, 500, 500);//tamaño de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        cont= ventana.getContentPane();
       }
    
    public void prendeApaga(boolean prendeApaga){
    muestraElementos();
    ventana.setVisible(true);
    }
    
    //elementos
    private void muestraElementos(){
        numeroa = new JTextField();
        numeroa.setBounds(10, 10, 120, 40);
        cont.add(numeroa); 
        
        numerob = new JTextField();
        numerob.setBounds(200, 10, 120, 40);
        cont.add(numerob);
        
        resu = new JTextField();
        resu.setBounds(70, 50, 120, 40);
        cont.add(resu);
        
        b1= new JButton();
        b1.setBounds(10, 160, 160, 40);
        b1.setText("Binomio");
        b1.addActionListener (this);
        cont.add(b1);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        int num1=0;
        int num2=0;
        int num3;
        int num4;
        String tot,tot2,tot3,tot4;
            String resul=resu.getText();
            int num = Integer.parseInt((numeroa.getText().toString()));
            num1=num*num;
            int numa = Integer.parseInt((numerob.getText().toString()));
            num2=(numa+numa)*num;
            num3=numa*numa;
            num4=num1+num2+num3;
            
            tot=String.valueOf(num1);
            tot2=String.valueOf(num2);
            tot3=String.valueOf(num3);
            tot4=String.valueOf(num4);
            resu.setText(tot + " + " + tot2 + " + " + tot3 + "=" + tot4);
        
    }
}
