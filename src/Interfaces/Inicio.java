package Interfaces;

import Estructura.ArrayListPropiedad;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JPanel {
    private ArrayListPropiedad Propiedades;
    private ProgramaPrincipal Principal;

    public Inicio(ArrayListPropiedad Propiedades,ProgramaPrincipal Principal) {
        initComponents();
        this.Propiedades=Propiedades;
        this.Principal=Principal;
    }
 public ArrayListPropiedad getPropiedades() {
        return Propiedades;
    }

    public void setPropiedades(ArrayListPropiedad Propiedades) {
        this.Propiedades = Propiedades;
    }
    
    public ProgramaPrincipal getPrincipal() {
        return Principal;
    }

    public void setPrincipal(ProgramaPrincipal Principal) {
        this.Principal=Principal;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inicio = new javax.swing.JPanel();
        AdministrarHipotecas = new javax.swing.JButton();
        AdministrarPropiedades = new javax.swing.JButton();
        AdministrarPersonas = new javax.swing.JButton();
        Creadores = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        LogoHipoteca = new javax.swing.JLabel();
        LogoPersonas = new javax.swing.JLabel();
        LogoPropiedad = new javax.swing.JLabel();
        Arriba = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        LogoFacu = new javax.swing.JLabel();

        Inicio.setBackground(new java.awt.Color(255, 204, 204));

        AdministrarHipotecas.setBackground(new java.awt.Color(0, 0, 0));
        AdministrarHipotecas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AdministrarHipotecas.setForeground(new java.awt.Color(255, 255, 255));
        AdministrarHipotecas.setText("Administrar Hipotecas");
        AdministrarHipotecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministrarHipotecasActionPerformed(evt);
            }
        });

        AdministrarPropiedades.setBackground(new java.awt.Color(0, 0, 0));
        AdministrarPropiedades.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AdministrarPropiedades.setForeground(new java.awt.Color(255, 255, 255));
        AdministrarPropiedades.setText("Administrar Propiedades");
        AdministrarPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministrarPropiedadesActionPerformed(evt);
            }
        });

        AdministrarPersonas.setBackground(new java.awt.Color(0, 0, 0));
        AdministrarPersonas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AdministrarPersonas.setForeground(new java.awt.Color(255, 255, 255));
        AdministrarPersonas.setText("Administrar Personas");
        AdministrarPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministrarPersonasActionPerformed(evt);
            }
        });

        Creadores.setBackground(new java.awt.Color(0, 255, 51));
        Creadores.setText("Creador");
        Creadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreadoresActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(255, 0, 0));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        LogoHipoteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoHipoteca.png"))); // NOI18N

        LogoPersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPropietario.png"))); // NOI18N

        LogoPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPropiedad.png"))); // NOI18N

        Arriba.setBackground(new java.awt.Color(153, 0, 51));

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Sistema de gestion Hipotecaria");
        Titulo.setToolTipText("");

        LogoFacu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoFacultad.png"))); // NOI18N

        javax.swing.GroupLayout ArribaLayout = new javax.swing.GroupLayout(Arriba);
        Arriba.setLayout(ArribaLayout);
        ArribaLayout.setHorizontalGroup(
            ArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArribaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addComponent(LogoFacu))
        );
        ArribaLayout.setVerticalGroup(
            ArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArribaLayout.createSequentialGroup()
                .addComponent(LogoFacu)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ArribaLayout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Arriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(LogoHipoteca, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(LogoPersonas)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Creadores, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(AdministrarHipotecas)
                .addGap(88, 88, 88)
                .addComponent(AdministrarPropiedades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AdministrarPersonas)
                .addGap(39, 39, 39))
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioLayout.createSequentialGroup()
                .addComponent(Arriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InicioLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LogoPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LogoPersonas))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LogoHipoteca, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdministrarPropiedades)
                    .addComponent(AdministrarHipotecas)
                    .addComponent(AdministrarPersonas))
                .addGap(18, 18, 18)
                .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Creadores, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AdministrarHipotecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministrarHipotecasActionPerformed
        PanelAdmHipoteca h=new PanelAdmHipoteca(Propiedades,this.Principal);
        this.setVisible(false);
        try {
                    this.finalize();
                    } catch (Throwable ex) {}
        this.Principal.setSize(570,834);
        this.Principal.setContentPane(h);
    }//GEN-LAST:event_AdministrarHipotecasActionPerformed

    private void AdministrarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministrarPersonasActionPerformed
        PanelAdmPersonas p=new PanelAdmPersonas(Propiedades,this.Principal);
        this.setVisible(false);
        try {
                    this.finalize();
                    } catch (Throwable ex) {}
        this.Principal.setSize(620,830);
        this.Principal.setContentPane(p);
    }//GEN-LAST:event_AdministrarPersonasActionPerformed

    private void CreadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreadoresActionPerformed
        PanelCreador c=new PanelCreador(Propiedades,this.Principal);
        this.setVisible(false);
        try {
                    this.finalize();
                    } catch (Throwable ex) {}
        this.Principal.setSize(360,580);
        this.Principal.setContentPane(c);
    }//GEN-LAST:event_CreadoresActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Salir();
    }//GEN-LAST:event_SalirActionPerformed

    private void AdministrarPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministrarPropiedadesActionPerformed
        PanelAdmPropiedades p1=new PanelAdmPropiedades(Propiedades,this.Principal);
        this.setVisible(false);
        try {
                    this.finalize();
                    } catch (Throwable ex) {}
        this.Principal.setSize(767,808);
        this.Principal.setContentPane(p1);
    }//GEN-LAST:event_AdministrarPropiedadesActionPerformed

 public void Salir(){
     try{
         Propiedades.GuardarEnArchivoTxt();}
     catch(IOException e){
         JOptionPane.showMessageDialog(null,"Error guardando los archivos \n"+e.toString(),"Error",JOptionPane.ERROR_MESSAGE);}
        System.exit(1);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdministrarHipotecas;
    private javax.swing.JButton AdministrarPersonas;
    private javax.swing.JButton AdministrarPropiedades;
    private javax.swing.JPanel Arriba;
    private javax.swing.JButton Creadores;
    private javax.swing.JPanel Inicio;
    private javax.swing.JLabel LogoFacu;
    private javax.swing.JLabel LogoHipoteca;
    private javax.swing.JLabel LogoPersonas;
    private javax.swing.JLabel LogoPropiedad;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
