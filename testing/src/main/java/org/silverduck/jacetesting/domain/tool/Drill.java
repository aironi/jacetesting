package org.silverduck.jacetesting.domain.tool;

/**
 * Created by ihietala on 30.5.2014.
 */
public class Drill extends AbstractTool {

    private String brand;

    private Long socketSize;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getSocketSize() {
        return socketSize;
    }

    public void setSocketSize(Long socketSize) {
        this.socketSize = socketSize;
    }
}
