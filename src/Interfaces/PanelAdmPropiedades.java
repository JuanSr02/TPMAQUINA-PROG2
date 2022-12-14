
package Interfaces;

import Clases.Propiedad;
import Estructura.ArrayListPropiedad;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PanelAdmPropiedades extends javax.swing.JPanel {
    private ProgramaPrincipal Principal;
    private ArrayListPropiedad Propiedades;
    
    public PanelAdmPropiedades(ArrayListPropiedad Propiedades,ProgramaPrincipal Principal) {
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

        PanelAdmPropiedades = new javax.swing.JPanel();
        Arriba = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        LogoFacu = new javax.swing.JLabel();
        CargarPropiedadIm = new javax.swing.JLabel();
        Baja = new javax.swing.JLabel();
        Modi = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        EliminarPropiedad = new javax.swing.JButton();
        ModificarPropiedad = new javax.swing.JButton();
        CargarPropiedad = new javax.swing.JButton();
        MostrarPropiedadesCargadas = new javax.swing.JButton();
        BuscarPropPorDNIpropietario = new javax.swing.JButton();
        BuscarIm = new javax.swing.JLabel();
        Mostrar = new javax.swing.JLabel();
        BuscarPropPorDireccion = new javax.swing.JButton();
        TipoPropMAS = new javax.swing.JPanel();
        TipoPropmasB = new javax.swing.JToggleButton();
        ScrollAyuda = new javax.swing.JScrollPane();
        TipoProp = new javax.swing.JTextArea();
        PromedioM2Cubiertos = new javax.swing.JPanel();
        PromM2CubiertosBot = new javax.swing.JToggleButton();
        ScrollAux = new javax.swing.JScrollPane();
        PromM2 = new javax.swing.JTextArea();

        PanelAdmPropiedades.setBackground(new java.awt.Color(255, 204, 204));

        Arriba.setBackground(new java.awt.Color(153, 0, 51));

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setFont(new java.awt.Font("Arial", 3, 42)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Administrar Propiedades");
        Titulo.setToolTipText("");

        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        LogoFacu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoFacultad.png"))); // NOI18N

        javax.swing.GroupLayout ArribaLayout = new javax.swing.GroupLayout(Arriba);
        Arriba.setLayout(ArribaLayout);
        ArribaLayout.setHorizontalGroup(
            ArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArribaLayout.createSequentialGroup()
                .addGroup(ArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ArribaLayout.createSequentialGroup()
                        .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 577, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ArribaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Titulo)
                        .addGap(45, 45, 45)))
                .addComponent(LogoFacu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ArribaLayout.setVerticalGroup(
            ArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArribaLayout.createSequentialGroup()
                .addGroup(ArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ArribaLayout.createSequentialGroup()
                        .addGroup(ArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LogoFacu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ArribaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        CargarPropiedadIm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CargaPropiedad.png"))); // NOI18N

        Baja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarPropieda.png"))); // NOI18N

        Modi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar (1).png"))); // NOI18N

        Salir.setBackground(new java.awt.Color(255, 0, 0));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        EliminarPropiedad.setBackground(new java.awt.Color(255, 0, 51));
        EliminarPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/X.png"))); // NOI18N
        EliminarPropiedad.setText("Eliminar Propiedad");
        EliminarPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPropiedadActionPerformed(evt);
            }
        });

        ModificarPropiedad.setBackground(new java.awt.Color(255, 255, 102));
        ModificarPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar.png"))); // NOI18N
        ModificarPropiedad.setText("Modificar Propiedad");
        ModificarPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarPropiedadActionPerformed(evt);
            }
        });

        CargarPropiedad.setBackground(new java.awt.Color(102, 255, 102));
        CargarPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Check.png"))); // NOI18N
        CargarPropiedad.setText("Cargar Propiedad");
        CargarPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarPropiedadActionPerformed(evt);
            }
        });

        MostrarPropiedadesCargadas.setBackground(new java.awt.Color(204, 255, 255));
        MostrarPropiedadesCargadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar.png"))); // NOI18N
        MostrarPropiedadesCargadas.setText("Mostrar Propiedades Cargadas");
        MostrarPropiedadesCargadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarPropiedadesCargadasActionPerformed(evt);
            }
        });

        BuscarPropPorDNIpropietario.setBackground(new java.awt.Color(204, 204, 255));
        BuscarPropPorDNIpropietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        BuscarPropPorDNIpropietario.setText("Buscar Propiedad por DNI Propietario");
        BuscarPropPorDNIpropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPropPorDNIpropietarioActionPerformed(evt);
            }
        });

        BuscarIm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BuscarProp.png"))); // NOI18N

        Mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MostrarB.png"))); // NOI18N

        BuscarPropPorDireccion.setBackground(new java.awt.Color(204, 204, 255));
        BuscarPropPorDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        BuscarPropPorDireccion.setText("Buscar Propiedad por Direccion");
        BuscarPropPorDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPropPorDireccionActionPerformed(evt);
            }
        });

        TipoPropMAS.setBackground(new java.awt.Color(255, 204, 204));

        TipoPropmasB.setText("Tipo de Propiedad mas Hipotecada");
        TipoPropmasB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TipoPropmasBStateChanged(evt);
            }
        });
        TipoPropmasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoPropmasBActionPerformed(evt);
            }
        });

        TipoProp = new javax.swing.JTextArea(){
            @Override
            public boolean isEditable(){
                return false;
            }
        };
        TipoProp.setColumns(20);
        TipoProp.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TipoProp.setRows(5);
        TipoProp.setFocusable(false);
        ScrollAyuda.setViewportView(TipoProp);

        javax.swing.GroupLayout TipoPropMASLayout = new javax.swing.GroupLayout(TipoPropMAS);
        TipoPropMAS.setLayout(TipoPropMASLayout);
        TipoPropMASLayout.setHorizontalGroup(
            TipoPropMASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TipoPropMASLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TipoPropMASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TipoPropMASLayout.createSequentialGroup()
                        .addComponent(TipoPropmasB)
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addComponent(ScrollAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        TipoPropMASLayout.setVerticalGroup(
            TipoPropMASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TipoPropMASLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TipoPropmasB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollAyuda, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
        );

        PromedioM2Cubiertos.setBackground(new java.awt.Color(255, 204, 204));

        PromM2CubiertosBot.setText("Promedio M2 Cubiertos");
        PromM2CubiertosBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromM2CubiertosBotActionPerformed(evt);
            }
        });
        PromM2CubiertosBot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PromM2CubiertosBotKeyReleased(evt);
            }
        });

        PromM2 = new javax.swing.JTextArea(){
            @Override
            public boolean isEditable(){
                return false;
            }
        };
        PromM2.setColumns(20);
        PromM2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        PromM2.setRows(5);
        PromM2.setFocusable(false);
        ScrollAux.setViewportView(PromM2);

        javax.swing.GroupLayout PromedioM2CubiertosLayout = new javax.swing.GroupLayout(PromedioM2Cubiertos);
        PromedioM2Cubiertos.setLayout(PromedioM2CubiertosLayout);
        PromedioM2CubiertosLayout.setHorizontalGroup(
            PromedioM2CubiertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollAux, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(PromM2CubiertosBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PromedioM2CubiertosLayout.setVerticalGroup(
            PromedioM2CubiertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PromedioM2CubiertosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PromM2CubiertosBot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollAux, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelAdmPropiedadesLayout = new javax.swing.GroupLayout(PanelAdmPropiedades);
        PanelAdmPropiedades.setLayout(PanelAdmPropiedadesLayout);
        PanelAdmPropiedadesLayout.setHorizontalGroup(
            PanelAdmPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Arriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelAdmPropiedadesLayout.createSequentialGroup()
                .addGroup(PanelAdmPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Mostrar)
                    .addGroup(PanelAdmPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelAdmPropiedadesLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(PanelAdmPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Baja)
                                .addComponent(CargarPropiedadIm)
                                .addComponent(Modi)))
                        .addGroup(PanelAdmPropiedadesLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(BuscarIm, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(PanelAdmPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAdmPropiedadesLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(PanelAdmPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelAdmPropiedadesLayout.createSequentialGroup()
                                .addGroup(PanelAdmPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CargarPropiedad)
                                    .addComponent(EliminarPropiedad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TipoPropMAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelAdmPropiedadesLayout.createSequentialGroup()
                                .addGroup(PanelAdmPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ModificarPropiedad)
                                    .addComponent(BuscarPropPorDNIpropietario)
                                    .addComponent(BuscarPropPorDireccion)
                                    .addComponent(MostrarPropiedadesCargadas))
                                .addGap(28, 28, 28)
                                .addComponent(PromedioM2Cubiertos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdmPropiedadesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salir)
                        .addGap(31, 31, 31))))
        );
        PanelAdmPropiedadesLayout.setVerticalGroup(
            PanelAdmPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAdmPropiedadesLayout.createSequentialGroup()
                .addComponent(Arriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelAdmPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAdmPropiedadesLayout.createSequentialGroup()
                        .addGroup(PanelAdmPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAdmPropiedadesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CargarPropiedadIm))
                            .addGroup(PanelAdmPropiedadesLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(CargarPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(PanelAdmPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAdmPropiedadesLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(Baja))
                            .addGroup(PanelAdmPropiedadesLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(EliminarPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelAdmPropiedadesLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(TipoPropMAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelAdmPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAdmPropiedadesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Modi)
                        .addGap(18, 18, 18)
                        .addComponent(BuscarIm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mostrar))
                    .addGroup(PanelAdmPropiedadesLayout.createSequentialGroup()
                        .addGroup(PanelAdmPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PanelAdmPropiedadesLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(ModificarPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(BuscarPropPorDNIpropietario)
                                .addGap(18, 18, 18)
                                .addComponent(BuscarPropPorDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MostrarPropiedadesCargadas))
                            .addGroup(PanelAdmPropiedadesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(PromedioM2Cubiertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAdmPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAdmPropiedades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        Inicio a=new Inicio(Propiedades,this.Principal);
        this.setVisible(false);
        try {
            this.finalize();
         }catch(Throwable ex){}
        this.Principal.setSize(890,575);
        this.Principal.setContentPane(a);
    }//GEN-LAST:event_RegresarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Salir();
    }//GEN-LAST:event_SalirActionPerformed

    private void EliminarPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPropiedadActionPerformed
        if(Propiedades.isEmpty()){
            Ventana_Mensaje("No hay Propiedades cargadas","/imagenes/X.png");
        }
        else{
        BuscarPorDireccion i3=new BuscarPorDireccion(Propiedades,this.Principal,1);
        this.setVisible(false);
        try {
            this.finalize();
         }catch(Throwable ex){}
        this.Principal.setSize(440,300);
        this.Principal.setContentPane(i3);}
    }//GEN-LAST:event_EliminarPropiedadActionPerformed

    private void ModificarPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarPropiedadActionPerformed
         if(Propiedades.isEmpty()){
            Ventana_Mensaje("No hay Propiedades cargadas","/imagenes/X.png");
        }
        else{
        BuscarPorDireccion i3=new BuscarPorDireccion(Propiedades,this.Principal,2);
        this.setVisible(false);
        try {
            this.finalize();
         }catch(Throwable ex){}
        this.Principal.setSize(440,300);
        this.Principal.setContentPane(i3);}
    }//GEN-LAST:event_ModificarPropiedadActionPerformed

    private void CargarPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarPropiedadActionPerformed
        CargarProp1 c=new CargarProp1(Propiedades,this.Principal);
        this.setVisible(false);
        try {
            this.finalize();
         }catch (Throwable ex){}
        this.Principal.setSize(515,610);
        this.Principal.setContentPane(c);
    }//GEN-LAST:event_CargarPropiedadActionPerformed

    private void MostrarPropiedadesCargadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarPropiedadesCargadasActionPerformed
        if(Propiedades.isEmpty()){
            Ventana_Mensaje("No hay Propiedades cargadas","/imagenes/X.png");
        }
        else{
        MostrarTodos m=new MostrarTodos(Propiedades,this.Principal);
        this.setVisible(false);
        try {
            this.finalize();
        }catch (Throwable ex){}
        this.Principal.setSize(745,360);
        this.Principal.setContentPane(m);
        }
    }//GEN-LAST:event_MostrarPropiedadesCargadasActionPerformed

    private void BuscarPropPorDNIpropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPropPorDNIpropietarioActionPerformed
         if(Propiedades.isEmpty()){
            Ventana_Mensaje("No hay Propiedades cargadas","/imagenes/X.png");
        }
        else{
        Ventana_Mensaje("Proximamente!!","/imagenes/Emoji1.png");
           /*  BuscarPorDNI b4=new BuscarPorDNI(Propiedades,this.Principal,this);
        this.setVisible(false);
        try {
        this.finalize();
        }catch (Throwable ex){}
         this.Principal.setSize(455,320);
        this.Principal.setContentPane(b4);*/}
    }//GEN-LAST:event_BuscarPropPorDNIpropietarioActionPerformed

    private void TipoPropmasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoPropmasBActionPerformed
         if(Propiedades.isEmpty()){
            TipoProp.setText("No hay propiedades \n Cargadas.");
        }
         else{
        int x=Propiedad.TipoPropiedadMasHipotecada();
        if(x==1){
            TipoProp.setText(" El tipo de propiedad mas\n hipotecada son las\n Casas");
        }
        if(x==2){
            TipoProp.setText(" Ambos tipos de propiedad\n han sido hipotecados\n la misma cantidad de\n veces");
        }
        if(x==3){
            TipoProp.setText(" El tipo de propiedad mas\n hipotecada son los\n Departamentos");
        }
         }
    }//GEN-LAST:event_TipoPropmasBActionPerformed

    private void PromM2CubiertosBotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromM2CubiertosBotActionPerformed
         if(Propiedades.isEmpty()){
            PromM2.setText("No hay propiedades \n Cargadas.");
        }
         else{
        double y=Propiedad.PromedioM2CubiertosCasasHipotecados(Propiedades);
        double z=Propiedad.PromedioM2CubiertosDepartamentosHipotecados(Propiedades);
        double v=Propiedad.PromedioM2CubiertosPropiedadesHipotecados(Propiedades);
        PromM2.setText(" El promedio de M2 cubiertos\n de las casas hipotecadas\n es de: " + y + "\n\n El promedio de M2 cubiertos\n de los departamentos hipotecados\n es de: " + z + "\n\n El promedio de M2 cubiertos\n de todas las propiedades\n es de : " + v);}
    }//GEN-LAST:event_PromM2CubiertosBotActionPerformed

    private void BuscarPropPorDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPropPorDireccionActionPerformed
         if(Propiedades.isEmpty()){
            Ventana_Mensaje("No hay Propiedades cargadas","/imagenes/X.png");
        }
        else{
        BuscarPorDireccion i3=new BuscarPorDireccion(Propiedades,this.Principal,0);
        this.setVisible(false);
        try {
        this.finalize();
        }catch (Throwable ex){}
        this.Principal.setSize(440,300);
        this.Principal.setContentPane(i3);}
    }//GEN-LAST:event_BuscarPropPorDireccionActionPerformed

    private void TipoPropmasBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TipoPropmasBStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoPropmasBStateChanged

    private void PromM2CubiertosBotKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PromM2CubiertosBotKeyReleased
        this.TipoProp.setVisible(false);
    }//GEN-LAST:event_PromM2CubiertosBotKeyReleased
public void Salir(){
     try{
         Propiedades.GuardarEnArchivoTxt();}
     catch(IOException e){
         JOptionPane.showMessageDialog(null,"Error guardando los archivos \n"+e.toString(),"Error",JOptionPane.ERROR_MESSAGE);}
        System.exit(1);
}
  
public void Ventana_Mensaje(String Imprimir, String imagen) {
    Icon icono = new javax.swing.ImageIcon(getClass().getResource(imagen));
    JLabel texto = new javax.swing.JLabel();
    texto.setFont(new java.awt.Font("Microsoft YaHei", 1, 16));
    texto.setText(Imprimir);
    JOptionPane.showMessageDialog(this, texto, "Lo sentimos!", JOptionPane.PLAIN_MESSAGE, icono); 
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Arriba;
    private javax.swing.JLabel Baja;
    private javax.swing.JLabel BuscarIm;
    private javax.swing.JButton BuscarPropPorDNIpropietario;
    private javax.swing.JButton BuscarPropPorDireccion;
    private javax.swing.JButton CargarPropiedad;
    private javax.swing.JLabel CargarPropiedadIm;
    private javax.swing.JButton EliminarPropiedad;
    private javax.swing.JLabel LogoFacu;
    private javax.swing.JLabel Modi;
    private javax.swing.JButton ModificarPropiedad;
    private javax.swing.JLabel Mostrar;
    private javax.swing.JButton MostrarPropiedadesCargadas;
    private javax.swing.JPanel PanelAdmPropiedades;
    private javax.swing.JTextArea PromM2;
    private javax.swing.JToggleButton PromM2CubiertosBot;
    private javax.swing.JPanel PromedioM2Cubiertos;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton Salir;
    private javax.swing.JScrollPane ScrollAux;
    private javax.swing.JScrollPane ScrollAyuda;
    private javax.swing.JTextArea TipoProp;
    private javax.swing.JPanel TipoPropMAS;
    private javax.swing.JToggleButton TipoPropmasB;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
