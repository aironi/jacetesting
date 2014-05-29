package org.silverduck.jacetesting.domain.tool;

/**
 * Created by ihietala on 29.5.2014.
 */
public class CSpanner extends AbstractTool {
    private long sizeInMm;

    public long getSizeInMm() {
        return sizeInMm;
    }

    public void setSizeInMm(long sizeInMm) {
        this.sizeInMm = sizeInMm;
    }
}
