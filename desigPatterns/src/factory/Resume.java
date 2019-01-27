/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author norhan
 */
public class Resume extends Document {

    @Override
    public void CreatePages() {
      pages.add(new IntroductionPage());
      pages.add(new ExperiencePage());
    }
    
}
