package com.pharmacy_domain_driven.factory.AlternativeContact;
import com.pharmacy_domain_driven.domain.AlternativeContact.Impl.AlternativeContactImpl;
/**
 * Created by SONY on 2016-04-16.
 */
public class AlternativeContactFactory
{
    public  static AlternativeContactImpl getAlternativeDetails(String alternNum, String alternNm)
    {
        AlternativeContactImpl myAltern = new AlternativeContactImpl.Builder(alternNum)
                .bAlternName(alternNm)
                .build();
        return myAltern;
    }
}

