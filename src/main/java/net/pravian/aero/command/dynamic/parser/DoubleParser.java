/*
 * Copyright 2015 Jerom van der Sar.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.pravian.aero.command.dynamic.parser;

import java.util.List;

public class DoubleParser implements Parser<Double>
{

    @Override
    public int parse(List<? super Double> result, String[] args, int offset) throws Exception
    {

        try
        {
            result.add(Double.parseDouble(args[offset]));
        }
        catch (NumberFormatException nex)
        {
            throw new ParseException("Could not parse double: " + args[offset], nex);
        }
        return offset + 1;
    }

}
