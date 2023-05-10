/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import model.Carro;
import servicos.CarroServicos;
import servicos.PessoaServicos;
import servicos.ServicosFactory;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 182120036
 */
public class JFCarro extends javax.swing.JFrame {

    /**
     * Creates new form JFCarro
     */
    public JFCarro() {
        initComponents();
        this.setLocationRelativeTo(null);
        jbDeletar.setVisible(false);
    }

    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) jtCarros.getModel();
        model.getDataVector().removeAllElements();//remove todas as linhas
        model.fireTableDataChanged();
        Object rowData[] = new Object[9];
        CarroServicos carroS = ServicosFactory.getCarroServicos();
        PessoaServicos pessoaS = ServicosFactory.getPessoaServicos();
        for (Carro carro : carroS.getCarros()) {
            rowData[0] = carro.getModelo();
            rowData[1] = carro.getMarca();
            rowData[2] = carro.getPlaca();
            rowData[3] = carro.getAnoFab();
            rowData[4] = carro.getAnoMod();
            rowData[5] = carro.getProprietario().getNome();
            rowData[6] = carro.getCombustivel();
            rowData[7] = carro.getTpCambio();
            rowData[8] = carro.getCor();
            model.addRow(rowData);
        }
    }
    
    public boolean validaInputs(){
        if (jtfModelo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Modelo obrigatório!");
            jtfModelo.requestFocus();
            return false;
        }else if(jtfMarca.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Marca obrigatório!");
            jtfMarca.requestFocus();
            return false;
        }else if(jftfPlaca.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Placa obrigatório!");
            jftfPlaca.requestFocus();
            return false;
        }else if (jftfAnoFab.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ano de Fab. obrigatório!");
            jftfAnoFab.requestFocus();
            return false;
        }else if (jftfAnoMod.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ano de Mod. obrigatório!");
            jftfAnoMod.requestFocus();
            return false;
        } else if (jftfCPFP.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Proprietario obrigatório!");
            jftfCPFP.requestFocus();
            return false;
        } else if (jtfTpCombustivel.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tipo de Combustível obrigatório!");
            jtfTpCombustivel.requestFocus();
            return false;
	}else if (jtfTpCambio.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tipo Câmbio obrigatório!");
            jtfTpCambio.requestFocus();
            return false;
        } else if (jtfCor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo Cor obrigatório!");
            jtfCor.requestFocus();
            return false;
        }
        return true;
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jtfModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jftfAnoFab = new javax.swing.JFormattedTextField();
        jftfAnoMod = new javax.swing.JFormattedTextField();
        jtfTpCombustivel = new javax.swing.JTextField();
        jtfTpCambio = new javax.swing.JTextField();
        jtfCor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCarros = new javax.swing.JTable();
        jbDeletar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jftfPlaca = new javax.swing.JFormattedTextField();
        jftfCPFP = new javax.swing.JFormattedTextField();
        jlProp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gerencia Carro");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("* Modelo:");

        jtfModelo.setBackground(new java.awt.Color(255, 255, 255));
        jtfModelo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jtfModelo.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("* Marca:");

        jtfMarca.setBackground(new java.awt.Color(255, 255, 255));
        jtfMarca.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jtfMarca.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("* Placa:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("* Ano de Fabricação:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tipo de Combustível: ");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tipo de Câmbio: ");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("* Ano de Modelo: ");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("* CPF do Proprietário: ");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Cor:");

        jftfAnoFab.setBackground(new java.awt.Color(255, 255, 255));
        jftfAnoFab.setForeground(new java.awt.Color(0, 0, 0));
        try {
            jftfAnoFab.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfAnoFab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jftfAnoFabMouseClicked(evt);
            }
        });

        jftfAnoMod.setBackground(new java.awt.Color(255, 255, 255));
        jftfAnoMod.setForeground(new java.awt.Color(0, 0, 0));
        try {
            jftfAnoMod.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfAnoMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jftfAnoModMouseClicked(evt);
            }
        });

        jtfTpCombustivel.setBackground(new java.awt.Color(255, 255, 255));
        jtfTpCombustivel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jtfTpCombustivel.setForeground(new java.awt.Color(0, 0, 0));

        jtfTpCambio.setBackground(new java.awt.Color(255, 255, 255));
        jtfTpCambio.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jtfTpCambio.setForeground(new java.awt.Color(0, 0, 0));

        jtfCor.setBackground(new java.awt.Color(255, 255, 255));
        jtfCor.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jtfCor.setForeground(new java.awt.Color(0, 0, 0));

        jtCarros.setBackground(new java.awt.Color(255, 255, 255));
        jtCarros.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jtCarros.setForeground(new java.awt.Color(0, 0, 0));
        jtCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Modelo", "Marca", "Placa", "Ano de Fab", "Ano de Mod", "CPF do Prop.", "Tipo de Comb.", "Tipo de Camb.", "Cor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCarros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCarrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCarros);

        jbDeletar.setBackground(new java.awt.Color(255, 255, 255));
        jbDeletar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jbDeletar.setForeground(new java.awt.Color(0, 0, 0));
        jbDeletar.setText("Deletar");
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        jbEditar.setBackground(new java.awt.Color(255, 255, 255));
        jbEditar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jbEditar.setForeground(new java.awt.Color(0, 0, 0));
        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbSalvar.setBackground(new java.awt.Color(255, 255, 255));
        jbSalvar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jbSalvar.setForeground(new java.awt.Color(0, 0, 0));
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbLimpar.setBackground(new java.awt.Color(255, 255, 255));
        jbLimpar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jbLimpar.setForeground(new java.awt.Color(0, 0, 0));
        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbFechar.setBackground(new java.awt.Color(255, 255, 255));
        jbFechar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jbFechar.setForeground(new java.awt.Color(0, 0, 0));
        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        jftfPlaca.setBackground(new java.awt.Color(255, 255, 255));
        jftfPlaca.setForeground(new java.awt.Color(0, 0, 0));
        try {
            jftfPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-#H##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftfPlacaActionPerformed(evt);
            }
        });

        jftfCPFP.setBackground(new java.awt.Color(255, 255, 255));
        jftfCPFP.setForeground(new java.awt.Color(0, 0, 0));
        try {
            jftfCPFP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfCPFP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jftfCPFPFocusLost(evt);
            }
        });
        jftfCPFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftfCPFPActionPerformed(evt);
            }
        });

        jlProp.setBackground(new java.awt.Color(255, 255, 255));
        jlProp.setForeground(new java.awt.Color(0, 0, 0));
        jlProp.setToolTipText("");
        jlProp.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(40, 40, 40)
                        .addComponent(jftfAnoMod))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jtfTpCombustivel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jtfCor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jftfAnoFab))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfMarca)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jftfPlaca))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jtfTpCambio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jbLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbFechar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jftfCPFP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlProp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jftfCPFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlProp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jftfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jftfAnoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jftfAnoFab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfTpCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfTpCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtfCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDeletar)
                    .addComponent(jbEditar)
                    .addComponent(jbSalvar)
                    .addComponent(jbLimpar)
                    .addComponent(jbFechar))
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //private void jtCarroMouseClicked(java.awt.event.MouseEvent evt) {                                       
    // TODO add your handling code here:
    //jbDeletar.setVisible(true);
    //jbEditar.setEnabled(true);

    private void jftfAnoFabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jftfAnoFabMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jftfAnoFabMouseClicked

    private void jftfAnoModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jftfAnoModMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jftfAnoModMouseClicked

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
        if (jbLimpar.getText().equals("Limpar")) {
            limparCampos();
        } else {
            jbEditar.setEnabled(false);
            jbLimpar.setText("Limpar");
            limparCampos();
        }
    }//GEN-LAST:event_jbLimparActionPerformed
    public void limparCampos() {
        jftfCPFP.setText("");
        jtfCor.setText("");
        jtfMarca.setText("");
        jtfModelo.setText("");
        jftfPlaca.setText("");
        jtfTpCombustivel.setText("");
        jtfTpCambio.setText("");
        jftfAnoFab.setText("");
        jftfAnoMod.setText("");
        jlProp.setText(" ");
    }
    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // TODO add your handling code here:
        jbDeletar.setVisible(false);
        jbSalvar.setText("Confirmar");
        jbLimpar.setText("Cancelar");
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jtCarrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCarrosMouseClicked
        // TODO add your handling code here:
        jbDeletar.setVisible(true);
        jbEditar.setEnabled(true);
    }//GEN-LAST:event_jtCarrosMouseClicked

    private void jftfPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftfPlacaActionPerformed

    private void jftfCPFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfCPFPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftfCPFPActionPerformed

    private void jftfCPFPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jftfCPFPFocusLost
        // TODO add your handling code here:
        PessoaServicos pessoaS = ServicosFactory.getPessoaServicos();
        String cpf, nome;
        cpf = jftfCPFP.getText();
        nome = pessoaS.getPessoaByDoc(cpf).getNome();
        if (nome == null) {
            JOptionPane.showMessageDialog(this, "Pessoa não existe!");
            jftfCPFP.requestFocus();
        } else {
            Object[] btnMSG = {"Sim", "Não"};
            int resp = JOptionPane.showOptionDialog(this,
                    "Este é o proprietário? " + nome, "PROPRIETÁRIO",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                    null, btnMSG, btnMSG[0]);
            if (resp == 0) {
                jlProp.setText(nome);
            } else {
                jftfCPFP.requestFocus();
                jftfCPFP.setText("");
            }
        }
    }//GEN-LAST:event_jftfCPFPFocusLost

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jbSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(JFCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JFormattedTextField jftfAnoFab;
    private javax.swing.JFormattedTextField jftfAnoMod;
    private javax.swing.JFormattedTextField jftfCPFP;
    private javax.swing.JFormattedTextField jftfPlaca;
    private javax.swing.JLabel jlProp;
    private javax.swing.JTable jtCarros;
    private javax.swing.JTextField jtfCor;
    private javax.swing.JTextField jtfMarca;
    private javax.swing.JTextField jtfModelo;
    private javax.swing.JTextField jtfTpCambio;
    private javax.swing.JTextField jtfTpCombustivel;
    // End of variables declaration//GEN-END:variables
}
