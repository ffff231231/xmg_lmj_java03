package com.mj.common;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class DruidDateSourceFactory extends UnpooledDataSourceFactory {
    public DruidDateSourceFactory(){
        this.dataSource = new DruidDataSource();
    }
}
