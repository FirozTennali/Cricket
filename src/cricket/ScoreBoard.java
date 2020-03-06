/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cricket;

import java.util.ArrayList; 
import java.util.Iterator; 
/**
 *
 * @author administrator
 */
public class ScoreBoard implements Subject 
{ 
    int runs; 
    int wickets; 
    float overs; 
    ArrayList<Watcher> watchers; 
  
    public ScoreBoard() { 
        watchers = new ArrayList<Watcher>(); 
    } 
  
    @Override
    public void registerWatcher(Watcher w) { 
        watchers.add(w); 
    } 
  
    @Override
    public void unregisterWatcher(Watcher w) { 
        watchers.remove(watchers.indexOf(w)); 
    } 
  
    @Override
    public void notifyWatcher() 
    {         
        for (Iterator<Watcher> it = watchers.iterator(); it.hasNext();) 
        { 
            Watcher w = it.next(); 
            w.update(runs,wickets,overs); 
        }
    }
  
    // get current runs
    private int getCurrentRuns() 
    { 
        return 10; 
    } 
  
    // get current wickets
    private int getCurrentWickets() 
    { 
        return 1; 
    } 
  
    // get current overs
    private float getCurrentOvers() 
    { 
        return (float)2.2; 
    } 
  
    // This method is used update displays 
    // when data changes 
    public void onChange() 
    { 
        //get latest data 
        runs = getCurrentRuns(); 
        wickets = getCurrentWickets(); 
        overs = getCurrentOvers();
        notifyWatcher(); 
    } 
} 
