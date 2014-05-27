package org.silverduck.jacetesting.domain.tool;

/**
 * Created by ihietala on 22.5.2014.
 */
public class Wrench extends AbstractTool {

    private String color;

    private Long milliMetres;

    private Long weight;

    private String nickName;

    public String getColor() {
        return color;
    }

    public Long getMilliMetres() {
        return milliMetres;
    }

    public Long getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMilliMetres(Long milliMetres) {
        this.milliMetres = milliMetres;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
