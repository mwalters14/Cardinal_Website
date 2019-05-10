package siteHandler;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* Learning comments
    A class can extend only one abstract class
    A class can implement more than one interface

    interface - An interface is a special form of an abstract class which does not implement any methods
    extends - CustomerRepository inherits the attributes and methods of the JpaRepository
*/
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> { }
