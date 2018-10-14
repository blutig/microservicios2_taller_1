/**
 * 
 */
package co.com.taller1.backend.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author drache
 *
 */
@Configuration
@EnableTransactionManagement
@ImportResource({ "classpath*:spring/*.xml" })
@EnableJpaRepositories(basePackages = { "co.com.taller1.backend.persistence.repositories" })
@ComponentScan(basePackages = { "co.com.taller1.backend" })
public class Configurations {

}
