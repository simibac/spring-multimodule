package ch.cbfs.foundation.config;

//import org.flywaydb.core.Flyway;

//@Configuration
//public class FlywayModuleBMigrationConfig implements FlywayMigrationStrategy {
//
//    @Override
//    public void migrate(Flyway flyway) {
//        System.out.println("bar");
//        var dataSource = flyway.getConfiguration().getDataSource();
//        Flyway testModule = Flyway.configure()
//                .schemas("foundation")
//                .locations("db/migration")
//                .dataSource(dataSource).load();
//
//        testModule.migrate();
//    }
//}
