package org.apache.maven.plugin.surefire.report;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.plugin.surefire.log.api.ConsoleLogger;

import java.util.Collection;
import java.util.List;

/**
 * Tree view class for console reporters using UNICODE theme.
 *
 * @author <a href="mailto:fabriciorby@hotmail.com">Fabrício Yamamoto</a>
 */
public class ConsoleTreeReporterUnicode extends ConsoleTreeReporterBase {

    public ConsoleTreeReporterUnicode(ConsoleLogger logger, boolean usePhrasedClassNameInRunning,
                                      boolean usePhrasedClassNameInTestCaseSummary) {
        super(logger, usePhrasedClassNameInRunning, usePhrasedClassNameInTestCaseSummary);
    }

    @Override
    TreePrinter getTreePrinter(List<WrappedReportEntry> classEntries, List<WrappedReportEntry> testEntries) {
        return new TreePrinter(getConsoleLogger(), classEntries, testEntries, Theme.UNICODE);
    }

}
