package org.silverduck.jacetesting.domain.tool;

/**
 * Created by ihietala on 22.5.2014.
 */
public class Wrench extends AbstractTool {

    private String color;

    private Long milliMetres;

    private String nickName;

    public String getColor() {
        return color;
    }

    public Long getMilliMetres() {
        return milliMetres;
    }

    public String getNickName() {
        return nickName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMilliMetres(Long milliMetres) {
        this.milliMetres = milliMetres;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
