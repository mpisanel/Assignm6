package com.pharmacy_domain_driven.factory.Invoice;
import com.pharmacy_domain_driven.domain.Invoice.Impl.InvoiceImpl;
/**
 * Created by SONY on 2016-04-16.
 */
public class InvoiceFactory
{
   public static InvoiceImpl getInvoice(String invoID, String invoDetails, String invoDate)
   {
       InvoiceImpl myInvo= new InvoiceImpl.Builder(invoID)
               .bDetails(invoDetails)
               .bCurrentDate(invoDate)
               .build();
       return myInvo;
   }
}
