/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arduinoseriportdeneme;
import java.util.Scanner;
import jssc.SerialPort;
import jssc.SerialPortException;
/**
 *
 * @author Mustafa
 */
public class ArduinoSeriPortDeneme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SerialPortException{
        
      SerialPort seri = new SerialPort("COM4");
      seri.openPort();
      seri.setParams(9600, 8, 1, 0); 
        
        Scanner scn = new Scanner(System.in);
        int girilen = 0;
        while(girilen != -1){
            //System.out.println("Lutfen karesini almak icin 0-3 arasinda bir deger giriniz  ya da portu kapatmak icin  : -1");
            System.out.println("Portu kapatmak icin -1/ Lutfen karesi alinacak sayiyi giriniz : (0-3 arasi)");
            girilen = scn.nextInt();
            seri.writeInt(girilen);
        }
        seri.closePort();
    }
    
}
