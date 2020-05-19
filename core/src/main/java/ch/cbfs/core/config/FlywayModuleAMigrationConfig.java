package ch.cbfs.core.config;

//import org.flywaydb.core.Flyway;

//@Component
//public class FlywayModuleAMigrationConfig implements FlywayMigrationStrategy {
//
//    @Override
//    public void migrate(Flyway flyway) {
//        System.out.println("foo");
//        var dataSource = flyway.getConfiguration().getDataSource();
//        Flyway testModule = Flyway.configure()
//                .schemas("core")
//                .locations("db/migration")
//                .dataSource(dataSource).load();
//
//        testModule.migrate();
//    }
//}
