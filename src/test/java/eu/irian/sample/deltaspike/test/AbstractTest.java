/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package eu.irian.sample.deltaspike.test;

import org.apache.deltaspike.cdise.api.ContextControl;
import org.apache.deltaspike.core.api.scope.WindowScoped;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

abstract class AbstractTest {

  private @Inject
  ContextControl contextControl;


  void cleanInstances() {
    contextControl.stopContext(RequestScoped.class);
    contextControl.stopContext(SessionScoped.class);
    contextControl.stopContext(WindowScoped.class);
    contextControl.startContext(RequestScoped.class);
    contextControl.startContext(SessionScoped.class);
    contextControl.startContext(WindowScoped.class);
  }
}
