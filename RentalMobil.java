package pbo;
import javax.swing.*; 
import java.awt.event.*;

public class RentalMobil extends JFrame 
{
JLabel lblnama=new JLabel("NAMA PENYEWA");    
JTextField txnama=new JTextField(20);    
JLabel lblnohp=new JLabel("NO HP");    
JTextField txnid=new JTextField(7);    
JLabel lbljenismobil=new JLabel("JENIS MOBIL");    
JRadioButton avanza=new JRadioButton("AVANZA");    
JRadioButton xenia=new JRadioButton("XENIA");    
ButtonGroup total=new ButtonGroup();    
JLabel lbltotal=new JLabel("HARGA SEWA");    
JCheckBox duaratuslimapuluh=new JCheckBox("250 RIBU");    
JCheckBox tigaratus=new JCheckBox("300 RIBU");    
JCheckBox tigaratuslimapuluh=new JCheckBox("350 RIBU");    
JButton cetak=new JButton("Cetak");    
JTextArea hasil=new JTextArea();    
    
RentalMobil()    
{       
 setTitle("RENTAL MOBIL");       
 setLocation(300,100);       
 setSize(300,320);       
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
}  
 
 void KomponenVisual()    
 {       
  getContentPane().setLayout(null);
  getContentPane().add(lblnama);       
  lblnama.setBounds(10,10,80,20);       
  getContentPane().add(txnama);       
  txnama.setBounds(105,10,175,20);       
  getContentPane().add(lblnohp);       
  lblnohp.setBounds(10,33,80,20);       
  getContentPane().add(txnid);       
  txnid.setBounds(105,33,70,20);       
  getContentPane().add(lbljenismobil);      
  lbljenismobil.setBounds(10,56,80,20);  
  total.add(avanza);    
  total.add(xenia);      
  getContentPane().add(duaratuslimapuluh);  
  duaratuslimapuluh.setBounds(105,56,62,20);    
  getContentPane().add(tigaratus);
  tigaratus.setBounds(160,56,100,20);       
  getContentPane().add(lbltotal);       
  lbltotal.setBounds(10,80,70,20);       
  getContentPane().add(duaratuslimapuluh);       
  duaratuslimapuluh.setBounds(105,80,100,20);       
  getContentPane().add(tigaratus);       
  tigaratus.setBounds(105,103,100,20);       
  getContentPane().add(tigaratuslimapuluh);       
  tigaratuslimapuluh.setBounds(105,126,100,20);       
  getContentPane().add(cetak);       
  cetak.setBounds(10,150,270,20);       
  getContentPane().add(hasil);       
  hasil.setBounds(10,180,270,100);       
  setVisible(true); 
 }

 void AksiReaksi()    
 {       
  cetak.addActionListener(new ActionListener()       
  {          
   public void actionPerformed(ActionEvent e)          
   {             
    hasil.append(txnama.getText()+"\n");             
    hasil.append(txnid.getText()+"\n");             
    if(avanza.isSelected()==true)             
    {                
     hasil.append(avanza.getText()+"\n");             
    }             
    else             
    {                
    hasil.append(xenia.getText()+"\n");             
    }  
    if(duaratuslimapuluh.isSelected()==true)             
    {                
     hasil.append(duaratuslimapuluh.getText()+"\n");             
    }             
    if(tigaratus.isSelected()==true)             
    {                
     hasil.append(tigaratus.getText()+"\n");             
    }             
    if(tigaratuslimapuluh.isSelected()==true)             
    {                
     hasil.append(tigaratuslimapuluh.getText()+"\n");             
    } 
  }       
  });    
 }  
  public static void main(String args[])    
  {       
   RentalMobil e5=new RentalMobil();       
   e5.KomponenVisual();       
   e5.AksiReaksi();    
  }

}