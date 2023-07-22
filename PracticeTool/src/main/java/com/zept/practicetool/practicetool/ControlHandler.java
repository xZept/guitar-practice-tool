package com.zept.practicetool.practicetool;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
 *
 * @author Allen James Laxamana
 */
class ControlHandler {
    // Singleton class to prevent multiple instances
    static ControlHandler obj = new ControlHandler();
    private ControlHandler () {
        
    }
    private int time, noOfNotes, minutes, seconds;
    DecimalFormat dFormat = new DecimalFormat("00");
    private String ddMinute, ddSecond;
    Timer timer;
    
    // Check what difficulty is chosen then set a value to the variables that will determine the difficulty
    // Also checks if there is a selected difficulty
    public boolean checkSelectedBtn(ButtonModel selectedButton) {
       if (selectedButton == null) {
           JOptionPane.showMessageDialog(null, "Please choose a difficulty");
           return false;
       }
       else if (selectedButton == PracticeTool.btnEasy.getModel()) {
           time = 60;
           noOfNotes = 10;
       }
       else if (selectedButton == PracticeTool.btnAverage.getModel()) {
           time = 30;
           noOfNotes = 20;
       }
       else if (selectedButton == PracticeTool.btnHard.getModel()) {
           time = 10;
           noOfNotes = 40;
       }
       else {
           try {
                time = Integer.parseInt(PracticeTool.txtTime.getText());
                noOfNotes = Integer.parseInt(PracticeTool.txtNotes.getText());
           }
           catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(null, "Invalid input");
               return false;
           }
       }
       minutes = time / 60; // Convert time to minutes
       seconds = (time - (60 * minutes)); // Convert time to seconds
       return true;
    }
    
    public int getTime() {
        return time;
    }
    
    public int getNoOfNotes() {
        return noOfNotes;
    }
    
    public String generateRandomNote () {
        Random random = new Random();
        String notes[] = {"A", "A#/B♭", "B", "C", "C#/D♭", "D", "D#/E♭", "E", "F", "F#/G♭", "G", "G#/A♭"};
        int randomIndex = random.nextInt(notes.length); // Generate a random index
        String randomNote = notes[randomIndex]; // Pick a random note from the array
        return randomNote;
    }
    
    public void countdownTimer() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seconds--;
                ddSecond = dFormat.format(seconds);
                ddMinute = dFormat.format(minutes);
                NoteGenerator.lblTimer.setText(ddMinute + ":" + ddSecond);

                if (seconds <= -1) {
                    seconds = 59;
                    minutes--;
                    ddSecond = dFormat.format(seconds);
                    ddMinute = dFormat.format(minutes);
                    NoteGenerator.lblTimer.setText(ddMinute + ":" + ddSecond);
                }
                if (minutes <= 00 && seconds <= 00) {
                    timer.stop();
                }
            }
        });
        timer.start();
    }
    
    // Return the instance of this class
    public static ControlHandler getInstance() {
        return obj;
    }
}
