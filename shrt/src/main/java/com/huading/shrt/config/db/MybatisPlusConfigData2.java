package com.huading.shrt.config.db;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author pengpeng
 * @package com.hdgt.oashr.config
 * @project oashr
 * @date 2021/1/12 9:23
 */
@Configuration
@MapperScan(basePackages = "com.huading.shrt.mapper", sqlSessionTemplateRef = "data2SqlSessionTemplate")
public class MybatisPlusConfigData2 {
    //主数据源 datas数据源
    @Bean("data2SqlSessionFactory")
    public SqlSessionFactory data2SqlSessionFactory(@Qualifier("data2DataSource") DataSource dataSource) throws Exception {
        MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().
                getResources("classpath:mappers/data2/**.xml"));
        return sqlSessionFactory.getObject();
    }


    @Bean(name = "data2TransactionManager")
    public DataSourceTransactionManager data2TransactionManager(@Qualifier("data2DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }


    @Bean(name = "data2SqlSessionTemplate")
    public SqlSessionTemplate data2SqlSessionTemplate(@Qualifier("data2SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
