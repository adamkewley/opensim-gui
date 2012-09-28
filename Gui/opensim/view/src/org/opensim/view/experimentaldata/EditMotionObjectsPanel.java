/*
* Copyright (c)  2005-2008, Stanford University
 * Use of the OpenSim software in source form is permitted provided that the following
 * conditions are met:
 * 	1. The software is used only for non-commercial research and education. It may not
 *     be used in relation to any commercial activity.
 * 	2. The software is not distributed or redistributed.  Software distribution is allowed 
 *     only through https://simtk.org/home/opensim.
 * 	3. Use of the OpenSim software or derivatives must be acknowledged in all publications,
 *      presentations, or documents describing work in which OpenSim or derivatives are used.
 * 	4. Credits to developers may not be removed from executables
 *     created from modifications of the source.
 * 	5. Modifications of source code must retain the above copyright notice, this list of
 *     conditions and the following disclaimer. 
 * 
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 *  EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 *  SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 *  TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; 
 *  HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 *  OR BUSINESS INTERRUPTION) OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 *  WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *  EditPrescribedForceSetPanel.java
 *
 * Created on January 27, 2010, 8:59 AM
 */

package org.opensim.view.experimentaldata;

import java.io.IOException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileFilter;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.util.Exceptions;
import org.opensim.modeling.ArrayInt;
import org.opensim.modeling.ExternalForce;
import org.opensim.modeling.ExternalLoads;
import org.opensim.modeling.Model;
import org.opensim.utils.FileUtils;
import org.opensim.view.motions.MotionsDB;

/**
 *
 * @author  ayman
 */
public class EditMotionObjectsPanel extends javax.swing.JPanel 
                                         implements ListSelectionListener {
    
    //Storage externalLoadsStorage=null;
    private MotionObjectsListModel objectListModel;
    AnnotatedMotion aMotion;
    Model aModel;
    //private NumberFormat numFormat = NumberFormat.getInstance();
    /**
     * Creates new form EditPrescribedForceSetPanel
     */
    public EditMotionObjectsPanel(AnnotatedMotion dMotion, Model model){
        aMotion = dMotion;
        aModel = model;
        objectListModel = new MotionObjectsListModel(aMotion);
        initComponents();
        updateButtonAvailability();
        jMotionObjectsList.addListSelectionListener(this);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EditOneMotionObjectPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BodiesComboBox = new javax.swing.JComboBox();
        PointIsGlobalCheckBox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        ForceNameTextField = new javax.swing.JTextField();
        ForceIsGlobalCheckBox = new javax.swing.JCheckBox();
        ForceColumnsPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxFX = new javax.swing.JComboBox();
        jComboBoxFY = new javax.swing.JComboBox();
        jComboBoxFZ = new javax.swing.JComboBox();
        PointColumnsPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxPX = new javax.swing.JComboBox();
        jComboBoxPY = new javax.swing.JComboBox();
        jComboBoxPZ = new javax.swing.JComboBox();
        TorqueColumnLabels = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxTX = new javax.swing.JComboBox();
        jComboBoxTY = new javax.swing.JComboBox();
        jComboBoxTZ = new javax.swing.JComboBox();
        MotionObjectsListPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMotionObjectsList = new javax.swing.JList();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonLoad = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();

        jLabel5.setText("Applied to"); // NOI18N

        BodiesComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        PointIsGlobalCheckBox.setText("Point is global"); // NOI18N
        PointIsGlobalCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        PointIsGlobalCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel3.setText("Force Name"); // NOI18N

        ForceIsGlobalCheckBox.setText("Force is global"); // NOI18N
        ForceIsGlobalCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        ForceIsGlobalCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel4.setText("Force Columns"); // NOI18N

        jComboBoxFX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxFY.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxFZ.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.layout.GroupLayout ForceColumnsPanelLayout = new org.jdesktop.layout.GroupLayout(ForceColumnsPanel);
        ForceColumnsPanel.setLayout(ForceColumnsPanelLayout);
        ForceColumnsPanelLayout.setHorizontalGroup(
            ForceColumnsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(ForceColumnsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel4)
                .add(12, 12, 12)
                .add(jComboBoxFZ, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jComboBoxFY, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jComboBoxFX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        ForceColumnsPanelLayout.setVerticalGroup(
            ForceColumnsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(ForceColumnsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jLabel4)
                .add(jComboBoxFY, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jComboBoxFZ, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jComboBoxFX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jLabel6.setText("Point Columns"); // NOI18N

        jComboBoxPX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxPY.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxPZ.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.layout.GroupLayout PointColumnsPanelLayout = new org.jdesktop.layout.GroupLayout(PointColumnsPanel);
        PointColumnsPanel.setLayout(PointColumnsPanelLayout);
        PointColumnsPanelLayout.setHorizontalGroup(
            PointColumnsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PointColumnsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel6)
                .add(13, 13, 13)
                .add(jComboBoxPZ, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jComboBoxPY, 0, 94, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jComboBoxPX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PointColumnsPanelLayout.setVerticalGroup(
            PointColumnsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PointColumnsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jLabel6)
                .add(jComboBoxPY, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jComboBoxPX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jComboBoxPZ, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jLabel7.setText("Torque Columns"); // NOI18N

        jComboBoxTX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxTY.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxTZ.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.layout.GroupLayout TorqueColumnLabelsLayout = new org.jdesktop.layout.GroupLayout(TorqueColumnLabels);
        TorqueColumnLabels.setLayout(TorqueColumnLabelsLayout);
        TorqueColumnLabelsLayout.setHorizontalGroup(
            TorqueColumnLabelsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TorqueColumnLabelsLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jComboBoxTZ, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jComboBoxTY, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jComboBoxTX, 0, 128, Short.MAX_VALUE))
        );
        TorqueColumnLabelsLayout.setVerticalGroup(
            TorqueColumnLabelsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TorqueColumnLabelsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jComboBoxTZ, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jLabel7)
                .add(jComboBoxTY, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jComboBoxTX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout EditOneMotionObjectPanelLayout = new org.jdesktop.layout.GroupLayout(EditOneMotionObjectPanel);
        EditOneMotionObjectPanel.setLayout(EditOneMotionObjectPanelLayout);
        EditOneMotionObjectPanelLayout.setHorizontalGroup(
            EditOneMotionObjectPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(EditOneMotionObjectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(EditOneMotionObjectPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(EditOneMotionObjectPanelLayout.createSequentialGroup()
                        .add(9, 9, 9)
                        .add(EditOneMotionObjectPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel5)
                            .add(jLabel3))
                        .add(25, 25, 25)
                        .add(EditOneMotionObjectPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(ForceNameTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .add(BodiesComboBox, 0, 116, Short.MAX_VALUE)))
                    .add(EditOneMotionObjectPanelLayout.createSequentialGroup()
                        .add(PointIsGlobalCheckBox)
                        .add(39, 39, 39)
                        .add(ForceIsGlobalCheckBox)))
                .add(231, 231, 231))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, EditOneMotionObjectPanelLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(EditOneMotionObjectPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(EditOneMotionObjectPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, ForceColumnsPanel, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, PointColumnsPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(TorqueColumnLabels, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        EditOneMotionObjectPanelLayout.setVerticalGroup(
            EditOneMotionObjectPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(EditOneMotionObjectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(EditOneMotionObjectPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(ForceNameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(EditOneMotionObjectPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(BodiesComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 12, Short.MAX_VALUE)
                .add(ForceColumnsPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(PointColumnsPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TorqueColumnLabels, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(21, 21, 21)
                .add(EditOneMotionObjectPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(PointIsGlobalCheckBox)
                    .add(ForceIsGlobalCheckBox))
                .addContainerGap())
        );

        MotionObjectsListPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Specify Objects"));

        jMotionObjectsList.setModel(objectListModel);
        jScrollPane1.setViewportView(jMotionObjectsList);

        jButtonAdd.setText("Add..."); // NOI18N
        jButtonAdd.setToolTipText("Add a motion object based on data "); // NOI18N
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete"); // NOI18N
        jButtonDelete.setToolTipText("Delete selected object(s)"); // NOI18N
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed1(evt);
            }
        });

        jButtonEdit.setText("Edit..."); // NOI18N
        jButtonEdit.setToolTipText("Edit selected object"); // NOI18N
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonLoad.setText("Load..."); // NOI18N
        jButtonLoad.setToolTipText("Add a motion object based on ExternalLoads file "); // NOI18N
        jButtonLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadActionPerformed(evt);
            }
        });

        jButtonSave.setText("Save..."); // NOI18N
        jButtonSave.setToolTipText("Save forces tp ExternalLoads file "); // NOI18N
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout MotionObjectsListPanelLayout = new org.jdesktop.layout.GroupLayout(MotionObjectsListPanel);
        MotionObjectsListPanel.setLayout(MotionObjectsListPanelLayout);
        MotionObjectsListPanelLayout.setHorizontalGroup(
            MotionObjectsListPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, MotionObjectsListPanelLayout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(MotionObjectsListPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(MotionObjectsListPanelLayout.createSequentialGroup()
                        .add(MotionObjectsListPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jButtonAdd, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .add(jButtonEdit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addContainerGap())
                    .add(MotionObjectsListPanelLayout.createSequentialGroup()
                        .add(MotionObjectsListPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jButtonLoad, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .add(jButtonDelete, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addContainerGap())
                    .add(MotionObjectsListPanelLayout.createSequentialGroup()
                        .add(jButtonSave, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        MotionObjectsListPanelLayout.setVerticalGroup(
            MotionObjectsListPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(MotionObjectsListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(jButtonAdd)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButtonEdit)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButtonDelete)
                .add(27, 27, 27)
                .add(jButtonLoad)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 8, Short.MAX_VALUE)
                .add(jButtonSave)
                .addContainerGap(25, Short.MAX_VALUE))
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(MotionObjectsListPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(MotionObjectsListPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed1
        int[] sels = jMotionObjectsList.getSelectedIndices();
        Object pfo=null;
        for(int i=sels.length;i>=1;i--){
           ExperimentalDataObject obj= (ExperimentalDataObject) objectListModel.get(sels[i-1]);
           objectListModel.remove(sels[i-1]);
           aMotion.getClassified().remove(obj);
        }
 // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonDeleteActionPerformed1

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        int[] sels = jMotionObjectsList.getSelectedIndices();
        Object pfo=null;
        if (sels.length==1){
            pfo = objectListModel.get(sels[0]);
        }
        //System.out.println(pfo.toString());
        MotionObjectPointForce pf = ((MotionObjectPointForce) pfo);
        MotionObjectPointForce pfSave = new MotionObjectPointForce(pf);
        EditOneMotionObjectPanel eofPanel = new EditOneMotionObjectPanel(pf, aMotion, aModel);
        DialogDescriptor dlg = new DialogDescriptor(eofPanel, "Create/Edit Motion Objects");
        eofPanel.setDDialog(dlg);
        DialogDisplayer.getDefault().createDialog(dlg).setVisible(true);
        Object userInput = dlg.getValue();
         if (((Integer)userInput).compareTo((Integer)DialogDescriptor.OK_OPTION)!=0){
             objectListModel.set(sels[0], pfSave);
         }
         else{ // do nothing as editing is done inplace
             //objectListModel.set(sels[0], pfSave);
             //System.out.println(pfo.toString());
         }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
         MotionObjectPointForce pf = new MotionObjectPointForce(ExperimentalDataItemType.PointForceData, "", -1);
         EditOneMotionObjectPanel eofPanel = new EditOneMotionObjectPanel(pf, aMotion, aModel);
         DialogDescriptor dlg = new DialogDescriptor(eofPanel, "Create/Edit Motion Objects");
         eofPanel.setDDialog(dlg);
         DialogDisplayer.getDefault().createDialog(dlg).setVisible(true);
         Object userInput = dlg.getValue();
         if (((Integer)userInput).compareTo((Integer)DialogDescriptor.OK_OPTION)!=0){
             //objectListModel.set(sels[0], pfCopy);
         }
         else {
             objectListModel.add(objectListModel.getSize(), pf);
             aMotion.getClassified().add(pf);
             //System.out.println("Adding force id="+pf.getForceIdentifier()+" start index"+pf.getStartIndexInFileNotIncludingTime());
         }
    }//GEN-LAST:event_jButtonAddActionPerformed

private void jButtonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadActionPerformed
// TODO add your handling code here:
    FileFilter ff = FileUtils.getFileFilter(".xml", "File to load External Loads from");
    String fileName = FileUtils.getInstance().browseForFilename(ff, true, null);
    if (fileName!=null){
            try {
                ExternalLoads exLoads = new ExternalLoads(aModel, fileName);
                String errorsWarnings = "";
                for(int i=0; i<exLoads.getSize(); i++){
                    ExternalForce ef = exLoads.get(i);
                    String bodyApplied = ef.getAppliedToBodyName();
                    String pointInBody = ef.getPointExpressedInBodyName();
                    if (ef.appliesForce()){
                        String forceInBody = ef.getForceExpressedInBodyName();
                        String froceId = ef.getForceIdentifier();
                        ArrayInt forceIndices = aMotion.getColumnIndicesForIdentifier(froceId);
                        MotionObjectPointForce motionForce;
                        if (ef.specifiesPoint()) { // PointForce
                            String pointId = ef.getPointIdentifier();
                            ArrayInt pointIndices = aMotion.getColumnIndicesForIdentifier(pointId);
                            motionForce = new MotionObjectPointForce(ExperimentalDataItemType.PointForceData, pointId, pointIndices.getitem(0));
                            motionForce.setPointExpressedInBody(pointInBody);
                        } else { // BodyForce
                            motionForce = new MotionObjectPointForce(ExperimentalDataItemType.BodyForceData, froceId, forceIndices.getitem(0));
                        }
                        motionForce.setForceAppliedToBody(bodyApplied);
                        motionForce.setName(ef.getName());
                        motionForce.setForceExpressedInBodyName(forceInBody);
                        motionForce.setForceIdentifier(froceId);
                        if (ef.appliesTorque()){
                            motionForce.setSpecifyTorque(true);
                            motionForce.setTorqueIdentifier(ef.getTorqueIdentifier());
                        }
                     // Torque entries
                    objectListModel.add(objectListModel.getSize(), motionForce);
                    aMotion.getClassified().add(motionForce);
                  }
                  else {
                      errorsWarnings = errorsWarnings.concat("External force:"+ef.getName()+" doesn't apply force and will be ignored\n");
                  }
               }
               if (!errorsWarnings.isEmpty()){
                    NotifyDescriptor.Message dlg = new NotifyDescriptor.Message(errorsWarnings);
                    DialogDisplayer.getDefault().notify(dlg);
               }
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
    }

}//GEN-LAST:event_jButtonLoadActionPerformed

private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
// TODO add your handling code here:
    FileFilter ff = FileUtils.getFileFilter(".xml", "File to save External Loads");
    String fileName = FileUtils.getInstance().browseForFilenameToSave(ff, true, "", null);
    String fullFilename = FileUtils.addExtensionIfNeeded(fileName, ".xml");
   // create ExternalLoads object and set its attributes
    ExternalLoads exLoad = new ExternalLoads();
    exLoad.setDataFileName(MotionsDB.getInstance().getStorageFileName(aMotion));
    int sz = objectListModel.size();
    String warnings = "Data file set to:"+exLoad.getDataFileName()+"\n";
    for (int i=0; i<sz; i++){
        ExperimentalDataObject obj= (ExperimentalDataObject) objectListModel.get(i);
        if (obj instanceof MotionObjectPointForce){
            ExternalForce extForce = new ExternalForce();
            extForce.setName(obj.getName());
            MotionObjectPointForce force = (MotionObjectPointForce) obj;
            extForce.setAppliedToBodyName(force.getForceAppliedToBody());
            extForce.setForceExpressedInBodyName(force.getForceExpressedInBodyName());
            extForce.setForceIdentifier(force.getForceIdentifier());
            extForce.setPointExpressedInBodyName(force.getPointExpressedInBody());
            if (force.isSpecifyTorque())
                extForce.setTorqueIdentifier(force.getTorqueIdentifier());
            if (force.specifiesPoint())
                extForce.setPointIdentifier(force.getPointIdentifier());
            if (!force.getForceComponent().equalsIgnoreCase("ALL"))
                warnings = warnings.concat(obj.getName()+ ":Warning, component will be ignored as unsupported by External Loads.\n");
            exLoad.cloneAndAppend(extForce);
        }
    }
    if (!warnings.isEmpty()){ // Show info message with all warnings
        NotifyDescriptor.Message dlg = new NotifyDescriptor.Message(warnings);
        DialogDisplayer.getDefault().notify(dlg);
    }
    exLoad.print(fullFilename);
}//GEN-LAST:event_jButtonSaveActionPerformed
   
    private void updateButtonAvailability() {
       int[] sels = jMotionObjectsList.getSelectedIndices();
       jButtonEdit.setEnabled(sels.length==1);
       jButtonDelete.setEnabled(sels.length>=1);
       // Allow Add only if a data file is available
       //jButtonAdd.setEnabled (externalLoadsStorage!=null);
    }

    public void valueChanged(ListSelectionEvent e) {
        updateButtonAvailability();
    }

    public MotionObjectsListModel getForceListModel() {
        return objectListModel;
    }

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox BodiesComboBox;
    private javax.swing.JPanel EditOneMotionObjectPanel;
    private javax.swing.JPanel ForceColumnsPanel;
    private javax.swing.JCheckBox ForceIsGlobalCheckBox;
    private javax.swing.JTextField ForceNameTextField;
    private javax.swing.JPanel MotionObjectsListPanel;
    private javax.swing.JPanel PointColumnsPanel;
    private javax.swing.JCheckBox PointIsGlobalCheckBox;
    private javax.swing.JPanel TorqueColumnLabels;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonLoad;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox jComboBoxFX;
    private javax.swing.JComboBox jComboBoxFY;
    private javax.swing.JComboBox jComboBoxFZ;
    private javax.swing.JComboBox jComboBoxPX;
    private javax.swing.JComboBox jComboBoxPY;
    private javax.swing.JComboBox jComboBoxPZ;
    private javax.swing.JComboBox jComboBoxTX;
    private javax.swing.JComboBox jComboBoxTY;
    private javax.swing.JComboBox jComboBoxTZ;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jMotionObjectsList;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}
