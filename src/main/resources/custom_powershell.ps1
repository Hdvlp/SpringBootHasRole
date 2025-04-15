

$env:processAppDebugging="true";
$env:processAppDataSourceDriverClassName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
$env:processAppDatabasePlatform="org.hibernate.dialect.SQLServer2012Dialect";
$env:processAppDataSourceUrl="jdbc:sqlserver://localhost;databaseName=springboothasrole;encrypt=false;trustServerCertificate=false;"
$env:processAppDataSourceUsername="sa";
$env:processAppDataSourcePassword="63C9F4n1PPd3b81omm31dB7gl18";
./mvnw spring-boot:run;

