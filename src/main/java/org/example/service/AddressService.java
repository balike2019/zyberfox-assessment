package org.example.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.domain.Address;
import org.example.domain.AddressLineDetail;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddressService {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    private List<Address> addresses;


    public AddressService() throws IOException {

      //get the file from resources folder
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("addresses.json").getFile());

        addresses = objectMapper.readValue(file, new TypeReference<List<Address>>(){});



    }

    public List<String> prettyPrintAllAddresses() throws IOException {

        List<String> prettyPrintedAddresses = new ArrayList<>();
        for (Address address : addresses) {
            String prettyAddress = prettyPrintAddress(address);
            System.out.println(prettyAddress);
            prettyPrintedAddresses.add(prettyAddress);
        }
        return prettyPrintedAddresses;
    }
    public List<String> printAddressesByType(String type) throws IOException {

        List<String> prettyPrintedAddresses = new ArrayList<>();
        for (Address address : addresses) {
            if (address.getType() != null && address.getType().getName().equalsIgnoreCase(type)) {
                String prettyAddress = prettyPrintAddress(address);
                prettyPrintedAddresses.add(prettyAddress);
            }
        }
        return prettyPrintedAddresses;
    }
    public String prettyPrintAddress(Address address) {
      //Physical Address: Address 1 Line 2 - City 1 - Eastern Cape - 1234 - South Africa

        String prettyAddress = "";
        if (address.getType() != null) {
            prettyAddress += address.getType().getName() + ": ";
        }
        if (address.getAddressLineDetail() != null) {
            prettyAddress += address.getAddressLineDetail().getLine1() + " ";
            if (address.getAddressLineDetail().getLine2() != null) {
                prettyAddress += address.getAddressLineDetail().getLine2() + " - ";
            }
        }
        if (address.getCityOrTown() != null) {
            prettyAddress += address.getCityOrTown() + " - ";
        }
        if (address.getProvinceOrState() != null) {
            prettyAddress += address.getProvinceOrState().getName() + " - ";
        }
        if (address.getPostalCode() != null) {
            prettyAddress += address.getPostalCode() + " - ";
        }
        if (address.getCountry() != null) {
            prettyAddress += address.getCountry().getName();
        }
        return prettyAddress;
    }
    public String validateAddresses() {
        for (Address address : addresses) {
            boolean isValid = true;
            String invalidMsg = "";

            // check if postal code is numeric
            if (address.getPostalCode() == null || !address.getPostalCode().matches("\\d+")) {
                isValid = false;
                invalidMsg += "Postal code must be a numeric value. ";
            }

            // check if country is present
            if (address.getCountry() == null || address.getCountry().getName().isEmpty()) {
                isValid = false;
                invalidMsg += "Country must be present. ";
            }

            // check if address line detail is present
            if (address.getAddressLineDetail() == null || address.getAddressLineDetail().getLine1().isEmpty()) {
                isValid = false;
                invalidMsg += "Address line detail must be present. ";
            }

            // check if province is present for South Africa
            if (address.getCountry().getCode().equals("ZA") && (address.getProvinceOrState() == null || address.getProvinceOrState().getName().isEmpty())) {
                isValid = false;
                invalidMsg += "Province is required for South Africa. ";
            }

            // print validation result
            if (isValid) {
                return "Address " + address.getId() + " is valid.";
            } else {
                return "Address " + address.getId() + " is invalid: " + invalidMsg;
            }
        }
        return "";
    }

}
