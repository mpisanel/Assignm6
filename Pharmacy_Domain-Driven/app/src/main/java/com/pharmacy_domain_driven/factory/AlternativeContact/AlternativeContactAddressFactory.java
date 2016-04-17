package com.pharmacy_domain_driven.factory.AlternativeContact;
import com.pharmacy_domain_driven.domain.AlternativeContact.Impl.AlternativeContactAddressImpl;
/**
 * Created by SONY on 2016-04-16.
 */
public class AlternativeContactAddressFactory
{
    public static AlternativeContactAddressImpl getAlternativeAddress(String aStreet, String aSuburb, String aPostCode)
    {
        AlternativeContactAddressImpl myAlternAddress = new AlternativeContactAddressImpl.Builder(aStreet)
                .bSuburb(aSuburb)
                .bPostCode(aPostCode)
                .build();
        return myAlternAddress;
    }
}
