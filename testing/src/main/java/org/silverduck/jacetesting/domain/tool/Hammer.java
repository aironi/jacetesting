package org.silverduck.jacetesting.domain.tool;

/**
 * Created by ihietala on 28.5.2014.
 */
public class Hammer extends AbstractTool {
    private Long diameter;

    public Long getDiameter() {
        return diameter;
    }

    public void setDiameter(Long diameter) {
        this.diameter = diameter;
    }
}