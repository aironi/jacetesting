package org.silverduck.jacetesting.domain.tool;

/**
 * Created by ihietala on 22.5.2014.
 */
public class Wrench extends AbstractTool {

    private Long milliMetres;

    private Long inches;

    public Long getMilliMetres() {
        return milliMetres;
    }

    public void setMilliMetres(Long milliMetres) {
        this.milliMetres = milliMetres;
    }

    public Long getInches() {
        return inches;
    }

    public void setInches(Long inches) {
        this.inches = inches;
    }
}
