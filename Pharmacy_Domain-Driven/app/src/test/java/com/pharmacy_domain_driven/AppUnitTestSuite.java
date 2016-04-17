package com.pharmacy_domain_driven;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.pharmacy_domain_driven.factories.AlternativeContactT.AlternativeContactTest;
import com.pharmacy_domain_driven.factories.AlternativeContactT.AlternativeContactAddressTest;
import com.pharmacy_domain_driven.factories.DoctorT.DoctorTest;
import com.pharmacy_domain_driven.factories.DoctorT.DoctorAddressTest;
import com.pharmacy_domain_driven.factories.InvoiceT.InvoiceTest;
import com.pharmacy_domain_driven.factories.PatientT.PatientTest;
import com.pharmacy_domain_driven.factories.PatientT.PatientAddressTest;
import com.pharmacy_domain_driven.factories.PharmacyT.PharmacyTest;
import com.pharmacy_domain_driven.factories.PharmacyT.PharmacyAddressTest;
import com.pharmacy_domain_driven.factories.PrescriptionT.PrescriptionTest;
/**
 * Created by SONY on 2016-04-16.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AlternativeContactTest.class,
        AlternativeContactAddressTest.class,
        DoctorTest.class,
        DoctorAddressTest.class,
        InvoiceTest.class,
        PatientTest.class,
        PatientAddressTest.class,
        PharmacyTest.class,
        PharmacyAddressTest.class,
        PrescriptionTest.class})
public class AppUnitTestSuite {}
