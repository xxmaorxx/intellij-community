/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.siyeh.ipp.annotation;

import com.siyeh.ipp.IPPTestCase;

public class ExpandToNormalAnnotationIntentionTest extends IPPTestCase {
  public void testOneAttr() throws Exception {
    doTest();
  }
  
  public void testMultiAttr() throws Exception {
    doTest();
  }

  public void testAlreadyHasName() throws Exception {
    assertIntentionNotAvailable();
  }

  @Override
  protected String getIntentionName() {
    return "Expand to 'value = \"foo\"'";
  }

  @Override
  protected String getRelativePath() {
    return "expandToNormal";
  }
}
