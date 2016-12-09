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
import io.fabric8.kubernetes.api.model.PodList;
import io.fabric8.kubernetes.client.dsl.ClientMixedOperation;

/**
 * @author Christoph Deppisch
 * @since 2.7
 */
public class ListPods extends AbstractListCommand<PodList> {

    /**
     * Default constructor initializing the command name.
     */
    public ListPods() {
        super("pods");
    }

    @Override
    protected ClientMixedOperation listOperation(KubernetesClient kubernetesClient, TestContext context) {
        return kubernetesClient.getEndpointConfiguration().getKubernetesClient().pods();
    }
}
