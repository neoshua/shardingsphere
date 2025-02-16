/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.dbdiscovery.fixture;

import org.apache.shardingsphere.dbdiscovery.spi.DatabaseDiscoveryType;

import javax.sql.DataSource;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

public final class TestDatabaseDiscoveryType implements DatabaseDiscoveryType {
    
    @Override
    public void checkDatabaseDiscoveryConfiguration(final String schemaName, final Map<String, DataSource> dataSourceMap) {
    }
    
    @Override
    public void updatePrimaryDataSource(final String schemaName, final Map<String, DataSource> activeDataSourceMap, final Collection<String> disabledDataSourceNames, final String groupName) {
    }
    
    @Override
    public void updateMemberState(final String schemaName, final Map<String, DataSource> dataSourceMap, final Collection<String> disabledDataSourceNames) {
    }
    
    @Override
    public void startPeriodicalUpdate(final String schemaName, final Map<String, DataSource> dataSourceMap, final Collection<String> disabledDataSourceNames, final String groupName) {
    }
    
    @Override
    public String getPrimaryDataSource() {
        return "primary";
    }
    
    @Override
    public void updateProperties(final String groupName, final Properties props) {
    
    }
    
    @Override
    public String getType() {
        return "TEST";
    }
}
