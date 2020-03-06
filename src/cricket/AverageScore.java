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
public class AverageScore implements Watcher 
{ 
    private float runRate; 
    private int predictedScore; 
  
    @Override
    public void update(int runs, int wickets,  float overs) 
    { 
        this.runRate =(float)runs/overs; 
        this.predictedScore = (int)(this.runRate * 50); 
        display(); 
    } 
  
    public void display() 
    { 
        System.out.println("\nAverage Score Display: \n"
                           + "Run Rate: " + runRate + 
                           "\nPredictedScore: " + 
                           predictedScore); 
    } 
} 
