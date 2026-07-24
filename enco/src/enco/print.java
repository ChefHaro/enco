/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enco;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author CSHS-PC105
 */
public class print implements Task2 {

    
   
    public void PrintForm(JTextArea container) {
       PrinterJob job = PrinterJob.getPrinterJob();
        
        job.setJobName("Student Record");
        
        job.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) 
                    throws PrinterException {
             
                
             if(pageIndex > 0 ){
                 return NO_SUCH_PAGE;
             }   
             Graphics2D g2 = (Graphics2D) graphics;
             
               
            g2.translate(pageFormat.getImageableX(),
                    pageFormat.getImageableY());
            
            double panelwidth = container.getWidth();
             double panelHeight = container.getHeight();
             
             double pageWidth = pageFormat.getImageableWidth();
              double pageHeight = pageFormat.getImageableHeight();
              
              double scaleX = pageWidth / panelwidth;
              double scaleY  = pageHeight / panelHeight;
              
              double scale = Math.min(scaleX, scaleY);
              g2.scale(scale, scale);
              container.printAll(g2);
              return PAGE_EXISTS;
            }
        });
            
         
       
        boolean ok = job.printDialog();
        if (ok){
            try{
                job.print();
                
            }catch(PrinterException ex){
                JOptionPane.showMessageDialog(null, "Printing Failed!\n" + ex.getMessage());
            }
        }  
        
    }

   

   
    
}
