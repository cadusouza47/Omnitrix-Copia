package br.com.first.projeto.tela.java;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.springframework.jdbc.core.JdbcTemplate;

public class Login extends javax.swing.JFrame {  
    public Login() {
        initComponents();
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblOminitrix = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        lblTituloLogin = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblEntradaEmail = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblSenha = new javax.swing.JLabel();
        lblEntradaSenha = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        chkManterConectado = new javax.swing.JCheckBox();
        lblCriarUmaConta = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        validationLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 86, 11));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        lblOminitrix.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblOminitrix.setForeground(new java.awt.Color(255, 255, 255));
        lblOminitrix.setText("OMINITRIX");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblOminitrix)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(lblOminitrix)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(38, 38, 57));

        lblTituloLogin.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblTituloLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloLogin.setText("Faça seu login");

        lblEmail.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");

        lblEntradaEmail.setBackground(new java.awt.Color(38, 38, 57));
        lblEntradaEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblEntradaEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEntradaEmail.setBorder(null);
        lblEntradaEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblEntradaEmailActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblSenha.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");

        lblEntradaSenha.setBackground(new java.awt.Color(38, 38, 57));
        lblEntradaSenha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblEntradaSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblEntradaSenha.setBorder(null);
        lblEntradaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblEntradaSenhaActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        chkManterConectado.setBackground(new java.awt.Color(38, 38, 57));
        chkManterConectado.setForeground(new java.awt.Color(255, 255, 255));
        chkManterConectado.setText("Me mantenha conectado");
        chkManterConectado.setBorder(null);
        chkManterConectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkManterConectadoActionPerformed(evt);
            }
        });

        lblCriarUmaConta.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblCriarUmaConta.setForeground(new java.awt.Color(255, 255, 255));
        lblCriarUmaConta.setText("Criar uma conta");

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        validationLogin.setBackground(new java.awt.Color(51, 153, 0));
        validationLogin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        validationLogin.setText("Login");
        validationLogin.setActionCommand("Cadastrar");
        validationLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validationLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(validationLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCriarUmaConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator5)))
                    .addComponent(chkManterConectado)
                    .addComponent(lblTituloLogin)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEntradaSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEntradaEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(89, 89, 89))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblTituloLogin)
                .addGap(69, 69, 69)
                .addComponent(lblEmail)
                .addGap(4, 4, 4)
                .addComponent(lblEntradaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEntradaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(chkManterConectado)
                        .addGap(31, 31, 31)
                        .addComponent(validationLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lblCriarUmaConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblEntradaEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblEntradaEmailActionPerformed
     
    }//GEN-LAST:event_lblEntradaEmailActionPerformed

    private void chkManterConectadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkManterConectadoActionPerformed

    }//GEN-LAST:event_chkManterConectadoActionPerformed
   
    private void validationLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validationLoginActionPerformed
        
        Boolean statusError = false;
        gerarLog = new GerarLog();
        Dash dashObj = new Dash();
        JFrame loginObj = new JFrame();
        Conexao con = new Conexao();
        JdbcTemplate template = new JdbcTemplate(con.getBanco());  
        
        String emailDigitado = getLblEntradaEmail().getText();
        String senhaDigitada = getLblEntradaSenha().getText();
        
        List validacao = template.queryForList("SELECT email FROM usuario WHERE email = ? and senha = ?",
                emailDigitado, senhaDigitada);
        
        if (!validacao.isEmpty()) {     
            
            List idUsuarioList = template.queryForList("SELECT idUsuario FROM usuario WHERE email = ? and senha = ?", 
                    emailDigitado, senhaDigitada);
            
            String idUsuario = idUsuarioList.get(0).toString().substring(11, 12);         
            
            List idMaquinaList = template.queryForList("SELECT idMaquina FROM maquina WHERE fkUsuario = ?", 
                    idUsuario);
            
            String idMaquina = idMaquinaList.get(0).toString().substring(11, 12);
       
            dashObj.setId(Integer.valueOf(idMaquina));
            
            dashObj.setVisible(true);
            loginObj.setDefaultCloseOperation(Login.DISPOSE_ON_CLOSE);
            dispose();
            
             mensagem = "Usuario logado com sucesso";
                    gerarLog.createLogLogin(mensagem, statusError);
        } else {
            System.out.println("Email ou senha incorretos");
        }
        
    }//GEN-LAST:event_validationLoginActionPerformed
   
    private void lblEntradaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblEntradaSenhaActionPerformed

    }//GEN-LAST:event_lblEntradaSenhaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    public Login(JLabel lblEmail, JTextField lblEntradaEmail, JPasswordField lblEntradaSenha) {
        this.lblEmail = lblEmail;
        this.lblEntradaEmail = lblEntradaEmail;
        this.lblEntradaSenha = lblEntradaSenha;
    }

    public JTextField getLblEntradaEmail() {
        return lblEntradaEmail;
    }

    public void setLblEntradaEmail(JTextField lblEntradaEmail) {
        this.lblEntradaEmail = lblEntradaEmail;
    }

    public JPasswordField getLblEntradaSenha() {
        return lblEntradaSenha;
    }

    public void setLblEntradaSenha(JPasswordField lblEntradaSenha) {
        this.lblEntradaSenha = lblEntradaSenha;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkManterConectado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblCriarUmaConta;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JTextField lblEntradaEmail;
    private javax.swing.JPasswordField lblEntradaSenha;
    private javax.swing.JLabel lblOminitrix;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTituloLogin;
    private javax.swing.JButton validationLogin;
    // End of variables declaration//GEN-END:variables
}
