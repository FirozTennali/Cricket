/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cricket;

/**
 *
 * @author administrator
 */
public class Cricket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create objects for testing 
        AverageScore averageScore = new AverageScore(); 
        CurrentScore currentScore = new CurrentScore(); 
  
        // pass the displays to Cricket data 
        ScoreBoard scoreBoard = new ScoreBoard(); 
  
        // register display elements 
        scoreBoard.registerWatcher(averageScore); 
        scoreBoard.registerWatcher(currentScore); 
  
        // in real app you would have some logic to 
        // call this function when data changes 
        scoreBoard.onChange(); 
  
        //remove an watcher 
        scoreBoard.unregisterWatcher(averageScore); 
  
        // now only current score gets display
        // notification 
        scoreBoard.onChange();         
    }
    
}
