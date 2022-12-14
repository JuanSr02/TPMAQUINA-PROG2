package Interfaces;
import Clases.Hipoteca;
import Clases.Propiedad;
import Estructura.ArrayListPropiedad;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BuscarPorIDHipoteca extends javax.swing.JPanel {
 private ProgramaPrincipal Principal;
    private ArrayListPropiedad Propiedades;
    private JPanel padre;

    public BuscarPorIDHipoteca(ArrayListPropiedad Propiedades,ProgramaPrincipal Principal,JPanel padre) {
        initComponents();
        this.Propiedades=Propiedades;
        this.Principal=Principal;
        this.padre=padre;
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

    public JPanel getPadre() {
        return padre;
    }

    public void setPadre(JPanel padre) {
        this.padre = padre;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuscarID = new javax.swing.JPanel();
        Arriba3 = new javax.swing.JPanel();
        Regresar2 = new javax.swing.JButton();
        LogoFacu = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Salir3 = new javax.swing.JButton();
        Ins = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Aceptar = new javax.swing.JButton();

        BuscarID.setBackground(new java.awt.Color(255, 204, 204));

        Arriba3.setBackground(new java.awt.Color(153, 0, 51));

        Regresar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        Regresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar2ActionPerformed(evt);
            }
        });

        LogoFacu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoFacultad.png"))); // NOI18N

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Busqueda por ID");

        javax.swing.GroupLayout Arriba3Layout = new javax.swing.GroupLayout(Arriba3);
        Arriba3.setLayout(Arriba3Layout);
        Arriba3Layout.setHorizontalGroup(
            Arriba3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Arriba3Layout.createSequentialGroup()
                .addComponent(Regresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(LogoFacu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Arriba3Layout.setVerticalGroup(
            Arriba3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Arriba3Layout.createSequentialGroup()
                .addGroup(Arriba3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Arriba3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Title)
                        .addComponent(LogoFacu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Regresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Salir3.setBackground(new java.awt.Color(255, 0, 0));
        Salir3.setText("Salir");
        Salir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir3ActionPerformed(evt);
            }
        });

        Ins.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Ins.setText("Ingresar ID (5 caracteres).");

        ID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        Aceptar.setBackground(new java.awt.Color(102, 102, 255));
        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BuscarIDLayout = new javax.swing.GroupLayout(BuscarID);
        BuscarID.setLayout(BuscarIDLayout);
        BuscarIDLayout.setHorizontalGroup(
            BuscarIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Arriba3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarIDLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Aceptar)
                .addGap(52, 52, 52)
                .addComponent(Salir3)
                .addContainerGap())
            .addGroup(BuscarIDLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(BuscarIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ID))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BuscarIDLayout.setVerticalGroup(
            BuscarIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarIDLayout.createSequentialGroup()
                .addComponent(Arriba3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(Ins)
                .addGap(31, 31, 31)
                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(BuscarIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aceptar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BuscarID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BuscarID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Regresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar2ActionPerformed
        this.setVisible(false);
        try {
                    this.finalize();
                    } catch (Throwable ex) {}
        PanelAdmHipoteca panel=new PanelAdmHipoteca(Propiedades,this.Principal);
         this.Principal.setSize(570,834);
         this.Principal.setContentPane(panel);
    }//GEN-LAST:event_Regresar2ActionPerformed

    private void Salir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir3ActionPerformed
        Salir();
    }//GEN-LAST:event_Salir3ActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        String p="";
        p=ID.getText();
        if(p.isEmpty()){
            Ventana_Mensaje("No se ha ingresado ningun caracter","/imagenes/X.png","No se ingreso ninguna ID");
        }
        else{
            if (p.length()!=5){
                Ventana_Mensaje("Se ha ingresado una ID no valida (Debe ser de 5 caracteres)","/imagenes/X.png","ID de mas o menos de 5 caracteres");
                return;
            }
            Propiedad p1=Propiedades.buscarPropiedadPorIDDeHipoteca(p);
            if(p1!=null){
                Hipoteca h1=p1.getHipoteca();
                MostrarUnicoHipoteca m12=new MostrarUnicoHipoteca(Propiedades,this.Principal,h1);
                this.setVisible(false);
                try {
                    this.finalize();
                    } catch (Throwable ex) {}
                this.Principal.setSize(1020,230);
                this.Principal.setContentPane(m12);
            }
            else{
                Ventana_Mensaje("No se ha encontrado una Hipoteca con el ID ingresado","/imagenes/X.png","ID no cargada en el sistema");
            }
        }
    }//GEN-LAST:event_AceptarActionPerformed
public void Salir(){
     try{
         Propiedades.GuardarEnArchivoTxt();}
     catch(IOException e){
         JOptionPane.showMessageDialog(null,"Error guardando los archivos \n"+e.toString(),"Error",JOptionPane.ERROR_MESSAGE);}
        System.exit(1);
}

public void Ventana_Mensaje(String Imprimir, String imagen,String Titulo) {
    Icon icono = new javax.swing.ImageIcon(getClass().getResource(imagen));
    JLabel texto = new javax.swing.JLabel();
    texto.setFont(new java.awt.Font("Microsoft YaHei", 1, 16));
    texto.setText(Imprimir);
    JOptionPane.showMessageDialog(this, texto,Titulo, JOptionPane.PLAIN_MESSAGE, icono); 
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JPanel Arriba3;
    private javax.swing.JPanel BuscarID;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel Ins;
    private javax.swing.JLabel LogoFacu;
    private javax.swing.JButton Regresar2;
    private javax.swing.JButton Salir3;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
