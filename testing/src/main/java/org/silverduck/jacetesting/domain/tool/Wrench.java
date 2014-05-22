package org.silverduck.jacetesting.domain.tool;

/**
 * Created by ihietala on 22.5.2014.
 */
public class Wrench extends AbstractTool {
    
    private Long milliMetres;


    public Long getMilliMetres() {
        return milliMetres;
    }

    public void setMilliMetres(Long milliMetres) {
        this.milliMetres = milliMetres;
    }
}
