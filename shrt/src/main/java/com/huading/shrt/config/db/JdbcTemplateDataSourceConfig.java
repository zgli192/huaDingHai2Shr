package com.huading.shrt.config.db;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * JdbcTemplate多数据源配置
 * 依赖于数据源配置
 *
 * @author pengpeng
 * @package com.hdgt.oashr.config
 * @project oashr
 * @date 2021/1/12 9:08
 */
@Configuration
public class JdbcTemplateDataSourceConfig {
    //JdbcTemplate主数据源data1数据源
    @Primary

/*    @Bean(name = "data1JdbcTemplate")
    public JdbcTemplate ds1JdbcTemplate(@Qualifier("data1DataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }*/

    //JdbcTemplate第二个data2数据源
    @Bean(name = "data2JdbcTemplate")
    public JdbcTemplate ds2JdbcTemplate(@Qualifier("data2DataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
