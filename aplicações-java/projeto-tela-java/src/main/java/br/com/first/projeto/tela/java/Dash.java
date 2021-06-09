package br.com.first.projeto.tela.java;

import org.springframework.jdbc.core.JdbcTemplate;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.ChatAction;
import com.pengrad.telegrambot.request.SendChatAction;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.BaseResponse;
import com.pengrad.telegrambot.response.SendResponse;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import br.com.first.projeto.tela.java.GerarLog;

public class Dash extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblAdmin = new javax.swing.JLabel();
        lblUltraT = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lblDiscoLivre = new javax.swing.JLabel();
        lblUsoDoProc = new javax.swing.JLabel();
        lblStatusProc = new javax.swing.JLabel();
        fundoProc = new javax.swing.JPanel();
        lblEstePc = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        lblPorcentagemCpu = new javax.swing.JLabel();
        lblUsoDaCPU = new javax.swing.JLabel();
        lblStatusCpu = new javax.swing.JLabel();
        fundoCpu = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        lblPorcentagemRam = new javax.swing.JLabel();
        lblUsoDaRam = new javax.swing.JLabel();
        lblStatusRam = new javax.swing.JLabel();
        fundoRam = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        lblPorcentagemTemperatura = new javax.swing.JLabel();
        lblTemperatura = new javax.swing.JLabel();
        lblStatusTemperatura = new javax.swing.JLabel();
        fundoTemperatura = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(25, 25, 38));

        lblAdmin.setBackground(new java.awt.Color(36, 86, 11));
        lblAdmin.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdmin.setText("Admin");
        lblAdmin.setOpaque(true);

        lblUltraT.setBackground(new java.awt.Color(0, 102, 204));
        lblUltraT.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        lblUltraT.setForeground(new java.awt.Color(255, 255, 255));
        lblUltraT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUltraT.setText("Ultra T");

        lblStatus.setBackground(new java.awt.Color(0, 153, 0));
        lblStatus.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(51, 153, 0));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStatus.setText("Ativo");

        lblSair.setBackground(new java.awt.Color(0, 102, 204));
        lblSair.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        lblSair.setForeground(new java.awt.Color(255, 255, 255));
        lblSair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSair.setText("Sair");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUltraT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUltraT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus)
                .addGap(181, 181, 181)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(lblSair)
                .addGap(23, 23, 23))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 520));

        jPanel4.setBackground(new java.awt.Color(176, 176, 190));

        lblDashboard.setBackground(new java.awt.Color(0, 102, 204));
        lblDashboard.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(0, 0, 0));
        lblDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDashboard.setText("Dashboard");
        lblDashboard.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jPanel6.setBackground(new java.awt.Color(210, 210, 232));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(246, 244, 244));

        lblDiscoLivre.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        lblDiscoLivre.setForeground(new java.awt.Color(0, 0, 0));
        lblDiscoLivre.setText("0GB");

        lblUsoDoProc.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        lblUsoDoProc.setForeground(new java.awt.Color(0, 0, 0));
        lblUsoDoProc.setText("DISCO LIVRE");

        lblStatusProc.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        lblStatusProc.setForeground(new java.awt.Color(0, 0, 0));

        fundoProc.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout fundoProcLayout = new javax.swing.GroupLayout(fundoProc);
        fundoProc.setLayout(fundoProcLayout);
        fundoProcLayout.setHorizontalGroup(
            fundoProcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        fundoProcLayout.setVerticalGroup(
            fundoProcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel15))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDiscoLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsoDoProc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(fundoProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblStatusProc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatusProc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lblUsoDoProc)
                        .addGap(5, 5, 5)
                        .addComponent(lblDiscoLivre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(fundoProc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        lblEstePc.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        lblEstePc.setForeground(new java.awt.Color(0, 0, 0));
        lblEstePc.setText(" Este PC");
        lblEstePc.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jPanel9.setBackground(new java.awt.Color(246, 244, 244));

        lblPorcentagemCpu.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        lblPorcentagemCpu.setForeground(new java.awt.Color(0, 0, 0));
        lblPorcentagemCpu.setText("0%");

        lblUsoDaCPU.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        lblUsoDaCPU.setForeground(new java.awt.Color(0, 0, 0));
        lblUsoDaCPU.setText("USO DA CPU");

        lblStatusCpu.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        lblStatusCpu.setForeground(new java.awt.Color(0, 0, 0));

        fundoCpu.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout fundoCpuLayout = new javax.swing.GroupLayout(fundoCpu);
        fundoCpu.setLayout(fundoCpuLayout);
        fundoCpuLayout.setHorizontalGroup(
            fundoCpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );
        fundoCpuLayout.setVerticalGroup(
            fundoCpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel26))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPorcentagemCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsoDaCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fundoCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblStatusCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lblUsoDaCPU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPorcentagemCpu)
                        .addGap(11, 11, 11)
                        .addComponent(lblStatusCpu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(fundoCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel10.setBackground(new java.awt.Color(246, 244, 244));

        lblPorcentagemRam.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        lblPorcentagemRam.setForeground(new java.awt.Color(0, 0, 0));
        lblPorcentagemRam.setText("0%");

        lblUsoDaRam.setBackground(new java.awt.Color(102, 51, 255));
        lblUsoDaRam.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        lblUsoDaRam.setForeground(new java.awt.Color(0, 0, 0));
        lblUsoDaRam.setText("USO DA RAM");

        lblStatusRam.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        lblStatusRam.setForeground(new java.awt.Color(0, 0, 0));

        fundoRam.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout fundoRamLayout = new javax.swing.GroupLayout(fundoRam);
        fundoRam.setLayout(fundoRamLayout);
        fundoRamLayout.setHorizontalGroup(
            fundoRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        fundoRamLayout.setVerticalGroup(
            fundoRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel31))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStatusRam, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPorcentagemRam, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsoDaRam, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(fundoRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(lblUsoDaRam)
                        .addGap(5, 5, 5)
                        .addComponent(lblPorcentagemRam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStatusRam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(fundoRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel11.setBackground(new java.awt.Color(246, 244, 244));

        lblPorcentagemTemperatura.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        lblPorcentagemTemperatura.setForeground(new java.awt.Color(0, 0, 0));
        lblPorcentagemTemperatura.setText("0°");

        lblTemperatura.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        lblTemperatura.setForeground(new java.awt.Color(0, 0, 0));
        lblTemperatura.setText("TEMPERATURA");

        lblStatusTemperatura.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        lblStatusTemperatura.setForeground(new java.awt.Color(0, 0, 0));

        fundoTemperatura.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout fundoTemperaturaLayout = new javax.swing.GroupLayout(fundoTemperatura);
        fundoTemperatura.setLayout(fundoTemperaturaLayout);
        fundoTemperaturaLayout.setHorizontalGroup(
            fundoTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );
        fundoTemperaturaLayout.setVerticalGroup(
            fundoTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel36))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPorcentagemTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fundoTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblStatusTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(lblTemperatura)
                        .addGap(5, 5, 5)
                        .addComponent(lblPorcentagemTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblStatusTemperatura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel36)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(fundoTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        btnIniciar.setBackground(new java.awt.Color(51, 153, 0));
        btnIniciar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar info");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(36, 86, 11));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEstePc, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstePc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addComponent(btnIniciar)
                .addGap(43, 43, 43))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(429, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 650, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Integer id;

    public Dash() {
        initComponents();
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }


    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        
        gerarLog = new GerarLog();
        Monitoramento mon = new Monitoramento();
        Conexao con = new Conexao();
        JdbcTemplate template = new JdbcTemplate(con.getBanco());

        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        String today = formatador.format(data);

        int delay = 5000;   // delay de 5 seg.
        int interval = 5000;  // intervalo de 1 seg.
        Timer timer = new Timer();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        TelegramBot bot = new TelegramBot("1763158664:AAEumHLWhXlZAIAM6r3qref8duSPpIVWs_Q");

        bot.setUpdatesListener(new UpdatesListener() {
            @Override
            public int process(List<Update> list) {
                for (Update update : list) {
                    String command = update.message().text();
                    Long chatId = update.message().chat().id();
                    BaseResponse baseResponse;
                    SendResponse sendResponse;

                    switch (command) {
                        case "/parametros":
                            if (mon.getMemoriaRam() >= 95) {
                                baseResponse = bot.execute(new SendChatAction(chatId, ChatAction.typing));
                                sendResponse = bot.execute(new SendMessage(chatId,
                                        String.format("- A memoria RAM está em nivel altos.Valor: %s \nId da Maquina: %d",
                                                decimalFormat.format(mon.getMemoriaRam()), getId())));
                              
                            }
                            if (mon.getQtdDeUso() > 30) {
                                baseResponse = bot.execute(new SendChatAction(chatId, ChatAction.typing));
                                sendResponse = bot.execute(new SendMessage(chatId,
                                        String.format("- Quantidade de uso está alta.Valor: %s \nId da Maquina: %d",
                                                mon.getQtdDeUso(), getId())));
                               
                            }
                            if (mon.getDiscoLivre() >= 90) {
                                baseResponse = bot.execute(new SendChatAction(chatId, ChatAction.typing));
                                sendResponse = bot.execute(new SendMessage(chatId,
                                        String.format("- O disco está quase cheio.Valor Livre: %s GB\nId da Maquina: %d",
                                                decimalFormat.format(mon.getDiscoLivre()), getId())));
                                
                            } else {
                                baseResponse = bot.execute(new SendChatAction(chatId, ChatAction.typing));
                                sendResponse = bot.execute(new SendMessage(chatId,
                                        "Tudo certo até agora, não encontramos nenhuma irregularidade"));
                            }
                            break;
                        default:
                            baseResponse = bot.execute(new SendChatAction(chatId, ChatAction.typing));
                            sendResponse = bot.execute(new SendMessage(chatId, "Não entendi por favor use um comando valido"));
                            break;
                    }
                }
                return UpdatesListener.CONFIRMED_UPDATES_ALL;
            }
        });

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
           
                lblPorcentagemRam.setText(decimalFormat.format(mon.getMemoriaRam()) + " %");
                lblPorcentagemTemperatura.setText(mon.getTemperatura() + "º");
                lblPorcentagemCpu.setText(mon.getQtdDeUso().toString() + " %");
                lblDiscoLivre.setText(decimalFormat.format(mon.getDiscoLivre()) + " GB");

                System.out.println("------------------");
                System.out.println(decimalFormat.format(mon.getMemoriaRam()) + " %");
                System.out.println(mon.getTemperatura() + "º");
                System.out.println(mon.getQtdDeUso().toString() + " %");
                System.out.println(decimalFormat.format(mon.getDiscoLivre()) + " GB");
                System.out.println("------------------");

//                Api monday - verifica se os dados gerados estão acima do nosso valor de alerta, se sim criar um chamado no monday
                if (mon.getMemoriaRam() > 95) {
                    var category = "topics";
                    var name = String.format("- A memoria RAM está em nivel altos.Valor: %s",
                            decimalFormat.format(mon.getMemoriaRam()));
                    mensagem = "A memória RAM está em nível crítico";
                                gerarLog.componentesPc(mensagem, statusError);

                    try {
                        Monday.createItem(category, name);
                    } catch (IOException | InterruptedException e) {
                        System.out.println("ERROR!");
                        e.printStackTrace();
                    }
                }

                if (mon.getQtdDeUso() > 30) {
                    var category = "topics";
                    var name = String.format("- Quantidade de uso está alta.Valor: %s ",
                            decimalFormat.format(mon.getQtdDeUso()));
                    mensagem = "Quantidade de uso está alta";
                                gerarLog.componentesPc(mensagem, statusError);

                    try {
                        Monday.createItem(category, name);
                    } catch (IOException | InterruptedException e) {
                        System.out.println("ERROR!");
                        e.printStackTrace();
                    }
                }

                if (mon.getDiscoLivre() >= 90) {
                    var category = "topics";
                    var name = String.format("- O disco está quase cheio.Valor Livre: %s GB",
                            decimalFormat.format(mon.getDiscoLivre()), getId());
                     mensagem = "O disco da máquina está quase cheio, limpe o disco para melhor desempenho";
                                gerarLog.componentesPc(mensagem, statusError, List);

                    try {
                        Monday.createItem(category, name);
                    } catch (IOException | InterruptedException e) {
                        System.out.println("ERROR!");
                        e.printStackTrace();
                    }
                }
//            template.update("INSERT INTO dados (ram,temperatura,processador,dataDado,fkMaquina) VALUES (?,?,?,?,?)", 
//                    mon.getMemoriaRam().toString(),
//                    mon.getTemperatura(),
//                    mon.getDiscoLivre().toString(),
//                    today,
//                    getId()); 
            }
        }, delay, interval);

    }//GEN-LAST:event_btnIniciarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            ;
            public void run() {
                new Dash().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JPanel fundoCpu;
    private javax.swing.JPanel fundoProc;
    private javax.swing.JPanel fundoRam;
    private javax.swing.JPanel fundoTemperatura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblDiscoLivre;
    private javax.swing.JLabel lblEstePc;
    private javax.swing.JLabel lblPorcentagemCpu;
    private javax.swing.JLabel lblPorcentagemRam;
    private javax.swing.JLabel lblPorcentagemTemperatura;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStatusCpu;
    private javax.swing.JLabel lblStatusProc;
    private javax.swing.JLabel lblStatusRam;
    private javax.swing.JLabel lblStatusTemperatura;
    private javax.swing.JLabel lblTemperatura;
    private javax.swing.JLabel lblUltraT;
    private javax.swing.JLabel lblUsoDaCPU;
    private javax.swing.JLabel lblUsoDaRam;
    private javax.swing.JLabel lblUsoDoProc;
    // End of variables declaration//GEN-END:variables
}
