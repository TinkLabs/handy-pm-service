package com.hi.util;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.sql.SQLException;

public class MyBatisPlusGenerator {

    public static void main(String[] args) throws SQLException {

        //1. global configuration
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(true)
                .setAuthor("Landin")
                .setOutputDir("/Users/linLandin/Documents/generatedCode/PM-service1")
                .setFileOverride(true)
                .setIdType(IdType.AUTO)
                .setServiceName("%sService")
                //默认不开启二级缓存
                .setEnableCache(false)
                // IEmployeeService
                .setBaseResultMap(true)
                //设置为input
                .setIdType(IdType.INPUT)
                .setBaseColumnList(true);

        //2. datasource configuration
        DataSourceConfig dsConfig = new DataSourceConfig();
        dsConfig.setDbType(DbType.MYSQL)
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://localhost:13306/backend2")
                .setUsername("root")
                .setPassword("abc123");

        //3. strategy configuration
        StrategyConfig stConfig = new StrategyConfig();
        stConfig.setCapitalMode(false) //全局大写命名
                .setNaming(NamingStrategy.underline_to_camel)
                .setInclude("message_recipients")
                .setInclude("messages");
//                .setInclude("message_info");
//                .setInclude("device_users");
        //4. package configuration
        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent("com.hi")
                .setMapper("mapper")//dao
                .setService("service")//servcie
                .setServiceImpl("service.impl")
                .setController("controller")//controller
                .setEntity("entity")
                .setXml("mapper.xml");//mapper.profile.xml

        //5. merge configuration
        AutoGenerator ag = new AutoGenerator();
        ag.setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);

        //6. execute
        ag.execute();
    }

}
