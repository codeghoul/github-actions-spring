package me.jysh.springcicddemo.testcontainer;

import org.testcontainers.containers.PostgreSQLContainer;

public class PostgreSqlTestContainer extends PostgreSQLContainer<PostgreSqlTestContainer> {
  private static final String IMAGE_VERSION = "postgres:11.1";
  private static PostgreSqlTestContainer container;

  private PostgreSqlTestContainer() {
    super(IMAGE_VERSION);
  }

  /**
   * Get Postgre SQL Test Container Instance.
   *
   * @return
   */
  public static PostgreSqlTestContainer getInstance() {
    if (container == null) {
      container = new PostgreSqlTestContainer();
    }
    return container;
  }

  @Override
  public void start() {
    super.start();
    System.setProperty("JDBC_DATABASE_URL", container.getJdbcUrl());
    System.setProperty("JDBC_DATABASE_USERNAME", container.getUsername());
    System.setProperty("JDBC_DATABASE_PASSWORD", container.getPassword());
  }

  @Override
  public void stop() {
    // do nothing, JVM handles shut down
  }
}
