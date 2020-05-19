//package ch.cbfs.foundation.config;
//
//import org.flywaydb.core.Flyway;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class FlywayModuleBMigrationConfig implements FlywayMigrationStrategy {
//
//    @Override
//    public void migrate(Flyway flyway) {
//        System.out.println("bar");
//        DataSource dataSource = flyway.getConfiguration().getDataSource();
//        Flyway testModule = Flyway.configure()
//                .schemas("foundation")
//                .locations("db/migration")
//                .dataSource(dataSource).load();
//
//        testModule.migrate();
//    }
//}
