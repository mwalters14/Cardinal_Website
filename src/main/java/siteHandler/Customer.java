package siteHandler;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;
    private String find_us;
    private boolean newsletter_subscription;
    private String message;

    // Standard Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFind_us() {
        return find_us;
    }

    public void setFind_us(String find_us) {
        this.find_us = find_us;
    }

    public boolean isNewsletter_subscription() {
        return newsletter_subscription;
    }

    public void setNewsletter_subscription(boolean newsletter_subscription) {
        this.newsletter_subscription = newsletter_subscription;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
