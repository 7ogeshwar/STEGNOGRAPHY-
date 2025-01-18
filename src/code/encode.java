/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package code;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author logig
 */
public class encode extends javax.swing.JFrame {

   BufferedImage sourceImage =null, Embeddedimage =null;
    public encode() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelmessages = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextmessage = new javax.swing.JTextArea();
        jPanel2source = new javax.swing.JPanel();
        jLabelsource = new javax.swing.JLabel();
        jPanelembedded = new javax.swing.JPanel();
        jLabelembedded = new javax.swing.JLabel();
        jButtonreset = new javax.swing.JButton();
        jButtonopen = new javax.swing.JButton();
        jButtonembeded = new javax.swing.JButton();
        jButtonsave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelmessages.setBackground(new java.awt.Color(153, 153, 153));
        jPanelmessages.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MESSAGES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 14))); // NOI18N

        jTextmessage.setColumns(20);
        jTextmessage.setRows(5);
        jScrollPane1.setViewportView(jTextmessage);

        javax.swing.GroupLayout jPanelmessagesLayout = new javax.swing.GroupLayout(jPanelmessages);
        jPanelmessages.setLayout(jPanelmessagesLayout);
        jPanelmessagesLayout.setHorizontalGroup(
            jPanelmessagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelmessagesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelmessagesLayout.setVerticalGroup(
            jPanelmessagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelmessagesLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanelmessages, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1030, 230));

        jPanel2source.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2source.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "SOURCEIMAGE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 14)))); // NOI18N

        javax.swing.GroupLayout jPanel2sourceLayout = new javax.swing.GroupLayout(jPanel2source);
        jPanel2source.setLayout(jPanel2sourceLayout);
        jPanel2sourceLayout.setHorizontalGroup(
            jPanel2sourceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2sourceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelsource, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2sourceLayout.setVerticalGroup(
            jPanel2sourceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2sourceLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelsource, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2source, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 242, 450, 220));

        jPanelembedded.setBackground(new java.awt.Color(204, 204, 204));
        jPanelembedded.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMBEDDEDIMAGE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 14))); // NOI18N

        javax.swing.GroupLayout jPanelembeddedLayout = new javax.swing.GroupLayout(jPanelembedded);
        jPanelembedded.setLayout(jPanelembeddedLayout);
        jPanelembeddedLayout.setHorizontalGroup(
            jPanelembeddedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelembeddedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelembedded, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
        );
        jPanelembeddedLayout.setVerticalGroup(
            jPanelembeddedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelembeddedLayout.createSequentialGroup()
                .addComponent(jLabelembedded, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanelembedded, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 242, 520, 220));

        jButtonreset.setText("RESET");
        jButtonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonresetActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 468, 101, 37));

        jButtonopen.setText("OPEN");
        jButtonopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonopenActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonopen, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 468, 101, 43));

        jButtonembeded.setText("EMBEDED");
        jButtonembeded.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonembededActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonembeded, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 471, 101, 37));

        jButtonsave.setText("SAVE");
        jButtonsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 468, 101, 37));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonresetActionPerformed
        
        jTextmessage.setText("");
        sourceImage =null;
        Embeddedimage =null;
        jLabelsource.setIcon(null);
        jLabelembedded.setIcon(null);
        
        
    }//GEN-LAST:event_jButtonresetActionPerformed

 private File showFileDialog(final boolean open){
        JFileChooser fc =new JFileChooser("open a image");
        FileFilter filefilter = new FileFilter(){
            @Override
            public boolean accept(File file){
          String name = file.getName().toLowerCase();
          
          if (open)
              return file.isDirectory()|| name.endsWith(".jpg")|| name.endsWith(".jpeg")|| name.endsWith(".png")||name.endsWith(".bmg");
          return file.isDirectory() || name .endsWith(".png") ||name.endsWith(".bmg");
          
            }
            @Override
            public String getDescription(){
                if(open)
                    return "Image (*.jpg,*.jpeg,*.png ,*.bmp)";
                return "Image (*.png ,*.bmp)";
            }
        };
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter((javax.swing.filechooser.FileFilter) filefilter);
        
        
        File file =null;
        if(open && fc.showOpenDialog(this) == fc.APPROVE_OPTION)
            file = fc.getSelectedFile();
        else if (!open && fc.showSaveDialog(this) == fc.APPROVE_OPTION)
            file = fc.getSelectedFile();
            return file;
        
    }
    
    private void jButtonopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonopenActionPerformed
        File file = showFileDialog(true);
     if (file==null)
     {return;


     }
       try {
           sourceImage= ImageIO.read(file);
           jLabelsource.setIcon(new ImageIcon(sourceImage));
           this.validate();
       } catch (IOException ex) {
       }
        
    }//GEN-LAST:event_jButtonopenActionPerformed

    private void jButtonembededActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonembededActionPerformed
        
        if(jTextmessage.equals("") || sourceImage ==null){
            JOptionPane.showMessageDialog(this,"no message has been embedded"," no picture or message found" ,JOptionPane.ERROR_MESSAGE);
            return;        
        }
        String Message =jTextmessage.getText();
        Embeddedimage =sourceImage.getSubimage(0,0,sourceImage.getWidth(),sourceImage.getHeight());
        embeddedMessage(Embeddedimage, Message);
        
        
        jLabelembedded .setIcon(new ImageIcon(Embeddedimage));
        this.validate();
       
    }//GEN-LAST:event_jButtonembededActionPerformed

    private void jButtonsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsaveActionPerformed
        
        if(Embeddedimage == null){
             JOptionPane.showMessageDialog(this,"no message has been embedde","nothing to save",JOptionPane.ERROR_MESSAGE);
        }
        else{
            File file=showFileDialog(false);
            if(file ==null){
                return;
            }
            String name=file.getName();
            String Extention=name.substring(name.lastIndexOf(".")+1).toLowerCase();
            if(!Extention.equals("png")&& !Extention.equals("bmp")){
                Extention = "png";
                file =new File(file.getAbsolutePath()+".png");          
            }
            if(file.exists()) file.delete();
            try {
                ImageIO.write(Embeddedimage, Extention.toUpperCase(), file);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
        }
        
        
        
    }//GEN-LAST:event_jButtonsaveActionPerformed
  
    
   
    
    
    
    
    
    private void embeddedMessage(BufferedImage img ,String mess){
     int messageLength =mess.length();
     int imageWidth =img.getWidth(),imageHeight =img.getHeight(),imageSize =imageWidth+imageHeight;
     byte[] messageBytes = mess.getBytes(StandardCharsets.UTF_8);
     if(messageLength * 8 +32 > imageSize){
         JOptionPane.showMessageDialog(this,"message is too long for this image "," hi",JOptionPane.ERROR_MESSAGE);
     }
         else{
                 embedInteger(img,messageLength,0,0);
                 
                 //byte b[]=mess.getBytes();
                 //for(int i=0;i<b.length;i++)
                 //embedByte (img,b[i],i*8+32,0);
                 for (int i = 0; i < messageBytes.length; i++)
            embedByte(img, messageBytes[i], i * 8 + 32, 0);
                 
                 }
         
     }
  /* private void embedInteger(BufferedImage img,int n,int start ,int storageBit){
       int maxX =img.getWidth(),maxY=img.getHeight(),startX =start/maxY,startY=start-startX*maxY,count=0;
       
       for(int i=startX;i<maxX && count < 32 ;i++){
       for(int j=startY;j<maxY && count < 32 ;j++){
           int rgb =img.getRGB(i,j),bit =getBitValue(n,count);
           rgb =setBitValue(rgb ,storageBit,bit);
           img.setRGB(i,j,rgb);
           count++;
           
       }
   }
   }*/
 private void embedInteger(BufferedImage img, int n, int start, int storageBit) {
    int maxX = img.getWidth(), maxY = img.getHeight(), 
       startX = start/maxY, startY = start - startX*maxY, count=0;
    for(int i=startX; i<maxX && count<32; i++) {
       for(int j=startY; j<maxY && count<32; j++) {
          int rgb = img.getRGB(i, j), bit = getBitValue(n, count);
          rgb = setBitValue(rgb, storageBit, bit);
          img.setRGB(i, j, rgb);
          count++;
          }
       }
    }    
   
   
   
   private void embedByte(BufferedImage img ,byte b,int start,int storageBit){
       int maxX =img.getWidth(),maxY =img.getHeight(), startX =start/maxY, startY =start-startX*maxY,count=0;
       for(int i =startX ; i<maxX && count <8 ;i++){
           for(int j=startY;j<maxY && count < 8;j++){
               int rgb =img.getRGB(i,j),bit =getBitValue(b,count);
           rgb =setBitValue(rgb ,storageBit,bit);
           img.setRGB(i,j,rgb);
           count++;
           }
       }
   }
   
/*private void embedByte(BufferedImage img, byte b, int start, int storageBit) {
    int maxX = img.getWidth(), maxY = img.getHeight(), 
       startX = start/maxY, startY = start - startX*maxY, count=0;
    for(int i=startX; i<maxX && count<8; i++) {
       for(int j=startY; j<maxY && count<8; j++) {
          int rgb = img.getRGB(i, j), bit = getBitValue(b, count);
          rgb = setBitValue(rgb, storageBit, bit);
          img.setRGB(i, j, rgb);
          count++;
          }
       }
    } */  
   
   private int getBitValue (int n, int location){
       int v= (int ) (n &Math.round(Math.pow(2,location)));
       
       return v == 0?0:1;
   }
   
   
   
   private int setBitValue (int n, int location ,int bit){
       
       
       int toggle =(int) Math.pow(2,location),bv =getBitValue(n,location);
       if(bv == bit)
           return n;
       if(bv == 0 && bit ==1)
           n |=toggle;
       else if (bv ==1 && bit == 0)
           n ^=toggle;
       return n;
   }
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(encode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(encode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(encode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(encode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new encode().setVisible(true);
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonembeded;
    private javax.swing.JButton jButtonopen;
    private javax.swing.JButton jButtonreset;
    private javax.swing.JButton jButtonsave;
    private javax.swing.JLabel jLabelembedded;
    private javax.swing.JLabel jLabelsource;
    private javax.swing.JPanel jPanel2source;
    private javax.swing.JPanel jPanelembedded;
    private javax.swing.JPanel jPanelmessages;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextmessage;
    // End of variables declaration//GEN-END:variables

    void setLocationRelativetTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

}
