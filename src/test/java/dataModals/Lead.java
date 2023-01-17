package dataModals;

import enums.*;

import java.util.Objects;

public class Lead {
    private final String firstName;
    private final String lastName;
    private final String company;
    private final String phone;
    private final LeadStatus leadStatus;
    private final Salutation salutation;
    private final Rating rating;
    private final Industry industry;
    private final LeadSource leadSource;
    private final String email;
    private final String title;
    private final String website;
    private final String city;
    private final String state;
    private final String zipCode;
    private final String country;
    private final String employees;
    private final String annualRevenue;
    private final String street;
    private final String description;
    private final String name;

    private Lead(LeadBuilder leadBuilder) {
        this.firstName = leadBuilder.firstName;
        this.lastName = leadBuilder.lastName;
        this.company = leadBuilder.company;
        this.phone = leadBuilder.phone;
        this.leadStatus = leadBuilder.leadStatus;
        this.salutation = leadBuilder.salutation;
        this.rating = leadBuilder.rating;
        this.industry = leadBuilder.industry;
        this.leadSource = leadBuilder.leadSource;
        this.email = leadBuilder.email;
        this.title = leadBuilder.title;
        this.website = leadBuilder.website;
        this.city = leadBuilder.city;
        this.state = leadBuilder.state;
        this.zipCode = leadBuilder.zipCode;
        this.country = leadBuilder.country;
        this.employees = leadBuilder.employees;
        this.annualRevenue = leadBuilder.annualRevenue;
        this.street = leadBuilder.street;
        this.description = leadBuilder.description;
        this.name = leadBuilder.name;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getPhone() {
        return phone;
    }

    public LeadStatus getLeadStatus() {
        return leadStatus;
    }

    public Salutation getSalutation() {
        return salutation;
    }

    public Rating getRating() {
        return rating;
    }

    public Industry getIndustry() {
        return industry;
    }

    public LeadSource getLeadSource() {
        return leadSource;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    public String getWebsite() {
        return website;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getEmployees() {
        return employees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public String getStreet() {
        return street;
    }

    public String getDescription() {
        return description;
    }


    public static class LeadBuilder {
        private String firstName;
        private String lastName;
        private String company;
        private String phone;
        private LeadStatus leadStatus;
        private Salutation salutation;
        private Rating rating;
        private Industry industry;
        private LeadSource leadSource;
        private String email;
        private String title;
        private String website;
        private String city;
        private String state;
        private String zipCode;
        private String country;
        private String employees;
        private String annualRevenue;
        private String street;
        private String description;
        private String name;

        public LeadBuilder(String name, String company) {
            this.name = name;
            this.company = company;
        }


        public LeadBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public LeadBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public LeadBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public LeadBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public LeadBuilder setLeadStatus(String leadStatus) {
            this.leadStatus = LeadStatus.valueOf(leadStatus);
            return this;
        }

        public LeadBuilder setSalutation(String salutation) {
            this.salutation = Salutation.valueOf(salutation);
            return this;
        }

        public LeadBuilder setRating(String rating) {
            this.rating = Rating.valueOf(rating);
            return this;
        }

        public LeadBuilder setIndustry(String industry) {
            this.industry = Industry.valueOf(industry);
            return this;
        }

        public LeadBuilder setLeadSource(String leadSource) {
            this.leadSource = LeadSource.valueOf(leadSource);
            return this;
        }

        public LeadBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public LeadBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public LeadBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public LeadBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public LeadBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public LeadBuilder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public LeadBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public LeadBuilder setEmployees(String employees) {
            this.employees = employees;
            return this;
        }

        public LeadBuilder setAnnualRevenue(String annualRevenue) {
            this.annualRevenue = annualRevenue;
            return this;
        }

        public LeadBuilder setStreet(String street) {
            this.street = street;
            return this;
        }

        public LeadBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Lead build() {
            return new Lead(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lead lead = (Lead) o;
        return firstName.equals(lead.firstName) && lastName.equals(lead.lastName) && company.equals(lead.company) &&
                phone.equals(lead.phone) && leadStatus == lead.leadStatus && salutation == lead.salutation &&
                rating == lead.rating && industry == lead.industry && leadSource == lead.leadSource &&
                email.equals(lead.email) && title.equals(lead.title) && website.equals(lead.website) &&
                city.equals(lead.city) && state.equals(lead.state) && zipCode.equals(lead.zipCode) &&
                country.equals(lead.country) && employees.equals(lead.employees) && annualRevenue.equals(lead.annualRevenue) &&
                street.equals(lead.street) && description.equals(lead.description) && name.equals(lead.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, company, phone, leadStatus, salutation, rating, industry,
                leadSource, email, title, website, city, state, zipCode, country, employees, annualRevenue,
                street, description, name);
    }

    @Override
    public String toString() {
        return "Lead{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", phone='" + phone + '\'' +
                ", leadStatus=" + leadStatus +
                ", salutation=" + salutation +
                ", rating=" + rating +
                ", industry=" + industry +
                ", leadSource=" + leadSource +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", website='" + website + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                ", employees='" + employees + '\'' +
                ", annualRevenue='" + annualRevenue + '\'' +
                ", street='" + street + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
