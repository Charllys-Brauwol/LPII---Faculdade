
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author charl
 */
public class Abastecimentos extends javax.swing.JFrame {

    /**
     * Creates new form Abastecimentos
     * @throws java.sql.SQLException
     */
    public Abastecimentos() throws SQLException {
        initComponents();
        chamarFuncionarios();
        chamarVeiculo();
        popularTabelaAbastecimento();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxVeiculo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxFuncionario = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAbastecimento = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JTextField();
        jTextFieldValorAbastecimento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldKmAbastecimento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPosto = new javax.swing.JTextField();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldSaida = new javax.swing.JTextField();
        jTextFieldDestino = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abastecimento.png"))); // NOI18N

        jComboBoxVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE" }));
        jComboBoxVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVeiculoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("VEICULO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("FUNCIONARIO:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("DATA:");

        jComboBoxFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE" }));
        jComboBoxFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxFuncionarioMouseClicked(evt);
            }
        });
        jComboBoxFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFuncionarioActionPerformed(evt);
            }
        });
        jComboBoxFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxFuncionarioKeyPressed(evt);
            }
        });

        jTableAbastecimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FUNCIONARIO", "VEICULO", "DATA", "VALOR", "KM", "POSTO", "SAIDA", "DESTINO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAbastecimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAbastecimentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAbastecimento);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("VALOR:");

        jTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("KM:");

        jTextFieldKmAbastecimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKmAbastecimentoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("POSTO:");

        jTextFieldPosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPostoActionPerformed(evt);
            }
        });

        jButtonExcluir.setBackground(new java.awt.Color(255, 0, 51));
        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.setPreferredSize(new java.awt.Dimension(70, 90));
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditar.setBackground(new java.awt.Color(51, 102, 255));
        jButtonEditar.setText("EDITAR");
        jButtonEditar.setEnabled(false);
        jButtonEditar.setPreferredSize(new java.awt.Dimension(70, 90));
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonSalvar.setBackground(new java.awt.Color(153, 255, 0));
        jButtonSalvar.setText("SALVAR");
        jButtonSalvar.setPreferredSize(new java.awt.Dimension(70, 90));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("LOCAL DE SAÍDA:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("DESTINO:");

        jTextFieldSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaidaActionPerformed(evt);
            }
        });

        jTextFieldDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDestinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(295, 295, 295))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldSaida))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldValorAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldKmAbastecimento)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPosto)
                            .addComponent(jComboBoxVeiculo, 0, 230, Short.MAX_VALUE)
                            .addComponent(jTextFieldDestino))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldValorAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldKmAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldPosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVeiculoActionPerformed

    private void jComboBoxFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFuncionarioActionPerformed

    private void jTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataActionPerformed

    private void jTextFieldKmAbastecimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKmAbastecimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKmAbastecimentoActionPerformed

    private void jTextFieldPostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPostoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        String funcionario = jComboBoxFuncionario.getSelectedItem().toString();
        int posFuncionario = funcionario.indexOf("-");
        String idFuncionario = funcionario.substring(0, posFuncionario);
        String veiculo = jComboBoxVeiculo.getSelectedItem().toString();
        int posVeiculo = veiculo.indexOf("-");
        String idVeiculo = veiculo.substring(0, posVeiculo);
        String data_viagem = jTextFieldData.getText();
        String valor_abastecimento = jTextFieldValorAbastecimento.getText();
        String km_veiculo = jTextFieldKmAbastecimento.getText();
        String posto = jTextFieldPosto.getText();
        String local_saida = jTextFieldSaida.getText();
        String local_destino = jTextFieldDestino.getText();
        
        if (data_viagem.equals("") || valor_abastecimento.equals("") || km_veiculo.equals("") || posto.equals("") || local_saida.equals("") || local_destino.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para continuar!");
        } else {
            try {
                SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
                String str = data_viagem;
                Date data = formatador.parse(str);

                Conexao con = new Conexao();
                java.sql.Statement st = (java.sql.Statement) con.conexao.createStatement();
                String sql = "INSERT INTO abastecimento (funcionario, veiculo, data_viagem, valor_abastecimento, km_veiculo, posto, local_saida, local_destino) VALUES ('" + idFuncionario + "','" 
                        + idVeiculo + "','" 
                        + new java.sql.Date(data.getTime()) + "','" 
                        + valor_abastecimento + "','" 
                        + km_veiculo + "','" 
                        + posto + "','"
                        + local_saida + "','"
                        + local_destino + "' )";

                if (st.execute(sql)) {
                    JOptionPane.showMessageDialog(null, "Ops! Algo errado");
                } else {
                    JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                    popularTabelaAbastecimento();
                    limparCampos();
                }
            } catch (Exception e) {
                System.out.println("erro");
            }
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSaidaActionPerformed

    private void jTextFieldDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDestinoActionPerformed

    private void jComboBoxFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxFuncionarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFuncionarioMouseClicked

    private void jComboBoxFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxFuncionarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFuncionarioKeyPressed

    private void jTableAbastecimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAbastecimentoMouseClicked
       jButtonExcluir.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        
        int row = jTableAbastecimento.getSelectedRow();
        String id = jTableAbastecimento.getValueAt(row, 0).toString();
        String funcionario = jTableAbastecimento.getValueAt(row, 1).toString();
        String veiculo = jTableAbastecimento.getValueAt(row, 2).toString();
        String data = jTableAbastecimento.getValueAt(row, 3).toString();
        String valor = jTableAbastecimento.getValueAt(row, 4).toString();
        String km = jTableAbastecimento.getValueAt(row, 5).toString();
        String posto = jTableAbastecimento.getValueAt(row, 6).toString();
        String saida = jTableAbastecimento.getValueAt(row, 7).toString();
        String destino = jTableAbastecimento.getValueAt(row, 8).toString();

        
        jTextFieldData.setText(data);
        jTextFieldValorAbastecimento.setText(valor);
        jTextFieldKmAbastecimento.setText(km);
        jTextFieldPosto.setText(posto);
        jTextFieldSaida.setText(saida);
        jTextFieldDestino.setText(destino);
    }//GEN-LAST:event_jTableAbastecimentoMouseClicked

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int linha = jTableAbastecimento.getSelectedRow();
        String id = jTableAbastecimento.getValueAt(linha, 0).toString();

        int confirmacao = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente deletar?");
        if (confirmacao == 0) {
            try {
                Conexao con = new Conexao();
                Statement st = con.conexao.createStatement();
                String sqlDelete = "DELETE FROM abastecimento WHERE id = " + id;
                

                if (!st.execute(sqlDelete)) {
                    JOptionPane.showMessageDialog(rootPane, "DELETADO COM SUCESSO!");
                    limparCampos();
                    popularTabelaAbastecimento();
                    con.conexao.close();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "ERRO AO DELETAR");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Cidades.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        int row = jTableAbastecimento.getSelectedRow();
        String id = jTableAbastecimento.getValueAt(row, 0).toString();

        String funcionario = jComboBoxFuncionario.getSelectedItem().toString();
        int posFuncionario = funcionario.indexOf("-");
        String idFuncionario = funcionario.substring(0, posFuncionario);
        String veiculo = jComboBoxVeiculo.getSelectedItem().toString();
        int posVeiculo = veiculo.indexOf("-");
        String idVeiculo = veiculo.substring(0, posVeiculo);
        String data_viagem = jTextFieldData.getText();
        String valor_abastecimento = jTextFieldValorAbastecimento.getText();
        String km_veiculo = jTextFieldKmAbastecimento.getText();
        String posto = jTextFieldPosto.getText();
        String local_saida = jTextFieldSaida.getText();
        String local_destino = jTextFieldDestino.getText();
        
        //SELECT funcionarios.nome, veiculos.veiculo, abastecimento.* 
        //FROM `abastecimento` JOIN funcionarios ON funcionarios.id = abastecimento.funcionario 
        //JOIN veiculos ON veiculos.id = abastecimento.veiculo ORDER BY abastecimento.id DESC";
        
        if (!funcionario.isEmpty() || !veiculo.isEmpty()) {
            try {
                SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
                String str = data_viagem;
                Date data = formatador.parse(str);
                
                Conexao con = new Conexao();
                Statement st = con.conexao.createStatement();
                String sql = "UPDATE abastecimento SET funcionario='" + idFuncionario + "',"
                        + "veiculo='" + idVeiculo + "',"
                        + "data_viagem='" + new java.sql.Date(data.getTime()) + "',"
                        + "valor_abastecimento='" + valor_abastecimento + "',"
                        + "km_veiculo='" + km_veiculo + "',"
                        + "posto='" + posto + "',"
                        + "local_saida='" + local_saida + "',"
                        + "local_destino='" + local_destino + "'"
                        + " WHERE id=" + id;
                        System.out.println(sql);
                if (st.executeUpdate(sql) == 1) {
                    JOptionPane.showMessageDialog(null, "Dados alterados");
                    
                    jButtonEditar.setEnabled(false);
                    jButtonExcluir.setEnabled(false);
                    jButtonSalvar.setEnabled(true);
                    
                    limparCampos();
                    popularTabelaAbastecimento();

                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao alterar!");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Cidades.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(Abastecimentos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ops!, Preencha os campos para continuar! ");
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

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
            java.util.logging.Logger.getLogger(Abastecimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Abastecimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Abastecimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Abastecimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Abastecimentos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Abastecimentos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxFuncionario;
    private javax.swing.JComboBox<String> jComboBoxVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAbastecimento;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldDestino;
    private javax.swing.JTextField jTextFieldKmAbastecimento;
    private javax.swing.JTextField jTextFieldPosto;
    private javax.swing.JTextField jTextFieldSaida;
    private javax.swing.JTextField jTextFieldValorAbastecimento;
    // End of variables declaration//GEN-END:variables

public void chamarFuncionarios() throws SQLException{
        Conexao con = new Conexao();
        Statement st = con.conexao.createStatement();
        
        String sql = "SELECT id, nome FROM funcionarios";
        
        ResultSet resultado = st.executeQuery(sql);

        while (resultado.next()) {
            jComboBoxFuncionario.addItem(resultado.getString("id") + "-" + resultado.getString("nome")); 
        }
}

public void chamarVeiculo() throws SQLException{
        Conexao con = new Conexao();
        Statement st = con.conexao.createStatement();
        
        String sql = "SELECT id, veiculo FROM veiculos";
        
        ResultSet resultado = st.executeQuery(sql);

        while (resultado.next()) {
            jComboBoxVeiculo.addItem(resultado.getString("id") + "-" + resultado.getString("veiculo")); 
        }
}

    public void popularTabelaAbastecimento() throws SQLException {

            DefaultTableModel model = (DefaultTableModel) jTableAbastecimento.getModel();
            model.setNumRows(0);

            Conexao con = new Conexao();
            java.sql.Statement st = con.conexao.createStatement();

        String sql = "SELECT funcionarios.nome, veiculos.veiculo, abastecimento.* FROM `abastecimento` JOIN funcionarios ON funcionarios.id = abastecimento.funcionario JOIN veiculos ON veiculos.id = abastecimento.veiculo ORDER BY abastecimento.id DESC";
        
        System.out.println(sql);

        ResultSet resultado = st.executeQuery(sql);
        
        
        
        
        while (resultado.next()) {
            String dataTabela = resultado.getString("data_viagem"); 
            Date dt;
            try {
                dt = new SimpleDateFormat("yyyy-MM-dd").parse(dataTabela);
                String dataFormatada = new SimpleDateFormat("dd-MM-yyyy").format(dt);
                model.addRow(new Object[]{
                resultado.getString("id"),
                resultado.getString("nome"),
                resultado.getString("veiculo"),                
                dataFormatada,
                resultado.getString("valor_abastecimento"),
                resultado.getString("km_veiculo"),
                resultado.getString("posto"),
                resultado.getString("local_saida"),
                resultado.getString("local_destino")
            });
            } catch (ParseException ex) {
                Logger.getLogger(Abastecimentos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


public void limparCampos(){
        jComboBoxFuncionario.setSelectedIndex(0);
        jComboBoxVeiculo.setSelectedIndex(0);
        jTextFieldData.setText("");
        jTextFieldValorAbastecimento.setText("");
        jTextFieldKmAbastecimento.setText("");
        jTextFieldPosto.setText("");
        jTextFieldSaida.setText("");
        jTextFieldDestino.setText("");
}
}
