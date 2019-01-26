/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author norhan
 */
public class LoadBalancer {
    private static LoadBalancer _instance;
    private List<String> _servers = new ArrayList<String>();

    private LoadBalancer() {
      _servers.add("ServerI");
      _servers.add("ServerII");
      _servers.add("ServerIII");
      _servers.add("ServerIV");
      _servers.add("ServerV");
    }

    public LoadBalancer getInstance() {
        
        if(_instance==null){
            synchronized(this){
              if(_instance==null)  
                 _instance= new LoadBalancer();
            }
        }
        
        return _instance;
        
    }
    
    }
    
    
    
    

