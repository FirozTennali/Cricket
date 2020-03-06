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
public interface Subject {
    public void registerWatcher(Watcher o); 
    public void unregisterWatcher(Watcher o); 
    public void notifyWatcher(); 
}
