package com.pharmacy_domain_driven.domain.Invoice.Impl;

import com.pharmacy_domain_driven.domain.Invoice.Invoice;

/**
 * Created by SONY on 2016-04-16.
 */
public class InvoiceImpl implements Invoice
{
    private String invoiceID;
    private String details;
    private String currentDate;

    public InvoiceImpl(Builder builder)
    {
        details = builder.details;
        currentDate = builder.currentDate;
    }

    public String getInvoiceID()
    {
        return invoiceID;
    }

    public String getCurrentDate()
    {
        return currentDate;
    }

    public String getDetails()
    {
        return details;
    }
    public static class Builder
    {
        private String invoiceID;
        private String currentDate;
        private String details;

        public Builder(String invoiceID)
        {
            this.invoiceID = invoiceID;
        }
        public Builder bDetails(String details)
        {
            this.details = details;
            return this;
        }
        public Builder bCurrentDate(String currentDate)
        {
            this.currentDate = currentDate;
            return this;
        }
        public Builder copy(InvoiceImpl invo)
        {
            this.invoiceID = invo.invoiceID;
            this.details = invo.getDetails();
            this.currentDate = invo.getCurrentDate();
            return this;
        }
        public InvoiceImpl build()
        {
            return new InvoiceImpl(this);
        }
    }

}
