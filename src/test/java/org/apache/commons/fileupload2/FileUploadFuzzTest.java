/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.fileupload2;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.fileupload2.portlet.PortletFileUploadTest;
import org.apache.commons.fileupload2.servlet.ServletFileUploadTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class FileUploadFuzzTest {

    public static Stream<FileUpload> data() {
        return Util.fileUploadImplementations().stream();
    }

    @FuzzTest
    void myFuzzTest(FuzzedDataProvider data) {

        //final List<FileItem> fileItems = Util.parseUpload(upload, data.consumeRemainingAsString());
        // Call the functions you want to test with the provided data and optionally
        // assert that the results are as expected.

        // If you want to know more about writing fuzz tests you can checkout the
        // example projects at https://github.com/CodeIntelligenceTesting/cifuzz/tree/main/examples
        // or have a look at our tutorial:
        // https://github.com/CodeIntelligenceTesting/cifuzz/blob/main/docs/How-To-Write-A-Fuzz-Test.md
    }
}
