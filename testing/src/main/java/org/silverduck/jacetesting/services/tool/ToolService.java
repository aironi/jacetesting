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
        System.out.println("Wrenching away a bit less with my " + wrench);
        System.out.println("Wrenching away again with my " + wrench);
        System.out.println("Wrenching away just a little bit more with my " + wrench);
    }

}
