/*
 * Copyright 2013 Nicolas Morel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.progressoft.brix.domino.jacksonapt.deser.map.key;

import com.progressoft.brix.domino.jacksonapt.deser.map.key.BaseNumberKeyDeserializer.BigIntegerKeyDeserializer;
import org.junit.Test;

import java.math.BigInteger;

/**
 * @author Nicolas Morel
 */
public class BigIntegerKeyDeserializerTest extends AbstractKeyDeserializerTest<BigInteger> {

    @Override
    protected BigIntegerKeyDeserializer createDeserializer() {
        return BigIntegerKeyDeserializer.getInstance();
    }

    @Override
    @Test
	public void testDeserializeValue() {
        String value = "1548784651132124566543513203245448715154542123114001571970";
        BigInteger expected = new BigInteger(value);
        assertDeserialization(expected, value);
    }

}
