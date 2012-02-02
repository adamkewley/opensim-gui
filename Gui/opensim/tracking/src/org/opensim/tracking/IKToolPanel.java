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
 */
/*
 * IKToolPanel.java
 *
 * Created on July 16, 2007, 5:17 PM
 */

package org.opensim.tracking;

import java.awt.Toolkit;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Observable;
import java.util.Observer;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.opensim.modeling.InverseKinematicsTool;
import org.opensim.modeling.MarkerSet;
import org.opensim.modeling.Model;
import org.opensim.view.ModelEvent;
import org.opensim.view.pub.OpenSimDB;

public class IKToolPanel extends BaseToolPanel implements Observer {
   private IKToolModel ikToolModel = null;
   private NumberFormat numFormat = NumberFormat.getInstance();

   /** Creates new form IKToolPanel */
   public IKToolPanel(Model model) throws IOException {
      if(model==null) throw new IOException("IKToolPanel got null model");

      ikToolModel = new IKToolModel(model);

      if (numFormat instanceof DecimalFormat) {
        ((DecimalFormat) numFormat).applyPattern("#,##0.#########");
      }

      super.prepareHelpset("IK.hs");//add IK help set
      super.getHelpBroker().enableHelpOnButton(super.helpButton, "org.opensim.simtrack.ik.help", super.getHelpSet());// add action listener to help button
      initComponents();
      bindPropertiesToComponents();

      setSettingsFileDescription("IK tool settings file");

      jTabbedPane.addTab("Weights", new IKTaskSetPanel(ikToolModel.getIKCommonModel()));

      markerFileName.setExtensionsAndDescription(".trc", "IK trial marker data");
      coordinateFileName.setExtensionsAndDescription(".mot,.sto", "Coordinates of IK trial");
  
      updateModelDataFromModel();
      updateFromModel();

      ikToolModel.addObserver(this);
   }

   private void bindPropertiesToComponents() {
      InverseKinematicsTool ikTool = ikToolModel.getIKTool();
      ToolCommon.bindProperty(ikTool, "marker_file", markerFileName);
      ToolCommon.bindProperty(ikTool, "coordinate_file", coordinateFileName);
      ToolCommon.bindProperty(ikTool, "time_range", startTime);
      ToolCommon.bindProperty(ikTool, "time_range", endTime);
   }

   public void update(Observable observable, Object obj) {
      if (observable instanceof OpenSimDB){
           if (obj instanceof ModelEvent) {
                if (OpenSimDB.getInstance().hasModel(ikToolModel.getOriginalModel()))
                    return;
                else {
                    ikToolModel.deleteObserver(this);
                    NotifyDescriptor.Message dlg =
                          new NotifyDescriptor.Message("Model used by the tool is being closed.. Closing tool.");
                    DialogDisplayer.getDefault().notify(dlg);
                    this.close();
                    return;
                }        
           }
           return;
       }
      if(observable == ikToolModel && obj == IKToolModel.Operation.ExecutionStateChanged) {
         // Just need to update the buttons
         updateDialogButtons();
      } else {
         updateFromModel();
      }
   }

   public void updateModelDataFromModel() {
      // Fill in model data -- only needs to be done once in beginning
      Model model = ikToolModel.getOriginalModel();
      modelNameTextField.setText(model.getName());
      modelNameTextField.setCaretPosition(0);
      MarkerSet markerSet = model.getMarkerSet();
      int numMarkers = markerSet.getSize();
      if(numMarkers > 0) markerSetInfoTextField.setText(numFormat.format(numMarkers)+" markers");
      else markerSetInfoTextField.setText("No markers");
   }

   public void updateFromModel() {
      // Static trial marker data
      markerFileName.setFileName(ikToolModel.getIKCommonModel().getMarkerDataFileName(),false);
      markerFileName.setFileIsValid(ikToolModel.getIKCommonModel().getMarkerDataValid());
      //OpenSim23 markerDataInfoPanel.update(ikToolModel.getIKCommonModel().getMarkerData());

      // Coordinate data
      coordinateFileName.setEnabled(ikToolModel.getIKCommonModel().getCoordinateDataEnabled());
      coordinateCheckBox.setSelected(ikToolModel.getIKCommonModel().getCoordinateDataEnabled());
      coordinateFileName.setFileName(ikToolModel.getIKCommonModel().getCoordinateDataFileName(),false);
      coordinateFileName.setFileIsValid(ikToolModel.getIKCommonModel().getCoordinateDataValid());

      // Time range
      double[] timeRange = ikToolModel.getIKCommonModel().getTimeRange();
      startTime.setText(numFormat.format(timeRange[0]));
      endTime.setText(numFormat.format(timeRange[1]));

      //---------------------------------------------------------------------
      // Dialog buttons
      //---------------------------------------------------------------------
      updateDialogButtons();
   }


   public void updateDialogButtons() {
      updateApplyButton(!ikToolModel.isExecuting() && ikToolModel.isModified() && ikToolModel.isValid());
   }

   //------------------------------------------------------------------------
   // Overrides from BaseToolPanel
   //------------------------------------------------------------------------

   public void loadSettings(String fileName) { ikToolModel.loadSettings(fileName); }
   public void saveSettings(String fileName) { ikToolModel.saveSettings(fileName); }

   public void pressedCancel() {
      ikToolModel.cancel();
   }

   public void pressedClose() {
   }

   public void pressedApply() {
      ikToolModel.execute();
      updateDialogButtons();
   }

   /** This method is called from within the constructor to
    * initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is
    * always regenerated by the Form Editor.
    */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        markerPlacerPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        endTime = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        startTime = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        markerFileName = new org.opensim.swingui.FileTextFieldAndChooser();
        coordinateFileName = new org.opensim.swingui.FileTextFieldAndChooser();
        coordinateCheckBox = new javax.swing.JCheckBox();
        genericModelDataPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        modelNameTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        markerSetInfoTextField = new javax.swing.JTextField();

        markerPlacerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "IK Trial"));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Time range");

        endTime.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        endTime.setMinimumSize(new java.awt.Dimension(1, 20));
        endTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeRangeActionPerformed(evt);
            }
        });
        endTime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                timeRangeFocusLost(evt);
            }
        });

        jLabel9.setText("to");

        startTime.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        startTime.setMinimumSize(new java.awt.Dimension(1, 20));
        startTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeRangeActionPerformed(evt);
            }
        });
        startTime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                timeRangeFocusLost(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Marker data for trial");

        markerFileName.setMinimumSize(new java.awt.Dimension(3, 20));
        markerFileName.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                markerFileNameStateChanged(evt);
            }
        });

        coordinateFileName.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                coordinateFileNameStateChanged(evt);
            }
        });

        coordinateCheckBox.setText("Coordinate data for trial");
        coordinateCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        coordinateCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        coordinateCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coordinateCheckBoxActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout markerPlacerPanelLayout = new org.jdesktop.layout.GroupLayout(markerPlacerPanel);
        markerPlacerPanel.setLayout(markerPlacerPanelLayout);
        markerPlacerPanelLayout.setHorizontalGroup(
            markerPlacerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(markerPlacerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(markerPlacerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(coordinateCheckBox, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel12))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(markerPlacerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(markerFileName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .add(coordinateFileName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, markerPlacerPanelLayout.createSequentialGroup()
                        .add(startTime, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel9)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(endTime, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                .addContainerGap())
        );

        markerPlacerPanelLayout.linkSize(new java.awt.Component[] {coordinateCheckBox, jLabel12, jLabel8}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        markerPlacerPanelLayout.setVerticalGroup(
            markerPlacerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(markerPlacerPanelLayout.createSequentialGroup()
                .add(markerPlacerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(markerFileName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel12))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(markerPlacerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(startTime, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel9)
                    .add(endTime, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel8))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(markerPlacerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(coordinateFileName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(coordinateCheckBox))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        genericModelDataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Current Model"));

        jLabel13.setText("Name");

        modelNameTextField.setEditable(false);
        modelNameTextField.setToolTipText("Current Model in GUI");
        modelNameTextField.setMinimumSize(new java.awt.Dimension(3, 20));

        jLabel16.setText("Marker set");

        markerSetInfoTextField.setEditable(false);
        markerSetInfoTextField.setMinimumSize(new java.awt.Dimension(3, 20));

        org.jdesktop.layout.GroupLayout genericModelDataPanelLayout = new org.jdesktop.layout.GroupLayout(genericModelDataPanel);
        genericModelDataPanel.setLayout(genericModelDataPanelLayout);
        genericModelDataPanelLayout.setHorizontalGroup(
            genericModelDataPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(genericModelDataPanelLayout.createSequentialGroup()
                .add(genericModelDataPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(genericModelDataPanelLayout.createSequentialGroup()
                        .add(34, 34, 34)
                        .add(jLabel13))
                    .add(genericModelDataPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel16)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(genericModelDataPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(modelNameTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .add(markerSetInfoTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                .addContainerGap())
        );
        genericModelDataPanelLayout.setVerticalGroup(
            genericModelDataPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(genericModelDataPanelLayout.createSequentialGroup()
                .add(genericModelDataPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel13)
                    .add(modelNameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(genericModelDataPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(markerSetInfoTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel16))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(markerPlacerPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(genericModelDataPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(genericModelDataPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(markerPlacerPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Settings", jPanel1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 245, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   private void markerFileNameStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_markerFileNameStateChanged
      ikToolModel.getIKCommonModel().setMarkerDataFileName(markerFileName.getFileName());
   }//GEN-LAST:event_markerFileNameStateChanged

   private void coordinateCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coordinateCheckBoxActionPerformed
      ikToolModel.getIKCommonModel().setCoordinateDataEnabled(coordinateCheckBox.isSelected());
   }//GEN-LAST:event_coordinateCheckBoxActionPerformed

   private void coordinateFileNameStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_coordinateFileNameStateChanged
      ikToolModel.getIKCommonModel().setCoordinateDataFileName(coordinateFileName.getFileName());
   }//GEN-LAST:event_coordinateFileNameStateChanged

   private void timeRangeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_timeRangeFocusLost
      if(!evt.isTemporary()) timeRangeActionPerformed(null);
   }//GEN-LAST:event_timeRangeFocusLost

   private void timeRangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeRangeActionPerformed
      try {
         double[] range = new double[]{numFormat.parse(startTime.getText()).doubleValue(), numFormat.parse(endTime.getText()).doubleValue()};
         ikToolModel.getIKCommonModel().setTimeRange(range);
      } catch (ParseException ex) { // To catch parsing problems (string -> double)
         Toolkit.getDefaultToolkit().beep();
         double[] timeRange = ikToolModel.getIKCommonModel().getTimeRange();
         startTime.setText(numFormat.format(timeRange[0]));
         endTime.setText(numFormat.format(timeRange[1]));
      }
   }//GEN-LAST:event_timeRangeActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox coordinateCheckBox;
    private org.opensim.swingui.FileTextFieldAndChooser coordinateFileName;
    private javax.swing.JTextField endTime;
    private javax.swing.JPanel genericModelDataPanel;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane;
    private org.opensim.swingui.FileTextFieldAndChooser markerFileName;
    private javax.swing.JPanel markerPlacerPanel;
    private javax.swing.JTextField markerSetInfoTextField;
    private javax.swing.JTextField modelNameTextField;
    private javax.swing.JTextField startTime;
    // End of variables declaration//GEN-END:variables
   
}
