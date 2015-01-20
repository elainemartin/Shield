//    uniCenta oPOS  - Touch Friendly Point Of Sale
//    Copyright (c) 2009-2014 uniCenta & previous Openbravo POS works
//    http://www.unicenta.com
//
//    This file is part of uniCenta oPOS
//
//    uniCenta oPOS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//   uniCenta oPOS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with uniCenta oPOS.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.pos.panels;

import com.openbravo.basic.BasicException;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.forms.JPanelView;
import com.openbravo.pos.printer.DeviceFiscalPrinter;
import com.openbravo.pos.printer.DevicePrinter;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author adrianromero
 */
public class JPanelIncome extends JPanel implements JPanelView {

    /** Creates new form JPrinter
     * @param oApp */
    public JPanelIncome(AppView oApp) {
       
        initComponents();

        
//        if (oApp.getDeviceTicket().getDeviceDisplay().getDisplayComponent() != null) {
//            m_jDisplay.add(oApp.getDeviceTicket().getDeviceDisplay().getDisplayComponent());
//        }     
//        
//        List<DevicePrinter> aprinters = oApp.getDeviceTicket().getDevicePrinterAll();
//        for (int i = 0; i < aprinters.size(); i++) {   
//            DevicePrinter printer = aprinters.get(i);
//            if (printer.getPrinterComponent() != null) {
//                m_jPrinters.add(printer.getPrinterName(), printer.getPrinterComponent());
//            }
//        }
//        
//        DeviceFiscalPrinter fp = oApp.getDeviceTicket().getFiscalPrinter();
//        if (fp.getFiscalComponent() != null) {
//            m_jPrinters.add(fp.getFiscalName(), fp.getFiscalComponent());
//        }
    }

    /**
     *
     * @return
     */
    @Override
    public JComponent getComponent() {
        return this;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return AppLocal.getIntString("Menu.IncomeStatement");
    }        

    /**
     *
     * @throws BasicException
     */
    @Override
    public void activate() throws BasicException {
    }

    /**
     *
     * @return
     */
    @Override
    public boolean deactivate() {
        return true;
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Income Statement");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 9, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Your Company, LLC");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 37, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Reporting Period: 01/01/2015 to 3/31/15");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 59, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("Revenue");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 87, -1, -1));

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(DefaultTableCellRenderer.RIGHT);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"     Edibles", "$12,643.34          "},
                {"     Extracts", "$8,432.10          "},
                {"     Bud", "$29,745.33          "},
                {"     Accessories", "$18,540.08          "},
                {"Total Revenue", "$69,360.85"}
            },
            new String [] {
                "Accounts", ""
            }
        ));
        jTable1.setRowHeight(17);
        jTable1.setRowMargin(5);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 115, 648, 110));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setText("Cost of Goods Sold");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"     Edibles", "$8,441.23          "},
                {"     Extracts", "$6,099.12          "},
                {"     Bud", "$17,091.10          "},
                {"     Accessories", "$10,983.49          "},
                {"Total COGS", "$42,614.94"},
                {"Gross Margin %", "38.5%"}
            },
            new String [] {
                "Accounts", ""
            }
        ));
        jTable2.setRowHeight(17);
        jTable2.setRowMargin(5);
        jTable2.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 648, 130));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("Operating Expenses");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"     Utilities", "$897.14          "},
                {"     Payroll", "7,030.34          "},
                {"     Insurance", "$1,800.43          "},
                {"     Property Tax", "$239.09          "},
                {"Total Operating Expenses", "$9,967"},
                {"", ""},
                {"NET PROFIT", "$16,778.91"}
            },
            new String [] {
                "Accounts", ""
            }
        ));
        jTable3.setRowHeight(17);
        jTable3.setRowMargin(5);
        jTable3.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        jScrollPane3.setViewportView(jTable3);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 648, 140));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
