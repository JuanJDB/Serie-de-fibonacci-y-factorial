
package actividad2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Esta clase contiene los elementos java swing
 * @author: Nevarez Tovar Juan Carlos y Juan Ignacio Monroy Gonzalez
 * @version: 1.0
 * 
 */
public class Series extends JFrame implements ActionListener{
  JButton Fibo;
  JButton Fac;
  JTextField num;
  JTextField resulta;
  JLabel titulo;
  JLabel leyenda;
  JLabel ultimo;
  
    public Series(){
      Configuracion();
      Componentes();
    }
    
    public void Configuracion(){
        setTitle("Serie de fibonacci y factorial");
        setSize(600,500);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void Componentes(){
        
        titulo = new JLabel("El factorial y fibonacci");
        titulo.setBounds(50, 25, 600, 50);
        titulo.setHorizontalAlignment(JLabel.CENTER);
        add(titulo);
        titulo.setVisible(true);
        
        leyenda = new JLabel("Ingrese un numero : ");
        leyenda.setBounds(50, 100, 200, 50);
        add(leyenda);
        leyenda.setVisible(true);
        
        num =  new JTextField();
        num.setBounds(250, 100, 250, 50);
        num.setEditable(true);
        add(num);
        num.setVisible(true);
        
        Fibo= new JButton("Fibonacci");
        Fibo.setBounds(50, 200, 200, 50);
        add(Fibo);
        Fibo.addActionListener(this);
        add(Fibo);
        
        Fac = new JButton("Factorial");
        Fac.setBounds(300, 200, 200, 50);
        add(Fac);
        Fac.addActionListener(this);
        add(Fac);
        
        leyenda = new JLabel("Resultado: ");
        leyenda.setBounds(50, 300, 200, 50);
        add(leyenda);
        leyenda.setVisible(true);
        
        resulta = new JTextField();
        resulta.setBounds(250, 300, 250, 50);
        resulta.setEditable(false);
        add(resulta);
        resulta.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
            if(e.getSource()== Fibo ){
                String numero = num.getText();
                if(numero.length()>=11){
                    JOptionPane.showMessageDialog(this, "El parametro es muy largo");
                    resulta.setText("Error :'v");
                }
                else if(numero.matches(".*[^0123456789].*")){
                    JOptionPane.showMessageDialog(this, "Ingrese numeros!");
                    resulta.setText("Error :'v");
                }
                else{
                    int n = Integer.parseInt(num.getText());

                    int sum1=0;
                    int sum2=1;
                    int sum3;
                    String acumulador="0";
                    for(int i=1; i<n;i++){ 
                        sum3=sum1+sum2; 
                        sum1=sum2; 
                        sum2=sum3;     
                        acumulador = acumulador + ", " + sum2;     
                    }  
                    resulta.setText(acumulador);
                }
                
            }
            else{
                if(e.getSource() == Fac ){
                    String numer = num.getText();
                    int nume = Integer.parseInt(num.getText());
                    int factor = 1;
                    
                    if(numer.length()>=11){
                    JOptionPane.showMessageDialog(this, "El parametro es muy largo");
                    resulta.setText("Error :'v");
                }
                else if(numer.matches(".*[^0123456789].*")){
                    JOptionPane.showMessageDialog(this, "Ingrese numeros!");
                    resulta.setText("Error :'v");
                }
                else{
                    
                    while(nume!=0){
                        factor=factor*nume; 
                        nume=nume-1;
                    }                  
                   resulta.setText(Integer.toString(factor));
                }
              }
            }
      }
    
      
}
