/* -------------------------------------------------------------------------- *
 * OpenSim: AboutJPanel.java                                                  *
 * -------------------------------------------------------------------------- *
 * OpenSim is a toolkit for musculoskeletal modeling and simulation,          *
 * developed as an open source project by a worldwide community. Development  *
 * and support is coordinated from Stanford University, with funding from the *
 * U.S. NIH and DARPA. See http://opensim.stanford.edu and the README file    *
 * for more information including specific grant numbers.                     *
 *                                                                            *
 * Copyright (c) 2005-2017 Stanford University and the Authors                *
 * Author(s): Ayman Habib, Kevin Xu                                           *
 *                                                                            *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may    *
 * not use this file except in compliance with the License. You may obtain a  *
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0          *
 *                                                                            *
 * Unless required by applicable law or agreed to in writing, software        *
 * distributed under the License is distributed on an "AS IS" BASIS,          *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   *
 * See the License for the specific language governing permissions and        *
 * limitations under the License.                                             *
 * -------------------------------------------------------------------------- */

/*
 * AboutJPanel.java
 *
 * Created on August 8, 2007, 7:50 PM
 */

package org.opensim.helputils.helpmenu;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.MissingResourceException;
import static org.opensim.modeling.opensimCommonJNI.GetCompilerVersion;
import org.opensim.modeling.opensimCommonJNI;
import org.opensim.utils.TheApp;

/**
 *
 * @author  Ayman
 */
public final class AboutJPanel extends javax.swing.JPanel implements ImageObserver {
    /** The about image */
    static Reference aboutRef;
    static Reference OpenSimRef;
    static Reference SimTKRef;
    static Reference NIHRef;
    static Reference SimbiosRef;
    static Reference DARPARef;
    static Reference NCSRRRef;
         

    /** Creates new form AboutJPanel */
    public AboutJPanel() {        
        initComponents();
        this.setPreferredSize(new Dimension(410, 505));
        populateDetailsPanel();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jDetailsPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        operatingSystemString = new javax.swing.JLabel();
        jreString = new javax.swing.JLabel();
        jHomeDirString = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        VMvendorString = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        libraryPathString = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        compilerVersionLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelOpenSimHomeString = new javax.swing.JLabel();
        jVersionTextField = new javax.swing.JTextField();
        jCreditsPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(410, 515));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(410, 515));

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 506, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 501, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("About", jPanel1);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 32, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 501, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("OpenSim");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Product Version:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Operating System:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Java Runtime:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Home Dir:");

        operatingSystemString.setText("Windows XP SP2");

        jreString.setText("Java 1.5_06");

        jHomeDirString.setText("home dir");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("VM Vendor:");

        VMvendorString.setText("jLabel7");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Library Path:");

        libraryPathString.setText("jLabel8");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Build Info:");

        compilerVersionLabel.setText("Compiler Version");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("OpenSim Home:");

        jLabelOpenSimHomeString.setText("jLabel10");

        jVersionTextField.setEditable(false);
        jVersionTextField.setText("4.0");
        jVersionTextField.setToolTipText("ID for the current version of the application, use it when reporting bugs/issues/requests");
        jVersionTextField.setBorder(null);

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 151, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel7)
                            .add(jLabel8)
                            .add(jLabel9)
                            .add(jPanel5Layout.createSequentialGroup()
                                .add(21, 21, 21)
                                .add(jLabel1)))
                        .add(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(operatingSystemString, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .add(jreString, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jPanel5Layout.createSequentialGroup()
                                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(VMvendorString)
                                    .add(jHomeDirString)
                                    .add(jLabelOpenSimHomeString)
                                    .add(compilerVersionLabel)
                                    .add(libraryPathString))
                                .add(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .add(jVersionTextField)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(27, 27, 27)
                .add(jLabel1)
                .add(30, 30, 30)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jVersionTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(compilerVersionLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(operatingSystemString))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jreString)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(VMvendorString)
                    .add(jLabel6))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jHomeDirString)
                    .add(jLabel5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(libraryPathString))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(jLabelOpenSimHomeString))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jDetailsPanelLayout = new org.jdesktop.layout.GroupLayout(jDetailsPanel);
        jDetailsPanel.setLayout(jDetailsPanelLayout);
        jDetailsPanelLayout.setHorizontalGroup(
            jDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDetailsPanelLayout.setVerticalGroup(
            jDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Details", jDetailsPanel);

        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(236, 233, 216));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setText("OpenSim uses:\n- Simbody (https://simtk.org/home/simbody),\n- three.js (MIT; https://threejs.org),\n- JxBrowser (proprietary; https://teamdev.com),\n- JFreeChart (LGPL; http://www.jfree.org),\n- NetBeans platform (CDDL; http://netbeans.org).\nSee LICENSE.txt and NOTICE.txt for more information:\n  - on Windows: root of installation\n  - on Mac: <.app>/Contents/Resources/OpenSim\n");
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setAlignmentY(0.0F);
        jTextArea4.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jScrollPane4.setViewportView(jTextArea4);

        jScrollPane5.setBorder(null);
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(new java.awt.Color(236, 233, 216));
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setText("To sustain the OpenSim project, please acknowledge us by citing the following paper:\n\nSeth, et al. OpenSim: Simulating musculoskeletal dynamics and neuromuscular control to study human and animal movement. Plos Computational Biology, 14(7), 2018.\n\nFor additional details about how to acknowledge model, software, and simulation developers in your work, see https://simtk-confluence.stanford.edu:8443/display/OpenSim/License+for+OpenSim+3.0+and+Later\n");
        jTextArea5.setWrapStyleWord(true);
        jTextArea5.setAlignmentY(0.0F);
        jTextArea5.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jScrollPane5.setViewportView(jTextArea5);

        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(236, 233, 216));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("OpenSim is an application for musculoskeletal modeling and simulation. It is supported by US NIH National Center for Physics-Based Simulation of Biological Structures (Simbios; U54 GM072970), US NIH National Center for Simulation in Rehabilitation Research (NCSRR; R24 HD065690, P2C HD065690), US NIH Mobilize Center (U54 EB020405), and US DARPA Warrior Web (W911QX-12-C-0018).");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setAlignmentY(0.0F);
        jTextArea2.setMargin(new java.awt.Insets(5, 5, 0, 0));
        jScrollPane1.setViewportView(jTextArea2);

        org.jdesktop.layout.GroupLayout jPanel8Layout = new org.jdesktop.layout.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel8Layout.createSequentialGroup()
                .add(113, 113, 113)
                .add(jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane4)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1))
                .add(0, 0, 0))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 117, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jScrollPane5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout jCreditsPanelLayout = new org.jdesktop.layout.GroupLayout(jCreditsPanel);
        jCreditsPanel.setLayout(jCreditsPanelLayout);
        jCreditsPanelLayout.setHorizontalGroup(
            jCreditsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jCreditsPanelLayout.createSequentialGroup()
                .add(jPanel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jCreditsPanelLayout.setVerticalGroup(
            jCreditsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jCreditsPanelLayout.createSequentialGroup()
                .add(jPanel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Acknowledgements", jCreditsPanel);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VMvendorString;
    private javax.swing.JLabel compilerVersionLabel;
    private javax.swing.JPanel jCreditsPanel;
    private javax.swing.JPanel jDetailsPanel;
    private javax.swing.JLabel jHomeDirString;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelOpenSimHomeString;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jVersionTextField;
    private javax.swing.JLabel jreString;
    private javax.swing.JLabel libraryPathString;
    private javax.swing.JLabel operatingSystemString;
    // End of variables declaration//GEN-END:variables

    @Override
    public void paint(Graphics g) {
       super.paint(g);
        if (jTabbedPane1.getSelectedIndex()==0){
            g.drawImage( getAboutImage(), 15, 25, 380, 472, this );
        }
        else if (jTabbedPane1.getSelectedIndex()==1){
           g.drawImage( getOpenSimImage(), 15, 40, 48, 48, this );
        }
        else {
           g.drawImage( getOpenSimImage(), 15, 40, this ); 
           g.drawImage( getSimbiosImage(), 15, 150, this );           
           g.drawImage( getNCSRRImage(), 15, 225, this );
           g.drawImage( getSimTKImage(), 15, 280, this );
           g.drawImage( getNIHImage(), 15, 350, this );
           g.drawImage( getDARPAImage(), 15, 450, this );
        }
    }
    
    /** @return about image */
    private Image getAboutImage() {
        Image ret;
        if ((aboutRef == null) ||
                ((ret = (Image) aboutRef.get()) == null)) {
            ret = loadImage("/org/opensim/helputils/helpmenu/images/splash.gif");
            aboutRef = new WeakReference(ret);
        }
        return ret;
    }
    private Image getOpenSimImage() {
        Image ret;
        if ((OpenSimRef == null) ||
                ((ret = (Image) OpenSimRef.get()) == null)) {
            ret = loadImage("/org/opensim/helputils/helpmenu/images/logo_transparent_color.png");
            OpenSimRef = new WeakReference(ret);
        }
        return ret;
    }
    
    private Image getDARPAImage() {
        Image ret;
        if ((DARPARef == null) ||
                ((ret = (Image) DARPARef.get()) == null)) {
            ret = loadImage("/org/opensim/helputils/helpmenu/images/darpa_logo.png");
            DARPARef = new WeakReference(ret);
        }
        return ret;
    }
    
    private Image getNCSRRImage() {
        Image ret;
        if ((NCSRRRef == null) ||
                ((ret = (Image) NCSRRRef.get()) == null)) {
            ret = loadImage("/org/opensim/helputils/helpmenu/images/ncsrr_logo_footer.png");
            NCSRRRef = new WeakReference(ret);
        }
        return ret;
    }
    
    private Image getSimTKImage() {
        Image ret;
        if ((SimTKRef == null) ||
                ((ret = (Image) SimTKRef.get()) == null)) {
            ret = loadImage("/org/opensim/helputils/helpmenu/images/SimTKLogo.png");
            SimTKRef = new WeakReference(ret);
        }
        return ret;
    }
    
    private Image getNIHImage() {
        Image ret;
        if ((NIHRef == null) ||
                ((ret = (Image) NIHRef.get()) == null)) {
            ret = loadImage("/org/opensim/helputils/helpmenu/images/nih_logo.png");
            NIHRef = new WeakReference(ret);
        }
        return ret;
    }
    
    private Image getSimbiosImage() {
        Image ret;
        if ((SimbiosRef == null) ||
                ((ret = (Image) SimbiosRef.get()) == null)) {
            ret = loadImage("/org/opensim/helputils/helpmenu/images/SimbiosLogo.png");
            SimbiosRef = new WeakReference(ret);
        }
        return ret;
    }
    
    /** Loads an about image from its source */
    private Image loadImage(String urlString) {
        try {
            URL u = getClass().getResource(urlString);
            return Toolkit.getDefaultToolkit().getImage(u);
        } catch (MissingResourceException exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private void populateDetailsPanel() {
        jVersionTextField.setText(System.getProperty ("opensim.buildnumber"));
        operatingSystemString.setText(System.getProperty("os.name")+" version "+System.getProperty("os.version"));
        jreString.setText(System.getProperty("java.home"));
        jreString.setToolTipText("<html>"+System.getProperty("java.home")+"</html");
        VMvendorString.setText(System.getProperty("java.vendor"));
        jHomeDirString.setText(System.getProperty("user.home"));
        jHomeDirString.setToolTipText("<html>"+System.getProperty("user.home")+"</html");
        libraryPathString.setText(System.getProperty("java.library.path"));
        compilerVersionLabel.setText(GetCompilerVersion());
        libraryPathString.setToolTipText("<html>"+System.getProperty("java.library.path").replace(";", "<br>")+"</html>");
        jLabelOpenSimHomeString.setText(TheApp.getInstallDir());
        jLabelOpenSimHomeString.setToolTipText("<html>"+TheApp.getInstallDir()+"</html");
        jDetailsPanel.validate();
    }
    
}
