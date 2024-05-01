package com.sourabh.vendorapp.Service;

import com.sourabh.vendorapp.Entities.Vendor;
import com.sourabh.vendorapp.Repos.VendorRepository;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.annotation.Repeatable;
import java.util.List;

@Service
public class VendorServiceImpl implements  VendorService{
    @Autowired
    VendorRepository repository;
    @Override
    public Vendor saveVendor(Vendor vendor) {
        return repository.save(vendor) ;
    }

    @Override
    public Vendor updateVendor(Vendor vendor) {
        return repository.save(vendor);
    }

    @Override
    public void deleteVendor(Vendor vendor) {
        repository.delete(vendor);
    }

    @Override
    public Vendor getVendorById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Vendor> getAllVedors() {
        return repository.findAll();
    }
}
