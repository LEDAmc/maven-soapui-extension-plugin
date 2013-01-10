/*
 * Copyright 2013 Thomas Bouffard (redfish4ktc)
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
 *
 */

package org.ktc.soapui.maven.extension.impl.runner;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.tools.SoapUITestCaseRunner;
import org.apache.commons.lang.ArrayUtils;

public class SoapUIExtensionTestCaseRunner extends SoapUITestCaseRunner {

    private String[] testsuiteProperties = {"fake"};

    public SoapUIExtensionTestCaseRunner() {
        super();
    }

    public SoapUIExtensionTestCaseRunner(String title) {
        super(title);
    }

    @Override
    protected void initProject(WsdlProject project) throws Exception {
        super.initProject(project);
        initTestSuiteProperties(project);
    }

    private void initTestSuiteProperties(WsdlProject project) {
        log.info("Configuring test suite properties");
        log.info(ArrayUtils.toString(testsuiteProperties));
        log.info("Test suite properties configuration done");
    }

}
