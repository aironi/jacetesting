package org.silverduck.jacetesting.services.tool;

import org.silverduck.jacetesting.domain.tool.Wrench;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Created by ihietala on 22.5.2014.
 */
@Stateless
@LocalBean
public class ToolService {
    public void wrench(Wrench wrench) {
        System.out.println("Wrenching away a bit with my " + wrench);
        System.out.println("The Wrench broke. Bummer");
        System.out.println("I repaired it with duct tape and wire.");
        System.out.println("Holy smokes I can wrench again.");
    }

}
