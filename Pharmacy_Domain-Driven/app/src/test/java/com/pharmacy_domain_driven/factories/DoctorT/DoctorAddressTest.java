package com.pharmacy_domain_driven.factories.DoctorT;
import com.pharmacy_domain_driven.domain.Doctor.Impl.DoctorAddressImpl;
import com.pharmacy_domain_driven.factory.Doctor.DoctorAddressFactory;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by SONY on 2016-04-17.
 */
public class DoctorAddressTest extends TestCase
{
    DoctorAddressImpl docAddress;

    @Override
    public void setUp() throws Exception
    {
        docAddress = DoctorAddressFactory.getDoctorAddress("FF143", "Khayelitsha", "7788");
    }

    public void testDocAddress() throws Exception
    {
        Assert.assertEquals("FF143", docAddress.getStreet());
    }

    public void testUpdate() throws Exception
    {
        DoctorAddressImpl docUp = new DoctorAddressImpl.Builder(docAddress.getStreet())
                .copy(docAddress)
                .bPostCode("7784")
                .build();

        Assert.assertNotNull(docUp);
        Assert.assertEquals("7784", docUp.getPostCode());
    }
}
