//package ch.cbfs.foundation;
//
//import lombok.var;
//import org.flywaydb.core.Flyway;
//import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
//import org.springframework.stereotype.Component;
//
//@Component
//public class FlywayModuleAMigrationConfig implements FlywayMigrationStrategy {
//
//    @Override
//    public void migrate(Flyway flyway) {
//        System.out.println("ert");
//        var dataSource = flyway.getConfiguration().getDataSource();
//        Flyway testModule = Flyway.configure()
//                .table("foo")
//                .baselineOnMigrate(true)
//                .schemas("core")
//                .locations("db/core")
//                .dataSource(dataSource).load();
//        Flyway testModule2 = Flyway.configure()
//                .table("bar")
//                .baselineOnMigrate(true)
//                .schemas("foundation")
//                .locations("db/foundation")
//                .dataSource(dataSource).load();
//        System.out.println("foo");
//        System.out.println("bar");
////        testModule.migrate();
////        testModule2.migrate();
//    }
//}
