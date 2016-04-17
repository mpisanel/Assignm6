package com.pharmacy_domain_driven.factories.AlternativeContactT;
import com.pharmacy_domain_driven.domain.AlternativeContact.Impl.AlternativeContactAddressImpl;
import com.pharmacy_domain_driven.factory.AlternativeContact.AlternativeContactAddressFactory;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by SONY on 2016-04-17.
 */
public class AlternativeContactAddressTest extends TestCase
{
    AlternativeContactAddressImpl alterContAddress;

    @Override
    public void setUp() throws Exception
    {
        alterContAddress = AlternativeContactAddressFactory.getAlternativeAddress("FF142", "Khayelitsha", "7788");
    }

    public void testAlternativeConAddress() throws Exception
    {
        Assert.assertEquals("FF142", alterContAddress.getStreet());
    }

    public void testUpdate() throws Exception
    {
        AlternativeContactAddressImpl altAddUp = new AlternativeContactAddressImpl.Builder(alterContAddress.getStreet())
                .copy(alterContAddress)
                .bPostCode("7784")
                .build();

        Assert.assertNotNull(altAddUp);
        Assert.assertEquals("7784", altAddUp.getPostCode());
    }
}
