package org.silverduck.jacetesting.domain.tool;

/**
 * Created by ihietala on 22.5.2014.
 */
public class Wrench extends AbstractTool {

    private String color;

    private Long milliMetres;

    public String getColor() {
        return color;
    }

    public Long getMilliMetres() {
        return milliMetres;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMilliMetres(Long milliMetres) {
        this.milliMetres = milliMetres;
    }

}
