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

import java.util.ArrayList;
import java.util.List;
import oms3.annotations.*;

/**
 * @author sidereus
 */
public class Out2 {

    @OutNode public List<Double> outval1 = new ArrayList<Double>();
    @OutNode public List<Double> outval2 = new ArrayList<Double>();
    @In public Double inval;

    @Execute
    public void run() {
        outval1.add(inval);
        outval2.add(inval);
    }
 
}
