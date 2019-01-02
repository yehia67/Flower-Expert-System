/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.clipsrules.jni.Environment;
import net.sf.clipsrules.jni.FactAddressValue;
import net.sf.clipsrules.jni.MultifieldValue;
import net.sf.clipsrules.jni.PrimitiveValue;
import net.sf.clipsrules.jni.SymbolValue;
/**
 *
 * @author Mohammed
 */
public class Frame extends javax.swing.JFrame {
  Environment clips = new Environment();
  
    /**
     * Creates new form FlowerExpertSystem
     */
    public Frame() {
         clips.loadFromResource("/flower.clp");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
     private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        textField1 = new java.awt.TextField();
        why_size = new javax.swing.JButton();
        textField3 = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        why_season = new javax.swing.JButton();
        why_lifeCycle = new javax.swing.JButton();
        why_color = new javax.swing.JButton();
        Why_root = new javax.swing.JButton();
     //   why_height = new javax.swing.JButton();
        why_perfume = new javax.swing.JButton();
        why_soil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("What is the size of the flower ?");

        jSlider1.setMaximum(200);
        jSlider1.setMinimum(10);
        jSlider1.setValue(100);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel2.setText("What is the life cycle of the flower ?");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one", "One year", "More than one year" }));

        jLabel3.setText("What is the season of the Flower?");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one", "Summer", "Autumn", "Spring", "Winter" }));

        jLabel4.setText("What is the color of the flower?");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one", "blue", "purple", "red", "yellow", "white", "pink", "orange", "violate", "pinkish-red" }));

        jLabel5.setText("What is the Root Type of the flower?");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one", "Bulb", "root" }));

        jLabel6.setText("What is the height of the flower?");

        jLabel7.setText("What is soil type of the flower ?");

        jLabel9.setText("Does the flower has Perfume ?");

        jLabel10.setText("The name of the flower is:");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one", "Small", "Medium", "Tall" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one", "Acidic", "Loose", "Fertile", "Rich", "Well-drained" }));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one", "True", "False" }));

        textField1.setText("textField1");

        why_size.setText("Why?");
        why_size.setActionCommand("why_size");
        why_size.setName("why_size"); // NOI18N
        why_size.setRequestFocusEnabled(false);
        why_size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                why_ActionPerformed(evt);
            }
        });

        textField3.setText(String.valueOf(jSlider1.getValue()));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                 try {
                    jButton1ActionPerformed(evt);
                } catch (Exception ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
        });

        why_season.setText("Why?");
        why_season.setActionCommand("why_season");
        why_season.setName("why_size"); // NOI18N
        why_season.setRequestFocusEnabled(false);
        why_season.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                why_ActionPerformed(evt);
            }
        });

        why_lifeCycle.setText("Why?");
        why_lifeCycle.setActionCommand("why_lifeCycle");
        why_lifeCycle.setName("why_size"); // NOI18N
        why_lifeCycle.setRequestFocusEnabled(false);
        why_lifeCycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                why_ActionPerformed(evt);
            }
        });

        why_color.setText("Why?");
        why_color.setActionCommand("why_color");
        why_color.setName("why_size"); // NOI18N
        why_color.setRequestFocusEnabled(false);
        why_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                why_ActionPerformed(evt);
            }
        });

        Why_root.setText("Why?");
        Why_root.setActionCommand("Why_root");
        Why_root.setName("why_size"); // NOI18N
        Why_root.setRequestFocusEnabled(false);
        Why_root.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                why_ActionPerformed(evt);
            }
        });

      /*  why_height.setText("Why?");
        why_height.setActionCommand("why_height");
        why_height.setName("why_size"); // NOI18N
        why_height.setRequestFocusEnabled(false);
        why_height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                why_ActionPerformed(evt);
            }
        });*/

        why_perfume.setText("Why?");
        why_perfume.setActionCommand("why_perfume");
        why_perfume.setName("why_size"); // NOI18N
        why_perfume.setRequestFocusEnabled(false);
        why_perfume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                why_ActionPerformed(evt);
            }
        });

        why_soil.setText("Why?");
        why_soil.setActionCommand("why_soil");
        why_soil.setName("why_size"); // NOI18N
        why_soil.setRequestFocusEnabled(false);
        why_soil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                why_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(why_size)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Why_root))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(why_lifeCycle)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(why_season)
                                        .addComponent(why_color)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(why_perfume, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(why_soil, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(why_size))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(why_lifeCycle))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(why_season)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(Why_root))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(why_soil))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(why_perfume))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(why_color))
                        .addGap(49, 49, 49)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {                                      
        // TODO add your handling code here:
       
        textField3.setText(String.valueOf(jSlider1.getValue()));
    } 
    private void why_ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String message = "";
        if( evt.getActionCommand().equalsIgnoreCase("why_size")){
           message = "We need the size to determine height that we will search in\n";
           message += "For example in case of size was > 150 :-\n";
           message += " IF life type is perennial\n" +
                        "AND height is tall\n" +
                        "AND root type is bulbs\n" +
                        "AND season is summer\n" +
                        "THEN flower name is Dahlia";
           
            JOptionPane.showMessageDialog(this, message );
        }
        else if(evt.getActionCommand().equalsIgnoreCase("why_lifecycle")){
             JOptionPane.showMessageDialog(this, message );
        }
        else if(evt.getActionCommand().equalsIgnoreCase("why_season")){
           message = "We need to determine the season to determine path that we will search in\n";
           message += "For example in case of season was winter :-\n";
           message += "IF season is winter\n" +
                    "AND color is white\n" +
                    "OR color is pink\n" +
                    "OR color is red\n" +
                    "THEN flower name is Azalea";
            JOptionPane.showMessageDialog(this, message );
        }
        else if(evt.getActionCommand().equalsIgnoreCase("why_root")){
             JOptionPane.showMessageDialog(this, message );
        }
        else if(evt.getActionCommand().equalsIgnoreCase("why_height")){
             JOptionPane.showMessageDialog(this, message );
        }
        else if(evt.getActionCommand().equalsIgnoreCase("why_soil")){
           message = "We need to determine the soil of the flower was Begonia, Rose, or Camellia\n";
           message += "For example if the soil was acidic\n";
           message += "IF soil is acidic\n" +
                    "AND color is white\n" +
                    "OR color is pink\n" +
                    "OR color is red\n" +
                    "AND life type is perennial\n" +
                    "AND root type is roots\n" +
                    "THEN flower name is Camellia";
             JOptionPane.showMessageDialog(this, message );
        }
        else if(evt.getActionCommand().equalsIgnoreCase("why_perfume")){
             JOptionPane.showMessageDialog(this, message );
        }
        else if(evt.getActionCommand().equalsIgnoreCase("why_color")){
             JOptionPane.showMessageDialog(this, message );
        }
        //JOptionPane.showMessageDialog(this, message );
      //  System.out.println("Lis");
    } 
    /*private void why_sizeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }  */                                      

    /*private void why_seasonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void why_lifeCycleActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void why_colorActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void Why_rootActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void why_heightActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void why_perfumeActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void why_soilActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }    */
     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {                                         
        // TODO add your handling code here:
        
         //Check the size of the flower 
         
         //if(jSlider1.getValue()>10)
         System.out.println("Jslider value : " + jSlider1.getValue());
          clips.eval("(assert (size (no " +jSlider1.getValue()+ ")))");
         // Check the Life type of the flower 
         String lifeCycle = jComboBox2.getSelectedItem().toString();
         String Perfume = jComboBox8.getSelectedItem().toString();
         if(lifeCycle.equals("One year"))
         {
             clips.eval("(assert (life_cycle (cycle 1)))");
         }
        else if(lifeCycle.equals("More than one year")) 
         {
             clips.eval("(assert (life_cycle (cycle 5)))");
         }
         
         if(Perfume.equals("True")){
         clips.eval(  "(assert(perfume (flag 1)))" );
        }else if(Perfume.equals("False")){
         clips.eval(  "(assert(perfume (flag 0)))" );
        }
         
         // Check the for flower irise 
         String season  = jComboBox1.getSelectedItem().toString(); 
         String color  = jComboBox3.getSelectedItem().toString();
     //    String lifeType  = jComboBox7.getSelectedItem().toString();
         String rootType  = jComboBox4.getSelectedItem().toString();
         String soil     = jComboBox6.getSelectedItem().toString();
         //String flowerName = jComboBox5.getSelectedItem().toString();
         if(!season.equals("Select one")){
         clips.eval("(assert(season (name "+ season.toLowerCase() +")))");
         }
          if(!color.equals("Select one")){
           clips.eval(  "(assert(color (name "+ color.toLowerCase()+")))" );
          }
    /*     if(!lifeType.equals("Select one")){
            clips.eval("(assert(life_type (type "+ lifeType.toLowerCase() +")))");
         }*/
         if(!rootType.equals("Select one")){
          clips.eval("(assert(root_type  (type "+ rootType.toLowerCase() +")))");
         }
         if(!soil.equals("Select one")){
            clips.eval("(assert(soil  (type "+ soil.toLowerCase() +")))");
         }
        /* if(!flowerName.equals("Select one")){
          clips.eval("(assert(flower_name  (name "+ flowerName.toLowerCase() +")))");
         }*/
         
         

        
      
          
         /* if(season.equals("Summer") && color.equals("blue") && lifeType.equals("Perennial") ) 
         {
             clips.eval("(assert (flower_name (name irise)))");
         }*/
         
         //clips.reset();
         clips.run();
         MultifieldValue flowersFacts = null;
         FactAddressValue heightFact = null;
         FactAddressValue lifeTypeFact = null;
         try{
        /*PrimitiveValue value=clips.eval("(facts)");
        FactAddressValue fv = (FactAddressValue) ((MultifieldValue) clips.eval("(find-fact ((?f flower_name)) TRUE)")).get(0);
        FactAddressValue height_fact = (FactAddressValue) ((MultifieldValue) clips.eval("(find-fact ((?f height)) TRUE)")).get(0);
        MultifieldValue flowersHeight = ((MultifieldValue) clips.eval("(find-fact ((?f height)) TRUE)"));
        for(int i = 0; i < flowersHeight.size(); i++) {
            FactAddressValue factValue =  ((FactAddressValue)flowersHeight.get(i));
            System.out.println("flower " + i + " size  = " + factValue);
        }
        //String height = height_fact.getFactSlot("name").toString() ; +"  "+height
       // String ou = fv.getFactSlot("name").toString() ; 
        //String ou = value.toString() ;
        //System.out.println(fv) ;
        //System.out.println(ou) ;
        System.out.println(fv);*/
        
        //JOptionPane.showMessageDialog(this,"The Flower name is:"+ height_fact );
        //textField1.setText(ou);
            PrimitiveValue value=clips.eval("(facts)");
            flowersFacts = ((MultifieldValue) clips.eval("(find-all-facts ((?f flower_name)) TRUE)"));
            heightFact = (FactAddressValue) ((MultifieldValue) clips.eval("(find-fact ((?f height)) TRUE)")).get(0);
            lifeTypeFact =  (FactAddressValue) ((MultifieldValue) clips.eval("(find-fact ((?f life_type)) TRUE)")).get(0);
            
            String flowerFactString = "";
            String heightFactString = "";
            String lifeTypeFactString = "";
            
            if(flowersFacts.size() > 1) {
                for(int i = 0; i < flowersFacts.size(); i++) {

                   FactAddressValue fact = (FactAddressValue) flowersFacts.get(i);
                   String flowerName = fact.getFactSlot("name").toString();
                   flowerFactString += "flower " + (i + 1) + 
                           " name is : " + flowerName + "\n";
                }
            } else {
               FactAddressValue fact = (FactAddressValue) flowersFacts.get(0);
               String flowerName = fact.getFactSlot("name").toString();
               flowerFactString += "flower name is : " + flowerName;
            }
            
            /*String heightVal = heightFact.getFactSlot("name").toString();
            heightFactString = "Height is : " + heightVal;
            
            String lifeTypeVal = lifeTypeFact.getFactSlot("type").toString();
            lifeTypeFactString = "Life Type is : " + lifeTypeVal;*/
            
            ResultFrame rf = new ResultFrame(flowerFactString);
            rf.setVisible(true);
            
         } catch (Exception ex) {
             System.out.println(ex.toString());
             String flowerFactString = null;
             if(flowersFacts != null && flowersFacts.size() != 0) {
                 flowerFactString = "" ;
                 if(flowersFacts.size() > 1) {
                     for(int i = 0; i < flowersFacts.size(); i++) {
                         
                        FactAddressValue fact = (FactAddressValue) flowersFacts.get(i);
                        String flowerName = fact.getFactSlot("name").toString();
                        flowerFactString += "flower " + (i + 1) + 
                           " name is : " + flowerName + "\n";
                     }
                 } else {
                    FactAddressValue fact = (FactAddressValue) flowersFacts.get(0);
                    String flowerName = fact.getFactSlot("name").toString();
                    flowerFactString += "flower name is : " + flowerName;
                 }
             }
             
             /*if(heightFact != null) {
                 String heightVal = heightFact.getFactSlot("name").toString();
                 heightFactString = heightVal;
             }
             
             if(lifeTypeFact != null) {
                 String lifeTypeVal = lifeTypeFact.getFactSlot("type").toString();
                 lifeTypeFactString = lifeTypeVal;
             }*/
             
             ResultFrame rf = new ResultFrame(flowerFactString);
            rf.setVisible(true);
         }
    }

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Why_root;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSlider jSlider1;
    private java.awt.TextField textField1;
    private java.awt.TextField textField3;
    private javax.swing.JButton why_color;
    //private javax.swing.JButton why_height;
    private javax.swing.JButton why_lifeCycle;
    private javax.swing.JButton why_perfume;
    private javax.swing.JButton why_season;
    private javax.swing.JButton why_size;
    private javax.swing.JButton why_soil;
    // End of variables declaration                   
}
