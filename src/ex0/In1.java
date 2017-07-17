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

import java.util.List;
import oms3.annotations.*;

/**
 * @author sidereus
 */
public class In1 {

    @InNode public List<Double> inval1;
    @InNode public List<Double> in_other_val1;
    @Out public Double outval; 
    @Out public Double out_other_val;

    @Execute
    public void run() {
        outval = inval1.remove(0);
        out_other_val = in_other_val1.remove(0);
    }
 
}
