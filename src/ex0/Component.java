/*
 * $Id$
 * 
 * This file is part of the Object Modeling System (OMS),
 * 2007-2011, Olaf David, Colorado State University
 *
 * OMS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * OMS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with OMS.  If not, see <http://www.gnu.org/licenses/>.
 */
package ex0;

import oms3.annotations.*;

/**
 * @author sidereus
 */
public class Component {

    @In public Double val;
    @In public Double other_val;
    @In public Double inval;
    @In public Double in_other_val;
    @Out public Double outval;
    @Out public Double out_other_val;

    private Double[] tmpVal = new Double[]{0.0,1.0,2.0};
    private int index = 0;

    @In
    @Out
    public boolean goon = true;

    @Execute
    public void run() {
        if (inval != null) outval = val + inval;
        else outval = val;

        if (in_other_val != null) out_other_val = other_val + in_other_val;
        else out_other_val = other_val;

        outval += tmpVal[index];
        out_other_val += tmpVal[index];

        int timestep = index+1;
        System.out.println("Node " + val + " timestep " + timestep + " - value1: " + outval + " - value2: " + out_other_val);

        if (index == (tmpVal.length-1)) goon = false;

        index++;

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
    }
 
}
