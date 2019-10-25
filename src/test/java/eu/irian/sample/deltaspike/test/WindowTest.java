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

import eu.irian.sample.deltaspike.bean.WindowBean;
import org.apache.deltaspike.core.spi.scope.window.WindowContext;
import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

@RunWith(CdiTestRunner.class)
public class WindowTest extends AbstractTest {

  @Inject
  private WindowContext windowContext;

  @Inject
  private WindowBean windowBean;

  @Test
  public void testSomeBean() {
    windowContext.activateWindow("my-window-1");
    Assert.assertNull(windowBean.getName());
    windowBean.setName("Woodrush");
    Assert.assertEquals("Woodrush", windowBean.getName());
    Assert.assertEquals("my-window-1", windowContext.getCurrentWindowId());

    windowContext.activateWindow("my-window-2");
    Assert.assertNull(windowBean.getName());
    Assert.assertEquals("my-window-2", windowContext.getCurrentWindowId());
  }
}
