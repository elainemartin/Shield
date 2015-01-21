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
public class JPanelBalanceSheet extends JPanel implements JPanelView {

    /** Creates new form JPrinter
     * @param oApp */
    public JPanelBalanceSheet(AppView oApp) {
       
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
        return AppLocal.getIntString("Menu.BalanceSheet");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Balance Sheet");

        jLabel2.setText("Your Company, LLC");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel3.setText("Assets");

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(DefaultTableCellRenderer.RIGHT);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Current Assets", null},
                {"     Cash", "87,000"},
                {"     Accounts Receivable", "12,000"},
                {"     Prepaid Rent", "6,000"},
                {"     Inventory", "20,000"},
                {"", "-------"},
                {"Total Current Assets", "125,000"},
            },
            new String [] {
                "Account", "Balance"
            }
        ));
        jTable1.setRowHeight(17);

        jTable1.setRowMargin(1);
        //jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(100);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel5.setText("Liabilities");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Current Liabilities", null},
                {"     Accounts Payable", "36,000"},
                {"     Accrued Expenses", "800"},
                {"     Unearned Revenue", "2,000"},
                {"", "-------"},
                {"Total Current Liabilities", "38,800"},
                {"Long-term Liabilities", "45,000"},
                {"", "-------"},
                {"Total Liabilities", "83,800"},
            },
            new String [] {
                "Account", "Balance"
            }
        ));
        jTable3.setRowHeight(17);

        jTable3.setRowMargin(1);
        //jTable3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable3.getColumnModel().getColumn(1).setMaxWidth(100);
        jTable3.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        jScrollPane3.setViewportView(jTable3);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel4.setText("Equity");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"     Owner Investment / Drawings", "8,000"},
                {"Previous Year Earnings", "112,000"},
                {"Current Year Earnings", "11,000"},
                {"Total Equity", "123,000"},
                {"", "-------"},
                {"Total Liabilities and Equity", "41,920"},
            },
            new String [] {
                "Account", "Balance"
            }
        ));
        jTable2.setRowHeight(17);

        jTable2.setRowMargin(1);
        //jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable2.getColumnModel().getColumn(1).setMaxWidth(100);
        jTable2.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
