/*
 * Copyright 2006-2010 ConSol* Software GmbH.
 * 
 * This file is part of Citrus.
 * 
 * Citrus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Citrus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Citrus. If not, see <http://www.gnu.org/licenses/>.
 */

package com.consol.citrus.functions.core;

import java.util.Collections;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.consol.citrus.exceptions.InvalidFunctionUsageException;
import com.consol.citrus.functions.core.UpperCaseFunction;
import com.consol.citrus.testng.AbstractBaseTest;

/**
 * @author Christoph Deppisch
 */
public class UpperCaseFunctionTest extends AbstractBaseTest {
    UpperCaseFunction function = new UpperCaseFunction();
    
    @Test
    public void testFunction() {
        Assert.assertEquals(function.execute(Collections.singletonList("1000")), "1000");
        Assert.assertEquals(function.execute(Collections.singletonList("Hallo TestFramework!")), "HALLO TESTFRAMEWORK!");
        Assert.assertEquals(function.execute(Collections.singletonList("Today is: 09.02.2009")), "TODAY IS: 09.02.2009");
    }
    
    @Test(expectedExceptions = {InvalidFunctionUsageException.class})
    public void testNoParameters() {
        function.execute(Collections.<String>emptyList());
    }
}
