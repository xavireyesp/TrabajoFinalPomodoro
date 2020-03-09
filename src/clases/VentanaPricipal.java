package clases;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.media.AudioClip;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;


/**
 * @author EduardoReyes;
 */
public class VentanaPricipal extends javax.swing.JFrame {
 //Constructor
    public VentanaPricipal() {
        
        initComponents();
       
        
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
           
        setLocationRelativeTo(null);      
     
        t = new Timer(10, acciones); //inicializamos el contador para que transcura cada 1 segundo
                
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnReiniciar = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        etiquetaTiempo = new javax.swing.JLabel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaReloj = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SpinerNumeroPomo = new javax.swing.JSpinner();
        BtnAplicar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JSTiempoPomodoro = new javax.swing.JSlider();
        JSTiempoDescansoCorto = new javax.swing.JSlider();
        JSTiempoDescansoLargo = new javax.swing.JSlider();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cronómetro - Programación y más !");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.black);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.setEnabled(false);
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnPause.setText("Pausar");
        btnPause.setEnabled(false);
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        btnIniciar.setText("Iniciar");
        btnIniciar.setEnabled(false);
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        etiquetaTiempo.setFont(new java.awt.Font("Lucida Sans", 1, 40)); // NOI18N
        etiquetaTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTiempo.setText("00:00:00");
        etiquetaTiempo.setToolTipText("");

        etiquetaTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(51, 51, 255));
        etiquetaTitulo.setText("POMODORO");

        etiquetaReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaReloj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reloj2.png"))); // NOI18N
        etiquetaReloj.setAlignmentY(0.0F);
        etiquetaReloj.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(etiquetaReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(etiquetaTitulo)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(etiquetaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(etiquetaTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(etiquetaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(etiquetaReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReiniciar)
                            .addComponent(btnIniciar)
                            .addComponent(btnPause))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Número de tareas");

        SpinerNumeroPomo.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        BtnAplicar.setText("Aplicar");
        BtnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAplicarActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Pomodoro", null}
            },
            new String [] {
                "Tipo", ""
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(SpinerNumeroPomo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnAplicar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(SpinerNumeroPomo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAplicar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Configuración");

        jLabel3.setText("Tiempo Pomodoro");

        jLabel4.setText("Tiempo Descaso Corto");

        jLabel5.setText("Tiempo Descaso Largo");

        JSTiempoPomodoro.setMajorTickSpacing(10);
        JSTiempoPomodoro.setMaximum(60);
        JSTiempoPomodoro.setMinimum(1);
        JSTiempoPomodoro.setPaintLabels(true);
        JSTiempoPomodoro.setPaintTicks(true);
        JSTiempoPomodoro.setValue(25);

        JSTiempoDescansoCorto.setMajorTickSpacing(5);
        JSTiempoDescansoCorto.setMaximum(60);
        JSTiempoDescansoCorto.setPaintLabels(true);
        JSTiempoDescansoCorto.setPaintTicks(true);
        JSTiempoDescansoCorto.setValue(10);

        JSTiempoDescansoLargo.setMajorTickSpacing(5);
        JSTiempoDescansoLargo.setMaximum(60);
        JSTiempoDescansoLargo.setPaintLabels(true);
        JSTiempoDescansoLargo.setPaintTicks(true);
        JSTiempoDescansoLargo.setValue(20);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JSTiempoPomodoro, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(JSTiempoDescansoCorto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(JSTiempoDescansoLargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(JSTiempoPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(JSTiempoDescansoCorto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JSTiempoDescansoLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 51, 51));

        jMenu1.setBackground(new java.awt.Color(255, 51, 51));
        jMenu1.setText("File");

        jMenuItem1.setText("Nuevo");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator2);

        jMenuItem2.setText("Salir");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Timer t;  //Declaramos la variable de tipo Timer
    private int h, m, s, cs; //Declaramos las variables que vamos a usar
    private int contPomo=0, contDes=0; //Inicializamos las varables ques nos sirven de contador  
    private String sonidoA="../sonidos/sonidoA.wav",sonidoB="../sonidos/sonidoA.wav"; //Declaramos variables de tipo String con la direccion del archivo de audio
    //Inicializamos el Timer
    private ActionListener acciones = new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
        //El codigo que se va a reproducir en el Timer
            if(cs==0){
           cs=99;
           }
            --cs; 
            if(cs==0){
                cs = 99;
              --s; 
                              
            }
            if(s==0) 
            {
                s = 59;
                if (m!=0) {
                    --m; 
                }
             }
            int valor=(Integer)SpinerNumeroPomo.getValue();
            if(m==0 && s==01) //Compara si los minutos y los segundos son 0 para terminar las tareas
            {            
            //System.out.println("numero de pomo= " + valor);
            Sonido(sonidoA);//Reproducimos el sonido al acabar el primer pomodoro
             //ReproducirSonido("Sonido\tiro.wav");
             //t.stop();                                                   
            if(etiquetaTitulo.getText().equals("POMODORO")){
            //JOptionPane.showMessageDialog(null, "Tomese un descanso");
               contDes++;//aumenta el contador de Descansos
                if (contDes==4) {
                    etiquetaTitulo.setText("DESCANSO LARGO");
                    m=JSTiempoDescansoLargo.getValue();
                    s=0;
                    cs=0;
                    Sonido(sonidoA);//Reproducimos el sonodo al acabar el descanso
                }else{
                    etiquetaTitulo.setText("DESCANSO CORTO");
                   m=JSTiempoDescansoCorto.getValue();
                   s=0;
                   cs=0;
                   Sonido(sonidoA);//Reproducimos el sonodo al acabar el descanso
                }
                       
            }else{
             etiquetaTitulo.setText("POMODORO");
             //JOptionPane.showMessageDialog(null, "Volver a las actividades con mejor animo");
            m=JSTiempoPomodoro.getValue();
            Sonido(sonidoA);
             s=0;
             cs=0;
             contPomo++;
                System.out.println("valor "+ contPomo);
                
                if (valor==contPomo) {
                    t.stop();
                    btnIniciar.setEnabled(false);
                    btnPause.setEnabled(false);
                    
                }
                
            }
            
            }
            actualizarLabel();//Actualiza el label con los datos a cada segundo
        }
        
    };
    
    private void actualizarLabel() {
        /** 
         * Metodo Para actualizar label cada segundo para dar la sensacion de un temporizador
        **/
        String tiempo = (m<9?"0":"")+m+":"+(s<=9?"0":"")+s+":"+(cs<=9?"0":"")+cs;
        etiquetaTiempo.setText(tiempo);
        
       
    }
    
    private void Sonido(String sonido){
    /** 
     * Metodo para reproducir sonido
     
     **/
        
         AudioClip play = new AudioClip(getClass().getResource(sonido).toString());
            play.setCycleCount(1);
            play.play();
    
        }
    
    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        
        /*
        Metod que sirve para iniciar el Timer al momento de dar click al boton Iniciar
        
        */
        
        t.start();
        btnPause.setEnabled(true);
        btnReiniciar.setEnabled(true);
        BtnAplicar.setEnabled(false);
        btnIniciar.setEnabled(false);
        
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        /*Metodo que detiene el contador al momento de dar click en el boton Pause*/
        
        t.stop();//Comando para detener el Timer
        btnIniciar.setEnabled(true);
        btnPause.setEnabled(false);
    }//GEN-LAST:event_btnPauseActionPerformed
 /**
         * Metodo para Reinicar todos los valores
         **/
    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
       
        
        if(t.isRunning()) 
        {
            t.stop();
            btnIniciar.setEnabled(false);
          
        }
        btnIniciar.setText("Iniciar");
        btnPause.setEnabled(false);
        btnReiniciar.setEnabled(false);
        h=00; m=00; s=00; cs=00;
        contDes=0;
        contPomo=0;
        BtnAplicar.setEnabled(true);
        actualizarLabel();
        
        
    }//GEN-LAST:event_btnReiniciarActionPerformed
   /**
         * Metodo para aplicar todos los datos selecionados 
         **/
    private void BtnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAplicarActionPerformed
     
        btnIniciar.setEnabled(true);
        m=JSTiempoPomodoro.getValue();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Tipo");
        modelo.addColumn("Duración Minutos");
        
        int NumeroFila = ((Integer)SpinerNumeroPomo.getValue())*2;
        int pom =1;
        String tiempo=String.valueOf(JSTiempoPomodoro.getValue());
        System.out.println("tiempo pomo "+ tiempo);
        String tiempoDC=String.valueOf(JSTiempoDescansoCorto.getValue()); 
        String tiempoDL=String.valueOf(JSTiempoDescansoLargo.getValue()); 
        System.out.println(""+NumeroFila);
        
        String[]desCan={"Descanso corto",tiempoDC};
        String[]desCanL={"Descanso Largo",tiempoDL};
        for (int i = 1; i <= NumeroFila; i++) {
            String[]pomo={"Pomodoro "+pom,tiempo};
            if (i%2==0) {
                System.out.println("asas"+i%2);
                if (i==8||i==16) {
                modelo.addRow(desCanL);
                }else{
                modelo.addRow(desCan);}
            }else{
                modelo.addRow(pomo); 
                pom++;
            }    
         }
        jTable1.setModel(modelo);
        
        
    }//GEN-LAST:event_BtnAplicarActionPerformed
/**
         * Lanza la venta de ayuda
         * Creamos el form **/
    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
        VentanaAyuda ayuda= new VentanaAyuda(); 
        ayuda.setVisible(true);
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        
        VentanaAyuda ayuda= new VentanaAyuda();
        ayuda.setVisible(true);
        
        
    }//GEN-LAST:event_jMenu2MouseClicked


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
            java.util.logging.Logger.getLogger(VentanaPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPricipal().setVisible(true);
            }
        });
    }
  
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAplicar;
    private javax.swing.JSlider JSTiempoDescansoCorto;
    private javax.swing.JSlider JSTiempoDescansoLargo;
    public javax.swing.JSlider JSTiempoPomodoro;
    public javax.swing.JSpinner SpinerNumeroPomo;
    public javax.swing.JButton btnIniciar;
    public javax.swing.JButton btnPause;
    public javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel etiquetaReloj;
    public javax.swing.JLabel etiquetaTiempo;
    public javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
