package com.pharmacy_domain_driven.factories.PharmacyT;
import com.pharmacy_domain_driven.domain.Pharmacy.Impl.PharmacyImpl;
import com.pharmacy_domain_driven.factory.Pharmacy.PharmacyFactory;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by SONY on 2016-04-16.
 */
public class PharmacyTest extends TestCase
{
    PharmacyImpl phar;

    @Override
    public void setUp() throws Exception
    {
        phar = PharmacyFactory.getPharmacy("PH77", "Zizo");
    }

    public void testPharmacy() throws Exception
    {
        Assert.assertEquals("PH77", phar.getPharmacyID());
    }

    public void testUpdate() throws Exception
    {
        PharmacyImpl pha = new PharmacyImpl.Builder(phar.getPharmacyID())
                .copy(phar)
                .bPharmName("Mpisane")
                .build();

        Assert.assertNotNull(pha);
        Assert.assertEquals("Mpisane", pha.getPharmacyName());
    }
}
