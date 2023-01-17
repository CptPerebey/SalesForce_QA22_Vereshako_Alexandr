package pages;

import dataModals.Lead;
import elements.RecordLayoutItem;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class LeadDetailsPage extends HomePage {
        private final static By NAME_INPUT = By.xpath("//slot[@name='outputField']/lightning-formatted-name");
        private final static By COMPANY_INPUT = By.xpath("//span[text()='Company']//ancestor::records-record-layout-item//lightning-formatted-text");
        private final static By EMAIL_INPUT = By.xpath("//slot[@name='outputField']/emailui-formatted-email-lead");
        private final static By TITLE_INPUT = By.xpath("//span[text()='Title']//ancestor::records-record-layout-item//lightning-formatted-text");
        private final static By RATING_INPUT = By.xpath("//span[text()='Rating']//ancestor::records-record-layout-item//lightning-formatted-text");
        private final static By ADDRESS_INPUT = By.xpath("//lightning-formatted-address/a");
        private final static By WEBSITE_INPUT = By.xpath("//lightning-formatted-url/a");
        private final static By EMPLOYEES_INPUT = By.xpath("//records-record-layout-item[@class='slds-form__item slds-no-space']//lightning-formatted-number");
        private final static By LEAD_SOURCE_INPUT = By.xpath("//span[text()='Lead Source']//ancestor::records-record-layout-item//lightning-formatted-text");
        private final static By ANNUAL_REVENUE_INPUT = By.xpath("//span[text()='Annual Revenue']//ancestor::records-record-layout-item//lightning-formatted-text");
        private final static By INDUSTRY_INPUT = By.xpath("//span[text()='Industry']//ancestor::records-record-layout-item//lightning-formatted-text");
        private final static By DESCRIPTION_INPUT = By.xpath("//span[text()='Description']//ancestor::records-record-layout-item//lightning-formatted-text");
        private final static By LEAD_STATUS_INPUT = By.xpath("//span[text()='Lead Status']//ancestor::records-record-layout-item//lightning-formatted-text");
        private final static By PHONE_INPUT = By.xpath("//div[@class='slds-form-element__control']//lightning-formatted-phone/a");
        private final static By SALUTATION_INPUT = By.xpath("//span[text()='Salutation']//ancestor::records-record-layout-item//lightning-formatted-text");
        private final static By MARK_STATUS_AS_COMPLETE_BUTTON = By.xpath("//span[@class='uiOutputText']");
        private final static By MARK_STATUS = By.cssSelector(".uiOutputText");


    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }

        public Lead getLeadDetails() {
                Lead.LeadBuilder lead = new Lead.LeadBuilder(new RecordLayoutItem(driver, "Name").getValue());
                lead.setCompany(new RecordLayoutItem(driver, "Company")).getValue());
                lead.setEmail(new RecordLayoutItem(driver, "Email")).getValue());
                lead.setTitle(new RecordLayoutItem(driver, "Title")).getValue());
                lead.setRating(new RecordLayoutItem(driver, "Rating")).getValue());
                lead.setStreet(new RecordLayoutItem(driver, "Street")).getValue());
                lead.setWebsite(new RecordLayoutItem(driver, "Website")).getValue());
                lead.setCity(new RecordLayoutItem(driver, "City")).getValue());
                lead.setZipCode(new RecordLayoutItem(driver, "ZipCode")).getValue());
                lead.setState(new RecordLayoutItem(driver, "State")).getValue());
                lead.setCountry(new RecordLayoutItem(driver, "Country")).getValue());
                lead.setLeadStatus(new RecordLayoutItem(driver, "LeadStatus")).getValue());
                lead.setLeadSource(new RecordLayoutItem(driver, "LeadSource")).getValue());
                lead.setAnnualRevenue(new RecordLayoutItem(driver, "annualRevenue")).getValue());
                lead.setIndustry(new RecordLayoutItem(driver, "Industry")).getValue());
                lead.setDescription(new RecordLayoutItem(driver, "Description")).getValue());
                lead.setPhone(new RecordLayoutItem(driver, "Phone")).getValue());
                lead.setEmployees(new RecordLayoutItem(driver, "Evployees")).getValue());
                return lead.build();
        }

        public void clickMarkStatus(){
                driver.findElement(MARK_STATUS).click();
        }

        private String getSalutation() {
                return driver.findElement(SALUTATION_INPUT).getText();
        }

        private String getName() {
                return driver.findElement(NAME_INPUT).getText();
        }

        private String getCompany() {
                return driver.findElement(COMPANY_INPUT).getText();
        }

        private String getEmail() {
                return driver.findElement(EMAIL_INPUT).getText();
        }

        private String getTitle() {
                return driver.findElement(TITLE_INPUT).getText();
        }

        private String getRating() {
                return driver.findElement(RATING_INPUT).getText();
        }

        private String getAddress() {
                return driver.findElement(ADDRESS_INPUT).getText();
        }

        private String getWebsite() {
                return driver.findElement(WEBSITE_INPUT).getText();
        }

        private String getEmployees() {
                return driver.findElement(EMPLOYEES_INPUT).getText();
        }

        private String getLeadSource() {
                return driver.findElement(LEAD_SOURCE_INPUT).getText();
        }

        private String getAnnualRevenue() {
                return driver.findElement(ANNUAL_REVENUE_INPUT).getText();
        }

        private String getIndustry() {
                return driver.findElement(INDUSTRY_INPUT).getText();
        }

        private String getDescription() {
                return driver.findElement(DESCRIPTION_INPUT).getText();
        }

        private String getLeadStatus() {
                return driver.findElement(LEAD_STATUS_INPUT).getText();
        }

        private String getPhone() {
                return driver.findElement(PHONE_INPUT).getText();
        }

        public boolean isMarkStatusAsCompleteButtonPresent()    {
                try {
                        driver.findElement(MARK_STATUS_AS_COMPLETE_BUTTON);
                } catch (NoSuchElementException ex) {
                        return false;
                }
                return true;
        }
}
