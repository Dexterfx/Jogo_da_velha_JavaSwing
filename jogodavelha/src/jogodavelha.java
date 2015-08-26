

import Banco.banco;
import javax.swing.JOptionPane;

public class jogodavelha extends javax.swing.JFrame {

    boolean vezJogador1 = true;
    boolean vezJogador2 = false;
    
   //banco conecta = new banco();

    int totalVitoriasJogador1 = 0;
    int totalVitoriasJogador2 = 0;
    int totalVelha = 0;

    public jogodavelha() {
        initComponents();
       // conecta.conexao();
    }

    public void jogada(String simbolo) {
        if (vezJogador1 == true) {
            vezJogador1 = false;
            vezJogador2 = true;
            exibeVezJogador.setText("Jogador 2");
            exibeSimbolo.setText("Simbolo: O");
        } else {
            vezJogador1 = true;
            vezJogador2 = false;
            exibeVezJogador.setText("Jogador 1");
            exibeSimbolo.setText("Simbolo: X");
        }
        verifica(simbolo);
    }

    public void verifica(String jogador) {

        //-------------------------- VERIFICA LINHAS ---------------------------------------
        if ((b1.getText().equals(jogador)) && (b2.getText().equals(jogador)) && (b3.getText().equals(jogador))) {
            venceu(jogador);
        } else {
            if ((b4.getText().equals(jogador)) && (b5.getText().equals(jogador)) && (b6.getText().equals(jogador))) {
                venceu(jogador);
            } else {
                if ((b7.getText().equals(jogador)) && (b8.getText().equals(jogador)) && (b9.getText().equals(jogador))) {
                    venceu(jogador);
                } else {
                    //-------------------------- VERIFICA COLUNAS ---------------------------------------
                    if ((b1.getText().equals(jogador)) && (b4.getText().equals(jogador)) && (b7.getText().equals(jogador))) {
                        venceu(jogador);
                    } else {
                        if ((b2.getText().equals(jogador)) && (b5.getText().equals(jogador)) && (b8.getText().equals(jogador))) {
                            venceu(jogador);
                        } else {
                            if ((b3.getText().equals(jogador)) && (b6.getText().equals(jogador)) && (b9.getText().equals(jogador))) {
                                venceu(jogador);
                            } else {
                                //-------------------------- VERIFICA DIAGONAIS ---------------------------------------
                                if ((b1.getText().equals(jogador)) && (b5.getText().equals(jogador)) && (b9.getText().equals(jogador))) {
                                    venceu(jogador);
                                } else {
                                    if ((b3.getText().equals(jogador)) && (b5.getText().equals(jogador)) && (b7.getText().equals(jogador))) {
                                        venceu(jogador);
                                    } else {
                                        //-------------------------- VERIFICA EMPATE ---------------------------------------
                                        if (!b1.getText().equals("") && !b2.getText().equals("") && !b3.getText().equals("")
                                                && !b4.getText().equals("") && !b5.getText().equals("") && !b6.getText().equals("")
                                                && !b7.getText().equals("") && !b8.getText().equals("") && !b9.getText().equals("")) {
                                            venceu("VELHA!");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void venceu(String jogadorVenceu) {
        if (jogadorVenceu.equals("X")) {
            exibeVezJogador.setText("Jogador 1");
            exibeSimbolo.setText("Simbolo: X");
            JOptionPane.showMessageDialog(null, "Jogador 1 Venceu!");
            totalVitoriasJogador1++;
            vitoriasJogador1.setText("Vitórias: " + totalVitoriasJogador1);
            vezJogador1=true;
            vezJogador2=false;
            limpa();
        } else {
            if (jogadorVenceu.equals("O")) {
                exibeVezJogador.setText("Jogador 2");
            exibeSimbolo.setText("Simbolo: O");
                JOptionPane.showMessageDialog(null, "Jogador 2 Venceu!");
                totalVitoriasJogador2++;
                vitoriasJogador2.setText("Vitórias: " + totalVitoriasJogador2);
                vezJogador2=true;
                vezJogador1=false;
                limpa();
            } else {
                if (jogadorVenceu.equals("VELHA!")) {
                    JOptionPane.showMessageDialog(null, "Houve um empate, deu velha!");
                    totalVelha++;
                    velha.setText("Velha: " + totalVelha);
                    limpa();
                }
            }
        }
    }

    public void limpa(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
    }
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jogador1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vitoriasJogador1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jogador2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vitoriasJogador2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        velha = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        novoJogo = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        Ranking = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        exibeVezJogador = new javax.swing.JLabel();
        exibeSimbolo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        b1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        b1.setBorderPainted(false);
        b1.setFocusPainted(false);
        b1.setFocusable(false);
        b1.setOpaque(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        b2.setBorderPainted(false);
        b2.setFocusPainted(false);
        b2.setFocusable(false);
        b2.setOpaque(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        b3.setBorderPainted(false);
        b3.setFocusPainted(false);
        b3.setFocusable(false);
        b3.setOpaque(false);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        b4.setBorderPainted(false);
        b4.setFocusPainted(false);
        b4.setFocusable(false);
        b4.setOpaque(false);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        b5.setBorderPainted(false);
        b5.setFocusPainted(false);
        b5.setFocusable(false);
        b5.setOpaque(false);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        b6.setBorderPainted(false);
        b6.setFocusPainted(false);
        b6.setFocusable(false);
        b6.setOpaque(false);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        b7.setBorderPainted(false);
        b7.setFocusPainted(false);
        b7.setFocusable(false);
        b7.setOpaque(false);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        b8.setBorderPainted(false);
        b8.setFocusPainted(false);
        b8.setFocusable(false);
        b8.setOpaque(false);
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        b9.setBorderPainted(false);
        b9.setFocusPainted(false);
        b9.setFocusable(false);
        b9.setOpaque(false);
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jogador1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jogador1.setText("Jogador 1");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Simbolo: X");

        vitoriasJogador1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        vitoriasJogador1.setText("Vitórias: 0");

        jogador2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jogador2.setText("Jogador 2");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Simbolo: O");

        vitoriasJogador2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        vitoriasJogador2.setText("Vitórias: 0");

        velha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        velha.setText("Velha: 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vitoriasJogador1)
                            .addComponent(jogador1)
                            .addComponent(vitoriasJogador2)
                            .addComponent(jLabel2)
                            .addComponent(jogador2)
                            .addComponent(jLabel5)
                            .addComponent(velha))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jogador1)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vitoriasJogador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jogador2)
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vitoriasJogador2)
                .addGap(13, 13, 13)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(velha)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        novoJogo.setText("Novo Jogo");
        novoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoJogoActionPerformed(evt);
            }
        });

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        Ranking.setText("Ranking");
        Ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ranking)
                    .addComponent(novoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Ranking, novoJogo, sair});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(novoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ranking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(sair)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Ranking, novoJogo, sair});

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Vez", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel3.setToolTipText("");

        exibeVezJogador.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        exibeVezJogador.setText("Jogador 1");

        exibeSimbolo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        exibeSimbolo.setText("Simbolo: X");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exibeVezJogador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exibeSimbolo)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exibeVezJogador)
                    .addComponent(exibeSimbolo))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4)
                            .addComponent(b7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b2)
                            .addComponent(b5)
                            .addComponent(b8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b9)
                            .addComponent(b3)
                            .addComponent(b6)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {b1, b2, b3, b4, b5, b6, b7, b8, b9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b3)
                            .addComponent(b2)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b5)
                            .addComponent(b4)
                            .addComponent(b6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b7)
                            .addComponent(b8)
                            .addComponent(b9))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {b1, b2, b3, b4, b5, b6, b7, b8, b9});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed

        if (vezJogador1 == true) {
            if (b5.getText().equals("")) {
                b5.setText("X");
                jogada("X");
            }
        } else {
            b5.setText("O");
            jogada("O");
        }

    }//GEN-LAST:event_b5ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

        if (vezJogador1 == true) {
            if (b1.getText().equals("")) {
                b1.setText("X");
                jogada("X");
            }
        } else {
            b1.setText("O");
            jogada("O");
        }

    }//GEN-LAST:event_b1ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed

        if (vezJogador1 == true) {
            if (b4.getText().equals("")) {
                b4.setText("X");
                jogada("X");
            }
        } else {
            b4.setText("O");
            jogada("O");
        }

    }//GEN-LAST:event_b4ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed

        if (vezJogador1 == true) {
            if (b2.getText().equals("")) {
                b2.setText("X");
                jogada("X");
            }
        } else {
            b2.setText("O");
            jogada("O");
        }

    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed

        if (vezJogador1 == true) {
            if (b3.getText().equals("")) {
                b3.setText("X");
                jogada("X");
            }
        } else {
            b3.setText("O");
            jogada("O");
        }

    }//GEN-LAST:event_b3ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed

        if (vezJogador1 == true) {
            if (b6.getText().equals("")) {
                b6.setText("X");
                jogada("X");
            }
        } else {
            b6.setText("O");
            jogada("O");
        }

    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed

        if (vezJogador1 == true) {
            if (b7.getText().equals("")) {
                b7.setText("X");
                jogada("X");
            }
        } else {
            b7.setText("O");
            jogada("O");
        }

    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed

        if (vezJogador1 == true) {
            if (b8.getText().equals("")) {
                b8.setText("X");
                jogada("X");
            }
        } else {
            b8.setText("O");
            jogada("O");
        }

    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed

        if (vezJogador1 == true) {
            if (b9.getText().equals("")) {
                b9.setText("X");
                jogada("X");
            }
        } else {
            b9.setText("O");
            jogada("O");
        }

    }//GEN-LAST:event_b9ActionPerformed

    private void novoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoJogoActionPerformed
        limpa();
    }//GEN-LAST:event_novoJogoActionPerformed

    private void RankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankingActionPerformed

        new ranking().setVisible(true);
    }//GEN-LAST:event_RankingActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

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
            java.util.logging.Logger.getLogger(jogodavelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jogodavelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jogodavelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jogodavelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jogodavelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ranking;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel exibeSimbolo;
    private javax.swing.JLabel exibeVezJogador;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jogador1;
    private javax.swing.JLabel jogador2;
    private javax.swing.JButton novoJogo;
    private javax.swing.JButton sair;
    private javax.swing.JLabel velha;
    private javax.swing.JLabel vitoriasJogador1;
    private javax.swing.JLabel vitoriasJogador2;
    // End of variables declaration//GEN-END:variables
}
