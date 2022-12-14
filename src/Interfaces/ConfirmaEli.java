package Interfaces;
import Clases.Casa;
import Clases.Departamento;
import Clases.Propiedad;
import Estructura.ArrayListPropiedad;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConfirmaEli extends javax.swing.JPanel {
    private ProgramaPrincipal Principal;
    private ArrayListPropiedad Propiedades;
    private Propiedad p;
    
    public ConfirmaEli(ArrayListPropiedad Propiedades,ProgramaPrincipal Principal,Propiedad p) {
        initComponents();
        this.Propiedades=Propiedades;
        this.Principal=Principal;
        this.p=p;
        LlenadoTabla();
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

    public Propiedad getP() {
        return p;
    }

    public void setP(Propiedad p) {
        this.p = p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConfirmaEli = new javax.swing.JPanel();
        Arriba3 = new javax.swing.JPanel();
        Regresar2 = new javax.swing.JButton();
        LogoFacu = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Salir3 = new javax.swing.JButton();
        Mostr = new javax.swing.JScrollPane();
        Mostrar1 = new javax.swing.JTable();
        BAJA = new javax.swing.JButton();

        ConfirmaEli.setBackground(new java.awt.Color(255, 204, 204));

        Arriba3.setBackground(new java.awt.Color(153, 0, 51));

        Regresar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        Regresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar2ActionPerformed(evt);
            }
        });

        LogoFacu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoFacultad.png"))); // NOI18N

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Propiedad a eliminar");

        javax.swing.GroupLayout Arriba3Layout = new javax.swing.GroupLayout(Arriba3);
        Arriba3.setLayout(Arriba3Layout);
        Arriba3Layout.setHorizontalGroup(
            Arriba3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Arriba3Layout.createSequentialGroup()
                .addComponent(Regresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoFacu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Arriba3Layout.setVerticalGroup(
            Arriba3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Arriba3Layout.createSequentialGroup()
                .addGroup(Arriba3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Titulo)
                    .addGroup(Arriba3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LogoFacu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Regresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Salir3.setBackground(new java.awt.Color(255, 0, 0));
        Salir3.setText("Salir");
        Salir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir3ActionPerformed(evt);
            }
        });

        Mostrar1 = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        Mostrar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Mostrar1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Direccion", "Valor de Tasacion", "Cant. de Ambientes", "M2 Cubiertos", "M2 Totales", "Antiguedad", "Piso", "ID"
            }
        ));
        Mostrar1.setFocusable(false);
        Mostrar1.getTableHeader().setReorderingAllowed(false);
        Mostr.setViewportView(Mostrar1);

        BAJA.setBackground(new java.awt.Color(102, 255, 102));
        BAJA.setText("Confirmar Elmiinacion");
        BAJA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAJAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConfirmaEliLayout = new javax.swing.GroupLayout(ConfirmaEli);
        ConfirmaEli.setLayout(ConfirmaEliLayout);
        ConfirmaEliLayout.setHorizontalGroup(
            ConfirmaEliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Arriba3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfirmaEliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ConfirmaEliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfirmaEliLayout.createSequentialGroup()
                        .addComponent(BAJA)
                        .addGap(44, 44, 44)
                        .addComponent(Salir3))
                    .addComponent(Mostr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        ConfirmaEliLayout.setVerticalGroup(
            ConfirmaEliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmaEliLayout.createSequentialGroup()
                .addComponent(Arriba3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Mostr, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(ConfirmaEliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAJA))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ConfirmaEli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ConfirmaEli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Regresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar2ActionPerformed
        PanelAdmPropiedades i=new PanelAdmPropiedades(Propiedades,this.Principal);
        this.setVisible(false);
        try {
            this.finalize();
        } catch (Throwable ex) {}
        this.Principal.setSize(767,808);
        this.Principal.setContentPane(i);
    }//GEN-LAST:event_Regresar2ActionPerformed

    private void Salir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir3ActionPerformed
        Salir();
    }//GEN-LAST:event_Salir3ActionPerformed

    private void BAJAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAJAActionPerformed
        Propiedades.remove(p);
        PanelAdmPropiedades i=new PanelAdmPropiedades(Propiedades,this.Principal);
        Ventana_Mensaje("La propiedad ha sido eliminada correctamente","/imagenes/Check.png");
        if (p.getClass()==Casa.class){
            Casa.setCantCasas(Casa.getCantCasas()-1);
        }
        if (p.getClass()==Departamento.class){
            Departamento.setCantDepartamentos(Departamento.getCantDepartamentos()-1);
        }
        this.setVisible(false);
        try {
            this.finalize();
        } catch (Throwable ex) {}
        
        this.Principal.setSize(767,808);
        this.Principal.setContentPane(i);        
    }//GEN-LAST:event_BAJAActionPerformed
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
    JOptionPane.showMessageDialog(this, texto, "Baja confirmada!", JOptionPane.PLAIN_MESSAGE, icono); 
}
public void LlenadoTabla(){
 DefaultTableModel modelo= new javax.swing.table.DefaultTableModel(
            new Object [][] {
            
            },
            new String [] {
                "Direccion", "Valor de Tasacion", "Cant. de Ambientes","M2 Cubiertos","M2 Totales","Antiguedad","Piso","ID"
            }
        );
        if (p.getClass()==Casa.class){
                Casa p1=(Casa)p;
                modelo.addRow(new String[] {p1.getDireccion(),""+p1.getValorDeTasacion(),""+p1.getCantidadDeAmbientes(),""+p1.getMetrosCuadradosCubiertos(),""+p1.getMetrosCuadradosTotales(),""+p1.getAntiguedadDeConstruccion(),"",""});
            }
            else{
                Departamento p2=(Departamento)p;
                modelo.addRow(new String[] {p2.getDireccion(),""+p2.getValorDeTasacion(),""+p2.getCantidadDeAmbientes(),""+p2.getMetrosCuadradosCubiertos(),""+p2.getMetrosCuadradosTotales(),"",""+p2.getPiso(),p2.getID()});
            }
        this.Mostrar1.setModel(modelo);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Arriba3;
    private javax.swing.JButton BAJA;
    private javax.swing.JPanel ConfirmaEli;
    private javax.swing.JLabel LogoFacu;
    private javax.swing.JScrollPane Mostr;
    private javax.swing.JTable Mostrar1;
    private javax.swing.JButton Regresar2;
    private javax.swing.JButton Salir3;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
