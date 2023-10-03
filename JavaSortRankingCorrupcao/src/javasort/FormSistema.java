package javasort;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormSistema extends javax.swing.JFrame {
    ArrayList<Dados> lista = new ArrayList<>();
    
    // Definir os comparadores
    Comparator<Dados> compareIndex = (Dados d1, Dados d2) -> d1.getCorruptionIndex() - d2.getCorruptionIndex();
    Comparator<Dados> compareCountry = (Dados d1, Dados d2) -> d1.getCountry().compareTo(d2.getCountry());
    Comparator<Dados> compareContinente = (Dados d1, Dados d2) -> d1.getContinente().compareTo(d2.getContinente());
    Comparator<Dados> compareValoresDesviados = (Dados d1, Dados d2) -> {
        // Remova as vírgulas dos valores desviados e converta para double
        double valoresDesviados1 = Double.parseDouble(d1.getAnnualIncome().replace(",", ""));
        double valoresDesviados2 = Double.parseDouble(d2.getAnnualIncome().replace(",", ""));
        return Double.compare(valoresDesviados1, valoresDesviados2);
    };
    Comparator<Dados> compareIDH = (Dados d1, Dados d2) -> {
        double idh1 = Double.parseDouble(d1.getIDH().replace(",", "."));
        double idh2 = Double.parseDouble(d2.getIDH().replace(",", "."));
        return Double.compare(idh1, idh2);
    };
    
    public FormSistema() {
        initComponents();
        carregaArquivo();
        mostra();
    }
    private void carregaArquivo() {
     String csvFile = "corruption.csv";
    String line = "";
    String[] leitura = null;
    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        while ((line = br.readLine()) != null) {
            leitura = line.split(",");
            // Certifique-se de que existem pelo menos 5 elementos na linha
            if (leitura.length >= 5) {
                Dados country = new Dados();
                country.setCountry(leitura[0]); // Define o nome do país
                country.setCorruptionIndex(Integer.parseInt(leitura[1])); // Define o índice de corrupção
                // Substitua todas as vírgulas por pontos e depois faça o parsing
                String annualIncome = leitura[2].replace(",", ".");
                country.setAnnualIncome(annualIncome); // Define o valor desviado
                country.setContinente(leitura[3]); // Define o continente
                country.setIDH(leitura[4]); // Define o IDH
                lista.add(country); // Adiciona o país à lista
            }
        }
        mostra(); // Chama o método para exibir os dados na tabela
    } catch (IOException e) {
        e.printStackTrace();
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        TelaPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblProx = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnOrdNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        cbOrdena = new javax.swing.JComboBox<>();
        txtBusca = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        rbLinear = new javax.swing.JRadioButton();
        rbBinaria = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        TelaPrincipal.setBackground(new java.awt.Color(2, 127, 55));
        TelaPrincipal.setMinimumSize(new java.awt.Dimension(500, 300));

        lblProx.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lblProx.setForeground(new java.awt.Color(255, 255, 255));
        lblProx.setText("RANKING DE CORRUPÇÃO");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/LOGO SISTEMA.png"))); // NOI18N

        javax.swing.GroupLayout TelaPrincipalLayout = new javax.swing.GroupLayout(TelaPrincipal);
        TelaPrincipal.setLayout(TelaPrincipalLayout);
        TelaPrincipalLayout.setHorizontalGroup(
            TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(lblProx)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TelaPrincipalLayout.setVerticalGroup(
            TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaPrincipalLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaPrincipalLayout.createSequentialGroup()
                        .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TelaPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        btnOrdNome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnOrdNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/check-list (1).png"))); // NOI18N
        btnOrdNome.setText("Ordenar");
        btnOrdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdNomeActionPerformed(evt);
            }
        });

        tabelaDados.setAutoCreateRowSorter(true);
        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Países", "Indice de Corrupção", "Valores desviados $", "Continente", "IDH"
            }
        ));
        jScrollPane1.setViewportView(tabelaDados);

        cbOrdena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Países", "Indice de Corrupção", "Valores desviados", "IDH", "Continente", " " }));
        cbOrdena.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                cbOrdenaAncestorRemoved(evt);
            }
        });
        cbOrdena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrdenaActionPerformed(evt);
            }
        });

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });

        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/task.png"))); // NOI18N
        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbLinear);
        rbLinear.setText("Linear");
        rbLinear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLinearActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbBinaria);
        rbBinaria.setText("Binária");
        rbBinaria.setActionCommand("Binario");
        rbBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBinariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrdNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rbLinear)
                                .addGap(18, 18, 18)
                                .addComponent(rbBinaria)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBusca)
                            .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLinear)
                    .addComponent(rbBinaria))
                .addGap(18, 18, 18)
                .addComponent(btnBusca)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //https://1bestcsharp.blogspot.com/2016/03/java-populate-jtable-from-arraylist.html
    void mostra() {
    DefaultTableModel model = (DefaultTableModel) tabelaDados.getModel();
    model.setRowCount(0); // Limpa todas as linhas da tabela

    for (Dados country : lista) {
        Object[] rowData = {
            country.getCountry(),
            country.getCorruptionIndex(),
            country.getAnnualIncome(),
            country.getContinente(), // Adiciona o continente
            country.getIDH() // Adiciona o IDH
        };
        model.addRow(rowData); // Adiciona uma nova linha à tabela com os dados do país
    }
}
   
    
   
    
    
    private void btnOrdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdNomeActionPerformed
       // switch case para escolher por qual comparador ordenar
        switch(cbOrdena.getSelectedIndex()) {
        case 0: 
            // Ordena por nome de país
            lista.sort(compareCountry);
            break;
        case 1:
            // Ordena por índice de corrupção
            lista.sort(compareIndex);
            break;
        case 2:
            // Ordena por valores desviados
            lista.sort(compareValoresDesviados);
            break;
        case 3:
            // Ordena por IDH
            lista.sort(compareIDH);
            break;
        case 4:
            // Ordena por continente
            lista.sort(compareContinente);
            break;
     }
    mostra();
    }//GEN-LAST:event_btnOrdNomeActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        String textoBusca = txtBusca.getText();
    int indexEncontrado = -1;

    if (rbLinear.isSelected()) {
        indexEncontrado = buscaSequencial(textoBusca);
    } else if (rbBinaria.isSelected()) {
        // Certifique-se de que a lista esteja ordenada pelo atributo apropriado aqui
        indexEncontrado = buscaBinaria(textoBusca);
    }

    if (indexEncontrado == -1) {
        JOptionPane.showMessageDialog(null, "Não encontrado.");
    } else {
        JOptionPane.showMessageDialog(null, "Encontrado, índice: " + indexEncontrado);
    }
    }//GEN-LAST:event_btnBuscaActionPerformed

    private int buscaSequencial(String termoBusca) {
    for (int i = 0; i < lista.size(); i++) {
        Dados country = lista.get(i);
        if (country.getCountry().equalsIgnoreCase(termoBusca)) {
            return i; // Retorna o índice do item encontrado
        }
    }
    return -1; // Retorna -1 se o item não for encontrado
}
     private int buscaBinaria(String termoBusca) {
    // Certifique-se de que a lista está ordenada pelo critério de busca
    // Implemente a ordenação aqui, usando um dos atributos (países, índice de corrupção ou renda anual) como critério.

    int left = 0;
    int right = lista.size() - 1;

    while (left <= right) {
        int middle = left + (right - left) / 2;
        Dados country = lista.get(middle);
        int comparisonResult = country.getCountry().compareToIgnoreCase(termoBusca);

        if (comparisonResult == 0) {
            return middle; // Retorna o índice do item encontrado
        } else if (comparisonResult < 0) {
            left = middle + 1;
        } else {
            right = middle - 1;
        }
    }
    return -1; // Retorna -1 se o item não for encontrado
}
    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void rbBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBinariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbBinariaActionPerformed

    private void rbLinearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLinearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLinearActionPerformed

    private void cbOrdenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrdenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrdenaActionPerformed

    private void cbOrdenaAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbOrdenaAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrdenaAncestorRemoved

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelaPrincipal;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnOrdNome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbOrdena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProx;
    private javax.swing.JRadioButton rbBinaria;
    private javax.swing.JRadioButton rbLinear;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
