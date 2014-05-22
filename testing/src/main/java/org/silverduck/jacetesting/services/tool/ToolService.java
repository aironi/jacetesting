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
        System.out.println("Wrenching away with my " + wrench);
        System.out.println("Wrenching away even more with my " + wrench);
    }

}
