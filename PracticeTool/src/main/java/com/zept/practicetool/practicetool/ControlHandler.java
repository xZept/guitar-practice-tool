package com.zept.practicetool.practicetool;

import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Allen James Laxamana
 */
public class ControlHandler {
    private int time = 0;
    private int noOfNotes = 0;
    private ButtonModel selectedButton;
    
    public ControlHandler(ButtonModel selectedButton) {
        this.selectedButton = selectedButton;
    }
    
    // Check what difficulty is chosen then set a value to the variables that will determine the difficulty
    // Also checks if there is a selected difficulty
    public boolean checkSelectedBtn() {
       if (selectedButton == null) {
           JOptionPane.showMessageDialog(null, "Please choose a difficulty");
           return false;
       }
       else if (selectedButton == PracticeTool.btnEasy.getModel()) {
           time = 60;
           noOfNotes = 10;
           return true;
       }
       else if (selectedButton == PracticeTool.btnAverage.getModel()) {
           time = 30;
           noOfNotes = 20;
           return true;
       }
       else if (selectedButton == PracticeTool.btnHard.getModel()) {
           time = 10;
           noOfNotes = 40;
           return true;
       }
       else {
           try {
                time = Integer.parseInt(PracticeTool.txtTime.getText());
                noOfNotes = Integer.parseInt(PracticeTool.txtNotes.getText());
                return true;
           }
           catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(null, "Invalid input");
               return false;
           }
       }
    }
    
    public int getTime() {
        return time;
    }
    
    public int getNoOfNotes() {
        return noOfNotes;
    }
}
