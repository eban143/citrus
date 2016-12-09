/*
 * Copyright 2006-2016 the original author or authors.
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

package com.consol.citrus.kubernetes.command;

import com.consol.citrus.context.TestContext;
import com.consol.citrus.kubernetes.client.KubernetesClient;

import java.util.Map;

/**
 * @author Christoph Deppisch
 * @since 2.7
 */
public interface KubernetesCommand<R> {

    /**
     * Executes command with given kubernetes client and test context.
     * @param kubernetesClient
     * @param context
     */
    void execute(KubernetesClient kubernetesClient, TestContext context);

    /**
     * Gets the Kubernetes command name.
     * @return
     */
    String getName();

    /**
     * Gets the command parameters.
     * @return
     */
    Map<String, Object> getParameters();

    /**
     * Provides access to this command result if any.
     * @return
     */
    R getCommandResult();

    /**
     * Gets the command result callback.
     * @return
     */
    CommandResultCallback<R> getResultCallback();
}
