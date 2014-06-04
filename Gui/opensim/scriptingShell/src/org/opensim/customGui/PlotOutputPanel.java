/*
 * TextOutputPanel.java
 *
 * Created on August 19, 2010, 10:23 AM
 */

package org.opensim.customGui;

import javax.swing.JPanel;
import org.opensim.modeling.Analysis;
import org.opensim.modeling.AnalysisSet;
import org.opensim.modeling.ArrayStorage;
import org.opensim.modeling.Model;
import org.opensim.modeling.Storage;
import org.opensim.plotter.JPlotterPanel;
import org.opensim.plotter.Plot;
import org.opensim.plotter.PlotCurve;
import org.opensim.view.pub.OpenSimDB;

/**
 *
 * @author  ayman
 */
public class PlotOutputPanel extends JPanel implements LabOutputInterface {
    private LabOutputPlot labOutputPlot;
    private JPlotterPanel plotterPanel;
    private Storage sourceStorage=null;
    private int columnIndex=-1;
    private String columnName;
    private PlotCurve cv;
    int lastIndex;
    private ParametersTopComponent ownerTC;
    /** Creates new form TextOutputPanel */
    public PlotOutputPanel(LabOutputPlot nextOutput, ParametersTopComponent ownerTC) {
        labOutputPlot=nextOutput;
        this.ownerTC = ownerTC;
        initComponents();
    }

    public String getQuantitySpecfication() {
        return labOutputPlot.getQuantitySpecfication();
    }

    public void setQuantitySpecfication(String quantitySpecfication) {
        labOutputPlot.setQuantitySpecfication(quantitySpecfication);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 160, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 25, Short.MAX_VALUE)
        );

        setLayout(new java.awt.BorderLayout());

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
    }// </editor-fold>//GEN-END:initComponents

    public void updateDisplay(double aT) {
        int timeIndex = sourceStorage.findIndex(aT);
        if (timeIndex>=0 && lastIndex!=timeIndex){
           double value = sourceStorage.getStateVector(timeIndex).getData().getitem(columnIndex);
            cv.addDataPoint((double)aT, value);
            lastIndex=timeIndex;
        }
        
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void connectQuantityToSource(Model model) {
         // keep a reference to Storage, column to obtain data quickly wile running
        String[] specs=labOutputPlot.getQuantitySpecfication().split("\\.");
        AnalysisSet as = model.getAnalysisSet();
        boolean found = false;
        if (as!=null && as.getSize()>0){
            Analysis a= as.get(specs[0]);
            if (a != null && specs.length>=1){
                ArrayStorage storages=a.getStorageList();
                for(int idx=0; idx<storages.getSize(); idx++){
                    String dName = storages.get(idx).getName();
                    
                }
                sourceStorage = storages.get(specs[1]);
                if (sourceStorage!=null && specs.length>=2){
                    columnIndex = sourceStorage.getColumnLabels().findIndex(specs[2])-1;
                    columnName = specs[2];
                }
            }
        }

        plotterPanel = ownerTC.getResultDisplayer().getPlotter();
        cv = plotterPanel.showAnalysisCurveAgainstTime(OpenSimDB.getInstance().getCurrentModel(), 
                sourceStorage, 
                labOutputPlot.getPlotTitle(), 
                labOutputPlot.getYAxisTitle(), 
                columnName, 
                labOutputPlot.getXAxisTitle(), 
                labOutputPlot.getYAxisTitle()
                         );
        Plot dPlot = plotterPanel.getPlotterModel().getCurrentPlot();
        dPlot.setTitle(labOutputPlot.getPlotTitle());
        
   }

    public void cleanup() {
    }
    
}
