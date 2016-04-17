package com.pharmacy_domain_driven.factories.PharmacyT;
import com.pharmacy_domain_driven.domain.Pharmacy.Impl.PharmacyAddressImpl;
import com.pharmacy_domain_driven.factory.Pharmacy.PharmacyAddressFactory;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by SONY on 2016-04-17.
 */
public class PharmacyAddressTest extends TestCase
{
    PharmacyAddressImpl phaAddress;

    @Override
    public void setUp() throws Exception
    {
        phaAddress = PharmacyAddressFactory.getPatientAddress("FF143", "Mandalay", "7788");
    }

    public void testDocAddress() throws Exception
    {
        Assert.assertEquals("FF143", phaAddress.getStreet());
    }

    public void testUpdate() throws Exception
    {
        PharmacyAddressImpl phaUp = new PharmacyAddressImpl.Builder(phaAddress.getStreet())
                .copy(phaAddress)
                .bPostCode("8584")
                .build();

        Assert.assertNotNull(phaUp);
        Assert.assertEquals("8584", phaUp.getPostCode());
    }
}
