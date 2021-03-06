/*
 * Copyright 2006-2018 the original author or authors.
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

package com.consol.citrus.remote.transformer;

import com.consol.citrus.exceptions.CitrusRuntimeException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @author Christoph Deppisch
 * @since 2.7.4
 */
public class JsonRequestTransformer {

    public <T> T read(String body, Class<T> bodyType) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(body, bodyType);
        } catch (IOException e) {
            throw new CitrusRuntimeException("Failed to read json body", e);
        }
    }
}
