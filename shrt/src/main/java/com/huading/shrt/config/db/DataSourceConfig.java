package com.huading.shrt.config.db;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author pengpeng
 * @package com.hdgt.oashr.config
 * @project oashr
 * @date 2021/1/12 8:58
 */
@Configuration
public class DataSourceConfig {
    //主数据源 data1数据源
//    @Primary
//    @Bean(name = "data1DataSource")
//    public DataSource data1DataSource(@Qualifier("data1DataSourceProperties") DataSourceProperties dataSourceProperties) {
//        return dataSourceProperties.initializeDataSourceBuilder().build();
//    }
//
//    @Primary
//    @Bean(name = "data1DataSourceProperties")
//    @ConfigurationProperties(prefix = "spring.datasource.data1")
//    public DataSourceProperties data1DataSourceProperties() {
//        return new DataSourceProperties();
//    }



    //主数据源 data2数据源
    @Primary
    @Bean(name = "data2DataSource")
    public DataSource data2DataSource(@Qualifier("data2DataSourceProperties") DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }
    @Primary
    @Bean(name = "data2DataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.data2")
    public DataSourceProperties data2DataSourceProperties() {

        return new DataSourceProperties();
    }


}
