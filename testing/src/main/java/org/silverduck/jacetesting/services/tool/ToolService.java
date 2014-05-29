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

    public void hammer(Wrench wrench) {
        System.out.print("You really shouldn't hammer with a wrench.");
    }

    public void wrench(Wrench wrench) {
        System.out.println("Wrenching away a bit with my " + wrench);
        System.out.println("The Wrench broke. Bummer");
        System.out.println("I repaired it with duct tape and wire.");
        System.out.println("Holy smokes I can wrench again.");
        System.out.println("Umm.. My wrist broke.");
        System.out.println("I repaired it with splint and tape.");
        System.out.println("Wrenching again.");
        System.out.println("The Nut broke...");
        System.out.println("I glued the nut on with chemical metal.");
    }

}
