package com.pharmacy_domain_driven.factories.AlternativeContactT;
import com.pharmacy_domain_driven.domain.AlternativeContact.Impl.AlternativeContactImpl;
import com.pharmacy_domain_driven.factory.AlternativeContact.AlternativeContactFactory;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by SONY on 2016-04-17.
 */
public class AlternativeContactTest extends TestCase
{
    AlternativeContactImpl alterContact;

    @Override
    public void setUp() throws Exception
    {
        alterContact = AlternativeContactFactory.getAlternativeDetails("0723513277", "Mumu");
    }

    public void testAlternativeContact() throws Exception
    {
        Assert.assertEquals("0723513277", alterContact.getAlternativeContactNumber());
    }

    public void testUpdate() throws Exception
    {
        AlternativeContactImpl doc = new AlternativeContactImpl.Builder(alterContact.getAlternativeContactNumber())
                .copy(alterContact)
                .bAlternName("Luxolo")
                .build();

        Assert.assertNotNull(doc);
        Assert.assertEquals("Luxolo", doc.getAlternName());
    }


}
