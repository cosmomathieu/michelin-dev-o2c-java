/*
 * SwaggerPetstoreOpenAPI30Lib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package io.swagger.petstore.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import javax.xml.bind.annotation.XmlElement;

/**
 * This is a model class for User type.
 */
public class User {
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private Integer userStatus;

    /**
     * Default constructor.
     */
    public User() {
    }

    /**
     * Initialization constructor.
     * @param  id  Long value for id.
     * @param  username  String value for username.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  email  String value for email.
     * @param  password  String value for password.
     * @param  phone  String value for phone.
     * @param  userStatus  Integer value for userStatus.
     */
    public User(
            Long id,
            String username,
            String firstName,
            String lastName,
            String email,
            String password,
            String phone,
            Integer userStatus) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.userStatus = userStatus;
    }

    /**
     * Getter for Id.
     * @return Returns the Long
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @XmlElement(name = "id")
    public Long getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Long
     */
    @JsonSetter("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for Username.
     * @return Returns the String
     */
    @JsonGetter("username")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @XmlElement(name = "username")
    public String getUsername() {
        return username;
    }

    /**
     * Setter for Username.
     * @param username Value for String
     */
    @JsonSetter("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter for FirstName.
     * @return Returns the String
     */
    @JsonGetter("firstName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @XmlElement(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * @param firstName Value for String
     */
    @JsonSetter("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * @return Returns the String
     */
    @JsonGetter("lastName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @XmlElement(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * @param lastName Value for String
     */
    @JsonSetter("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for Email.
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @XmlElement(name = "email")
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for Password.
     * @return Returns the String
     */
    @JsonGetter("password")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @XmlElement(name = "password")
    public String getPassword() {
        return password;
    }

    /**
     * Setter for Password.
     * @param password Value for String
     */
    @JsonSetter("password")
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for Phone.
     * @return Returns the String
     */
    @JsonGetter("phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @XmlElement(name = "phone")
    public String getPhone() {
        return phone;
    }

    /**
     * Setter for Phone.
     * @param phone Value for String
     */
    @JsonSetter("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter for UserStatus.
     * User Status
     * @return Returns the Integer
     */
    @JsonGetter("userStatus")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @XmlElement(name = "userStatus")
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * Setter for UserStatus.
     * User Status
     * @param userStatus Value for Integer
     */
    @JsonSetter("userStatus")
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * Converts this User into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "User [" + "id=" + id + ", username=" + username + ", firstName=" + firstName
                + ", lastName=" + lastName + ", email=" + email + ", password=" + password
                + ", phone=" + phone + ", userStatus=" + userStatus + "]";
    }

    /**
     * Builds a new {@link User.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link User.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .username(getUsername())
                .firstName(getFirstName())
                .lastName(getLastName())
                .email(getEmail())
                .password(getPassword())
                .phone(getPhone())
                .userStatus(getUserStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link User}.
     */
    public static class Builder {
        private Long id;
        private String username;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String phone;
        private Integer userStatus;



        /**
         * Setter for id.
         * @param  id  Long value for id.
         * @return Builder
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for username.
         * @param  username  String value for username.
         * @return Builder
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        /**
         * Setter for firstName.
         * @param  firstName  String value for firstName.
         * @return Builder
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Setter for lastName.
         * @param  lastName  String value for lastName.
         * @return Builder
         */
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Setter for password.
         * @param  password  String value for password.
         * @return Builder
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Setter for phone.
         * @param  phone  String value for phone.
         * @return Builder
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * Setter for userStatus.
         * @param  userStatus  Integer value for userStatus.
         * @return Builder
         */
        public Builder userStatus(Integer userStatus) {
            this.userStatus = userStatus;
            return this;
        }

        /**
         * Builds a new {@link User} object using the set fields.
         * @return {@link User}
         */
        public User build() {
            return new User(id, username, firstName, lastName, email, password, phone, userStatus);
        }
    }
}
