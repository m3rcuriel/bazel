// Copyright 2018 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.devtools.build.skydoc.fakebuildapi.cpp;

import com.google.devtools.build.lib.skylarkbuildapi.ProviderApi;
import com.google.devtools.build.lib.skylarkbuildapi.cpp.CcModuleApi;
import com.google.devtools.build.lib.skylarkbuildapi.cpp.CcToolchainProviderApi;
import com.google.devtools.build.lib.skylarkbuildapi.cpp.CcToolchainVariablesApi;
import com.google.devtools.build.lib.skylarkbuildapi.cpp.FeatureConfigurationApi;
import com.google.devtools.build.lib.syntax.EvalException;
import com.google.devtools.build.lib.syntax.SkylarkDict;
import com.google.devtools.build.lib.syntax.SkylarkList;
import com.google.devtools.build.skydoc.fakebuildapi.FakeProviderApi;

/**
 * Fake implementation of {@link CcModuleApi}.
 */
public class FakeCcModule implements CcModuleApi<CcToolchainProviderApi, FeatureConfigurationApi,
    CcToolchainVariablesApi> {

  @Override
  public ProviderApi getCcToolchainProvider() {
    return new FakeProviderApi();
  }

  @Override
  public FeatureConfigurationApi configureFeatures(CcToolchainProviderApi toolchain,
      SkylarkList<String> requestedFeatures, SkylarkList<String> unsupportedFeatures)
      throws EvalException {
    return null;
  }

  @Override
  public String getToolForAction(FeatureConfigurationApi featureConfiguration, String actionName) {
    return "";
  }

  @Override
  public boolean isEnabled(FeatureConfigurationApi featureConfiguration, String featureName) {
    return false;
  }

  @Override
  public SkylarkList<String> getCommandLine(FeatureConfigurationApi featureConfiguration,
      String actionName, CcToolchainVariablesApi variables) {
    return null;
  }

  @Override
  public SkylarkDict<String, String> getEnvironmentVariable(
      FeatureConfigurationApi featureConfiguration, String actionName,
      CcToolchainVariablesApi variables) {
    return null;
  }

  @Override
  public CcToolchainVariablesApi getCompileBuildVariables(
      CcToolchainProviderApi ccToolchainProvider, FeatureConfigurationApi featureConfiguration,
      Object sourceFile, Object outputFile, Object userCompileFlags, Object includeDirs,
      Object quoteIncludeDirs, Object systemIncludeDirs, Object defines, boolean usePic,
      boolean addLegacyCxxOptions) throws EvalException {
    return null;
  }

  @Override
  public CcToolchainVariablesApi getLinkBuildVariables(CcToolchainProviderApi ccToolchainProvider,
      FeatureConfigurationApi featureConfiguration, Object librarySearchDirectories,
      Object runtimeLibrarySearchDirectories, Object userLinkFlags, Object outputFile,
      Object paramFile, Object defFile, boolean isUsingLinkerNotArchiver,
      boolean isCreatingSharedLibrary, boolean mustKeepDebug, boolean useTestOnlyFlags,
      boolean isStaticLinkingMode) throws EvalException {
    return null;
  }

  @Override
  public CcToolchainVariablesApi getVariables() {
    return null;
  }
}