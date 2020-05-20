package ch.cbfs.core.config;

import org.flywaydb.core.Flyway;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class FlywayModuleAMigrationConfig implements FlywayMigrationStrategy {

    @Override
    public void migrate(Flyway flyway) {
        DataSource dataSource = flyway.getConfiguration().getDataSource();
        Flyway coreModule = Flyway.configure()
                .schemas("core")
                .locations("db/migration/core")
                .table("core_schema_version")
                .dataSource(dataSource).load();

        Flyway foundationModule = Flyway.configure()
                .schemas("foundation")
                .locations("db/migration/foundation")
                .table("foundation_schema_version")
                .dataSource(dataSource).load();

        coreModule.migrate();
        foundationModule.migrate();
    }
}
