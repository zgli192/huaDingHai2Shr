//package com.huading.shrt.config.db;
//
//import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//
//import javax.sql.DataSource;
//
///**
// * Mybatis 数据源1配置
// * @author pengpeng
// * @package com.hdgt.oashr.config
// * @project oashr
// * @date 2021/1/12 9:11
// */
//@Configuration
//@MapperScan(basePackages ="com.hdgt.oashr.mapper.data1", sqlSessionTemplateRef  = "data1SqlSessionTemplate")
//public class MybatisPlusConfigData1 {
//    //主数据源 ds1数据源
//    @Primary
//    @Bean("data1SqlSessionFactory")
//    public SqlSessionFactory data1SqlSessionFactory(@Qualifier("data1DataSource") DataSource dataSource) throws Exception {
//        MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
//        sqlSessionFactory.setDataSource(dataSource);
//        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().
//                getResources("classpath:mappers/data1/**.xml"));
//        return sqlSessionFactory.getObject();
//    }
//
//    @Primary
//    @Bean(name = "data1TransactionManager")
//    public DataSourceTransactionManager data1TransactionManager(@Qualifier("data1DataSource") DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    @Primary
//    @Bean(name = "data1SqlSessionTemplate")
//    public SqlSessionTemplate data1SqlSessionTemplate(@Qualifier("data1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//
//}
