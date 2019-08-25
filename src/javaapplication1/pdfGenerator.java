/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.DocumentException;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author pratima
 */
public class pdfGenerator {
    
    public void pdfgen(int id){
    try 
    {
        boolean flag=true;
        String file_name="/home/Downloads/IncomeTax.pdf";          //Give the path where it is to be downloaded.
        Document document=new Document();
        PdfWriter.getInstance(document,new FileOutputStream(file_name));
        document.open();
        
        DBconnection db=new DBconnection();
        Connection con= db.getConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        ps=con.prepareStatement("SELECT * FROM userrecord WHERE USER_ID=?");
        ps.setInt(1,id);
        rs=ps.executeQuery();
        
         document.addTitle("IncomeTax");
        

        
        while(rs.next() & flag)
        {
            document.add(new Paragraph(rs.getString("NAME")));
             document.add(new Paragraph("\n\n"));
            document.add(new Paragraph("NAME                     " +"                                        "+rs.getString("NAME")));
            document.add(new Paragraph("SEX                      " +"                                           "+rs.getString("SEX")));
            document.add(new Paragraph("INCOME FROM SALARY       " +"                         "+rs.getString("INCOME_FROM_SALARY")));
            document.add(new Paragraph("INCOME FROM OTHER SOURCES" +"                  "+rs.getString("INCOME_FROM_OTHER_SOURCES")));
            document.add(new Paragraph("DEDUCTIONS               " +"                                    "+rs.getString("DEDUCTIONS")));
            document.add(new Paragraph("TOTAL GROSS INCOME       " +"                             "+rs.getString("TOTAL_GROSS_INCOME")));
            document.add(new Paragraph("INCOME RATE              " +"                                     "+rs.getString("TAXABLE_AMOUNT")));
            document.add(new Paragraph("TAXABLE AMOUNT           " +"                                      "+rs.getString("INCOME_RATE")));
            document.add(new Paragraph("INCOME TAX               " +"                                           "+rs.getString("INCOME_TAX")));
            flag=false;
        }
        
        if(!flag)
        {
            JOptionPane.showMessageDialog(null,"Successfully Downloaded!!");
        }
        document.close();
        
        
    }catch(SQLException e)
        {
            e.printStackTrace();
        }catch(Exception e)
            {
                System.out.println(e);
            } 
    
  
    
}
}
