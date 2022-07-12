package com.mj.cfg;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author 贾登辉
 * @version 1.0
 */
@Configuration
@EnableTransactionManagement
public class TxConfig {

    @Bean
    public DataSourceTransactionManager mgr(DataSource dataSource) {
        DataSourceTransactionManager mgr = new DataSourceTransactionManager();
        mgr.setDataSource(dataSource);
        return mgr;
    }
}
