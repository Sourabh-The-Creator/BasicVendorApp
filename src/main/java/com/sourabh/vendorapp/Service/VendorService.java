package com.sourabh.vendorapp.Service;

import com.sourabh.vendorapp.Entities.Vendor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface VendorService {
    Vendor saveVendor(Vendor vendor);
    Vendor updateVendor(Vendor vendor);
    void deleteVendor(Vendor vendor);
    Vendor getVendorById(Integer id);
    List<Vendor> getAllVedors();
}
