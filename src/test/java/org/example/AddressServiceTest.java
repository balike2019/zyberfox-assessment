package org.example;

import org.example.domain.*;
import org.example.service.AddressService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AddressServiceTest {

    private AddressService addressService;

    @BeforeEach
    public void setUp() throws IOException {
        addressService = new AddressService();
    }

    @Test
    public void testPrettyPrintAddress() {
        Address address = new Address();
        address.setId("1");
        Type addressType = new Type();
        addressType.setCode("1");
        addressType.setName("Physical Address");
        address.setType(addressType);
        AddressLineDetail addressLineDetail = new AddressLineDetail();
        addressLineDetail.setLine1("Address 1");
        addressLineDetail.setLine2("Line 2");
        address.setAddressLineDetail(addressLineDetail);
        ProvinceOrState provinceOrState = new ProvinceOrState();
        provinceOrState.setCode("5");
        provinceOrState.setName("Eastern Cape");
        address.setProvinceOrState(provinceOrState);
        address.setCityOrTown("City 1");
        Country country = new Country();
        country.setCode("ZA");
        country.setName("South Africa");
        address.setCountry(country);
        address.setPostalCode("1234");
        String expectedOutput = "Physical Address: Address 1 Line 2 - City 1 - Eastern Cape - 1234 - South Africa";
        Assertions.assertEquals(expectedOutput, addressService.prettyPrintAddress(address));




    }

    @Test
    public void testPrettyPrintAllAddresses() throws IOException {
        List<String> prettyPrintedAddresses = addressService.prettyPrintAllAddresses();
        Assertions.assertEquals(3, prettyPrintedAddresses.size());
        Assertions.assertTrue(prettyPrintedAddresses.get(0).startsWith("Physical Address:"));
        Assertions.assertTrue(prettyPrintedAddresses.get(1).startsWith("Postal Address:"));
        Assertions.assertTrue(prettyPrintedAddresses.get(2).startsWith("Business Address:"));
    }

    @Test
    public void testPrintAddressByType() throws IOException {
        List<String> prettyPrintedAddresses = addressService.printAddressesByType("Postal Address");
        Assertions.assertEquals(1, prettyPrintedAddresses.size());
        Assertions.assertTrue(prettyPrintedAddresses.get(0).startsWith("Postal Address:"));

        prettyPrintedAddresses = addressService.printAddressesByType("Business Address");
        Assertions.assertEquals(1, prettyPrintedAddresses.size());
        Assertions.assertTrue(prettyPrintedAddresses.get(0).startsWith("Business Address:"));

        prettyPrintedAddresses = addressService.printAddressesByType("Physical Address");
        Assertions.assertEquals(1, prettyPrintedAddresses.size());
        Assertions.assertTrue(prettyPrintedAddresses.get(0).startsWith("Physical Address:"));

    }


    @Test
    public void testValidateAddresses() throws IOException {
        String result = addressService.validateAddresses();
        Assertions.assertEquals("Address 1 is valid.", result);


    }








}

